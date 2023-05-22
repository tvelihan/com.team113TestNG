package utilities;

public class ReusableMethods {
    public ReusableMethods() {
    }

    public static void bekle(int saniye) {
        try {
            Thread.sleep((long)(saniye * 1000));
        } catch (InterruptedException var2) {
        }

    }

}
