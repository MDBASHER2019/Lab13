package edu.cscc;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Md Basher
 * Date: 12/01/2019
 * ProjectName: CSCI-2467 Lab 13 – Java Collections - Maps
 *  The Main class will change as follows:
 * 1)	As before, make sure the returned list (this time a Map) is not null.
 * 2)	In a loop prompt the user to type a surname
 * 3)	Input the name string
 * 4)	If the user types the sentinel value quit (any case), break out of the loop and end the program
 * 5)	Check to see if the name that the user input is in the Map (convert it to upper case first)
 * a.	If it is not, tell the user that the name was not found
 * b.	If you find it, output a report with the name, rank,  count, and proportion
 */


    public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv"; // To use the file path as a constant...

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name = null;
        //private static HashMap<String, Student> studentMap;

        //Surname[] namelist = Census.loadCensusData(CENSUSDATAFNAME);
        HashMap<String, Surname> namelist = Census.loadCensusData(CENSUSDATAFNAME);

        while (true) {
            try {
            System.out.print("Enter a surname" + " (or quit to end): ");
            name = input.nextLine().trim();

            if ("quit".equalsIgnoreCase(name)) break;
            Surname Name = namelist.get(name.toUpperCase());

            if (name != null) {
                System.out.println( "Surname:" + Name.getName()+" rank: "  + Name.getRank() + " count: "+
                        Name.getCount() + " proportion "+ Name.getProportion());
            }
            } catch (NullPointerException e){
                System.out.println("Surname: " + name + " not found");
            }
        }
    }
}
