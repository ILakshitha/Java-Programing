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

class student{
    String name;
    int age;
    String school;

    student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;

    }
}

class Ishan extends student{
    int markes;
    Ishan(String name, int age, String school, int markes){
      super(name, age, school);
      this.markes = markes;

    }
}

public class V35 {



    public static void main(String[] args) {
        C lucky = new C();
        lucky.print();
        Ishan obj= new Ishan("mama",23,"pd",87);
    }
}
