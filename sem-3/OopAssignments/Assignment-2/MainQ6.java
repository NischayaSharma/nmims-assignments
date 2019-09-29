package assgmt2.Q6;

import java.util.*;

class Greater {
    private int num;

    public Greater(int a) {
        this.num = a;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int a) {
        this.num = a;
    }

    public Greater compare(Greater obj) {
        if (this.num > obj.num) {
            return this;
        } else {
            return obj;
        }
    }
}

public class MainQ6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Greater obj1 = new Greater(in.nextInt());
        Greater obj2 = new Greater(in.nextInt());
        Greater great = obj1.compare(obj2);
        System.out.println(great+"<--Obj Data-->"+great.getNum());
    }
}