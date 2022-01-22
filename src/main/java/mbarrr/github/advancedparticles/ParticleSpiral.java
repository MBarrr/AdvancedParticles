package mbarrr.github.advancedparticles;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class ParticleSpiral {


    BukkitRunnable bukkitRunnable;
    double radius;
    double thing;
    double otherThing;
    Player player;

    public ParticleSpiral(Player player, Plugin instance, double radius){
        this.player = player;
        this.radius = radius;


        Location pointOnCircle = new Location(player.getWorld(), 0,0, radius);
        thing = radius/10;
        otherThing = 1;

        bukkitRunnable = new BukkitRunnable() {
            @Override
            public void run() {
                if(pointOnCircle.getZ() < -radius || pointOnCircle.getZ() > radius){
                    thing*=-1;
                    otherThing*= -1;
                }

                pointOnCircle.subtract(0,0,thing);
                pointOnCircle.setX(otherThing*Math.sqrt(radius*radius-pointOnCircle.getZ()*pointOnCircle.getZ()));

                player.sendMessage(pointOnCircle.getX() + " " + pointOnCircle.getZ());

                Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(0, 127, 155), 2.0F);
                player.spawnParticle(Particle.REDSTONE, player.getLocation().add(pointOnCircle), 1, dustOptions);
            }
        };

        bukkitRunnable.runTaskTimer(instance, 0L, 2L);
    }
}