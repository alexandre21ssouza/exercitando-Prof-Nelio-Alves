package application.entities;

/*Conta
 * empresarial
 */

//Classe derivada ou subclasse
public class BusinessAccount extends Account{

	//Limite para empréstimos
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	
	/*Construtor com parâmetros com atributos do Account dentro do super(que
	 * serve para executar a lógica do construtor da super classe na 
	 * subclasse ou classe derivada, devido esta classe extends a
	 *  classe Account ou super classe*/
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
	
	//Emprestar dinheiro
	public void loan(double amount) {
		
		/*Lógica de Só empresta se o limite for 
		  maior que o pedido de empréstimo */
		if(amount <= loanLimit) {
			balance +=amount - 10.0;
		}
		
	}
	

	
}
