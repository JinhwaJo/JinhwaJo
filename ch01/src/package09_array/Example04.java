package package09_array;

import java.text.DecimalFormat;

public class Example04 {
	public static void main(String[] args) {
		// ���� ) �迭�� ����� ���� ��� �ջ��Ͽ� �հ�� ����� ����Ͻÿ�.
		int[] arr = { 88, 76, 55, 99, 98};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		
		}
		System.out.println("�հ� : " + sum);
		/* �Ʒ��� ���� �����ϰ� ����� ���� ���� �ִ�.
		System.out.println("��� : " + sum / (double)arr.length); */
		double avg = sum / (double)arr.length;
		DecimalFormat df = new DecimalFormat("#.#");
		String a = df.format(avg);
		System.out.println("��� : " + a);
	}
}
