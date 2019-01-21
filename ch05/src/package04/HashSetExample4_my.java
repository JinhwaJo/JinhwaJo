package package04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample4_my {
	/* HashSet 을 이용해 나이키 상품 프로그램을 작성하시오.
	 * (추가, 삭제 등 메소드는 모두 리스트와 사용방법이 동일하다.)
	 * 
	 * 나이키 신발 : 상품번호, 상품명, 가격
	 * [ 나이키 매장 ]
	 * 1. 신상 등록 ( 상품번호, 상품명, 가격 이름 후 셋(Set) 객체에 저장 )
	 * 2. 상품 삭제 ( remove 메소드 사용(상품 번호로 삭제) )
	 * 3. 상품 목록 ( 등록된 상품번호와 상품명, 가격이 모두 출력되어야 한다. )
	 * 4. 상품 찾기 ( 상품명을 입력하면 상품 번호와 가격이 출력되어야 한다. )
	 * 5. 종료	 */
	private static HashSet<Nike_my> shoes = new HashSet<Nike_my>();
	private static Scanner sc = new Scanner(System.in);
	/* HashSet은 인덱스가 없어서 내부의 데이터를 배열처럼 하나씩 비교하지 못하므로,
	 * 인덱스의 역할을 해주는 Iterator가 필요한데 (각 절에 다 넣어줘야 함.)
	 * Iterator는 반복변수 i와 증감식을 사용하지 않고,
	 * while절을 사용하여 hasNext와 next를 통해 데이터를 비교한다.	 */
	public static void main(String[] args) {
		while(true) {
			System.out.println("[ 나이키 매장 ]");
			System.out.println("1. 신상 등록");
			System.out.println("2. 상품 삭제");
			System.out.println("3. 상품 목록");
			System.out.println("4. 상품 찾기");
			System.out.println("5. 종료");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;
			case 2:
				delete(); break;
			case 3:
				list(); break;
			case 4:
				search(); break;
			case 5:
				System.exit(1);
			}
		}
	}
	private static void search() {
		if(shoes.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		System.out.println("[ 상품 찾기 ]");
		System.out.print("상품명 : ");
		String name = sc.next();
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {
			Nike_my searchtool = iter.next();
			if(name.equals(searchtool.getName())) {
				System.out.println("상품 번호 : " + searchtool.getNumber());
				System.out.println("가격 : " + searchtool.getPrice());
				return;
			}
		}
		
	}
	private static void list() {
		if(shoes.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		System.out.println("[ 상품 목록 ]");
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {
			Nike_my itemlist = iter.next();
			System.out.println("상품 번호 : " + itemlist.getNumber());
			System.out.println("상품 명 : " + itemlist.getName());
			System.out.println("가격 : " + itemlist.getPrice());
		}
	}
	private static void delete() {
		if(shoes.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		System.out.println("[ 상품 삭제 ]");
		System.out.print("상품 번호 : ");
		int number = sc.nextInt();
		// hasNext는 메모리 안에 공간(신상 등록한 것)이 있으면 찾는 역할
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {	
			// next는 찾은 것을 내가 만든 eraser이란 변수에 대입해주는 역할
			Nike_my eraser = iter.next(); 
			// eraser변수는 권한을 부여한 Nike_my가 클래스이므로 get 메소드를 사용할 수 있다.
			if(number == eraser.getNumber()) {
				/* hasNext로 찾고, next로 eraser에 대입해놓았으니
				 * eraser의 삭제 = 입력 받은 상품의 삭제 */
				shoes.remove(eraser);
				System.out.println("상품이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("찾으시는 상품이 존재하지 않습니다.");
	}
	private static void registration() {	// 신상 등록 메소드
		System.out.println("[ 신상 등록 ]");
		System.out.print("상품 번호 : ");
		int number = sc.nextInt();
		System.out.print("상품명 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		Nike_my Set = new Nike_my (number, name, price);
		// 이미 등록된 상품에 대한 상품번호를 재 입력시 경고 문구가 뜨도록 함.
		if(shoes.contains(new Nike_my(number))) {
			System.out.println("해당 상품은 이미 등록되어 있습니다.");
			return;
		}
		shoes.add(Set);
		System.out.println("신상 등록이 완료되었습니다.");
		
	}
}
