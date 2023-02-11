package alberoproject;

import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		creaDipendenti();
	}

	public static void creaDipendenti() {
		System.out.print("Num. dipendenti: ");
		int nd = sc.nextInt();
		
		Dipendenti lista = new Dipendenti(nd);
		
		for (int i=0; i<nd; i++) {
			sc.nextLine();
			System.out.print("Nominativo dipendente: ");
			String nominativod = sc.nextLine();
			System.out.print("Sesso dipendente: ");
			String sessod = sc.nextLine();
			System.out.print("Indirizzo dipendente: ");
			String indirizzod = sc.nextLine();
			Dipendente d = new Dipendente(nominativod, sessod, indirizzod);
			lista.addDipendente(d, i);
		}
		
		sc.nextLine();
		System.out.print("Stampa dipendenti ");
		System.out.print("\n");
		for (int l=0; l<nd; l++) {
			lista.StampaDipendente(l);
		}
	}
}
