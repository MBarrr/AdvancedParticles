package mbarrr.github.advancedparticles.ParticleStructures;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class ParticleStructure {

    public BukkitRunnable bukkitRunnable; //loop runnable
    public long period; //time between loops in ticks
    public Plugin instance; //plugin instance
    public World world; //world to spawn particles in
    public Particle.DustOptions dustOptions; //particle settings
    public Location centerPoint; //centre point of formation

    public double radius; //distance from the centre on the X axis that the new point starts from
    public double xIncrement; //amount to increment X by
    public double multiplier; // 1 or -1
    public Location point; //our point to work with

    public ParticleStructure(Plugin instance, long period, double radius, World world, Particle.DustOptions dustOptions, Location centerPoint){
        this.centerPoint = centerPoint;
        this.dustOptions = dustOptions;
        this.instance = instance;
        this.world = world;
        this.period = period;
        this.radius = radius;

        xIncrement = -radius / 10;
        multiplier = 1;
        point = new Location(world, 0, 0, radius);

        load();
    }

    //prepare the loop to run whateever is in onTick
    private void load(){
        bukkitRunnable = new BukkitRunnable() {
            @Override
            public void run() {
                onTick();
            }
        };
    }

    //the code that will be executed in the loop
    public void onTick(){
        if (point.getZ() < -radius || point.getZ() > radius) {
            xIncrement *= -1;
            multiplier *= -1;
        }

        point.add(0, 0, xIncrement);

        setX();
        setY();
        changeParticleSettings();

        instance.getServer().broadcastMessage(point.getX() + " " + point.getY() + " " + point.getZ());
        world.spawnParticle(Particle.REDSTONE, centerPoint.clone().add(point), 1, dustOptions);
    }

    public void setX(){

    }

    public void setY(){

    }

    public void changeParticleSettings(){

    }

    //start the loop
    public void start(){
        bukkitRunnable.runTaskTimer(instance, 0L, period);
    }

    //end the loop
    public void stop(){
        bukkitRunnable.cancel();
    }

}
