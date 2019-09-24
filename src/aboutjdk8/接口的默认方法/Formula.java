package aboutjdk8.接口的默认方法;

/**
 * @Author dingxin
 * @Date 2019/8/7 17:06
 **/
public interface Formula {

    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
