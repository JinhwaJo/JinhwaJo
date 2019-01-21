package package03;

public class Movie {
	String name;		// ��ȭ �̸�
	String director;	// ��ȭ ����
	int rank;			// ��ȭ ����
	// ������(Constructor) : ��ü�� �����ϰ� �ʱ�ȭ�ϴ� �޼ҵ�
	// �������� �̸��� Ŭ������ �̸��� ����.
	/* �޼ҵ��� �̸��� ���� �� �Ű� ������ �̸��� �ٸ��� �����ϴ� ���� overloading�̶� �Ѵ�.
	 * ������ �����ε�(Overloading)
	 * : �޼ҵ� �̸��� ����, �Ű� ������ �ڷ��� �Ǵ� ������ '�ٸ���'
	 *   �޼ҵ带 ����ϴ� �� (��ȯ������ ���� ����.) */
	public Movie() {	// �Ű� ������ ������ ����Ʈ ������
		this.name = "������";
	}
	public Movie(String name) {	// �Ű� ������ 1���� ������
		this.name = name;
	}
	public Movie(int rank) { 	// �Ű� ������ 1���� ������
		this.rank = rank;
	}
	/* (��� �ȵ�)
	 	public Movie(String director) {
		this.director = director;
		} */
	
	// �Ű� ������ 2���� ������ (����)
	public Movie(String name, String director) {
		this.name = name;
		this.director = director;
	}
}
