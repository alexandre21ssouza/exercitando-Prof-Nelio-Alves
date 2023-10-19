package application;

import application.entities.Account;
import application.entities.BusinessAccount;
import application.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		/*UPCASTING: Pegar uma variável Account e atribuir ao BusinessAcount
		 * levando em conta a relação "é uma", sendo que BusinessAcount
		 * é uma Conta. 
		 * Neste caso Account pode instânciar objetos usando seus atributos
		 * somados aos da BusinessAccount OU SavingsAccount. 
		 * Exemplos abaixo:
		 */
		Account acc1 = bacc;
		
		
		/*Objeto intanciado com relação 'é um", usando atributos de ambas as.
		 * Classes, Super = Sub.
		 */
		
		//Atributos(nºConta, name, saldo, limiteEmprestimo)
		Account acc2 = new BusinessAccount(0101, "Toni", 0.0, 1000.0);
		
		//Atributos(nºConta, name, saldo, jurosRendimento)
		Account acc3 = new SavingsAccount(0202, "Joe", 0.0, 0.01);
		
		
	}
}
