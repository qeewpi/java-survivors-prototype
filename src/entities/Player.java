package entities;

import weapons.Weapon;

public class Player extends LivingEntity {
    private PlayerStats stats;
    private Weapon currentWeapon;

    public Player(double x, double y, double speed, int health, int damage, PlayerStats stats, Weapon currentWeapon) {
        super(x, y, speed, health, damage);
        this.stats = stats;
        this.currentWeapon = currentWeapon;
    }

    @Override
    public void update() {
        // TODO Implement per-frame logic
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
