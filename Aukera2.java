package probak;

import Ikuspegia.Kontsola;
import Kontrolagailuak.*;

public class Aukera2 {
	public void inprimatu() {
		Kontsola.inprimatu("1. Bezeroaren kontaktuak kontsultatu");
		Kontsola.inprimatu("2. Bezero batek egindako erosketa baten faktura sortu");
		Kontsola.inprimatu("3. Atzera joan");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}
}
