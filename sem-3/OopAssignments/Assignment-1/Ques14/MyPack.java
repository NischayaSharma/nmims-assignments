package mypack;

import package1.*;
import package1.package2.*;

public class MyPack {
    public static void main(String[] args) {
        Dell del = new Dell();
        Laptop lap = new Laptop();
        Mobile mob = new Mobile();
        Computer com = new Computer();
        Hp hp = new Hp();
        del.displayDell();
        lap.displayLaptop();
        mob.displayMobile();
        com.displayComputer();
        hp.displayHp();
    }
}