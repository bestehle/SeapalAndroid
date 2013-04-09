package en.htwg.seapal.controller;

import org.mockito.Mockito;

import android.content.Context;
import android.test.AndroidTestCase;

public class EulaTest extends AndroidTestCase {
	
	private Context mockContext;
	
	public EulaTest() {
		super();
		mockContext = Mockito.mock(Context.class);
	}
	
	public void testShowEula()	{
		Eula.showEula(mockContext);
	}
}
