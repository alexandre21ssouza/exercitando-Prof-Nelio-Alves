package application.entities;


/*Conta poupança
 * 
 */

public class SavingsAccount extends Account {
	
	//Taxa de Juros
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	//Atualiza o saldo com base a taxa de juros de rendimento
	public void updateBalance() {
		balance =+ balance * interestRate;
	}
}
