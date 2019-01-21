package package07;

import java.util.HashMap;
import java.util.Scanner;

class Music {
	// field
	private int hour, minute;	// 시, 분
	private String artist;		// 아티스트명
	private String album;		// 앨범명
	
	// constructor
	public Music() {}
	public Music(int hour, int minute, String artist, String album) {
		this.hour = hour;
		this.minute = minute;
		this.artist = artist;
		this.album = album;
	}
	
	// getter & setter
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
			
}


public class HashMapExample3 {
	public static void main(String[]args) {
		HashMap<String, Music> map = new HashMap<String, Music>();
		
		map.put("넘쳐흘러", new Music(4, 7, "엠씨더맥스", "Circular"));
		map.put("벌써 12시", new Music(3, 42, "청하", "벌써 12시"));
		map.put("180도", new Music(3, 50, "벤", "180도"));
		map.put("신용재", new Music(3, 34, "하은", "신용재"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("곡명 : ");
			String title = sc.nextLine().trim();
			
			// 입력한 곡이 있으면 true 없으면 false
			if(map.containsKey(title)) {
				// 곡명(키)에 따른 곡정보(값) 반환
				Music music = map.get(title);
				// 곡 정보 출력
				System.out.println
				("시간 : " + music.getHour() + ":" + music.getMinute());
				System.out.println("아티스트 : " + music.getArtist());
				System.out.println("앨범명 : " + music.getAlbum());
				break;
			} else {
				System.out.println("곡이 없습니다.");
			}
		}
	}
}
