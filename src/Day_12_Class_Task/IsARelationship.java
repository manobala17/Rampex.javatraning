package Day_12_Class_Task;

public class IsARelationship {
    public static void main(String[] args) {

        vehicle v1 = new vehicle();

        Car c1=new Car();
        c1.drive();

    }
}


class vehicle{
    public void drive(){
        System.out.println("Vehicle driving..");
    }
}

class Car{

    public void drive(){
        System.out.println("Car driving...!!");
    }

}
