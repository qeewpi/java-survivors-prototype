package entities;

public abstract class Entity implements Movable {
    protected double x;
    protected double y;
    protected double speed;    

	public Entity(double x, double y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	@Override
	public double getX() {
        return this.x;
	}

	@Override
	public double getY() {
        return this.y;
	}

	@Override
	public void move(double x, double y) {
		this.x += x;
        this.y += y;
	}
    
    public abstract void update();
}
