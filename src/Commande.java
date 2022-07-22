import java.time.LocalDateTime;
import java.util.ArrayList;
public class Commande {
   public  Employé ep;
   public  Restaurant rp;
   public  Livreur liv;
   
   public ArrayList<LignePizza> Pizza_comm = new ArrayList<LignePizza> ();
  
	private int numComm;
	 private LocalDateTime Datecommande;
	public Commande(int numComm, LocalDateTime datecommande) {
		super();
		this.numComm = numComm;
		Datecommande = datecommande;
	}
	public  ArrayList<LignePizza> getPizza_comm() {
		return Pizza_comm;
	}
	
	
	
	
	public int getNumComm() {
		return numComm;
	}
	public void setNumComm(int numComm) {
		this.numComm = numComm;
	}
	public LocalDateTime getDatecommande() {
		return Datecommande;
	}
	public void setDatecommande(LocalDateTime datecommande) {
		Datecommande = datecommande;
	}
	public void Add_Pizza(LignePizza Pi) {
		Pizza_comm.add(Pi);
	}




	public double Calcul_prixComm() {
		double res=0;
		for(int i =0;i<Pizza_comm.size();i++)
			res += Pizza_comm.get(i).calcul_prixPizza();
		
		return res;
		
	}

}

