package package07;

import java.util.HashMap;
import java.util.Scanner;
class AsianCup {
	private String country1;	// ����1
	private String country2;	// ����2
	private String country3;	// ����3
	private String country4;	// ����4

	public AsianCup() {}
	public AsianCup(String country1, String country2,
			String country3, String country4) {
		this.country1 = country1;
		this.country2 = country2;
		this.country3 = country3;
		this.country4 = country4;
	}
	public String getCountry1() {
		return country1;
	}
	public void setCountry1(String country1) {
		this.country1 = country1;
	}
	public String getCountry2() {
		return country2;
	}
	public void setCountry2(String country2) {
		this.country2 = country2;
	}
	public String getCountry3() {
		return country3;
	}
	public void setCountry3(String country3) {
		this.country3 = country3;
	}
	public String getCountry4() {
		return country4;
	}
	public void setCountry4(String country4) {
		this.country4 = country4;
	}

	}
public class HashMapExample4_my {
	public static void main(String[] args) {
		/* �ƽþ��� �� �� ������ ����Ͻÿ�.
		 * (���̹� : �ƽþ��� ����, A ~ C�������� �ϼ���^^)
		 * 
		 * �� : C
		 * ���ѹα�
		 * �߱�
		 * Ű���⽺��ź
		 * �ʸ���		 */
		
		HashMap<String, AsianCup> map = new HashMap<String, AsianCup>();
		
		map.put("A", new AsianCup("�ε�", "�ٷ���", "�ƶ����̸�Ʈ", "�±�"));
		map.put("B", new AsianCup("�丣��", "�ø���", "�ȷ���Ÿ��", "ȣ��"));
		map.put("C", new AsianCup("���ѹα�", "�߱�", "Ű���⽺��ź", "�ʸ���"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�� : ");
			String team = sc.nextLine().trim();
			
			// �Է��� ���� ������ true ������ false
			// �Է� �� �Է��� ���� ������� �빮�ڷ� ���� �� �ֵ��� toUpperCase �޼ҵ带 ���
			if(map.containsKey(team.toUpperCase())) {
				// ��(Ű)�� ���� �� ����(��) ��ȯ
				// ��� �� �Է��� ���� ������� �빮�ڷ� ���� �� �ֵ��� toUpperCase �޼ҵ带 ���
				AsianCup cup = map.get(team.toUpperCase());
				// �� ���� ���
				System.out.println(cup.getCountry1());
				System.out.println(cup.getCountry2());
				System.out.println(cup.getCountry3());
				System.out.println(cup.getCountry4());
				break;
			} else {
				System.out.println("�Է��Ͻ� ���� �����ϴ�.");
			}
		}
		
	}
}
