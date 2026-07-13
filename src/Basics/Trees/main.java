package Basics.Trees;

public class main {
    public static void main(String[] args) {
        Trees t=new Trees();
        t.insert(8);
        t.insert(5);
        t.insert(10);
        t.insert(6);
        t.insert(9);
        t.insert(0);
        t.insert(1);
        t.insert(2);
        System.out.println("Is 9 in the tree? " + t.search(11));
    }
}
