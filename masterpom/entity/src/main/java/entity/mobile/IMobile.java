package entity.mobile;

import java.awt.Point;

import entity.ControllerOrder;
import entity.IEntity;

public interface IMobile extends IEntity{
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
	public void immobile();
	public void die();
	public Point getPosition();
	public void setPosition(Point position);
	public boolean isAlive();
	public boolean isCrashed();
	public void setHasMoved();
	public boolean canMove(ControllerOrder choice);	
	public void removeEntity();
	public Point getPositionAfterOrder(ControllerOrder choice);
	public boolean isFalling();
	public void digg();
	public void strategy();
}