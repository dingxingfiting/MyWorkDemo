package 集合数组;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/*
如果要进行remove操作，可以调用迭代器的 remove 方法而不是集合类的 remove 方法。
因为如果列表在任何时间从结构上修改创建迭代器之后，
以任何方式除非通过迭代器自身remove/add方法，
迭代器都将抛出一个ConcurrentModificationException,
这就是单线程状态下产生的 fail-fast 机制。*/
public class ArrayTest03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if("1".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(list);
        list.add("1");

        try {
            for (String next:list
            ) {
                if ("1".equals(next)){
                    list.remove(next);
                }

            }
            System.out.println(list);
        }catch (ConcurrentModificationException c){
            System.out.println("我被捕捉到了,因为我在foreach循环里面执行了list.remove方法,触发了 fail-fast 机制。");
        }


    }
}
