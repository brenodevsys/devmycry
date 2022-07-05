package oo;


class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird {
    public void song() {
        System.out.println("RobinTweeeeet");
    }

}


public class Polymorphism {

    public static void main(String[] args) {

        Robin r = new Robin();
        r.sing();
        r.song();









    }
}
