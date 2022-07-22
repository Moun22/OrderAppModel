import java.util.ArrayList;

public class Client extends Personne {
  public int nbPizza=0;
  public double Solde=0.0;
  public ArrayList<Commande> commandesclient=new ArrayList<Commande> ();
	public Client(String numero_de_Telephone, String nom, String adresse) {
		super(numero_de_Telephone, nom, adresse);
		
	}
	
	public void addNbPizza(int add) {
		 nbPizza+=add;
	}
	public double getSolde() {
		return Solde;
	}
	public void setSolde(double solde) {
		Solde += solde;
	}
	public void takeSolde(double solde) {
		Solde -= solde;
	}
 
	public boolean verifnbPizza() {
		if(nbPizza == 10) {
			nbPizza=0;
			return true;
		}
		else {
			nbPizza++;
			return false;
		}
	}
}
