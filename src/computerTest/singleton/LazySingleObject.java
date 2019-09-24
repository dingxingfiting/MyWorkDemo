package computerTest.singleton;

//懒汉式,线程不安全
public class LazySingleObject {

    private static SingleObject singleObject;


    private LazySingleObject() {
    }

    public static SingleObject getSingleObject() {
        if (singleObject==null) {
            LazySingleObject singleObject = new LazySingleObject();

        }
        return singleObject;
    }
}
