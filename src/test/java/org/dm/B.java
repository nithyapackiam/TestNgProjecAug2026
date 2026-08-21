package org.dm;

import org.testng.annotations.DataProvider;

public class B {
	
	@DataProvider(name="source")
	private Object [] [] chair()
	{
		return new Object [] []
				{
			{"nithya" , "12345"},
			{"sathish" , "6789"}
			
				};
				
				
				
				}
		
	}


