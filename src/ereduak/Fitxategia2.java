package ereduak;

import java.io.BufferedReader;
import java.io.FileReader;



public class Fitxategia2 {
	
	private String fitxategiIzena;

	public Fitxategia2() {

	}

	public Fitxategia2(String fitxategiIzena) { // edo public Fitxategia(String izena) { fitxategiIzena = izena; } jarri ahalko genuke.
		this.fitxategiIzena = fitxategiIzena;
	}

	public void setIzena(String fitxategiIzena) {
		this.fitxategiIzena = fitxategiIzena;
	}

	public void run() {
		fitxategiaIrakurri();
	}

	public void fitxategiaIrakurri() {
		
		try {
			FileReader fr = new FileReader(fitxategiIzena);
			BufferedReader br = new BufferedReader(fr); // buffer es como un caché.
			br.readLine(); //hau jarriz, fitxategiaren lehenengo lerroa ez du irakurriko.
			do {
				String lerroa = br.readLine();
				if (lerroa == null)
					break;
				
				IO.println(lerroa);
				
				
			} while (true);
			br.close();
			fr.close();
			
		} catch (Exception e) {
			IO.println(e.toString());
		}
	}


	public static void main(String[] args) {
		Fitxategia f = new Fitxategia();
		f.setIzena("./src/ereduak/bezeroa.txt");
		f.run();
	}

}
