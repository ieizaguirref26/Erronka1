package ereduak;

import ikuspegia.Kontsola;
import kontrolagailuak.Teklatua;

public class Pasahitza {

	public void inprimatu() {
		Kontsola.inprimatu("Pasahitza:");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}

}
