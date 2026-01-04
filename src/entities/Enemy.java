package entities;

public class Enemy extends LivingEntity {
    private EnemyTier enemyTier;

    public Enemy(double x, double y, double speed, int health, int damage, EnemyTier enemyTier) {
        super(x, y, speed, health, damage);
        this.enemyTier = enemyTier;
    }

    @Override
    public void update() {
        // TODO Implement per-frame logic
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
