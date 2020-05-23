package Test;
import Test.Car;
import Test.Cargo;
import Test.Manned;
import Test.Truck;


import java.util.HashMap;
import java.util.Scanner;

public class Truck extends Car {
    private Car jc=new Car("japanese car",60,5,1.0,7);
    private Car ac=new Car("American car",60,2,3.0,8);

    public void print(){
        jc.print();
        System.out.println();
        ac.print();
        System.out.println();
    }

    public Car getJc() {
        return jc;
    }

    public Car getAc() {
        return ac;
    }
}
