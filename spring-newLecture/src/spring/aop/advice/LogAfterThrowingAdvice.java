package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	//���� around, before, after�� ��� ���ڰ� �����Ǿ��ֱ� ������ ������ �ɸ�����
	//throw�� � ���ܰ� �߻��ϴ��Ŀ� ���� �޶����� ���� �ٸ���.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("���ܰ� �߻��Ͽ����ϴ�. : " + e.getMessage());
	}
}
