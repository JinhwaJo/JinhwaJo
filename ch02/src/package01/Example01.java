package package01;

public class Example01 {
	public static void main(String[] args) {
		/*
		// ��ü ����(new ������ ���)
		Book book1 = new Book();	// Book�̶�� �̸��� ���� å�� �����ϴ� �ڷ����� ���������.
		// book1 ������ ���� '.'�� ������� �����ڶ�� �Ѵ�. 
		book1.name = "�̰��� �ڹٴ�";
		book1.author = "�ſ���";
		book1.rate = 4.9;
		book1.rank = 3;
		
		Book book2 = new Book();
		book2.name = "���߿�";
		book2.author = "�������� ��������";
		book2.rate = 5.0;
		book2.rank = 1; */
		// private�� ���̸� �������� ����� ����� �� ����. (����ڷκ��� ���� ����)
		
		Book book1 = new Book();
		book1.setRank(-5);
		book1.setName("this is java");
		book1.setRate(7.5);
		book1.setAuthor("�ſ���");
		
	}
}
