package org.example;

import java.util.Scanner;

import static org.example.Json.prettyJson;
import static org.example.Json.getJson;


public class Planets {
    public static void planetsButton(){
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                System.out.println();
                System.out.println("1) Display full json for Planets");
                System.out.println("2) Display specified Planet by id");
                System.out.println("3) <- Back");
                System.out.print("Your choice: ");
                int peoplesResult = in.nextInt();
                if(peoplesResult == 1){
                    planetsFullDisplay();
                } else if (peoplesResult == 2) {
                    planetsSpecified();
                } else if (peoplesResult == 3) {break;}
            } catch (Exception e){
                System.out.println("Try to write a number");
            }
        }
    }
    public static void planetsFullDisplay(){
        for(int i = 1; i<=60; i++){ // 60 = total count
            try{
                String iString = Integer.toString(i);
                String sWUrl = String.format("https://swapi.dev/api/planets/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
            } catch (Exception e){
                continue;
            }
        }
    }
    public static void planetsSpecified(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please select Planet id to display (1-60)");
        System.out.print("Your choice: ");
        int result = in.nextInt();
        while (true){
            try {
                String iString = Integer.toString(result);
                String sWUrl = String.format("https://swapi.dev/api/planets/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
                break;
            } catch (Exception e){
                if(result > 60){ // if id is out of bounds program will display first value
                    result = 1;
                }else{
                    result+=1;
                }
            }
        }
    }
}
