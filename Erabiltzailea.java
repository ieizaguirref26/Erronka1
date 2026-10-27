package probak;

import Ikuspegia.Kontsola;
import Kontrolagailuak.*;

public class Erabiltzailea {
	public void inprimatu() {
		Kontsola.inprimatu("Erabiltzaile:");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}

}
