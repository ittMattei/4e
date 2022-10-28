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
     
   }
}
