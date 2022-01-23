package mbarrr.github.advancedparticles.ParticleStructures.Circles.Orbs.ColourShift;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public class FollowerColourShiftParticleOrb extends ColourShiftParticleOrb{

    Entity entity;

    public FollowerColourShiftParticleOrb(Plugin instance, long period, double radius, Entity entity, Particle.DustOptions dustOptions, double floor, double ceiling, double yIncrement, int startPointPosOrNeg) {
        super(instance, period, radius, entity.getLocation(), dustOptions, floor, ceiling, yIncrement, startPointPosOrNeg);
        this.entity = entity;
    }

    @Override
    public void onTick(){
        centerPoint = entity.getLocation();
        super.onTick();
    }
}
