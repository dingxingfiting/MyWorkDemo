package computerTest.singleton;

public class SaveLazySingle {
    private static SingleObject singleObject;


    private SaveLazySingle() {
    }

    public static synchronized SingleObject getSingleObject() {
        if (singleObject==null) {
            SaveLazySingle singleObject = new SaveLazySingle();

        }
        return singleObject;
    }
}
