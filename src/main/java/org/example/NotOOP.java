package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class NotOOP {
    public static String prettyJson(String string){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(string);
        return gson.toJson(je);
    }
    public static String getJson(String url) throws IOException {
        URL urlObj = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        String sbString = null;
        if (responseCode == HttpsURLConnection.HTTP_OK) {
            StringBuilder sb = new StringBuilder();
            Scanner in = new Scanner(connection.getInputStream());
            while (in.hasNext()) {
                sb.append(in.nextLine());

            }
            sbString = sb.toString(); // raw json
        }

        return sbString;
    }
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
