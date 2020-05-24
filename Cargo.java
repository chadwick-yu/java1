package Test;

public class Cargo extends Car {
    ///存入实例化成员变量
    private Car Low=new Car("Low hurdles car",30,0,1.5,4);
    private Car High=new Car("High hurdles car",47,0,2.5,5);
    private Car Van=new Car("van",180,80,4.5,6);

    public Cargo(Car low, Car high, Car van) {
       this.Low = low;
        this.High = high;
        this.Van = van;
    }

    public Cargo(){

    }
    public void print(){
        Low.print();
        System.out.println();
        High.print();
        System.out.println();
        Van.print();
    }

    public Car getLow() {
        return Low;
    }

    public Car getHigh() {
        return High;
    }

    public Car getVan() {
        return Van;
    }
}
