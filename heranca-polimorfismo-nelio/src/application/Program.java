package application;

import application.entities.Account;
import application.entities.BusinessAccount;
import application.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		/*
		 * UPCASTING: Faz a conversão ao pegar uma variável Account e atribuir ao
		 * BusinessAcount levando em conta a relação "é uma", sendo que BusinessAcount é
		 * uma Conta. Neste caso Account pode instânciar objetos usando seus atributos
		 * somados aos da BusinessAccount OU SavingsAccount. Exemplos abaixo:
		 */
		Account acc1 = bacc;

		/*
		 * Objeto intanciado com relação 'é um", usando atributos de ambas as. Classes,
		 * Super = Sub.
		 */

		// Atributos(nºConta, name, saldo, limiteEmprestimo)
		Account acc2 = new BusinessAccount(0101, "Toni", 0.0, 1000.0);

		// Atributos(nºConta, name, saldo, jurosRendimento)
		Account acc3 = new SavingsAccount(0202, "Joe", 0.0, 0.01);

		/*
		 * DOWNCASTING: Converte os atributos da super classe para serem instanciados em
		 * objetos para serem usaados na subclasse, só que de maneira forçada, no caso
		 * usando o (Casting) para a conversão como veremos nos exemplos.
		 */

		/*
		 * BusinessAccount cont0 = (BusinessAccount) new Account(1212, "Luiz",
		 
				1000.0);
		System.out.println(cont0);
		*/

		/*
		 * Uma subclasse não pode fazer DOWNCASTING DE OUTRA subclasse, para evitar
		 * isto, usamos a palvra "instanceof" dentro de um if(intanceof) para fazer uma
		 * verificação. Ex:
		 */

		/*
		 * Ao tentar associar BusinessAccount(subclasse) com a instância do exemplo
		 * anterior (acc3), * Account acc3 = new SavingsAccount(0202, "Joe", 0.0, 0.01);
		 * que é : Account(superclasse) fazendo UPCASTING da SavingsAccount(subclasse).
		 * Neste caso os atributos da subclasse SavingsAccount não podem ser usados na
		 * subclasse BusinessAccount, pois isso vai gerar um "ERRO" no programa ao
		 * executá-lo.
		 */
		// uso indevido:
		//BusinessAccount cont2 = (BusinessAccount) acc3;

		/*
		 * Para garantir que isso não ocorra, usamos a palavra reservada (instanceof)
		 * para verificar se acc3 é instancia de BusinessAccount, ou seja, se o atributo
		 * a ser usado pertence a classe Account onde (pode ser usado) ou da
		 * SavingsAccount(não pode ser usado). Para isso fazemos esse teste lógico, se
		 * for true, execute o método(cont3.loan) Limite p/ impréstimo de 200.0. Caso não
		 * seja cairá no próximo if, onde será chamada o método de mostrar atualização
		 * do saldo da conta, para que o programa não dê erro e avisando que não passou
		 * por dentro do primeiro if.
		 */

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount cont3 = (BusinessAccount) acc3;
			cont3.loan(200.0);
			System.out.print("Loan");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount cont4 = (SavingsAccount) acc3;
			cont4.updateBalance();
			System.out.println("Update");

			// No console mostrará: "Update"
		}
		
		/*Exemplo do uso da anotação sobrescrita @override
		 * em SavingsAccount. permite usar o mesmo método mas com personalização
		 * da classe extendida (Subclasse).
		 */
		Account saq1 = new SavingsAccount(1210, "alex", 1000.0, 0.1);
		saq1.whithdraw(100.0);
		
		System.out.println(saq1.getBalance());
		//Console: 900.0, pois a taxa não é cobrada na classe SavingsAccount.		
	
		
		/*Exemplo do uso da palavra "super" na chamada do método original
		 * feito na Superclasse Account e sobreposto com @override em 
		 * BusinessAccount, com a personalização necessária de uma taxa de 
		 * desconto adicional de 2.0 além dos 5.0 do método original.
		 */
		Account saq2 = new BusinessAccount(1243, "Léo", 1000.0, 0.01);
		saq2.whithdraw(100);
		
		System.out.println(saq2.getBalance());
		/*Console: 893.0, pois é cobrado a taxa no método original whithdraw()
		 * de 5.0 na Superclasse Account e depois a adicional de 2.0 cobrada na 
		 * classe BusinessAccount.
		*/
	}
}
