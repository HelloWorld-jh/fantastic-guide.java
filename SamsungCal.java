package InterfaceTest;

public class SamsungCal implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ���ϱ�");
		return a+b;
	}

	@Override
	public int substr(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ����");
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ���ϱ�");
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ������");
		return a/b;
	}

}
