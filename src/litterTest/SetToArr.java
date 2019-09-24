package litterTest;

import java.util.HashSet;

/**
 * @Author dingxin
 * @Date 2019/9/18 17:14
 **/
public class SetToArr {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("151556.jpg");
        set.add("156556.jpg");
        set.add("156556.jpg");
        set.add("188556.jpg");
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());

        }

    }
}
