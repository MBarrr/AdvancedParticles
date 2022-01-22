package mbarrr.github.advancedparticles;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        ParticleSpiral particleSpiral = new ParticleSpiral(player, AdvancedParticles.getInstance(), Double.parseDouble(args[0]));

        return false;
    }
}
