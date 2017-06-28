package model.items;

import model.data.Level2D;
import model.data.Position;
/**
 * the box of the game
 * @author Sapir Markel and Roee Sisso
 *
 */
public class Box extends Moveable_Item {
public Box() {
	super();
}
	public Box(Box b) {
		this.p=new Position(b.p);;
	}
	public Box(Position p) {
		super(p);
		
	}
	
	public void move_up(Level2D level2d)
	{
		p.setI(p.getI()-1);
		
		
	}
	public void move_down(Level2D level2d)
	{
		p.setI(p.getI()+1);
	}
	public void move_right(Level2D level2d)
	{
		p.setJ(p.getJ()+1);
	}
	public void move_left(Level2D level2d)
	{
		p.setJ(p.getJ()-1);
	}
	public char getChar()
	{
		return '@';
	}
	@Override
	public char getFirstChar()
	{
		return 'B';
	}



}
