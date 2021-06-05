package ex23;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Locale;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        System.out.print("Is the car silent when you turn the key? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);

        if(str.equals("y") || str.equals("yes")){
            app.batteryTerminal();
        }
        else{
            app.slickingNoise();
        }
    }

    public void batteryTerminal(){
        System.out.print("Are the battery terminals corroded? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        if(str.equals("y") || str.equals("yes")){
            System.out.println("Clean terminals and try starting again.");
        }
        else{
            System.out.println("The battery cables may be damaged.\nReplace cables and try again");
        }
    }

    public void slickingNoise(){
        System.out.print("Does the car make a slicking noise? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        if(str.equals("y") || str.equals("yes")){
            System.out.println("Replace the battery.");
        }
        else{
            carCrank();
        }
    }

    public void carCrank(){
        System.out.print("Does the car crank up but fail to start? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        if(str.equals("y") || str.equals("yes")){
            System.out.println("Check spark plug connections.");
        }
        else{
            doesEngineStart();
        }
    }

    public void doesEngineStart(){
        System.out.print("Does the engine start and then die? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        if(str.equals("y") || str.equals("yes")){
            carFuel();
        }
        else {
            System.out.println("This should not be possible.");
        }
    }

    public void carFuel() {
        System.out.print("Does your car have fuel injection? ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        if (str.equals("y") || str.equals("yes")) {
            System.out.println("Get it in for service");
        } else {
            System.out.println("Check to ensure the choke is opening and closing.");
        }
    }
}
