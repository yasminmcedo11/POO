public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        float x = 1.0f;
        float y = 2.0f;
        float z = 3.0f;

        x = -x;
        y = y - 1;
        z = z + x;
        z = z + x - y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
