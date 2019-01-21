package package02;

public class Computer {
	private String[] winList = 
		{ "������10 Pro", "������10 Home",
				"������7", "������8.1"	};
	private String windows;
	
	// ������ ����� ����(����)�ϴ� setter �޼ҵ�
	public void setWindows(String windows) {
		for(int i = 0; i < winList.length; i++) {
			// tpUpperCase �޼ҵ� : ���ڿ��� �빮�ڷ� ��ȯ�Ѵ�.(�ѱ۰� ���� �־ ���x)
			if(windows.toUpperCase().equals(winList[i].toUpperCase())) {
				this.windows = windows;
				System.out.println("������ ����� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("���� ������ ����Դϴ�.");
	}
	
	/* CPU �� RAM �Ӽ� ���� setter �޼ҵ带 ���� ��ǻ�Ϳ� ������ �� �ֵ��� �Ͻÿ�.
	 * (CPU�� i3 8300, i5 8400, i7 8700 �� ���� ����)
	 * (RAM�� 4GB PC4, 8GB PC-213, 16GB PC4�� ���� ����)	 */
	
	private String[] CPUList = { "i3 8300", "i5 8400", "i7 8700" };
	private String cpu;
	public void setCPU(String cpu) {
		for(int i = 0; i < CPUList.length; i++) {
			if(cpu.equals(CPUList[i])) {
				this.cpu = cpu;
				System.out.println("CPU ����� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("���� CPU ��� �Դϴ�.");
	}
	private String[] RAMList = { "4GB PC4", "8GB PC-213", "16GB PC4" };
	private String ram;
	public void setRAM(String ram) {
		for(int i = 0; i < RAMList.length; i++) {
			if(ram.toUpperCase().equals(RAMList[i].toUpperCase())) {
				this.ram = ram;
				System.out.println("RAM ����� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("���� RAM ��� �Դϴ�.");
	}
	
	
	
	
}
