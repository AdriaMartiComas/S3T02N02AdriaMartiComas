package s03t02n02adriamarticomas;

public class BotigaSabates {

	private String nom;
	private PassarelaPagament passarelaPagament;

	public BotigaSabates(String nom) {
		this.nom = nom;
		this.passarelaPagament = new PassarelaPagament();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public PassarelaPagament getPassarelaPagament() {
		return passarelaPagament;
	}

	public void setPassarelaPagament(PassarelaPagament passarelaPagament) {
		this.passarelaPagament = passarelaPagament;
	}

}
