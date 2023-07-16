package org.example;

import java.util.Scanner;

import static org.example.Json.getJson;
import static org.example.Json.prettyJson;

public class Starships {
    public static void starshipsButton(){
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                System.out.println();
                System.out.println("1) Display full json for Starships");
                System.out.println("2) Display specified Starship by id");
                System.out.println("3) <- Back");
                System.out.print("Your choice: ");
                int peoplesResult = in.nextInt();
                if(peoplesResult == 1){
                    starshipsFullDisplay();
                } else if (peoplesResult == 2) {
                    starshipsSpecified();
                } else if (peoplesResult == 3) {break;}
            } catch (Exception e){
                System.out.println("Try to write a number");
            }
        }
    }
    public static void starshipsFullDisplay(){
        for(int i = 1; i<=36; i++){ // 36 = total count
            try{
                String iString = Integer.toString(i);
                String sWUrl = String.format("https://swapi.dev/api/starships/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
            } catch (Exception e){
                continue;
            }
        }
    }
    public static void starshipsSpecified(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please select Starship id to display (1-36)");
        System.out.print("Your choice: ");
        int result = in.nextInt();
        while (true){
            try {
                String iString = Integer.toString(result);
                String sWUrl = String.format("https://swapi.dev/api/starships/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
                break;
            } catch (Exception e){
                if(result > 36){ // if id is out of bounds program will display first value
                    result = 1;
                }else{
                    result+=1;
                }
            }
        }
    }
}
