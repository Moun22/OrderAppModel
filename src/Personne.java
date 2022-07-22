
public class Personne {

	private	String Numero_de_Telephone;
	private String Nom;
	private String Adresse;
	
	public Personne(String numero_de_Telephone, String nom, String adresse) {
		super();
		Numero_de_Telephone = numero_de_Telephone;
		Nom = nom;
		Adresse = adresse;
	}

	public Personne(String numero_de_Telephone, String adresse) {
		super();
		Numero_de_Telephone = numero_de_Telephone;
		Adresse = adresse;
		
	}
	
	public Personne(String nom) {
		super();
		
	
		Nom= nom ;
		}
	



	public String getNumero_de_Telephone() {
		return Numero_de_Telephone;
	}

	public void setNumero_de_Telephone(String numero_de_Telephone) {
		Numero_de_Telephone = numero_de_Telephone;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	

}
