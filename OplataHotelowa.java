package zadaniaGotoweAlx;

import javax.swing.JOptionPane;

public class OplataHotelowa {

	public static void main(String[] args) {
		/**
		 * Zadanie 2.2 Opłata hotelowa Potem napisz taki program: użytkownik podaje swój
		 * wiek i ile nocy spędzi w hotelu, a program wylicza, ile trzeba zapłacić.
		 * Zasady są takie: - nieletni (poniżej 18 roku życia) płacą 100 zł za noc -
		 * dorośli (ci, którzy mają przynajmniej 18 lat ale mniej niż 65 lat) płacą: -
		 * 200 zł za noc, jeśli nocują jedną noc - 180 zł za noc, jeśli nocują
		 * przynajmniej dwie ale mniej niż pięć nocy - 150 zł za noc, jeśli nocują pięć
		 * lub więcej nocy - emeryci (ci, którzy mają przynajmniej 65 lat), płacą jak
		 * dorośli, ale z 10% zniżki Przykładowo: jeśli użytkownik ma 70 lat i spędzi w
		 * hotelu dziesięć nocy, zapłaci 150 zł za noc z 10% zniżki, czyli 150-15 zł za
		 * noc, czyli 135 zł za noc, czyli 1350 zł Program można zrealizować jako
		 * pytanie-odpowiedź, albo jako aplikację okienkową w Swingu.
	
		 */
		
try {
    
	
	String wiekTxt = JOptionPane
				.showInputDialog(" Witamy państwo u nas w Four Seasons Hotels and Resorts Online. Podaj swój wiek.");
		int wiek = Integer.parseInt(wiekTxt);

		String nocyTxt = JOptionPane.showInputDialog(" Podaj, ile nocy spędzisz?");
		int nocy = Integer.parseInt(nocyTxt);
	
		if (wiek <= 17) {
			JOptionPane.showMessageDialog(null,
					" Jesteś nieletnim płacisz, do zapłaty, wraz z 50% zniżką: " + nocy * 100 + " zł ");
		}

		if (wiek >= 18 && wiek <= 64) {
			if (nocy >= 2 && nocy < 5) {
				JOptionPane.showMessageDialog(null,
						" Nocyjesz powyżej 1 nocy, przysługuje ciebie zniżka, do zapłaty: " + nocy * 180 + "zł");
				return;
			}
			if (nocy >= 5) {
				JOptionPane.showMessageDialog(null,
						" Nocyjesz powyżej 4 nocy, przysługuje ciebie zniżka, do zapłaty: " + nocy * 150 + "zł");
				return;
			}
			JOptionPane.showMessageDialog(null, " Jesteś dorosłym płacisz - 200 zł ");
		}

		if (wiek >= 65) {
			if (nocy >= 2 && nocy <= 4) {
				JOptionPane.showMessageDialog(null,
						" Jesteś emerytem, do zapłaty, wraz z zniżką: " + (nocy * 1620) * 10 / 100 + "zł");
				return;
			}
			if (nocy >= 5) {
				JOptionPane.showMessageDialog(null,
						" Jesteś emerytem, do zapłaty, wraz z zniżką: " + (nocy * 1458) * 10 / 100 + "zł");
				return;
			}
			JOptionPane.showMessageDialog(null, " Jesteś emerytem, płacisz, wraz z zniżką 10% - 180 zł ");
		}
	
		System.exit(0);
	} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Zły format liczby", "Błąd", JOptionPane.ERROR_MESSAGE);
		return ;
	}

}
	}

