package aboutjdk8.方法和构造函数引用;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:38
 **/
public class Person {

    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
