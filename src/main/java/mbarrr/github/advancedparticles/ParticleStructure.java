package mbarrr.github.advancedparticles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class ParticleStructure {

    BukkitRunnable bukkitRunnable;
    long period;
    Plugin instance;
    World world;
    Particle.DustOptions dustOptions;

    public ParticleStructure(Plugin instance, long period, World world, Particle.DustOptions dustOptions){
        this.dustOptions = dustOptions;
        this.instance = instance;
        this.world = world;
        this.period = period;
        load();
    }

    public void load(){
        bukkitRunnable = new BukkitRunnable() {
            @Override
            public void run() {
                onTick();
            }
        };
    }

    public void onTick(){

    }

    public void start(){
        bukkitRunnable.runTaskTimer(instance, 0L, period);
    }

    public void stop(){
        bukkitRunnable.cancel();
    }

}
