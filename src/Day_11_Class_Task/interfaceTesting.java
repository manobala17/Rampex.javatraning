package Day_11_Class_Task;

public class interfaceTesting {

    public static void main(String[] args) {

        Vivo v = new Vivo();
        v.call();
        v.message();
    }
}

interface phone1 {

    void call();
    void message();
}

class Vivo implements phone1 {

    public void call() {
        System.out.println("Calling...");
    }

    public void message() {
        System.out.println("Sending Message...");
    }
}