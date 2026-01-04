package entities;

public class Player extends Entity implements Damageable {
    private int health;
    
    private PlayerStats stats;

    public Player(double x, double y, double speed) {
        super(x, y, speed);
        this.health = 10;
        this.stats = new PlayerStats();
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }

    @Override
    public void update() {
        // TODO Implement per-frame logic
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
