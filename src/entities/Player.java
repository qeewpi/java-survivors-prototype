package entities;

public class Player extends Entity implements Movable, Damageable {
    private int health;
    
    private PlayerStats stats;

    public Player(double x, double y, double speed) {
        super(x, y, speed);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void takeDamage(int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeDamage'");
    }

    @Override
    public int getHealth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHealth'");
    }

    @Override
    public boolean isDead() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDead'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
