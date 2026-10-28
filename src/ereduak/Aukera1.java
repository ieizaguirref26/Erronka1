package ereduak;

import ikuspegia.Kontsola;
import kontrolagailuak.*;

public class Aukera1 {
	public void inprimatu() {
		Kontsola.inprimatu("1. Kontsultatu langile baten informazioa");
		Kontsola.inprimatu("2. Nagusi baten langileen zerrenda erakutsi");
		Kontsola.inprimatu("3. Atzera joan");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}
}
