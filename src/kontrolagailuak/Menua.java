package kontrolagailuak;

import ikuspegia.Kontsola;

public class Menua {
	public void inprimatuMenuNagusia() {
		Kontsola.inprimatu("1. Langileak");
		Kontsola.inprimatu("2. Bezeroak");
		Kontsola.inprimatu("3. Fitxategiak");
		Kontsola.inprimatu("4. Saioa itxi");
	}
	
	public void inprimatuLangileenMenua() {
		Kontsola.inprimatu("1. Kontsultatu langile baten informazioa");
		Kontsola.inprimatu("2. Nagusi baten langileen zerrenda erakutsi");
		Kontsola.inprimatu("3. Atzera bueltatu");
	}
	
	public void inprimatuBezeroenMenua() {
		Kontsola.inprimatu("1. Bezeroaren kontaktuak kontsultatu");
		Kontsola.inprimatu("2. Bezero batek egindako erosketa baten faktura sortu");
		Kontsola.inprimatu("3. Atzera bueltatu");
	}
	
	public void inprimatuFitxategienMenua() {
		Kontsola.inprimatu("1. Kontsulta bat egin");
		Kontsola.inprimatu("2. Atzera bueltatu");
	}
	
	public void inprimatuIrteeraPantaila() {
		IO.println("Saioa itxi nahi duzu?");
		IO.print("\n");
		Kontsola.inprimatu("Bai");
		Kontsola.inprimatu("Ez");
	}
	
	public String getAukera() {
		String aukera;
		aukera = Teklatua.irakurri();
		return aukera;
	}
}
