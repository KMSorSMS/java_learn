package chapter6;

public class Subclass extends Out.In{
    public Subclass(Out out){
        out.super("hello");
    }
    public static void main(String[] args){
        Out out = new Out();
        Subclass sb = new Subclass(out);
    }
}
