package Day_14_Class_Task;

public class ParalellArraysToObj {

    public static void main(String[] args) {

        Mazza d1 = new Mazza();
        Sprite d2 = new Sprite();
        Campa d3 = new Campa();
        Pepsi d4 = new Pepsi();

        System.out.println(d1.name + " " + d1.price);
        System.out.println(d2.name + " " + d2.price);
        System.out.println(d3.name + " " + d3.price);
        System.out.println(d4.name + " " + d4.price);
    }
}

class Drink {
    String name;
    float price;
}

class Mazza extends Drink {

    Mazza() {
        name = "Mazza";
        price = 20f;
    }
}

class Sprite extends Drink {

    Sprite() {
        name = "Sprite";
        price = 25f;
    }
}

class Campa extends Drink {

    Campa() {
        name = "Campa";
        price = 20f;
    }
}

class Pepsi extends Drink {

    Pepsi() {
        name = "Pepsi";
        price = 15f;
    }
}