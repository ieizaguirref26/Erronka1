package kontrolagailuak;

import ereduak.*;

import java.util.Map; 

public class KontrolagailuNagusia {
	
	private Map<String, Langileak> mapa;
	private String balioak;

	public KontrolagailuNagusia() {
		Erabiltzailea();
		begiztaNagusia();
	}

	private void Erabiltzailea() {
		Erabiltzailea m = new Erabiltzailea();
		m.inprimatu();
		String aukera = "";

		while (!aukera.equals(" ")) {
			aukera = m.getAukera();
			if (aukera.equals("ADMIN")) {

				Pasahitza();

			} else {
				IO.println();
				IO.println("Erabiltzailea okerra da, saiatu berriro:");
			}
		}
	}

	private void Pasahitza() {
		IO.println();
		Pasahitza p = new Pasahitza();
		p.inprimatu();
		String aukera = "";

		while (!aukera.equals(" ")) {
			aukera = p.getAukera();
			if (aukera.equals("1234FP")) {
				IO.println();
				Logoa l = new Logoa();
				l.marraztu(7);
				IO.println();
				begiztaNagusia();

			} else {
				IO.println();
				IO.println("Pasahitza okerra da, saiatu berriro:");
			}
		}
	}

	private void begiztaNagusia() {
		Menua m = new Menua();
		String aukera = "";

		while (!aukera.equals("4")) {
			IO.println();
			m.inprimatuMenuNagusia();
			aukera = m.getAukera();
			if (aukera.equals("1")) {
				Aukera1();
			} else if (aukera.equals("2")) {
				Aukera2();
			} else if (aukera.equals("3")) {
				Aukera3();
			} else if (aukera.equals("4")) {
				saioaItxi();
			} else {
				IO.println("Idatzi aukera zuzena");
			}
		}
	}

	private void Aukera1() {
		IO.println();
		Aukera1 m = new Aukera1();
		m.inprimatu();
		String aukera = "";

		while (!aukera.equals("3")) {
			aukera = m.getAukera();
			if (aukera.equals("1")) {
				Fitxategia();
			} else if (aukera.equals("2")) {

			} else if (aukera.equals("3")) {
			} else {
				IO.println("Idatzi aukera zuzena");
			}
		}
	}

	private void Fitxategia() {
		IO.println("\n" + "Sartu langilearen IDa:");
		Fitxategia f = new Fitxategia();
		f.inprimatu();
		String aukera ="";
		
		while (!aukera.equals("exit")) {
			balioak = Teklatua.irakurri();
			aukera = balioak;

		Langileak l = mapa.get(balioak);
		
		IO.println(l.getIzena() + " " + l.getAbizena() + " " + l.getTelefonoa() + " " + l.getAltaEguna());
		
		if (aukera.equals("exit")) {
		} else {
			IO.println("Idatzi existitzen den IDa.");
			}
		}
	}

	private void Aukera2() {
		IO.println();
		Aukera2 m = new Aukera2();
		m.inprimatu();
		String aukera = "";

		while (!aukera.equals("3")) {
			aukera = m.getAukera();
			if (aukera.equals("1")) {

			} else if (aukera.equals("2")) {

			} else if (aukera.equals("3")) {
			} else {
				IO.println("Idatzi aukera zuzena");
			}
		}
	}

	private void Aukera3() {
		IO.println();
		Aukera3 m = new Aukera3();
		m.inprimatu();
		String aukera = "";

		while (!aukera.equals("2")) {
			aukera = m.getAukera();
			if (aukera.equals("1")) {

			} else if (aukera.equals("2")) {
			} else {
				IO.println("Idatzi aukera zuzena");
			}
		}
	}

	private void saioaItxi() {
		IO.println();
		SaioaItxi m = new SaioaItxi();
		m.inprimatu();
		String aukera = "";

		while (!aukera.equals("5")) {
			aukera = m.getAukera();
			if (aukera.equals("Bai")) {
				Erabiltzailea();
			} else if (aukera.equals("Ez")) {
				begiztaNagusia();
			} else {
				IO.println("Idatzi 'Bai' edo 'Ez'");
			}
		}
	}

	public static void main(String[] args) {
		new KontrolagailuNagusia();

	}
}