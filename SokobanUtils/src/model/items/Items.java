package model.items;
import java.io.Serializable;

import model.data.Position;
/**
 * all the items in the game
 * @author Sapir Markel and Roee Sisso
 *
 */
public abstract class Items implements Serializable{
	public Position p;
	
	public Items() {
		p=null;
	}
	public Items(Position p) {
		this.p=p;
		
	}
	public Items(Items itm){
		this.p=new Position(itm.getP());
	}
	
	public Position getP() {
		return p;
	}
	public void setP(Position p) {
		this.p = p;
	}
	
	//check the flag/ if true the item on target
	public Boolean ifOnDestination()
	{
		if(p.getFlagDestination()==true)
			return true;
		else 
			return false;
	}
	//default char
	public char getChar()
	{
		return '*';
	}
	public abstract char getFirstChar();
	

}
