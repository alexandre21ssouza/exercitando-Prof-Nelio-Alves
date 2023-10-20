package application.entities;

/*Conta
 * empresarial
 */

//Classe derivada ou subclasse
public class BusinessAccount extends Account {

	// Limite para empréstimos
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	/*
	 * Construtor com parâmetros com atributos do Account dentro do super(que serve
	 * para executar a lógica do construtor da super classe na subclasse ou classe
	 * derivada, devido esta classe extends a classe Account ou super classe
	 */
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	// Emprestar dinheiro
	public void loan(double amount) {

		/*
		 * Lógica de Só empresta se o limite for maior que o pedido de empréstimo
		 */
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}

	}
	
	
	/*
	 * Usamos a anotação"@Override" para sobrescrever o método "whithdraw
	 * (double amount);"
	 * localizado na super classe Account, pois ela gera um desconto de 5.0,
	 * e aqui deve ser descontado os 5.0 e depois desconta mais 2.0, 
	 * no total 7.0.
	 * Neste exemplo vamos usa a palavra "super" para chamar o método da
	 * Superclasse Account. 
	 *  @Override só deve ser usado em subclasses 
	 * que contenham o mesmo método da super classe.
	 *
	 * Saque com taxa 5.0 e depois desconta 2.0. 
	 * Método original usado também na SuperClasse.
	*/
	@Override
	public void whithdraw(double amount) {
		super.whithdraw(amount);
		balance -= 2.0;
	}

}
