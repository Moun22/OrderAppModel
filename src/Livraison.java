
import java.time.Duration;
import java.time.LocalTime; 
public class Livraison {
	
	private int Id_Liv;
	private LocalTime Heure_Depart;
	private LocalTime Heure_arrive;
	public Livreur L;
	public Commande C;
    public Livraison(int id_Liv, LocalTime heure_Depart,LocalTime  heure_arrive) {
		super();
		Id_Liv = id_Liv;
		Heure_Depart = heure_Depart;
		
		Heure_arrive = heure_arrive;
	
		
		
			
		
	
}



public void setL(Livreur l) {
	L = l;
}

public void setC(Commande c) {
	C = c;
}

public int getId_Liv() {
	return Id_Liv;
}

public void setId_Liv(int id_Liv) {
	Id_Liv = id_Liv;
}

public int getHeure_Depart() {
	return Heure_Depart.getHour();
}
public int getMinute_Depart() {
	return Heure_Depart.getMinute();
}

public void setHeure_Depart(LocalTime heure_Depart) {
	Heure_Depart = heure_Depart;
}

public int getHeure_arrive() {
	return Heure_arrive.getHour();
}
public int getMinute_arrive() {
	return Heure_arrive.getMinute();
}

public void setHeure_arrive(LocalTime heure_arrive) {
	Heure_arrive = heure_arrive;
}



public Livreur getL() {
	return L;
}



public Commande getC() {
	return C;
}
	
public boolean Retard() {
	return Duration.between(Heure_Depart, Heure_arrive).toMinutes()>30;
}
}
