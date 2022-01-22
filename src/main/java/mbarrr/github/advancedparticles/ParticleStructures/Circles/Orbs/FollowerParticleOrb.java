package mbarrr.github.advancedparticles.ParticleStructures.Circles.Orbs;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FollowerParticleOrb extends ParticleOrb{
    Player player;

    public FollowerParticleOrb(Plugin instance, long period, double radius, Player player, Particle.DustOptions dustOptions, double floor, double ceiling, double yIncrement) {
        super(instance, period, radius, player.getLocation(), dustOptions, floor, ceiling, yIncrement);
        this.player = player;
    }

    @Override
    public void onTick(){
        centerPoint = player.getLocation();
        super.onTick();
    }
}
