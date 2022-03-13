package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = new
				  ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		
//		Exam exam = new NewlecExam(1,1,1,1);
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//				new Class[] {Exam.class}, 
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// 서브 업무 시작점 입력
//						long start = System.currentTimeMillis();
//						
//						// 시점에 따른 주 업무처리 객체 영역 연결(왼쪽)
//						// 호출하는 메소드를 갖고 있는 파라미터 연결(오른쪽)
//						// 또한 값을 반환해야 하기 때문에 모든 형태를 감쌀 수 있는 Object 반환
//						// invoke는 특정 클래스의 메소드를 호출해 값을 설정하거나 반환하는 함수
//						Object result = method.invoke(exam, args);
//						
//						// 서브 업무 마무리 입력
//						long end = System.currentTimeMillis();
//						String message = (end-start) + "ms 시간이 걸렸습니다.";
//						System.out.println(message);
//						
//						return result;
//					}
//				});
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
	}

}
