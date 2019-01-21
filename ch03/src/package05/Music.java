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
	
	// equal �޼ҵ� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music target = (Music)obj;
			/* �θ� = �ڽ�; (aka ��ū by ������) ������ ���� Ÿ�� ��ȯ�� �ʿ� ����.
			 * �ڽ� = �θ�; ������ ���� Ÿ�� ��ȯ�� ����� �Ѵ�.
			 * ���, ��ǻ�� ���忡���� ����� ���� �ڽ��� �θ𺸴� ũ��. */
			if(this.title.equals(target.title) && this.singer.equals(target.singer)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// ���� �Ʒ��� �˸��� Ŭ������ �ۼ��Ͻÿ�.
		System.out.println("[ ���� �÷��̾� ]");
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("������ : ");
		String singer = sc.nextLine();
		
		Music[] musics = new Music[] {
				new Music("�Ϸ絵 �״븦", "��â��"),
				new Music("�̺���", "IKON"),
				new Music("NOW", "���ȣ")
				// ���� �迭�� ���� �Էµ� ���� ���ؾ��ϴµ�, ��ü�� �ּҰ� �ƴ� 
		};
		
		for(int i = 0; i < musics.length; i++) {
			if(musics[i].equals(new Music(title, singer))) {
				System.out.println("�뷡�� �����մϴ�.");
				return;
			}
		}
		System.out.println("���� �뷡�Դϴ�.");
	}

}
