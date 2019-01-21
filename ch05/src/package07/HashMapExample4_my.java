package package07;

import java.util.HashMap;
import java.util.Scanner;
class AsianCup {
	private String country1;	// 국가1
	private String country2;	// 국가2
	private String country3;	// 국가3
	private String country4;	// 국가4

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
		/* 아시안컵 조 편성 정보를 출력하시오.
		 * (네이버 : 아시안컵 조편성, A ~ C조까지만 하세요^^)
		 * 
		 * 조 : C
		 * 대한민국
		 * 중국
		 * 키르기스스탄
		 * 필리핀		 */
		
		HashMap<String, AsianCup> map = new HashMap<String, AsianCup>();
		
		map.put("A", new AsianCup("인도", "바레인", "아랍에미리트", "태국"));
		map.put("B", new AsianCup("요르단", "시리아", "팔레스타인", "호주"));
		map.put("C", new AsianCup("대한민국", "중국", "키르기스스탄", "필리핀"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("조 : ");
			String team = sc.nextLine().trim();
			
			// 입력한 조가 있으면 true 없으면 false
			// 입력 시 입력한 값에 관계없이 대문자로 받을 수 있도록 toUpperCase 메소드를 사용
			if(map.containsKey(team.toUpperCase())) {
				// 조(키)에 따른 조 정보(값) 반환
				// 출력 시 입력한 값에 관계없이 대문자로 받을 수 있도록 toUpperCase 메소드를 사용
				AsianCup cup = map.get(team.toUpperCase());
				// 조 정보 출력
				System.out.println(cup.getCountry1());
				System.out.println(cup.getCountry2());
				System.out.println(cup.getCountry3());
				System.out.println(cup.getCountry4());
				break;
			} else {
				System.out.println("입력하신 조가 없습니다.");
			}
		}
		
	}
}
