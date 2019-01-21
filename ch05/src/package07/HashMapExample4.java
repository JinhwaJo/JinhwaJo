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
		/* 아시안컵 조 편성 정보를 출력하시오.
		 * (네이버 : 아시안컵 조편성, A ~ C조까지만 하세요^^)
		 * 
		 * 조 : C
		 * 대한민국
		 * 중국
		 * 키르기스스탄
		 * 필리핀
		 * 										 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, AsianCupGroup> map = new HashMap<String, AsianCupGroup>();
		map.put("A", new AsianCupGroup(new String[] {"인도", "바레인", "아랍에미리트", "태국"}) );
		map.put("B", new AsianCupGroup(new String[] {"요르단", "시리아", "팔레스타인", "호주"}) );
		map.put("C", new AsianCupGroup(new String[] {"대한민국", "중국", "키르기스스탄", "필리핀"}) );
		
		while(true) {
			System.out.print("조 : ");
			String group = sc.next().trim();
			if(group.equals("Q")) {
				System.out.println("프로그램 종료");
				return;
			}
			else if(!map.containsKey(group)) {
				System.out.println("A ~ C 조까지만 편성되어 있습니다.");
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
