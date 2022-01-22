package mbarrr.github.advancedparticles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;

public class StaticParticleStructure extends ParticleStructure{

    Location location;

    public StaticParticleStructure(Location location, Plugin instance, long period, Particle.DustOptions dustOptions) {
        super(instance, period, location.getWorld(), dustOptions);
        this.location = location;
    }
}
