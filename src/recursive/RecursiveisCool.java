package recursive;

public class RecursiveisCool {

    public static void main(String[] args) {

        sayHi(100000000);

    }

    private static void sayHi(int count) {
        System.out.println("hi");
        if(count <= 1) {
            return;
        }

        sayHi(count -1);
    }

}
