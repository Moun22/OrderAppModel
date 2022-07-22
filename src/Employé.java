
import java.util.ArrayList;

;
public class Employé extends Personne {
    private Commande Com_e;
	
	public void setCom_e(Commande com_e) {
		Com_e = com_e;
	}






	private Restaurant rest;
	
	public Employé(String nom,Restaurant rest) {
		super(nom);
		this.rest=rest;
	}
	
	
	public Restaurant getRest() {
		return rest;
	}
	public void setRest(Restaurant rest) {
		this.rest = rest;
	}
	

	public Commande getCom_e() {
		return Com_e;
	}

	

	
		
	
	
	

  
	public String Check_Commande(Client cl) {
		
		String res=null;
		ArrayList<Commande> com =cl.commandesclient;
		ArrayList<LignePizza> lp=com.get(com.size()-1).getPizza_comm();
		
		for(int j=0;j<lp.size();j++) 
			res+=(" "+(j+1)+" ) "+lp.get(j).getQuantité()+" "+lp.get(j).getP().getNom()+"de taille "+lp.get(j).getTaille()+"");
	
		
		
		   
			return res;
		
		
	}
}