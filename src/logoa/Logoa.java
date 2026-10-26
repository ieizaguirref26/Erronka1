package logoa;

public class Logoa {
	public void marraztu(Integer aldea) {
		int tamaina = 4;
		for (Integer n = tamaina - 1; n > 0; --n) {
			for (Integer p = (tamaina - 1); p > n; --p)
				IO.print(" ");
			for (Integer i = -1; i < (2 * n); ++i)
				IO.print("*");
			IO.println();
		}
		for (Integer j = 0; j < tamaina; ++j) {
			for (Integer p = (tamaina - 1); p > j; p--)
				IO.print(" ");
			for (Integer i = -1; i < (2 * j); ++i)
				IO.print("*");
			IO.println();
		}
		for (Integer l = 0; l < tamaina; ++l) {
			for (Integer p = (tamaina - 1); p > l; p--)
				IO.print(" ");
			IO.print("*");
			for (Integer i = 1; i < (2 * l); ++i)
				IO.print(" ");
			if (l == 0)
				IO.print("");
			else
				IO.print("*");
			IO.println();
		}
		for (Integer a = 1; a < (2 * tamaina); ++a)
			IO.print("*");
		IO.println();
			for (Integer j = 0; j < tamaina; ++j) {
				for (Integer p = 1; p < tamaina; ++p)
					IO.print(" ");
			IO.print("*");
			IO.println();
		}
		
		for (Integer a = 1; a < (2 * tamaina); ++a)
			IO.print("*");
		IO.println();
		for (Integer l = 0; l < tamaina; ++l) {
			for (Integer p = (tamaina - 1); p > l; p--)
				IO.print(" ");
			IO.print("*");
			for (Integer i = 1; i < (2 * l); ++i)
				IO.print(" ");
			if (l == 0)
				IO.print("");
			else
				IO.print("*");
			IO.println();
		}
	}
}
