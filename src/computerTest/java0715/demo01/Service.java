package computerTest.java0715.demo01;

import java.util.List;

/**
 * 单例服务类，里面有随机选择方法
 * 紧接第二题，用单例设计一个服务类，并定义一个方法，可以随机抽取集合中的某个学生对象，并打印输出。
 */

public class Service {
    //new出单例对象
    private static Service service = new Service();
    //构造器
    private Service() {

    }
    //getInstance方法，以便获得实例
    public static Service getInstance() {
        return service;
    }
    //建立随机获得集合属性的方法
    public Student randomStu(List<Student> stus) {
        //非空判断
        if (null != stus && !stus.isEmpty()) {
            //Math.random() * stus.size()获得随机数
            return stus.get((int)(Math.random() * stus.size()));
        } else {
            return null;
        }
    }

}
