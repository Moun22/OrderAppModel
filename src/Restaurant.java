import java.util.ArrayList;

public class Restaurant {
    
	
    public ArrayList<Ingrédient> Ings= new ArrayList<Ingrédient>();
   
	private String Adresse_rest;
    private Employé e;
	public Employé getE() {
		return e;
	}

	public Restaurant(String adresse_rest) {
		super();
		Adresse_rest = adresse_rest;
		e=new Employé("employé de Rapizz à"+getAdresse_rest(),this);
	}




	
	



	public String getAdresse_rest() {
		return Adresse_rest;
	}

	public void setAdresse_rest(String adresse_rest) {
		Adresse_rest = adresse_rest;
	}

	
	
	
	
}
