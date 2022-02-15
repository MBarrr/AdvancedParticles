package mbarrr.github.advancedparticles;

import mbarrr.github.advancedparticles.ParticleStructures.Circles.FollowerParticleCircle;
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

        FollowerParticleCircle thing1 = new FollowerParticleCircle(AdvancedParticles.getInstance(), 1, Double.parseDouble(args[0])/2, entity,dustOptions,-1);
        thing1.start();





        return false;
    }
}
