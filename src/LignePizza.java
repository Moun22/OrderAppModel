
public class LignePizza {
	private int quantité;
	private int taille;
	private Pizza P;
	public Commande C;
	public LignePizza(Pizza p,int taille, int quantité) {
		super();
		this.quantité = quantité;
		this.taille = taille;
		this.P=p;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public Pizza getP() {
		return P;
	}
	public void setP(Pizza p) {
		P = p;
	}
	public Commande getC() {
		return C;
	}
	public void setC(Commande c) {
		C = c;
	}

    public double calcul_prixPizza() {
    	if(taille==0)
    		return (P.getPrix()-(1.00/3.00*P.getPrix()))*quantité;
    	else if (taille==1)
    		return  P.getPrix()*quantité;
    	else
    		return (P.getPrix()+(1.00/3.00*P.getPrix()))*quantité;
    	 }

}


