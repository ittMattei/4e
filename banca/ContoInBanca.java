package banca;

	/**
	 * Un conto in banca ha un saldo che può essere modificato
	 * da versamenti e prelievi
	 * @author Prof
	 */
	public class ContoInBanca {

		private String proprietario;
		private double saldo;
		private int idConto;
		private static int progId = 0;


		   /**
		      Crea un conto vuoto
		   */
		   public ContoInBanca(String owner)
		   {
				this.proprietario = owner;
			    this.saldo = 0;
				idConto = ++progId;
		   }

		   /**
		      Crea un conto non vuoto
		      @param saldoIniziale il saldo iniziale
		   */
		   public ContoInBanca(double saldoIniziale, String owner)
		   {
			this.proprietario = owner;
			this.saldo = saldoIniziale;
			idConto = ++progId;
		   }

		   public void setOwner(String owner)
		   {
				this.proprietario = owner;
	 	   }
		   /**
		      Effettua un versamento
		      @param quantita l'entità del versamento
		   */
		   public void versa(double quantita)
		   {
				saldo = saldo + quantita;
	 	   }

		   /**
		      Effettua un prelievo
		      @param quantita l'entità del prelievo
		   */
		   public void preleva(double quantita)
		   {
			saldo = saldo - quantita;
		   }
		   /**
		      Ispeziona il valore del saldo
		      @return il saldo corrente
		   */
		   public void setSaldo(double newSaldo)
		   {
		      this.saldo = newSaldo;
		   }
		   /**
		      Ispeziona il valore del saldo
		      @return il saldo corrente
		   */
		   public double getSaldo()
		   {
		      return saldo;
		   }
		   
		   public String toString()
		   {
			   String tmp="";
			   tmp += "Id: " + this.idConto;
			   tmp += "\nSaldo: " + this.saldo;
			   tmp += "\nProprietario: " + this.proprietario;
			   
			 return tmp;
	 	   }
			
		   public static int getLastId()
		   {
			   return progId;
		   }
		}
	

