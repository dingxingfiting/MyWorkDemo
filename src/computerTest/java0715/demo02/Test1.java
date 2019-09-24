package computerTest.java0715.demo02;


/**
 * 将字符串「a-b-c-d-e-f」按 「-」 切割，找到 「c」字符，
 * 替换为大写，然后倒序输出 「f-e-d-C-b-a」
 * @author dingxin
 *
 */
public class Test1 {

    public static void main(String[] args) {
        //定义初始字符串
        String ss="a-b-c-d-e-f";
        //将字符串转换成数组
        String[] str=ss.split("-");
        //遍历数组
        for (int i = 0; i <str.length ; i++) {
            //找到「c」字符并转换为大写
            if("c".equals(str[i])){
                str[i]="C";
            }
        }

        //定义空字符串temp，利用反向遍历和累加生成反转字符串。
        String temp = "";
        for (int i = str.length-1; i >=0 ; i--) {
            temp = temp+str[i] + "-";
        }

        //利用substring方法来输出字符串
        System.out.println(temp.substring(0,temp.length()-1));

    }
}
