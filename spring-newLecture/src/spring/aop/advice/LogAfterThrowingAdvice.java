package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	//기존 around, before, after의 경우 인자가 고정되어있기 때문에 에러가 걸리지만
	//throw는 어떤 예외가 발생하느냐에 따라 달라져서 조금 다르다.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("예외가 발생하였습니다. : " + e.getMessage());
	}
}
