package oo.polymorphismAnimals;

public class Dog extends Animal{
    private String micky;

    public void ticado(){
        System.out.println("Tiquei mamãe!");
    }

    public String getMicky() {
        return micky;
    }

    public void setMicky(String micky) {
        this.micky = micky;
    }
}
