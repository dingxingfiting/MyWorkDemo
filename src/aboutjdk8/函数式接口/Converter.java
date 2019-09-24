package aboutjdk8.函数式接口;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:00
 **/
@FunctionalInterface
public interface Converter<F,T> {

    // 函数式接口”是指仅仅只包含一个抽象方法,
    // 但是可以有多个非抽象方法(也就是上面提到的默认方法)的接口
    // 像这样的接口，可以被隐式转换为lambda表达式。
    // java.lang.Runnable 与 java.util.concurrent.Callable 是函数式接口最典型的两个例子。


    T convert(F from);

    default void add(int a){}
    default void add2(int a){}


}
