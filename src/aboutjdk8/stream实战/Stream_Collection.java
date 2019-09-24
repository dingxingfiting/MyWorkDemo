package aboutjdk8.stream实战;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author dingxin
 * @Date 2019/8/18 22:44
 **/
public class Stream_Collection {
    public static void main(String[] args) {
        List<Student> list = init();
        //获取stream对象
        Stream<Student> stream = list.stream();
        //遍历集合
        stream.forEach(p -> System.out.println(p.toString()));
        System.out.println("--------------------------------------");
        //stream过滤器的实例
        list.stream()
                .filter(p->p.getSex()
                        .equals("女"))
                .forEach(p-> System.out.println(p.toString()));
    }

    static List<Student> init() {
        List<Student> list = new ArrayList<>();
        Student student = new Student("老焦", "男", 1);
        list.add(student);
        student = new Student("老王", "男", 1);
        list.add(student);
        student = new Student("老赵", "女", 1);
        list.add(student);
        return list;
    }
}