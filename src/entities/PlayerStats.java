package entities;

public class PlayerStats {
    // Flat bonuses (added to base)
    public int flatDamage = 0;
    public int flatHealth = 0;
    
    // Multipliers (applied after flat bonuses)
    public double damageMultiplier = 1.0;
    public double attackSpeedMultiplier = 1.0;
    public double cooldownMultiplier = 1.0;
    public double luckMultiplier = 1.0;
    
    // Base values
    public int maxHealth = 100;
    public double moveSpeed = 5.0;
}