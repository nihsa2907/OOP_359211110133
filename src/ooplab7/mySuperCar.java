package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        //user assign data to object
        SuperCar s4 = new SuperCar();
        s4 = inputData(s4);
        System.out.println(s4.toString());
    }
    private static SuperCar inputData(SuperCar s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a supercar info: ");
        System.out.print("brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("color: ");
        s.setColor(scanner.nextLine());
        System.out.print("engine size: ");
        s.setEnginesize(scanner.nextLine());
        System.out.print("max speed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("country: ");
        s.setCountry(scanner.nextLine());
        return s;
    }



} //class