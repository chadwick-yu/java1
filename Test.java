package Test;
import Test.Car;
import Test.Cargo;
import Test.Manned;
import Test.Truck;


import java.util.HashMap;
import java.util.Scanner;

public class Test { public static void main(String[] args) throws Exception{
    HashMap<String,Integer> rent=new HashMap<String, Integer>();
    rent.put("car",40);rent.put("bread",65);rent.put("bus",180);rent.put("Low",30);rent.put("High",47);rent.put("Van",180);rent.put("jc",60);rent.put("Ac",60);
    Scanner in=new Scanner(System.in);
    Manned manned=new Manned();
    Cargo  cargo=new Cargo();
    Truck  truck=new Truck();
    System.out.println("请问您是否要租车");
    String A;
    A=in.next();
    if(A.equals("是")){
        manned.print();
        System.out.println();
        cargo.print();
        System.out.println();
        truck.print();
    }
    else{
        System.out.println("滚");
    }
    System.out.println("再次向您展示租金");
    for(String key:rent.keySet()){ System.out.println("Key: "+key+" Value: "+rent.get(key));}
    System.out.println("请依次输入序号1~8的租车数量");
    //读取用户租各类型车的数量
    int [] number_car=new int[8];
    for(int count=0;count<number_car.length;){
        int x=in.nextInt();
        if(x<0){
            System.out.println("输入异常，请重新重头开始输入");
        }
        else{
            number_car[count]=x;
            count++;
        }
    }
    System.out.println("请输入租车天数");
    int number=in.nextInt();
    System.out.println(Car.price(number_car[0],number_car[1],number_car[2],number_car[3],number_car[4],number_car[5],number_car[6],number_car[7],number));
    System.out.println("这是您的租金");
    System.out.println("这次您租用的各类型车的数量");
    for(int i=0;i<number_car.length;i++){
        System.out.println("序号"+i+"的租车数量："+number_car[i]);
    }
    System.out.println("您租车的天数为："+number);
    System.out.println("您所租车的最大载人量为："+(number_car[0]*4+number_car[1]*7+number_car[2]*20+number_car[6]*5+number_car[7]*2));
    System.out.println("您所租车的最大载货量为："+(number_car[3]*1.5+number_car[4]*2.5+number_car[5]*4.5+number_car[6]*1+number_car[6]*3));
    int sum=0;
    for(int i=0;i<number_car.length;i++){sum=sum+number_car[i];}
    System.out.println("您一共租用了："+sum+"辆车");
    // System.out.println(Car.price(a,b,c,d,e,f,g,h,number));
    //用户输入回车结束程序
    System.out.println("感谢您对程序的使用，输入回车退出程序");
    if(System.in.read()=='\n'){
        System.exit(0);
    }







}
}
