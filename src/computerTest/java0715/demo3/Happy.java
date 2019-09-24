package computerTest.java0715.demo3;

/**
 * @Author dingxin
 * @Date 2019/8/27 10:33
 **/
 class Happy implements  Runnable {
    private int x;
    @Override
    public void run() {

        for ( x= 0; x!=10; x++) {
            System.out.println("x=" + x);
        }

    }
}
