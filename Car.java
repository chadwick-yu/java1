package Test;

import java.util.HashMap;

public class Car {
    private String car_name;
    private int price=0;
    private int manned=0;
    private Double cargo=0.0;
    private int number;

    public Car(String car_name, int price, int manned, Double cargo, int number) {
        this.car_name = car_name;
        this.price = price;
        this.manned = manned;
        this.cargo = cargo;
        this.number = number;
    }
    public Car(){

    }
    ///打印出所有的信息
    public void print(){
        System.out.println("车的序号是: "+number);
        System.out.println(car_name);
        System.out.println("最大载货量= "+manned+"吨");
        System.out.println("最大载人量= "+cargo);
        System.out.println("一辆该车的租车费用是 "+price+"元"+"一天");
    }

    public String getCar_name() {
        return car_name;
    }

    public int getPrice() {
        return price;
    }

    public int getManned() {
        return manned;
    }

    public Double getCargo() {
        return cargo;
    }

    public int getNumber() {
        return number;
    }
    ///计算总租车价格
    public  static int price(int a,int b,int c,int d,int e,int f,int g,int h,int number){
        int price=(a*40+b*65+c*180+d*30+e*47+f*80+(g+h)*60)*number;
        return price;}
}
