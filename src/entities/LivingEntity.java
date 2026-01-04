package entities;

public abstract class LivingEntity extends Entity implements Damageable {
    private int health;
    private int damage;

    public LivingEntity(double x, double y, double speed, int health, int damage) {
        super(x, y, speed);
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }

    
}
