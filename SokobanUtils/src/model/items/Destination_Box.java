package model.items;

import model.data.Position;
/**
 * the target of the box
 * @author Sapir Markel and Roee Sisso
 *
 */
public class Destination_Box extends Items {
	
	
public Destination_Box() {
	super();
	
}
	public Destination_Box(Position p) {
		super(p);
		p.setFlagDestination(true);
	}
	public char getChar()
	{
		return 'o';
	}
	@Override
	public char getFirstChar() {
		// TODO Auto-generated method stub
		return 'D';
	}


}
