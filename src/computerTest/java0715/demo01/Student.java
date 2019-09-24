package computerTest.java0715.demo01;

/**
 * 定义学生类（包含学号、姓名、年龄），将你所在小组组员添加到一个集合
 * 中，并按学号排序后输出
 * @author dingxin
 *
 */
public class Student implements Comparable<Student> {
    //定义Student属性学号，姓名，年龄
    private int code;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o){
        int flag = 0;
        if (this.code>o.code){
            flag=-1;
        }else if (this.code==o.code) {
            flag = 0;
        }else if (this.code<o.code){
            flag=1;
        }

        return flag;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
