package mbarrr.github.advancedparticles;

import mbarrr.github.advancedparticles.ParticleStructures.Squares.ParticleSquareCorner;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

public class DebugCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Entity entity = (Entity) sender;

        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(0, 255, 0), 1.0F);

        ParticleSquareCorner particleOrb = new ParticleSquareCorner(AdvancedParticles.getInstance(), 1, Double.parseDouble(args[0]), dustOptions, entity.getLocation(),-1);

        particleOrb.start();



        return false;
    }
}
