package ereduak;

import ikuspegia.Kontsola;
import kontrolagailuak.*;

public class Aukera3 {
	public void inprimatu() {
		Kontsola.inprimatu("1. Kontsulta bat egin");
		Kontsola.inprimatu("2. Atzera joan");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}
}
