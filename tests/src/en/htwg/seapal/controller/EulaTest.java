package en.htwg.seapal.controller;

import android.test.AndroidTestCase;

public class EulaTest extends AndroidTestCase {
	
	public EulaTest() {
		super();
	}
	
	public void testShowEula()	{
		Eula.showEula(getContext());
	}

}
