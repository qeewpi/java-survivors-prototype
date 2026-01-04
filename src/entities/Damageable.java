package entities;

public interface Damageable {
    void takeDamage(int amount);
    int getHealth();
    boolean isDead();
}
