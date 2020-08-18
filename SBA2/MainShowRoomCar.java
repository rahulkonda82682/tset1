package assign2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainShowRoomCar {
Map<String, List<Car>> carstore;
public void displayCarsByShowRoomName(String showRoomName)
{
List<Car> cars=carstore.get(showRoomName);
for(Car car:cars){
System.out.println(car);
}}
public static void main(String[] args) {
Car car1=new Car(1634,"BMW");
Car car2=new Car(1754,"BENZ");
Car car3=new Car(1554,"Ford");
Car car4=new Car(1694,"JEEP");
Car car5=new Car(1320,"Ferrari");
List<Car> cars=new ArrayList<Car>();
cars.add(car1);
cars.add(car2);
cars.add(car3);
cars.add(car4);
cars.add(car5);
Showroom showRoom =new Showroom("AUDI", 7337, cars);
Car car6=new Car(1554,"HONDA");
Car car7=new Car(1334,"Lamborghini");
Car car8=new Car(1894,"AstonMartin");
Car car9=new Car(1694,"Pagani Huayra");
Car car10=new Car(1999,"MARUTHI SUZAKI");
List<Car> cars1=new ArrayList<Car>();
cars1.add(car6);
cars1.add(car7);
cars1.add(car8);
cars1.add(car9);
cars1.add(car10);
Showroom showRoom2=new Showroom("Tata",131, cars1);
MainShowRoomCar mainShowRoomCar =new MainShowRoomCar();
mainShowRoomCar.carstore=new HashMap<String,List<Car>>();
mainShowRoomCar.carstore.put(showRoom.getShowRoomName(),showRoom.getCars());
mainShowRoomCar.carstore.put(showRoom2.getShowRoomName(),showRoom2.getCars());
System.out.println("sorted by showRoomName");
mainShowRoomCar.displayCarsByShowRoomName("AUDI");
System.out.println("sorted by car name");
Collections.sort(cars, new SortCarName());
for(Car car:cars) {
System.out.println(car);
}
System.out.println("sorted based on year");
Collections.sort(cars1, new SortYear());
for(Car car:cars1) {
System.out.println(car);
}}}

