package mbarrr.github.advancedparticles.ParticleStructures.Circles;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FollowerParticleCircle extends ParticleCircle{
    Player player;

    public FollowerParticleCircle(Plugin instance, long period, double radius, Player player, Particle.DustOptions dustOptions) {
        super(instance, period, radius, player.getLocation(), dustOptions);
        this.player = player;
    }

    @Override
    public void onTick(){
        //set location to player location
        centerPoint = player.getLocation();
        super.onTick();
    }

}
