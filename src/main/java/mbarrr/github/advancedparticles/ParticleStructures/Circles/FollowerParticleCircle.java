package mbarrr.github.advancedparticles.ParticleStructures.Circles;

import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FollowerParticleCircle extends ParticleCircle{
    Entity entity;

    public FollowerParticleCircle(Plugin instance, long period, double radius, Entity entity, Particle.DustOptions dustOptions, int startPointPosOrNeg) {
        super(instance, period, radius, entity.getLocation(), dustOptions, startPointPosOrNeg);
        this.entity = entity;
    }

    @Override
    public void onTick(){
        //set location to player location
        centerPoint = entity.getLocation();
        super.onTick();
    }

}
