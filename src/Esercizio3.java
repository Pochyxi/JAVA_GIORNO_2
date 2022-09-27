
public class Esercizio3 {

	public static void main(String[] args) {
		Articolo a1 = new Articolo("bellissimo cappottino", 1300.5, 1);
		Articolo a2 = new Articolo("Calzini in rame", 15.55, 5);
		Articolo a3 = new Articolo("Polpacci sostitutivi", 4880, 1);
		Cliente c1 = new Cliente("Adiener", "Lopez Velazquez", "adienerlopez@gmail.com", "01/08/2022");
		
		Carrello carr1 = new Carrello(c1, new Articolo[] {a1, a2, a3});
		
		System.out.println(carr1.calcolaTotaleCosto());
		

	}

}


class Articolo {
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int pezziDisponibili;
	
	Articolo( String _descrizioneArticolo, double _prezzo, int _pezziDisponibili) {
		this.descrizioneArticolo = _descrizioneArticolo;
		this.prezzo = _prezzo;
		this.pezziDisponibili = _pezziDisponibili;
	};
};

class Cliente {
	int codiceCliente;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
	
	Cliente( String _nome, String _cognome, String _email, String _dataIscrizione) {
		this.nome = _nome;
		this.cognome = _cognome;
		this.email = _email;
		this.dataIscrizione = _dataIscrizione;
	};
};

class Carrello {
	Cliente clienteAssociato;
	Articolo[] elencoArticoli;
	double totaleCostoArticoli;

	Carrello(Cliente _clienteAssociato, Articolo[] _elencoArticoli) {
		this.clienteAssociato = _clienteAssociato;
		this.elencoArticoli = _elencoArticoli;
	};
	
	double calcolaTotaleCosto() {
		double totale = 0;
		
		for(int i = 0; i < this.elencoArticoli.length; i++) {
			totale = totale + this.elencoArticoli[i].prezzo;
		};
		
		return totale;
	};
	
};




















