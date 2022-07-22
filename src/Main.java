
import java.util.*;


public class Main  {
 
	public Restaurant R1;
	public Restaurant R2;
	public Restaurant R3;
	public Restaurant R4;
	public Restaurant R5;
	public Restaurant R6;
	
	public Livreur L1;
	public Livreur L2;
	public Livreur L3;
	public Livreur L4;
	public Livreur L5;
	public Livreur L6;
	public Livreur L7;
	
	public Ingrédient I1;
	public Ingrédient I2;
	public Ingrédient I3;
	public Ingrédient I4;
	public Ingrédient I5;
	public Ingrédient I6;
	public Ingrédient I7;
	public Ingrédient I8;
	public Ingrédient I9;
	public Ingrédient I10;
	public Ingrédient I11;
	public Ingrédient I12;
	public Ingrédient I13;
	public Ingrédient I14;
	public Ingrédient I15;
	public Ingrédient I16;
	public Ingrédient I17;
	public Ingrédient I18;
	public Ingrédient I19;
	public Ingrédient I20;
	public Ingrédient I21;
	public Ingrédient I22;
	public Ingrédient I23;
	public Ingrédient I24;
	public Ingrédient I25;
	public Ingrédient I26;
	public Ingrédient I27;
	public Ingrédient I28;
	public Ingrédient I29;
	public Ingrédient I30;
	public Ingrédient I31;
	
