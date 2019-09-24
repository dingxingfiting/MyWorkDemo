package computerTest.java0715.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 建立测试类，将小组组员添加到一个集合
 * 中，并按学号排序后输出
 */
public class Test {

    public static void main(String[] args) {
        //new出集合
        List<Student> java103=new ArrayList<Student>();
        //new出学生对象
        Student stu1 = new Student(1, "Tom", 15);
        Student stu2 = new Student(3, "Jack", 13);
        Student stu3 = new Student(2, "Helen", 18);
        Student stu4 = new Student(4, "May", 12);
        //把学生对象放入集合
        java103.add(stu1);
        java103.add(stu2);
        java103.add(stu3);
        java103.add(stu4);
        // 按学号倒叙排列
        Collections.sort(java103);
        // 遍历学生，输出结果
        for (Student stu : java103) {
            System.out.println(stu);
        }
    }

}
