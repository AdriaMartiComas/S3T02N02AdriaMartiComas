package s03t02n02adriamarticomas;

public class Targeta implements TipusPagament {

	@Override
	public String tipus() {
		// aqui es pot afegir logica de pagament amb targeta

		return "Estas pagant amb targeta";
	}
}
