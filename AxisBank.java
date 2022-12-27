package Bank;

public class AxisBank extends BankInFo {
	public void deposit() {
		System.out.println(" deposit");
	}
	public static void main(String[] args) {
		BankInFo obj =new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
		
	}

}
