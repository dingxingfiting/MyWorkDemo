package litterTest;

public class Demo1 {
    //如何去小数点前两位，并四舍五入。(有歧义)
    public static void main(String[] args) {
        double d=1256.22d;
        d=d/100;
        System.out.println(Math.round(d)*100);
        



    }
}
