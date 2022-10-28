package banca;

import java.util.Scanner;

public class MenuDemo
{
   public static void main(String[] args)
   {
      var conti = new ContoInBanca[10];
      
	   Menu mainMenu = new Menu();
      
      mainMenu.addOption("Apri un nuovo conto");
      mainMenu.addOption("Accedi ad un conto esistente");
      mainMenu.addOption("Aiuto");
      mainMenu.addOption("Esci");
      mainMenu.display();
      
      Scanner in = new Scanner(System.in);
      
       System.out.print("Inserire il nominativo del proprietario: ");
      			String prop = in.next();
      			
      			System.out.print("Inserire il saldo iniziale: ");
      			double saldoIniz  = in.nextDouble();
      			
      			conti[ContoInBanca.getLastId()] = new ContoInBanca(saldoIniz,prop);
      			
   
      
      for(ContoInBanca element : conti)
      {
    	  System.out.println(element.toString());
      }
   }
}