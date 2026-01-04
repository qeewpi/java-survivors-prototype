package entities;

public abstract class LivingEntity extends Entity implements Damageable {
    private int health;
    private int damage;

    public LivingEntity(Builder<?> builder) {
        super(builder.x, builder.y, builder.speed);
        this.health = builder.health;
        this.damage = builder.damage;
    }

    public abstract static class Builder<T extends Builder<T>> {
        private double x, y, speed;

        private int health = 100;
        private int damage = 10;

        protected abstract T self();

        public T x(double x) {
            this.x = x;
            return self();
        }

        public T y(double y) {
            this.y = y;
            return self();
        }

        public T speed(double speed) {
            this.speed = speed;
            return self();
        }

        public T health(int health) {
            this.health = health;
            return self();
        }

        public T damage(int damage) {
            this.damage = damage;
            return self();
        }
        
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
