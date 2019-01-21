package package04_if;

public class Example03 {
	public static void main(String[] args) {
		int kor = 95, eng = 46;
		double avg = (kor + eng) / 2.0;
		
		// 이 외의 결과는 맨 위에 작성하는 것이 좋다.
		if((kor < 0 || kor > 100) || (eng < 0 || eng > 100)) {
			System.out.println("점수를 다시 입력해주세요.");
		} else {
			// 중첩 if문 (if 또는 else 문 안에 또다른 if문)
			if(kor < 50 || eng < 50) {
			System.out.print("한 과목이 50점 미만이므로, ");
			System.out.println("불합격(과락) 입니다.");
		} else if(avg >= 70) {
			System.out.print("두 과목의 평균 점수가 70점 이상이므로, ");
			System.out.println("합격입니다.");
		} else if(avg < 70) {
			System.out.print("두 과목의 평균 점수가 70점 미만이므로, ");
			System.out.println("불합격입니다.");
		} /* else {
			System.out.println("점수를 다시 입력해주세요."); */
			/* if, else if, else 절을 결합 사용할 때 else 절을 맨 밑에 적는 실수를 많이 한다.
			 * 하지만, 딱 하나의 식만 실행하게되어 있으므로 이 외의 절이 맨 밑에 있을 경우 제대로 실행되지 않는다.
			 */
		}
	}
}
