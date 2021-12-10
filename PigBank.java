
public class PigBank {

	int money;

	public PigBank(int money) {
		this.money = money;
	}

	// 돈을 넣는다
	public void deposit(int inMoney) {
		this.money += inMoney;

	}

	// 돈을 빼낸다
	public void withdraw(int outMoney) {
		this.money -= outMoney;
	}

	// 돈의 잔액을 확인하는 메소드 showMoney()
	public void showMoney() {
		System.out.println("현재 금액 : " + this.money + "원");
	}

}
