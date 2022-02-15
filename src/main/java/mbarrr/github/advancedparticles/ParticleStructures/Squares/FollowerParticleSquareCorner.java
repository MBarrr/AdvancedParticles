package mbarrr.github.advancedparticles.ParticleStructures.Squares;

import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public class FollowerParticleSquareCorner extends ParticleSquareCorner{

    Entity entity;

    public FollowerParticleSquareCorner(Plugin instance, long period, double radius, Particle.DustOptions dustOptions, Entity entity, int startPointPosOrNeg) {
        super(instance, period, radius, dustOptions, entity.getLocation(), startPointPosOrNeg);
        this.entity = entity;
    }

    @Override
    public void onTick(){
        //set location to player location
        centerPoint = entity.getLocation();
        super.onTick();
    }
}
