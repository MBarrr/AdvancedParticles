package mbarrr.github.advancedparticles.ParticleStructures.Circles.Orbs.ColourShift;

import mbarrr.github.advancedparticles.ParticleStructures.Circles.Orbs.ParticleOrb;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.plugin.Plugin;

public class ColourShiftParticleOrb extends ParticleOrb {
    public ColourShiftParticleOrb(Plugin instance, long period, double radius, Location location, Particle.DustOptions dustOptions, double floor, double ceiling, double yIncrement, int startPointPosOrNeg) {
        super(instance, period, radius, location, dustOptions, floor, ceiling, yIncrement, startPointPosOrNeg);
    }

    //shift red according to x axis
    @Override
    public void changeParticleSettings(){
        dustOptions = new Particle.DustOptions(Color.fromRGB((int) (127*point.getY()), 255, 0), 2.0F);
    }
}
