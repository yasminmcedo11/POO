public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        float x = 1.0f;
        float y = 2.0f;
        float z = 3.0f;

        x = -x; // x = -1
        y = y - 1; // y = 2 - 1 = 1 
        z = z + x; // z = 3 + (-1) = 3 - 1 = 2
        z = z + x - y; // z = 2 + (-1) - 3 = 2 - 1 - 1 = 0
        // x = -1.0; y = 1.0; z = 0.0

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
