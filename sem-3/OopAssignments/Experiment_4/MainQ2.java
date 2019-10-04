package exp4.Q2;
class Person {
    void Init() {
        String name = "Nischaya SHarma";
        int code = 30;
        System.out.println("Name:" + name);
        System.out.println("Code:" + code);
    }
}

class Account extends Person {
    void Init() {
        double pay = 150000;
        System.out.println("Pay:" + pay);
    }
}

class Admin extends Account {
    void Display() {
        double exp = 100000;
        System.out.println("Expenditure:" + exp);
    }
}

public class MainQ1 {
    public static void main(String args[]) {
        Person obj1 = new Person();
        Account obj2 = new Account();
        Admin obj3 = new Admin();
        obj1.Init();
        obj2.Init();
        obj3.Display();
    }
}