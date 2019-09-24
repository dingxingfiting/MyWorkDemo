package aboutjdk8.函数式接口;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:13
 **/
public class Test {

    public static void main(String[] args) {

        // TODO 将数字字符串转换为整数类型
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        //class java.lang.Integer
        System.out.println(converted);
        System.out.println(converted.getClass());

        //上面中的代码还可以通过静态方法引用来表示：
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter.convert("123");
        //class java.lang.Integer
        System.out.println(converted2.getClass());

        // Java 8允许您通过::关键字传递方法或构造函数的引用。
        // 上面的示例显示了如何引用静态方法。 但我们也可以引用对象方法：
        class Something {
            private String startsWith(String s) {
                return String.valueOf(s.charAt(0));
            }
        }

        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        // "J"
        System.out.println(converted3);
    }
}
