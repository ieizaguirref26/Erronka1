package ereduak;

import ikuspegia.Kontsola;
import kontrolagailuak.*;

public class SaioaItxi {
	public void inprimatu() {
		Kontsola.inprimatu("Bai");
		Kontsola.inprimatu("Ez");
	}

	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;

	}

}
