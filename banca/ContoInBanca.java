package banca;

	/**
	 * Un conto in banca ha un saldo che può essere modificato
	 * da versamenti e prelievi
	 * @author Prof
	 */
	public class ContoInBanca {

		private double saldo;
		private int idConto;
		private static int progId = 0;


		   /**
		      Crea un conto vuoto
		   */
		   public ContoInBanca()
		   {
				this.saldo = 0;
				idConto = ++progId;
		   }

		   /**
		      Crea un conto non vuoto
		      @param saldoIniziale il saldo iniziale
		   */
		   public ContoInBanca(double saldoIniziale)
		   {
			this.saldo = saldoIniziale;
			idConto = ++progId;
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
		   public double getSaldo()
		   {
		      return saldo;
		   }
		
	}

