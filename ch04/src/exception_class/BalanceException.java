package exception_class;

// 3-2. ���� Ŭ���� �ۼ�(�ֻ��� �θ��� Exception �Ǵ� RuntimeException�� ����Ѵ�.)
public class BalanceException extends RuntimeException {
	
	BalanceException(){}
	BalanceException(String msg){
		// �θ� ������ ȣ��(�޽��� ����)
		super(msg);
	}

}
