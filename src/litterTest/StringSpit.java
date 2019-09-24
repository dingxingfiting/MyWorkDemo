package litterTest;

/**
 * @Author dingxin
 * @Date 2019/9/16 10:21
 **/
public class StringSpit {


    public static void main(String[] args) {
        String[] fileNames=new String[3];
        fileNames[0]="001.pdf";
        fileNames[2]="0003.pdf";

        String fileName="003.pdf";
        String substring =  fileNames[2].substring( fileNames[2].lastIndexOf(".") + 1);
        System.out.println(substring);


    }
}
