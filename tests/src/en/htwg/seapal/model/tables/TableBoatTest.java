package en.htwg.seapal.model.tables;

import org.mockito.Mockito;

import en.htwg.seapal.model.models.Boat;

import android.content.Context;
import android.database.Cursor;
import android.test.AndroidTestCase;

public class TableBoatTest extends AndroidTestCase {

	private Context context;
	private TableBoat tableBoat;
	private Boat dummyBoat;

	public TableBoatTest() throws Exception {
		super();
		context = Mockito.mock(Context.class);
		tableBoat = new TableBoat(context);
		dummyBoat = new Boat(23, "BootXY", "1990", "2", "Hans", "Wurst", "Blume", "3.5", "50", 
				"Konstanz", "5.0", "100", "Ruderer", "5", "10", "Klaus", "30",
				"23", "Teuer", "abc", "3", "Bart", "nix", "2", "ad");
//		tableBoat.insert(dummyBoat);
//		cursor = tableBoat.select(dummyBoat);
		


	}
	
	public void testInsertUpdateDelete() throws Exception {
		insertTest();
		updateTest();
		deleteTest();
	}
	
//	public void testSelect() throws Exception {
//		Cursor selectedCursor =
//		assertNotNull(cursor);
//		assertTrue(cursor.moveToFirst()); // is it fails cursor is empty
//		assertTrue(1 == cursor.getCount());
//		assertTrue(1 <= cursor.getColumnCount());		
//	}
//	
	public void insertTest() throws Exception {
		tableBoat.insert(dummyBoat);
		Cursor insertedCursor = tableBoat.select(dummyBoat);
		assertTrue(insertedCursor.moveToFirst());
		assertEquals(dummyBoat.ID, insertedCursor.getInt(insertedCursor.getColumnIndex("ID")));
	}
	
	public void deleteTest() throws Exception {
		tableBoat.delete(dummyBoat);
		assertFalse(tableBoat.select(dummyBoat).moveToFirst());
	}
	
	public void updateTest() throws Exception {
		dummyBoat.name = "updatedName";
		tableBoat.update(dummyBoat);
		Cursor updatedCursor = tableBoat.select(dummyBoat);
		updatedCursor.moveToFirst();
		assertEquals(dummyBoat.name, updatedCursor.getString(updatedCursor.getColumnIndex("name")));
	}


}
