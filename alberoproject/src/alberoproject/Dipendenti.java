package alberoproject;

public class Dipendenti {
	private Dipendente[] lista;
	
	public Dipendenti(int i) {
		lista = new Dipendente[i];
	}

	public Dipendente[] getLista() {
		return lista;
	}

	public void setLista(Dipendente[] lista) {
		this.lista = lista;
	}
	
	public void addDipendente(Dipendente d, int i) {
		lista[i] = d;
	}
	
	public void StampaDipendente(int l) {
		System.out.print("Nominativo: ");
		System.out.print(lista[l].getNominativo());
		System.out.print(" Sesso: ");
		System.out.print(lista[l].getSesso());
		System.out.print(" Indirizzo: ");
		System.out.print(lista[l].getIndirizzo());
		System.out.print("\n");
	}
	
}
