package mbarrr.github.advancedparticles.ParticleStructures.Squares;

import mbarrr.github.advancedparticles.AdvancedParticles;
import mbarrr.github.advancedparticles.ParticleStructures.ParticleStructure;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class ParticleSquareCorner extends ParticleStructure {

    Location point2;

    public ParticleSquareCorner(Plugin instance, long period, double radius, Particle.DustOptions dustOptions, Location centerPoint, int startPointPosOrNeg) {
        super(instance, period, radius, centerPoint.getWorld(), dustOptions, centerPoint, startPointPosOrNeg);
    }

    @Override
    public void loadParams(){
        super.loadParams();
        point.add(radius*startPointPosOrNeg,0,0);
        point2 = point.clone();
    }

    @Override
    public void onTick(){
        if (point.getZ() < -radius || point.getZ() > radius) {
            xIncrement *= -1;
        }

        point.add(0, 0, xIncrement);
        point2.add(xIncrement, 0,0);

        setX();
        setY();

        //instance.getServer().broadcastMessage(point.getX() + " " + point.getY() + " " + point.getZ());
        world.spawnParticle(Particle.REDSTONE, centerPoint.clone().add(point), 1, dustOptions);
        world.spawnParticle(Particle.REDSTONE, centerPoint.clone().add(point2), 1, dustOptions);

        world.spawnParticle(Particle.REDSTONE, centerPoint.clone().add(AdvancedParticles.rotateAroundPoint(point.clone(), 135)), 1, dustOptions);
        world.spawnParticle(Particle.REDSTONE, centerPoint.clone().add(AdvancedParticles.rotateAroundPoint(point2.clone(), 135)), 1, dustOptions);
    }

    public void changeColour(Particle.DustOptions dustOptions){
        this.dustOptions = dustOptions;
    }
}
