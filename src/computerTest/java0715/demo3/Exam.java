package computerTest.java0715.demo3;

/**
 * @Author dingxin
 * @Date 2019/8/27 10:35
 **/
 class Exam extends Father {
    static int void1=0;

    public static void main(String[] args) {
        int noVoid=void1+1;
        Happy H = new Happy();
        new Thread(H).start();
        new Thread(H).start();
        Father father=new Father();

    }

    public void colsole(){
        super.console();
    }
}
