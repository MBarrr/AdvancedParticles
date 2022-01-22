package mbarrr.github.advancedparticles;

import org.bukkit.Bukkit;
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
}
