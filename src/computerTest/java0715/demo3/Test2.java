package computerTest.java0715.demo3;

import org.junit.Test;

/**
 * @Author dingxin
 * @Date 2019/8/27 14:46
 **/
public class Test2
{
    public void add(Byte b)
    {
        b = b++;
    }
    @Test
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
}