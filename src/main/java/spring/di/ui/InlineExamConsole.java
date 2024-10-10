package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;

    public InlineExamConsole() {

    }

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

//    xml 파일에서 bean 객체의 console 객체를 만남.
//    그러면 이 파일로 와서 Autowired를 찾는다.
//    setExam을 자동으로 해준다.
    @Autowired
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
