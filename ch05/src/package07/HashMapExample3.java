package package07;

import java.util.HashMap;
import java.util.Scanner;

class Music {
	// field
	private int hour, minute;	// ��, ��
	private String artist;		// ��Ƽ��Ʈ��
	private String album;		// �ٹ���
	
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
		
		map.put("�����귯", new Music(4, 7, "�������ƽ�", "Circular"));
		map.put("���� 12��", new Music(3, 42, "û��", "���� 12��"));
		map.put("180��", new Music(3, 50, "��", "180��"));
		map.put("�ſ���", new Music(3, 34, "����", "�ſ���"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("��� : ");
			String title = sc.nextLine().trim();
			
			// �Է��� ���� ������ true ������ false
			if(map.containsKey(title)) {
				// ���(Ű)�� ���� ������(��) ��ȯ
				Music music = map.get(title);
				// �� ���� ���
				System.out.println
				("�ð� : " + music.getHour() + ":" + music.getMinute());
				System.out.println("��Ƽ��Ʈ : " + music.getArtist());
				System.out.println("�ٹ��� : " + music.getAlbum());
				break;
			} else {
				System.out.println("���� �����ϴ�.");
			}
		}
	}
}
