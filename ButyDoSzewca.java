package zadaniaGotoweAlx;

import javax.swing.JOptionPane;

public class ButyDoSzewca {
	/**
	 * Zadanie 2.1 Buty do szewca :) Napisz taki program: użytkownik ma podać, w
	 * jaki dzień tygodnia oddał buty do szewca (poniedziałek to dzień 1, wtorek to
	 * dzień 2 itp.). Ma też podać, ile dni będzie trwała naprawa. Program ma
	 * wypisać, w jaki dzień tygodnia buty będą gotowe do odbioru. Jeśli tak będzie
	 * ci wygodniej, możesz założyć, że naprawa butów nigdy nie będzie trwała dłużej
	 * niż siedem dni.
	 * 
	 */

	public static void main(String[] args) {
		try {
			String imie = JOptionPane.showInputDialog("Jak masz na imię?");

			String dzienTxt = JOptionPane.showInputDialog("Kiedy " + imie + " podałes buty do szewca - podaj dzień");
			int dzien = Integer.parseInt(dzienTxt);
			int dniNaprawy = 3;

			String[] dzienTygodnia = new String[5];
			dzienTygodnia[0] = "poniedziałek";
			dzienTygodnia[1] = "wtorek";
			dzienTygodnia[2] = "środa";
			dzienTygodnia[3] = "czwartek";
			dzienTygodnia[4] = "piątek";

			if (dzien == 1) {

				JOptionPane.showMessageDialog(null, imie + " podałeś buty w poniedziałek, naprawa będzie trwała "
						+ dniNaprawy + " , odbierzesz buty w: " + dzienTygodnia[3]);
			} else if (dzien == 2) {
				JOptionPane.showMessageDialog(null,
						imie + " podałeś buty w poniedziałek, naprawa będzie trwała 3 dni, odbierzesz buty w: "
								+ dzienTygodnia[4]);
			} else if (dzien == 3) {
				JOptionPane.showMessageDialog(null,
						imie + " podałeś buty w poniedziałek, naprawa będzie trwała 3 dni, odbierzesz buty w: "
								+ dzienTygodnia[0]);
			} else if (dzien == 4) {
				JOptionPane.showMessageDialog(null,
						imie + " podałeś buty w poniedziałek, naprawa będzie trwała 3 dni, odbierzesz buty w: "
								+ dzienTygodnia[1]);
			} else if (dzien == 5) {
				JOptionPane.showMessageDialog(null,
						imie + " podałeś buty w poniedziałek, naprawa będzie trwała 3 dni, odbierzesz buty w: "
								+ dzienTygodnia[2]);

			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Zły format liczby", "Błąd", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "Do widzenia");
		System.exit(0);

	}

}
