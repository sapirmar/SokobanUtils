package model.data;

import java.io.InputStream;

/**
 * load the level
 * @author Sapir Markel and Roee Sisso
 *
 */
public interface LevelLoader {
	/**
	 * load the level
	 * @param in
	 * @return
	 */
	public Level load_level(InputStream in);//get a file and load the level(txt,xml,obj)
	
}
