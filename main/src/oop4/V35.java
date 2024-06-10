package oop4;

class V{
    int x= 10;
}
class C extends V{
    int x =15;
    public void print() {
        System.out.println(super.x);
    }
}

public class V35 {



    public static void main(String[] args) {
        C lucky = new C();
        lucky.print();
    }
}
