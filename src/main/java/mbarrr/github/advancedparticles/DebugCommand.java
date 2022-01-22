package mbarrr.github.advancedparticles;

import mbarrr.github.advancedparticles.ParticleStructures.Circles.Orbs.FollowerParticleOrb;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(0, 255, 0), 2.0F);

        FollowerParticleOrb particleOrb = new FollowerParticleOrb(AdvancedParticles.getInstance(), 1, Double.parseDouble(args[0]), player, dustOptions, 0, 2, 0.05);
        particleOrb.start();




        return false;
    }
}
