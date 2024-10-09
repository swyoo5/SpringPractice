package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.ui.ExamConsole;

public class Program {
    public static void main(String[] args) {
//        Exam exam = new NewlecExam();
//        DI : exam 주입
//        Inline 방식을 사용하다가 Grid 사용한다고 가정 => Grid로 바꾸는 소스코드가 아니라 외부 설정으로 빼야함
//        Inline : 한줄에 출력
//        ExamConsole console = new InlineExamConsole(exam);

//        ExamConsole console = new GridExamConsole();
//        console.setExam(exam);

//        스프링에게 지시하는 방법으로 코드를 변경(외부파일로 빼냄)
        ApplicationContext context =
                new ClassPathXmlApplicationContext("setting.xml");
//        context : IoC 컨테이너의 이름
//        xml 파일의 id로 접근하거나 type 명 (GridExamConsole)으로 접근
//        context에게 bean을 달라고 요청함. "console"이 정확히 어떤 타입인지 모르기 때문에 getBean은 Object형으로 반환하므로
//        캐스팅을 해줘야 한다.
//        ExamConsole console = (ExamConsole) context.getBean("console");

//        ExamConsole 타입에 맞게 반환하도록 함
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();
    }
}
