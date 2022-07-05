package flowcontrol;

public class LabelleBlock {

    public static void main(String[] args) {

        int x = 20;
        l1:
        {
            System.out.println("Block Begins");

            if(x == 20) {
                break l1;
            }
            System.out.println("Block ends");
        }

        System.out.println("Outside the block");


    }
}
