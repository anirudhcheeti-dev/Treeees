package Basics.Trees;

public class main {
    public static void main(String[] args) {
        Trees t=new Trees();
        t.insert(8);
        t.insert(5);
        t.insert(2);
        t.insert(10);
        t.insert(4);
        t.insert(11);
        t.insert(7);
        t.insert(9);

        t.count();
        //System.out.println(t.count());
        System.out.println(t.depth());
    }
}
