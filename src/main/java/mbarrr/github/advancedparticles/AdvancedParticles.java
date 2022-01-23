package mbarrr.github.advancedparticles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedParticles extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("Debug").setExecutor(new DebugCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AdvancedParticles getInstance(){
        return (AdvancedParticles) Bukkit.getPluginManager().getPlugin("AdvancedParticles");
    }

    public static Location rotateAroundPoint(Location location, double angle) {
        double angleCos = Math.cos(angle);
        double angleSin = Math.sin(angle);

        double x = angleCos * location.getX() + angleSin * location.getZ();
        double z = -angleSin * location.getX() + angleCos * location.getZ();
        location.setX(x);
        location.setZ(z);

        return location;
    }
}
