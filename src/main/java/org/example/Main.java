package org.example;


import java.util.Scanner;

import static org.example.People.peopleButton;
import static org.example.Planets.planetsButton;
import static org.example.Starships.starshipsButton;

public class Main {
    public static void consoleInterface(){
        while (true){
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("1) People");
                System.out.println("2) Planets");
                System.out.println("3) Starships");
                System.out.println("4) Exit");
                System.out.print("Your choice: ");
                int result = in.nextInt();
                if(result == 1){
                    peopleButton();
                }
                else if(result == 2){
                    planetsButton();
                }
                else if(result == 3){
                    starshipsButton();
                }
                else if(result == 4){
                    break;
                }
            } catch (Exception e){
                System.out.println("Try to write a number");
            }
        }
    }

    public static void main(String[] args) {
        consoleInterface();
    }
}
