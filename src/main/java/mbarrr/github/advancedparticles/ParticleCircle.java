package mbarrr.github.advancedparticles;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ParticleCircle extends FollowerParticleStructure{


    double radius;
    double thing;
    double otherThing;
    Location pointOnCircle;
    Location centerPoint;

    public ParticleCircle(Plugin instance, long period, double radius, Player player, Particle.DustOptions dustOptions) {
        super(instance, period, player, dustOptions);
        this.radius = radius;
        pointOnCircle = new Location(world, 0, 0, radius);
        thing = radius / 10;
        otherThing = 1;

        super.load();

    }

    @Override
    public void onTick(){
        if (pointOnCircle.getZ() < -radius || pointOnCircle.getZ() > radius) {
            thing *= -1;
            otherThing *= -1;
        }

        pointOnCircle.subtract(0, 0, thing);
        pointOnCircle.setX(otherThing * Math.sqrt(radius * radius - pointOnCircle.getZ() * pointOnCircle.getZ()));

        Bukkit.broadcastMessage(pointOnCircle.getX() + " " + pointOnCircle.getZ());

        world.spawnParticle(Particle.REDSTONE, player.getLocation().clone().add(pointOnCircle), 1, dustOptions);
    }
}
