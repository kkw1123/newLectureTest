package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

//xml ������ id�� ��Ī�� �ٿ� ȣ���Ͽ�����, component������ �ش� ������̼ǿ� ��Ī�� �ٿ��ָ� �ȴ�.
@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = true)
	//@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor ������ üũ");
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
