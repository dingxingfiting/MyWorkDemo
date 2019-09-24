package aboutjdk8.方法和构造函数引用;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:39
 * 指定一个用来创建Person对象的对象工厂接口：
 **/
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
