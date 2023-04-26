package be.intecbrussel;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) {

        try{

        Path path1 = Paths.get("resources//FromWalidToManuel//message.txt");

        Files.createDirectories(path1.getParent());


        if(Files.notExists(path1)){
            Files.createFile(path1);
            System.out.println("Path created");
        }


        } catch (IOException e){
            System.out.println("File already exists");
        }


        try {

        Path path2 = Paths.get("resources//FromWalidToLion//animal.txt");

        Files.createDirectories(path2.getParent());

        if(Files.notExists(path2)){
            Files.createFile(path2);
            System.out.println("File created");
        }

        } catch (IOException e){
            System.out.println("Already esxists");
        }


        try {
            FileWriter toPath = new FileWriter("resources//FromWalidToManuel//message.txt");
            toPath.write("Funny story 0 m8");
            toPath.close();

            int character;
            FileReader toConsole = new FileReader("resources//FromWalidToManuel//message.txt");

            while ((character = toConsole.read()) != -1){
                System.out.print((char)character + " ");
            }

            System.out.println();

        } catch (IOException e) {
            System.out.println("Already exist or something");
        }


        try {
            FileWriter toPath = new FileWriter("resources//FromWalidToLion//animal.txt");
            toPath.write("Funny animal story \n");
            toPath.close();
        } catch (IOException e) {
            System.out.println("Already exist or something");
        }

        Animal chicken = new Animal("my meal", true);

        // Object opslaan

        try{

            FileOutputStream file = new FileOutputStream("resources//FromWalidToLion//animal.txt");

            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(chicken);

        } catch (IOException e){
            System.out.println("some error happened");
        }



        try{

        FileInputStream file = new FileInputStream("resources//FromWalidToLion//animal.txt");

        ObjectInputStream in = new ObjectInputStream(file);

            System.out.println(in.readObject());

        } catch (IOException | ClassNotFoundException e){
        System.out.println("some error happened");
    }







    }
}
