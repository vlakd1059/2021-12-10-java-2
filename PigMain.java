import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PigBank bank = new PigBank(1000);
		bank.showMoney();

		System.out.print("입금액 입력 : ");
		int inMoney = sc.nextInt();
		bank.deposit(inMoney); // 돈 입금 작업
		bank.showMoney();

		System.out.print("출금액 입력 : ");
		int outMoney = sc.nextInt();
		bank.withdraw(outMoney); // 돈 출금 작업
		bank.showMoney();

	}

}
