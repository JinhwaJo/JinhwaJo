package package04;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class HashSetExample4 {
	/* HashSet 을 이용해 나이키 상품 프로그램을 작성하시오.
	 * (추가, 삭제 등 메소드는 모두 리스트와 사용 방법이 동일하다.)
	 * 
	 * 나이키 신발 : 상품번호, 상품명, 가격
	 * [ 나이키 매장 ]
	 * 1. 신상 등록 ( 상품번호, 상품명, 가격 이름 후 셋(Set) 객체에 저장 )
	 * 2. 상품 삭제 ( remove 메소드 사용(상품 번호로 삭제 ) )
	 * 3. 상품 목록 ( 등록된 상품번호와 상품명, 가격이 모두 출력되어야 한다. )
	 * 4. 상품 찾기 ( 상품명을 입력하면 상품 번호와 가격이 출력되어야 한다. )
	 * 5. 종료													 */
	private static Scanner sc = new Scanner(System.in);
	private static HashSet<Nike> goods = new HashSet<Nike>();
	private static int n = 0;
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("-----[ 나이키 신발 ]-----");
			System.out.println("1.신상 등록");
			System.out.println("2.상품 삭제");
			System.out.println("3.상품 목록");
			System.out.println("4.상품 찾기");
			System.out.println("5.종료");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration();
				break;
			case 2:
				delete();
				break;
			case 3:
				list();
				break;
			case 4:
				search();
				break;
			case 5:
				System.exit(1);
			}
		}
	}

	private static void search() {
		sc.nextLine();
		System.out.print("검색할 상품명 : ");
		String name = sc.nextLine();
		Iterator<Nike> i = goods.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			if(nike.getName().equals(name)) {
				System.out.println("상품 번호 : " + nike.getNumber());
				System.out.println("가격 : " + nike.getPrice());
				return;
			}
		}
		System.out.println("조회할 상품이 없습니다.");
	}

	private static void list() {
		Iterator<Nike> i = goods.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			System.out.println("상품 번호 : " + nike.getNumber());
			System.out.println("상품명 : " + nike.getName());
			System.out.println("가격 : " + nike.getPrice());
		}
		System.out.println("등록된 상품을 모두 조회하였습니다.");
	}

	private static void registration() {
		System.out.print("상품번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		long price = sc.nextLong();
		goods.add(new Nike(number, name, price));
	}
	
	private static void delete() {
		System.out.print("삭제할 상품의 번호 : ");
		int number = sc.nextInt();
		// 셋(Set)에 상품 번호가 있으면
		if(goods.contains(new Nike(number))) {
			// 상품 번호를 이용해 상품을 삭제한다.
			goods.remove(new Nike(number));
			System.out.println("상품을 삭제하였습니다.");
			return;
		}
		System.out.println("상품이 등록되어 있지 않습니다.");
	}
}






