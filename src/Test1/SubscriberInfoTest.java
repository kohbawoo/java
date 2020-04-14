package Test1;
class SubscriberInfo{ // 데이터 틀을 작성해보자. 아래 코드의 생성자를 확인하고 적절한 코드를 부여한다.
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	public SubscriberInfo() {}
	public SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
} // 원래는 class를 따로따로 분리해서 만드는 것이 권장된다. 강의 편의를 위해 한번에 포함시키는 것이니 실제 작성시에는 클래스를 따로따로 만들 것.

public class SubscriberInfoTest {
	public static void main(String[] args)
	{
		SubscriberInfo obj1, obj2,obj3; // 먼저 선언만 되어있고, 할당은 아래 코드부터 되는 구조
		obj1=new SubscriberInfo("박유신","1017db","daewi"); // 3개 생성자 
		obj2=new SubscriberInfo("백곰","baekom","white", 	"200-000-0000","north pole"); // 5개 생성자
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("교직원1숙사"); // 메서드 필요
		obj1.setPhoneNo("133-1234-5678"); // 메서드 필요
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("이름:"+obj.name); // 첫번째 과제와는 다르게 접근자가 private은 아니라는 이야기. 코드에 그냥 공개되었으므로.
		System.out.println("아이디:"+obj.id);
		System.out.println("패스워드:"+obj.password);
		System.out.println("전화번호:"+obj.phoneNo);
		System.out.println("주소:"+obj.address);
		System.out.println();
	}
}
