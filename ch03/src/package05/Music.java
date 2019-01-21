package package05;

import java.util.Scanner;

public class Music {
	private String title;
	private String singer;
	
	private static Scanner sc = new Scanner(System.in);
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// equal 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music target = (Music)obj;
			/* 부모 = 자식; (aka 작큰 by 성정쌤) 에서는 강제 타입 변환이 필요 없다.
			 * 자식 = 부모; 에서는 강제 타입 변환을 해줘야 한다.
			 * 사실, 컴퓨터 입장에서는 기능이 많은 자식이 부모보다 크다. */
			if(this.title.equals(target.title) && this.singer.equals(target.singer)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// 다음 아래에 알맞은 클래스를 작성하시오.
		System.out.println("[ 음악 플레이어 ]");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		
		Music[] musics = new Music[] {
				new Music("하루도 그대를", "임창정"),
				new Music("이별길", "IKON"),
				new Music("NOW", "김경호")
				// 위의 배열의 값과 입력될 값을 비교해야하는데, 객체의 주소가 아닌 
		};
		
		for(int i = 0; i < musics.length; i++) {
			if(musics[i].equals(new Music(title, singer))) {
				System.out.println("노래를 시작합니다.");
				return;
			}
		}
		System.out.println("없는 노래입니다.");
	}

}
