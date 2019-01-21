package package07;
import java.util.HashMap;
import java.util.Scanner;
class AsianCupGroup {
	private String[] group = new String[4];
	
	public AsianCupGroup() {}
	public AsianCupGroup(String[] group) {
		System.arraycopy(group, 0, this.group, 0, this.group.length);
	}
	public String[] getGroup() {
		return group;
	}
	public void setGroup(String[] group) {
		this.group = group;
	}
}

public class HashMapExample4 {
	public static void main(String[] args) {
		/* �ƽþ��� �� �� ������ ����Ͻÿ�.
		 * (���̹� : �ƽþ��� ����, A ~ C�������� �ϼ���^^)
		 * 
		 * �� : C
		 * ���ѹα�
		 * �߱�
		 * Ű���⽺��ź
		 * �ʸ���
		 * 										 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, AsianCupGroup> map = new HashMap<String, AsianCupGroup>();
		map.put("A", new AsianCupGroup(new String[] {"�ε�", "�ٷ���", "�ƶ����̸�Ʈ", "�±�"}) );
		map.put("B", new AsianCupGroup(new String[] {"�丣��", "�ø���", "�ȷ���Ÿ��", "ȣ��"}) );
		map.put("C", new AsianCupGroup(new String[] {"���ѹα�", "�߱�", "Ű���⽺��ź", "�ʸ���"}) );
		
		while(true) {
			System.out.print("�� : ");
			String group = sc.next().trim();
			if(group.equals("Q")) {
				System.out.println("���α׷� ����");
				return;
			}
			else if(!map.containsKey(group)) {
				System.out.println("A ~ C �������� ���Ǿ� �ֽ��ϴ�.");
				continue;
			}
			AsianCupGroup acg = map.get(group);
			String[] team = acg.getGroup();
			for(int i = 0; i < acg.getGroup().length; i++) {
				System.out.println(team[i]);
			}
		}
		
	}
}
