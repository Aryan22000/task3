package task3;


public class My_car {

  public static void main(String[] args) {
      Car car1 = new Car();//Connect to the class Car
      //Scanner read = new Scanner(System.in);
      //variableing =>
      car1.brand = "Fiat";
      car1.model = "500";
      int New_amountOfFuel = 50 ;
      int reful = 8;
      
      car1.amountOfFuel = New_amountOfFuel;
      //***********
      //useing the methods =>
      car1.printdata();
      System.out.println("************");
      System.out.println(car1.accelerate()); 
      System.out.println("************");
      car1.brake();
      System.out.println("************");
      car1.printdata();
    System.out.println("************");
      car1.refuel(reful);
      System.out.println("************");
      //second object =>
      Car car2 = new Car("BMW","Z4",100);
      car2.printdata();
      car1.brake();
      

}
}