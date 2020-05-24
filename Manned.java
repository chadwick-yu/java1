package Test;

public class Manned extends Car {
    ///存入实例化成员变量
    private Car car=new Car("car",40,4,0.0,1);
    private Car bread=new Car("bread",65,7,0.0,2);
    private Car bus=new Car("bus",180,20,0.0,3);
    public Manned(Car car, Car bread, Car bus) {
        this.car = car;
        this.bread = bread;
        this.bus = bus;
    }

    public Manned() {
    }
    public void print(){
        car.print();
        System.out.println();
        bread.print();
        System.out.println();
        bus.print();
        System.out.println();
    }

    public Car getCar() {
        return car;
    }

    public Car getBread() {
        return bread;
    }

    public Car getBus() {
        return bus;
    }
}
