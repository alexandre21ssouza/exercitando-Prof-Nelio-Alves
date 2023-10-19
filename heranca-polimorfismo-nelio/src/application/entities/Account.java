package application.entities;


/*Conta
 * comum
 */

/* Herança é uma associação entre classes
 * (e não entre objetos), sendo assim, ao
 * extender ou extends uma classe, elas se 
 * tornam um só objeto e não dois distintos
 * como na composição
 */

//Super classe ou classe base
public class Account {
	
	//Número da conta
	private Integer number;
	//Nome Cliente
	private String holder;
	
	/*Para que o método (loan da classe BusinessAcount tenha acesso
	ao balance) uso o protected, que pode ser acessado por outra classe
	do mesmo pacote*/
	//Saldo da conta
	protected Double balance;
	
	
	public Account() {
	}

	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getnumber() {
		return number;
	}


	public void setnumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}


	/*O set é removido pelo fato de não poder mudar
	 *  o saldo da conta livremente
	 */
//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}
	
	
	//Saque *balance é saldo
	public void whithdraw(double amount) {
		balance -= amount;
	}
	
	//Depósito
	public void deposit(double amount) {
		balance += amount;
	}
}