	public Pizza P1;
	public Pizza P2;
	public Pizza P3;
	public Pizza P4;
	public Pizza P5;
	public Pizza P6;
	public Pizza P7;
	public Pizza P8;
	public Pizza P9;
	public Pizza P10;
	public Pizza P11;
	public Pizza P12;
	public Pizza P13;
	public Pizza P14;
	public Pizza P15;
	public Pizza P16;
	public Pizza P17;
	public Pizza P18;
	public Pizza P19;
	public Pizza P20;
	public Pizza P21;
	public Pizza P22;
	public Pizza P23;
	public Pizza P24;
	
	
	public  ArrayList<Client> clients = new ArrayList<Client> ();
	public  ArrayList<Restaurant> restos = new ArrayList<Restaurant> ();
	public  ArrayList<Livreur> livreurs = new ArrayList<Livreur> ();
	
	
	/**
	 * 
	 */
	public Main() {
		
		//Les livreurs
		 L1= new Livreur("Badri","0776666723");
		 L2= new Livreur("Nazeem","0658495725");
		 L3= new Livreur("Stéphane","0620492123");
		 L4= new Livreur("Ismaeel","0738664075");
		 L5= new Livreur("Ifiok","0728452854");
		 L6= new Livreur("Jean-Claude","0643658453");
		 L7= new Livreur("Herbert","0776430723");
		 
		 
		
		//Les Restaurants
		 R1=new Restaurant("4 Place des Fédérés, 91000 Évry");
		 R2=new Restaurant("11 Avenue René Cassin, 77127 Lieusaint");
		 R3=new Restaurant("39 Bis Rue Feray, 91100 Corbeil-Essonnes");
		 R4=new Restaurant("81 Route de Grigny, 91130 Ris-Orangis");
		 R5=new Restaurant("12 Chemin du Moulin, 91350 Grigny");
		 R6=new Restaurant("28 Rue de la Fontaine, 91130 Ris-Orangis");
		 
		 restos.add(R1);
		 restos.add(R2);
		 restos.add(R3);
		 restos.add(R4);
		 restos.add(R5);
		 restos.add(R6);
		 
		
		//Les ingrédients;	
				I1= new Ingrédient("Sauce tomate");
				I1.Id_ing=0;
				 I2= new Ingrédient("mozzarella");
				I2.Id_ing=1;
				 I3= new Ingrédient("origan");
				I3.Id_ing=2;
				 I4= new Ingrédient("jambon");
				I4.Id_ing=3;
				 I5= new Ingrédient("champignons");
				I5.Id_ing=4;
				 I6= new Ingrédient("viande hachée");
				I6.Id_ing=5;
				 I7= new Ingrédient("poulet");
				I7.Id_ing=6;
				 I8= new Ingrédient("lardons");
				I8.Id_ing=7;
				 I9= new Ingrédient("œufs");
				I9.Id_ing=8;
				 I10= new Ingrédient("oignons");
				I10.Id_ing=9;
				 I11= new Ingrédient("thon");
				I11.Id_ing=10;
				 I12= new Ingrédient("poivrons");
				I12.Id_ing=11;
				 I13= new Ingrédient("olives");
				I13.Id_ing=12;
				 I14= new Ingrédient("anchois");
				I14.Id_ing=13;
				 I15= new Ingrédient("câpres");
				I15.Id_ing=14;
				 I16= new Ingrédient("chorizo");
				I16.Id_ing=15;
				 I17= new Ingrédient("artichauts");
				I17.Id_ing=16;
				 I18= new Ingrédient("viande grecque");
				I18.Id_ing=17;
				 I19= new Ingrédient("fromage de chèvre");
				I19.Id_ing=18;
				 I20= new Ingrédient("pommmes de terre");
				I20.Id_ing=19;
				 I21= new Ingrédient("merguez");
				I21.Id_ing=20;
				 I22= new Ingrédient("boursin");
				I22.Id_ing=21;
				 I23= new Ingrédient("cheddar");
				I23.Id_ing=22;
				 I24= new Ingrédient("piment  vert");
				I24.Id_ing=23;
				 I25= new Ingrédient("Crème fraîche");
				I25.Id_ing=24;
				 I26= new Ingrédient("rebolchon");
				I26.Id_ing=25;
				 I27= new Ingrédient("ananas");
				I27.Id_ing=26;
				 I28= new Ingrédient("bacon");
				I28.Id_ing=27;
				 I29= new Ingrédient("fromage à raclette");
				I29.Id_ing=28;
				 I30= new Ingrédient("saumon fumé");
				I30.Id_ing=29;
				 I31= new Ingrédient("Citron");
				I31.Id_ing=30;
				
			// Les Pizzas:	
				 P1= new Pizza("Marguerita", 7.00 );
			// Ajout des ingrédients dans la pizza	
				P1.AddIng(I1);
				P1.AddIng(I2);
				P1.AddIng(I3);
				
				 P2= new Pizza("Reine", 8.00 );
				P2.AddIng(I1);
				P2.AddIng(I2);
				P2.AddIng(I4);
				P2.AddIng(I5);
				 P3 = new Pizza("Campione", 8.00);
				P3.AddIng(I1);
				P3.AddIng(I2);
				P3.AddIng(I6);
				P3.AddIng(I5);
				 P4 = new Pizza("Paysanne", 8.00);
				P4.AddIng(I1);
				P4.AddIng(I2);
				P4.AddIng(I8);
				P4.AddIng(I10);
				P4.AddIng(I9);
				 P5 = new Pizza("Capri", 8.00);
				P5.AddIng(I1);
				P5.AddIng(I2);
				P5.AddIng(I7);
				P5.AddIng(I5);
				 P6 = new Pizza("Neptune", 8.00);
				P6.AddIng(I1);
				P6.AddIng(I2);
				P6.AddIng(I11);
				P6.AddIng(I12);
				P6.AddIng(I13);
				 P7 = new Pizza("Napolitaine", 8.00);
				P7.AddIng(I1);
				P7.AddIng(I2);
				P7.AddIng(I14);
				P7.AddIng(I15);
				P7.AddIng(I13);
				 P8 = new Pizza("3 jambons", 8.00);
				P8.AddIng(I1);
				P8.AddIng(I2);
				P8.AddIng(I4);
				P8.AddIng(I8);
				P8.AddIng(I16);
				 P9 = new Pizza("4 saisons", 8.00);
				P9.AddIng(I1);
				P9.AddIng(I2);
				P9.AddIng(I4);
				P9.AddIng(I5);
				P9.AddIng(I17);
				P9.AddIng(I12);
				 P10 = new Pizza("Calzone soufléé", 8.00);
				P10.AddIng(I1);
				P10.AddIng(I2);
				P10.AddIng(I9);
				P10.AddIng(I6);
				 P11 = new Pizza("Kebab", 9.00);
				P11.AddIng(I1);
				P11.AddIng(I2);
				P11.AddIng(I10);
				P11.AddIng(I18);
				 P12 = new Pizza("Bikette", 9.00);
				P12.AddIng(I1);
				P12.AddIng(I2);
				P12.AddIng(I7);
				P12.AddIng(I19);
				P12.AddIng(I20);
				 P13 = new Pizza("Orienale", 9.00);
				P13.AddIng(I1);
				P13.AddIng(I2);
				P13.AddIng(I21);
				P13.AddIng(I10);
				P13.AddIng(I9);
				P13.AddIng(I12);
				 P14 = new Pizza("Boursin", 9.00);
				P14.AddIng(I1);
				P14.AddIng(I2);
				P14.AddIng(I6);
				P14.AddIng(I22);
				P14.AddIng(I10);
				 P15 = new Pizza("Extravagante", 9.50);
				P15.AddIng(I1);
				P15.AddIng(I2);
				P15.AddIng(I6);
				P15.AddIng(I22);
				P15.AddIng(I23);
				P15.AddIng(I10);
				P15.AddIng(I12);
				P15.AddIng(I13);
				 P16 = new Pizza("Délcieuse", 9.50);
				P16.AddIng(I1);
				P16.AddIng(I2);
				P16.AddIng(I6);
				P16.AddIng(I21);
				P16.AddIng(I10);
				P16.AddIng(I16);
				 P17 = new Pizza("Au fromage souflée", 9.50);
				P17.AddIng(I25);
				P17.AddIng(I2);
				P17.AddIng(I19);
				P17.AddIng(I23);
				P17.AddIng(I29);
				 P18 = new Pizza("Campagnarde", 9.50);
				P18.AddIng(I25);
				P18.AddIng(I2);
				P18.AddIng(I7);
				P18.AddIng(I9);
				P18.AddIng(I20);
				 P19 = new Pizza("Tartiflette", 9.50);
				P19.AddIng(I25);
				P19.AddIng(I2);
				P19.AddIng(I8);
				P19.AddIng(I26);
				 P20 = new Pizza("Auvergnate", 9.50);
				P20.AddIng(I25);
				P20.AddIng(I6);
				P20.AddIng(I9);
				P20.AddIng(I20);
				 P21 = new Pizza("Hawaïenne", 9.50);
				P21.AddIng(I25);
				P21.AddIng(I2);
				P21.AddIng(I4);
				P21.AddIng(I27);
				 P22 = new Pizza("Raclette", 9.50);
				P22.AddIng(I25);
				P22.AddIng(I2);
				P22.AddIng(I4);
				P22.AddIng(I20);
				P22.AddIng(I29);
				 P23 = new Pizza("Norégienne", 9.50);
				P23.AddIng(I25);
				P23.AddIng(I2);
				P23.AddIng(I30);
				P23.AddIng(I31);
				 P24 = new Pizza("Bacon", 9.50);
				P24.AddIng(I25);
				P24.AddIng(I2);
				P24.AddIng(I24);
				P24.AddIng(I9);
				P24.AddIng(I20);
				
			
	}
	

	
	

	public static void main(String[] args)  {
		 
	
		
		
	}
	
	

}
