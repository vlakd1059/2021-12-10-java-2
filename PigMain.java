import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PigBank bank = new PigBank(1000);
		bank.showMoney();

		System.out.print("�Աݾ� �Է� : ");
		int inMoney = sc.nextInt();
		bank.deposit(inMoney); // �� �Ա� �۾�
		bank.showMoney();

		System.out.print("��ݾ� �Է� : ");
		int outMoney = sc.nextInt();
		bank.withdraw(outMoney); // �� ��� �۾�
		bank.showMoney();

	}

}
