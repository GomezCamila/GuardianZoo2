package main;

import NuevaEspecie.MurciBat;


public class BatTest {
public static void main(String[]args) {
	
	MurciBat MurciMurci= new MurciBat(0, 0, 0, 0);
	System.out.println("==============================================================================");
	System.out.println("Guardia del zoo: - Hoy se ha descubirto un nuevo especimen del murcielago  ");
    System.out.println("que hemos nombrados como Murciligo pero abreviado como Murci.");	
    System.out.println("Guardia del zoo:- Ayudanos a localizar a Murci.");
    System.out.println("==============================================================================");
   
    
	
	System.out.println("*****************************************");
	
	System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
	
	System.out.println("*****************************************");

     MurciMurci.Flay();
    System.out.println("Muerci a empezado a volar: " + MurciMurci.getFlay());
   

   
    
    System.out.println("*****************************************");
	
	System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
	
	System.out.println("******************************************");

    

	System.out.println("Animal comio humano: + "+ MurciMurci.getEatHumans());
    MurciMurci.eatHumans();
    System.out.println("=================================================");
    System.out.println("ANIMAL ATERRIZO CERCA DE LA CIUDAD 1-PEZCITTY");
    System.out.println("=================================================");

	 System.out.println("*****************************************");
		
	 System.out.print("Vida del nuevo animal: ");
	 MurciMurci.displayEnergia();
		
	
	 System.out.println("******************************************");

     MurciMurci.attackTown();
     System.out.println("El animal a entrado a la ciudad:");
     System.out.println("Ciudad PEZCITTY destruida: " + MurciMurci.getAttackTown());

     
     System.out.println("*****************************************");
		
	 System.out.print("Vida del nuevo animal: ");
	 MurciMurci.displayEnergia();
		
	 System.out.println("******************************************");

	 System.out.println("Animal comio humano: + "+ MurciMurci.getEatHumans());
	    MurciMurci.eatHumans();


	System.out.println("*****************************************");
			
	System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
			
	System.out.println("******************************************");
    

	 int i=1;
		while(i <= 6 ) {
			//System.out.println("Come banana: + "+ tito.getComerBananas());
			 MurciMurci.eatHumans();
    System.out.println("Animal comio humano: + " + MurciMurci.getEatHumans());
			i++;
		}
	System.out.println("*****************************************");
	System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
				
	System.out.println("******************************************");
	    
    
	System.out.println("=================================================");
	System.out.println("ANIMAL se CERCA DE LA CIUDAD 2-FONDO DE BICKYNI");
	System.out.println("=================================================");

	MurciMurci.attackTown();
	System.out.println("- El animal a entrado a la ciudad");
	System.out.println("Ciudad FONDO DE BICKYNI destruida: " + MurciMurci.getAttackTown());

		     
	System.out.println("*****************************************");
			
    System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
					
	System.out.println("******************************************");
		    
    MurciMurci.Flay();
    System.out.println("Empezo a volar hacia la ciudad 3- PUEBLO PALETA" + MurciMurci.getFlay());
          
    System.out.println("=================================================");
    System.out.println("ANIMAL se CERCA DE LA CIUDAD 3-PUEBLO PALETA");
    System.out.println("=================================================");

		     
	     
    MurciMurci.attackTown();
	System.out.println("El animal a entrado a la ciudad:");
    System.out.println("Ciudad PUEBLO PALETA fue destruida: " + MurciMurci.getAttackTown());

		  
	System.out.println("*****************************************");
					
	System.out.print("Vida del nuevo animal: ");
	MurciMurci.displayEnergia();
	System.out.println("******************************************");
				    
}
}
