package s03t02n02adriamarticomas;

public class Paypal implements TipusPagament{

	@Override
	public String tipus() {
		//aqui es pot afegir logica de pagament amb paypal

		return "Estas pagant amb paypal";

	}
	
}
