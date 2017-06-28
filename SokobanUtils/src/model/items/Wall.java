package model.items;

import model.data.Position;
/**
 * the wall of the game
 * @author Sapir Markel and Roee Sisso
 *
 */
public class Wall extends Items {
	public Wall() {
		super();
	}

	public Wall(Position p) {
		super(p);

	}
	public char getChar()
	{
		return '#';
	}

	@Override
	public char getFirstChar() {
		// TODO Auto-generated method stub
		return 'W';
	}
}
