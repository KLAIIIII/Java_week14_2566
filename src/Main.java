interface Car{
    public void methodCar();
}

interface Cat{
    public void methodCat();
}

interface A{
    String hi = "Hi";
    public void methodA();
}



class B{
    static String name = "Mark Zuckerberg";
    public void methodB(){
        System.out.println("method of class B");
    }
}

class C extends B implements A, Car{
    public void methodA(){
        System.out.println(hi + " method of class A " + this.name);
    }

    public void methodCar(){
        System.out.println("method of class Car");
    }

    public void methodC(){
        System.out.println("method of class C");
    }
}

class D extends B implements Cat{
    public void methodCat(){
        System.out.println("method of class Cat");
    }

    public void methodD(){
        System.out.println("method of class D");
    }
}

public class Main {
    public static void main(String[] args) {
//        B obj1 = new B();
        C obj1 = new C();
        D obj2 = new D();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
        obj1.methodCar();
        obj2.methodD();
//        obj2.methodA();
//        obj3.methodA();
    }
}