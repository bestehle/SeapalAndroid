package en.htwg.seapal.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import android.content.Context;
import en.htwg.seapal.model.models.Boat;
import en.htwg.seapal.model.tables.TableBoat;

/**
 * ControllerClass for Logbook to add and get Boats from the Table
 * @author 
 * 
 */
public class LogbookController {

	private Context activity = null;
	
	public LogbookController(Context activity) {
		this.activity = activity;
	}
	
	/**
	 * Get all Boats from Table
	 * @return List of Boats
	 */
	public List<Boat> getBoats() {
		TableBoat tableBoat = new TableBoat(activity);
		List<Boat> list = null;
		try {
			list = tableBoat.selectAll();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	/**
	 * Add a Boat in the Table
	 * @param boat The Boat to add
	 */
	public void addBoat(Boat boat) {
		TableBoat tableBoat = new TableBoat(activity);
		try {
			tableBoat.insert(boat);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


