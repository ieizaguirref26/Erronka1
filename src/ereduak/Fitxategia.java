package ereduak;

import java.io.*;
import java.util.HashMap;
import java.util.Map; 
import kontrolagailuak.Teklatua;

public class Fitxategia {
	private String fitxategiIzena;
	private Map<String, Langileak> mapa;
	private String balioak;
	
	// Zerrendekin, List<Langilea2> zerrenda; jartzea askoz hobea da.
	// Beste zerrenda bat sortzeko hau egin ahal da: List<Langilea2> zerrenda2 = new ArrayList<Langilea2>();

	public Fitxategia() {

	}

	public Fitxategia(String fitxategiIzena) { // edo public Fitxategia(String izena) { fitxategiIzena = izena; } jarri ahalko genuke.
		this.fitxategiIzena = fitxategiIzena;
	}

	public void setIzena(String fitxategiIzena) {
		this.fitxategiIzena = fitxategiIzena;
	}

	public void run() {
		fitxategiaIrakurri();
		inprimatu();
	}

	public void fitxategiaIrakurri() {
		// Langilea 1 = new Langilea();
		// Langilea2[] langileZerrenda = new Langilea2[1000]; baina 1000 edo zenbat langile diren ez dakigunez, ArrayList bat sortu eta erabili.
		
		mapa = new HashMap<String, Langileak>();
		
		try {
			FileReader fr = new FileReader(fitxategiIzena);
			BufferedReader br = new BufferedReader(fr); // buffer es como un caché.
			br.readLine(); //hau jarriz, fitxategiaren lehenengo lerroa ez du irakurriko.
			do {
				String lerroa = br.readLine();
				if (lerroa == null)
					break;
				String[] tokenak = lerroa.split("\t");
				
				Langileak l = new Langileak();
				l.setID(tokenak[0]);
				l.setIzena(tokenak[1]);
				l.setAbizena(tokenak[2]);
				l.setTelefonoa(tokenak[3]);
				l.setAltaEguna(tokenak[4]);
				mapa.put(tokenak[0], l);
				
			} while (true);
			br.close();
			fr.close();
			
		} catch (Exception e) {
			IO.println(e.toString());
		}
	}
	
	public void inprimatu() {
		/*for (Integer i = 0; i < zerrenda.size();++i) {
			Langilea2 l = (Langilea2) zerrenda.get(i);
			IO.println(l.getID()+" "+l.getIzena());
		}*/
		try {
		balioak = Teklatua.irakurri();
		Langileak l = mapa.get(balioak);
			
		IO.println(l.getIzena() + " " + l.getAbizena() + " " + l.getTelefonoa() + " " + l.getAltaEguna());
		} catch (Exception e) {
			IO.println("Langilea ez da existitzen. Saiatu berriro.");
		}
	}

	public static void main(String[] args) {
		IO.println("Sartu langilearen IDa:");
		Fitxategia f = new Fitxategia();
		f.setIzena("./src/ereduak/langileak.txt");
		f.run();
	}
}