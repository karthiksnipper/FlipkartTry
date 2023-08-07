package mock.manager;

import mock.pages.KartPage;

public class ObjectManager {
	public KartPage objInstance;
	
	public ObjectManager () {}

	public KartPage getKartPageInstance() {
		return(objInstance==null)? objInstance = new KartPage(): objInstance;
	}
}
