package package02_op;

public class Example08 {
	public static void main(String[] args) {
		int score = 95;
		
		// char grade = '값'; 	작은 따옴표
		char grade = (score > 90) ? 'A' : 'B';
		// "(조건식)? 부합하면 X : 아니면 Y" 의 형태이다.
		// 'A', 'B' 처럼, 값이 작은 따옴표로 되어있으므로 char을 넣어준다.
		System.out.println(score + "점은 " + grade + "입니다.");

		
		// String g = "값";		큰 따옴표
		String g = (score > 90) ? "A" : "B";
		System.out.println(score + "점은 " + g + "입니다.");
		
		char ch = 'B';
		// ch의 값이 대문자이면? [(char)(ch + 32) 실행] 아니면 [ch 실행]
		ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
		System.out.println(ch);
		// 소문자가 대문자보다 32 크다. A = 65, a = 97, 문자 0 = 48
		
		// 성적을 받아 수우미양가로 출력하시오.
		String s = 
				(score > 100 || score < 0) ? "1 ~ 100까지만 입력하세요." :
				(score >= 90) ? "수" : 
				(score >= 80) ? "우" : 
				(score >= 70) ? "미" : 
				(score >= 60) ? "양" : "가";
		System.out.println(s);
		// 조건식을 만족하는 값이 도출되면 해당 값을 저장하고 나가게 되며, 이후의 조건식은 연산되지 않는다.
		
		
	}
}
