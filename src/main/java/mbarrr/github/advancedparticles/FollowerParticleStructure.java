package mbarrr.github.advancedparticles;

import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FollowerParticleStructure extends ParticleStructure{
    Player player;

    public FollowerParticleStructure(Plugin instance, long period, Player player, Particle.DustOptions dustOptions) {
        super(instance, period, player.getWorld(), dustOptions);
        this.player = player;
    }
}
