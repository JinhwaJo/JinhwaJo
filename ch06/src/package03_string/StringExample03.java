package package03_string;

public class StringExample03 {
	public static void main(String[] args) {
		String address = "부산시 연제구 연산1동 XX아파트";
		
		// address가 참조하는 문자열에서 "연제구"의 '연' 위치(인덱스)를 반환한다.
		int location = address.indexOf("연제구");	// 반환 값 4
		System.out.println(location);
		
		// address가 참조하는 문자열에 "부산"이 없으면 -1을 반환한다. (없으면 -1을 반환한다는 식으로 많이 사용한다.)
		// if(address.indexOf("부산") >= 0) 도 동일한 의미를 가진다.
		if(address.indexOf("부산") != -1) {
			System.out.println("부산광역시에 거주하고 있습니다.");
		} else {
			System.out.println("부산광역시에 거주하지 않습니다.");
		}
	}
}
