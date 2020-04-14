package Test1;
class SubscriberInfo{ // ������ Ʋ�� �ۼ��غ���. �Ʒ� �ڵ��� �����ڸ� Ȯ���ϰ� ������ �ڵ带 �ο��Ѵ�.
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
} // ������ class�� ���ε��� �и��ؼ� ����� ���� ����ȴ�. ���� ���Ǹ� ���� �ѹ��� ���Խ�Ű�� ���̴� ���� �ۼ��ÿ��� Ŭ������ ���ε��� ���� ��.

public class SubscriberInfoTest {
	public static void main(String[] args)
	{
		SubscriberInfo obj1, obj2,obj3; // ���� ���� �Ǿ��ְ�, �Ҵ��� �Ʒ� �ڵ���� �Ǵ� ����
		obj1=new SubscriberInfo("������","1017db","daewi"); // 3�� ������ 
		obj2=new SubscriberInfo("���","baekom","white", 	"200-000-0000","north pole"); // 5�� ������
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("������1����"); // �޼��� �ʿ�
		obj1.setPhoneNo("133-1234-5678"); // �޼��� �ʿ�
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("�̸�:"+obj.name); // ù��° �����ʹ� �ٸ��� �����ڰ� private�� �ƴ϶�� �̾߱�. �ڵ忡 �׳� �����Ǿ����Ƿ�.
		System.out.println("���̵�:"+obj.id);
		System.out.println("�н�����:"+obj.password);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		System.out.println("�ּ�:"+obj.address);
		System.out.println();
	}
}
