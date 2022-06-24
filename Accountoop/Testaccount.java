package Accountoop;

public class Testaccount {
	public static void main(String[] args) {
		Account a= new Account();
		a.setNumber("244510803588");
		a.setAccountType("saving account");
		a.setBalance(10000);
		a.deposit(10000);
		a.withdrawal(4200);
		a.fundTransfer(800);
		a.payBill(3600);
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		
	}

}