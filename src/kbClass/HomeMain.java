package kbClass;

public class HomeMain {
	public static void main(String[] args) {
		MyMovie savingPrivateRyan = new MyMovie("���̾� �Ϻ� ���ϱ�","1994","3ȸ","600$","����ũ��","�̵���");
		MyMovie jinhong82 = new MyMovie("82��� ����ȫ","����ȫ","�̵���");
		MyMovie developer = new MyMovie("�귡�� ��Ʈ","ũ�������� ���");
		
		savingPrivateRyan.printInfo();
		jinhong82.printInfo();
		developer.printInfo();
	}
}

class MyMovie{
	String name = "�̻�";
	String release = "�̻�";
	String nominee = "���� ���� ����";
	String cost = "�̻�";
	String mainChar = "�̻�";
	String producer = "�̻�";
	
	public MyMovie(String name, String release, String nominee, String cost, String mainChar, String producer) {
		this.name = name;
		this.release = release;
		this.nominee =  nominee;
		this.cost = cost;
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public MyMovie(String name, String mainChar, String producer) {
		this.name = name;
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public MyMovie(String mainChar, String producer) {
		this.mainChar = mainChar;
		this.producer = producer;
	}
	
	public void printInfo() {
		System.out.println("-----------����----------");
		System.out.println("�̸�: "+name);
		System.out.println("��������: "+release);
		System.out.println("���󳻿�: "+nominee);
		System.out.println("���ۺ��: "+cost);
		System.out.println("�ֿ�: "+mainChar);
		System.out.println("����: "+producer);
	}
	
}