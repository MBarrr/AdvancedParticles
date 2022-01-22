package mbarrr.github.advancedparticles;

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

        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(0, 127, 155), 2.0F);

        ParticleCircle particleCircle = new ParticleCircle(AdvancedParticles.getInstance(), 1, Double.parseDouble(args[0]), player, dustOptions);

        particleCircle.start();


        return false;
    }
}
