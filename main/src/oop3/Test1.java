package oop3;

class parents{
   final public void say(){
        System.out.println("parents say");
    }
}

class child extends parents{

}

final class Sibling{
    //this class can't inherit for any one
}


public class Test1 {

    public static void main(String[] args) {
        final double g = 9.81;
        System.out.println(g);
    }
}
