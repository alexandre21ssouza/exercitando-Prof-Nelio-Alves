package application.entities;

/*Conta poupança
 * 
 */

public class SavingsAccount extends Account {

	// Taxa de Juros
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

	// Atualiza o saldo com base a taxa de juros de rendimento
	public void updateBalance() {
		balance =+ balance * interestRate;
	}
	
	
	
	
	/*
	 * Usamos a anotação"@Override" para sobrescrever o método "whithdraw(double amount)"
	 * localizado na super classe Account, pois ela gera um desconto de 5.0
	 * que não deve ser feito nesta classe. @Override só deve ser usado em
	 * subclasses que contenham o mesmo método da super classe.
	 *
	 * Saque sem taxa. Método usado também na SuperClasse.
	*/
	@Override
	public void whithdraw(double amount) {
		balance -= amount;
		
	}
}
