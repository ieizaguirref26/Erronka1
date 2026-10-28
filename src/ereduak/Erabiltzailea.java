package ereduak;

import ikuspegia.Kontsola;
import kontrolagailuak.*;

public class Erabiltzailea {
	public void inprimatu() {
		Kontsola.inprimatu("Erabiltzailea:");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}

}
