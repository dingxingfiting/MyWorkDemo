package computerTest.java0715.demo01;

import java.util.ArrayList;
import java.util.List;

public class ServiceTest {

    public static void main(String[] args) {
        //建立学生集合
        List<Student> teams = new ArrayList<Student>();
        //new出学生对象
        Student stu1 = new Student(1, "Tom", 15);
        Student stu2 = new Student(3, "Jack", 13);
        Student stu3 = new Student(2, "Helen", 18);
        Student stu4 = new Student(4, "May", 12);
        //将对象插入集合
        teams.add(stu1);
        teams.add(stu2);
        teams.add(stu3);
        teams.add(stu4);
        // 获取单例对象
        Service service = Service.getInstance();
        System.out.println("==========随机抽取学生=============");
        //调用随机选取方法
        Student randomStu = service.randomStu(teams);
        System.out.println(randomStu);
    }

}
