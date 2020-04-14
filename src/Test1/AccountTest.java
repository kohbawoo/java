package Test1; // 총 4개, 계좌, 예금주, 잔액, 이자율을 생성해야 한다. 주어진 코드를 보고 힌트를 찾아야 함.

class Account {
	private String accountNo;
	private String accountName;
	private double balance;
	static double interest; // 이자 제외한 나머지는 캡슐화하라 했으므로 나머지는 private.
	public Account(String accountNo, String accountName, int balance) {
		this.accountNo = accountNo; //this는 안써도 되지만, 명확하게 대상을 지정해주므로 쓰는걸 권장
		this.accountName = accountName;
		this.balance = balance;
	}
	public void deposit(int price) {
		this.balance += price;
	}
	public void withdraw(int price) {
		this.balance -= price;
	}
	public void addInterest() {
		balance = balance + (balance * interest);		
	}
	public String getAccountNo() {
		return this.accountNo;
	}
	public String getAccountName() {
		return this.accountName;
	}
	public double getBalance() {
		return this.balance;
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Account customer1=new Account("111-222-33333333","최은희",20000); // class가 Account 임을 유추, 어카운트 내 3개 값 가짐
		Account customer2=new Account("555-666-77777777","남매월",100000); 
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000); // deposit 메서드를 만들지 않으면 오류가 난다.
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산"); 
		Account.interest=0.05; // double 또는 float 형태로 만들기
		customer1.addInterest(); //저축된 금액=원금+원금*이자율
		customer2.addInterest();//저축된 금액=원금+원금*이자율
		printAccount(customer1);
		printAccount(customer2);
		}
	static void printAccount(Account customer){
		System.out.println("계좌번호:"+customer.getAccountNo());
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
		}
	}
