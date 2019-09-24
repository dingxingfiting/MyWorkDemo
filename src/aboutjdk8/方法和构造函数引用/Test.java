package aboutjdk8.方法和构造函数引用;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:58
 **/
public class Test {

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}
