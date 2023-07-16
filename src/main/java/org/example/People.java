package org.example;

import java.util.Scanner;

import static org.example.Json.getJson;
import static org.example.Json.prettyJson;

public class People {
    public static void peopleButton(){
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                System.out.println();
                System.out.println("1) Display full json for People");
                System.out.println("2) Display specified Person by id");
                System.out.println("3) <- Back");
                System.out.print("Your choice: ");
                int peoplesResult = in.nextInt();
                if(peoplesResult == 1){
                    peopleFullDisplay();
                } else if (peoplesResult == 2) {
                    peopleSpecified();
                } else if (peoplesResult == 3) {break;}
            } catch (Exception e){
                System.out.println("Try to write a number");
            }
        }
    }
    public static void peopleFullDisplay(){
        for(int i = 1; i<=82; i++){ // 82 = total count
            try{
                String iString = Integer.toString(i);
                String sWUrl = String.format("https://swapi.dev/api/people/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
            } catch (Exception e){
                continue;
            }
        }
    }
    public static void peopleSpecified(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please select Person id to display (1-82)");
        System.out.print("Your choice: ");
        int result = in.nextInt();
        while (true){
            try {
                String iString = Integer.toString(result);
                String sWUrl = String.format("https://swapi.dev/api/people/%s", iString);
                System.out.println(prettyJson(getJson(sWUrl)));
                break;
            } catch (Exception e){
                if(result > 82){ // if id is out of bounds program will display first value
                    result = 1;
                }else{
                    result+=1;
                }
            }
        }
    }
}
