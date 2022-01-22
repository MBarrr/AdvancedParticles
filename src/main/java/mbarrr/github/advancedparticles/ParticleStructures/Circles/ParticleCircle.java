package mbarrr.github.advancedparticles.ParticleStructures.Circles;

import mbarrr.github.advancedparticles.ParticleStructures.ParticleStructure;
import org.bukkit.*;
import org.bukkit.plugin.Plugin;

public class ParticleCircle extends ParticleStructure {
    public ParticleCircle(Plugin instance, long period, double radius, Location location, Particle.DustOptions dustOptions) {
        super(instance, period, radius, location.getWorld(), dustOptions, location);
    }

    @Override
    public void setX(){
        point.setX(multiplier * Math.sqrt(radius * radius - point.getZ() * point.getZ()));
    }
}
