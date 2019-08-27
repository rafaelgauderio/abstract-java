package application;
import java.util.ArrayList;

import java.util.List;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	// Classse abastrata não pode instanciada
	
	
		List <Account> lista =new ArrayList<Account>();
		//Account conta01=new Account(1001, "Rafael", 500.0);
		//lista.add(conta01);
		Account conta02= new SavingsAccount(1002, "Claudio", 550.0, 0.02);
		lista.add(conta02);
		Account conta03= new BusinessAccount(1003, "Ana", 670.0, 2000.0);
		lista.add(conta03);
		Account conta04= new SavingsAccount(1004, "Mariana", 900.0, 0.02);
		lista.add(conta04);
		Account conta05=new BusinessAccount(1005,"Adriana", 1500.0,2000.0);
		lista.add(conta05);
		
	
	for (Account apelido:lista) {
		System.out.println(apelido);
	}
	//criar um método que colete o somatório total
	
	double soma=0.0;
	for(Account apelido:lista) {
		soma+=apelido.getBalance();
	}
	System.out.println();
	System.out.printf("Sum of Balances %.2f\n",soma);
	
	for (Account apelido:lista) { 
		apelido.deposit(35.6); 
	}
	System.out.println();
	for(Account apelido:lista) {
		System.out.printf("Updated Balance for account %s: %.2f\n",apelido.getHolder(),apelido.getBalance());
	}
	
	}
}
	
