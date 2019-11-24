package demo;

import org.joda.time.LocalTime;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {  
        LocalTime  time = new LocalTime();
        System.out.println("LocalTime "+time);
        System.out.println(new App().getGreeting());
    }
}