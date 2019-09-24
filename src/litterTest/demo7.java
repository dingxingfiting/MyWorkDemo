package litterTest;

public class demo7 {
    public static int staticVar = 0;
    public int instanceVar = 0;
    public demo7(){
        staticVar++;
        instanceVar++;
        System.out.println("staticVar="+ staticVar + ",instanceVar=" + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println(demo7.staticVar);
    }
}
