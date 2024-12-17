package emrahbase;


import emrahpages.HRMWebPage;


public class EmrahPageInitializer extends EmrahBaseClass {
	
	
	public static HRMWebPage login;
	

	public static void initialize() {
	
		login = new HRMWebPage();
		
		 
	}

}
