package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

//xml 에서는 id에 명칭을 붙여 호출하였으나, component에서는 해당 어노테이션에 명칭을 붙여주면 된다.
@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = true)
	//@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor 생성자 체크");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("over loaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		} else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}
	
}
