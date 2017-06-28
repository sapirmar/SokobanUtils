package model.items;

import model.data.Position;
/**
 * the space in the game. the empty place
 * @author Sapir Markel and Roee Sisso
 *
 */
public class Space extends Items {
	public Space() {
		super();
	}
	
	public Space(Position p) {
		super(p);
		
	}
	public char getChar()
	{
		return ' ';
	}

	@Override
	public char getFirstChar() {
		// TODO Auto-generated method stub
		return 'S';
	}

}
