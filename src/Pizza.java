import java.util.ArrayList;

public class Pizza {
private String Nom;
private double Prix;


 public ArrayList<Ingrédient> Ingredients = new ArrayList<Ingrédient> ();
 public int nbIng= Ingredients.size();
public Pizza(String nom, double prix) {
	super();
	Nom = nom;
	Prix = prix;
	
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public double getPrix() {
	return Prix;
}

public void setPrix(double prix) {
	Prix = prix;
}

public void AddIng(Ingrédient g1) {
	Ingredients.add(g1);
	nbIng++;
	
}


	
public void SuppIng(Ingrédient g) {
	int i=0;
	boolean v=false;
	while(i<nbIng && !v ) {
		if(Ingredients.get(i) == g ) {
			Ingredients.remove(i);
			v=true;
		    
		    }
	   i++;
	}
	nbIng--;
}

public String AficherIngs() {
	String res;
	if(Ingredients.size()<=5) {
		res=Ingredients.get(0).getNom()+"\n";
	for(int s=1;s<Ingredients.size()-1;s++) 
		res=res+Ingredients.get(s).getNom()+"\n";
	res=res+Ingredients.get(Ingredients.size()-1).getNom();
	
	}
	else {
		int s=0;
		res="";
		while(s<Ingredients.size()-1) {
			res=res+Ingredients.get(s).getNom()+", "+Ingredients.get(s+1).getNom()+"\n";
			s+=2;
		}
	}
	return  res;
	}

public double calcul_prixPizza(int taille) {
	double res;
	if(taille==0)
		res =(Prix-(1.00/3.00*Prix));
	else if (taille==1)
		res = Prix;
	else
		res= ((Prix+(1.00/3.00*Prix)));
	
	return res;
	
	

}

}
