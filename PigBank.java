
public class PigBank {

	int money;

	public PigBank(int money) {
		this.money = money;
	}

	// ���� �ִ´�
	public void deposit(int inMoney) {
		this.money += inMoney;

	}

	// ���� ������
	public void withdraw(int outMoney) {
		this.money -= outMoney;
	}

	// ���� �ܾ��� Ȯ���ϴ� �޼ҵ� showMoney()
	public void showMoney() {
		System.out.println("���� �ݾ� : " + this.money + "��");
	}

}
