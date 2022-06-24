/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class TestUserprofile {

    private static Iterable<String> genres;
    public static void main (String [] arg){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("We have these Genres: ");
        for(String gen:genres){
        System.out.println(gen);
        }
        System.out.println("Please enter your favourite genre");
        String genre = input.nextLine();
      
    }
}
