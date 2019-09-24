package aboutjdk8.方法和构造函数引用;

import aboutjdk8.函数式接口.Converter;

/**
 * @Author dingxin
 * @Date 2019/8/7 18:36
 **/
class Something {

    private String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }


    public static void main(String[] args) {
        //Java 8允许您通过::关键字传递方法或构造函数的引用。 上面的示例显示了如何引用静态方法。 但我们也可以引用对象方法
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        // "J"
        System.out.println(converted);
    }
}
