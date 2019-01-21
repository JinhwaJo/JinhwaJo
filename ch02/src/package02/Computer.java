package package02;

public class Computer {
	private String[] winList = 
		{ "윈도우10 Pro", "윈도우10 Home",
				"윈도우7", "윈도우8.1"	};
	private String windows;
	
	// 윈도우 사양을 변경(저장)하는 setter 메소드
	public void setWindows(String windows) {
		for(int i = 0; i < winList.length; i++) {
			// tpUpperCase 메소드 : 문자열을 대문자로 변환한다.(한글과 같이 있어도 상관x)
			if(windows.toUpperCase().equals(winList[i].toUpperCase())) {
				this.windows = windows;
				System.out.println("윈도우 사양을 저장하였습니다.");
				return;
			}
		}
		System.out.println("없는 위도우 사양입니다.");
	}
	
	/* CPU 와 RAM 속성 값을 setter 메소드를 통해 컴퓨터에 저장할 수 있도록 하시오.
	 * (CPU는 i3 8300, i5 8400, i7 8700 만 저장 가능)
	 * (RAM은 4GB PC4, 8GB PC-213, 16GB PC4만 저장 가능)	 */
	
	private String[] CPUList = { "i3 8300", "i5 8400", "i7 8700" };
	private String cpu;
	public void setCPU(String cpu) {
		for(int i = 0; i < CPUList.length; i++) {
			if(cpu.equals(CPUList[i])) {
				this.cpu = cpu;
				System.out.println("CPU 사양을 저장하였습니다.");
				return;
			}
		}
		System.out.println("없는 CPU 사양 입니다.");
	}
	private String[] RAMList = { "4GB PC4", "8GB PC-213", "16GB PC4" };
	private String ram;
	public void setRAM(String ram) {
		for(int i = 0; i < RAMList.length; i++) {
			if(ram.toUpperCase().equals(RAMList[i].toUpperCase())) {
				this.ram = ram;
				System.out.println("RAM 사양을 저장하였습니다.");
				return;
			}
		}
		System.out.println("없는 RAM 사양 입니다.");
	}
	
	
	
	
}
