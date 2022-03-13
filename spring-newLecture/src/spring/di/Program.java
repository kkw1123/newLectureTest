package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// 스프링에서 지시하는 방법으로 코드를 변경
		//Exam exam = new NewlecExam();
		//Exam exam = new NewlecExam(10, 20, 30, 40);
		//ExamConsole console = new InlineExamConsole(exam); //DI 1
		//ExamConsole console = new GridExamConsole(); //DI 2
		//console.setExam(exam);
		
		//xml 활용시 경로 지정
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring/di/setting.xml");
		 */
		
		//java config 활용시 경로 지정 방법 1
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(NewlecDiConfig.class);
		 */
		
		//java config 활용시 경로 지정 방법 2
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		//context.register(NewlecDiConfig.class, other config.class);
		context.register(NewlecDiConfig.class);
		context.refresh();
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString()); 
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		/*
		 * for(Exam e : exams) { System.out.println(e); }
		 */
			
			
		
	}

}
