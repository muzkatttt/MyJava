package org.example;

import java.util.*;

public class ParadoxMontiHolla2 {
private static Random rand = new Random();
    private static int cars = 0;

    private static String pickRandom(Set<String> set) {
        return (String)set.toArray()[rand.nextInt(set.size())];
    }

    public static void run(boolean automatic, String changeornot) {
        Set<String> closedDoors = new HashSet<>(Arrays.asList("A", "B", "C"));
        String doorWithCar = pickRandom(closedDoors);
        Set<String> doorsWithGoat = new HashSet<>(closedDoors);
        doorsWithGoat.remove(doorWithCar);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nYou have got three doors, there is a price inside each of them. Pick a door: A, B, or C.");
        String pickedDoor = "";
        if(automatic) {
            pickedDoor = pickRandom(closedDoors);
        } else {
            while(true) {
                pickedDoor = sc.nextLine().toUpperCase();
                System.out.println("\n");
                try {
                    pickedDoor = "" + (char)(Integer.parseInt(pickedDoor) - 1 + 'A');
                } catch(NumberFormatException e) {
                }
                if(closedDoors.contains(pickedDoor)) break;
                System.out.println("The door you chose is not available. Try again.");
            }
        }
        System.out.println("you picked door " + pickedDoor);
        Set<String> possibleChoices = new HashSet<>(doorsWithGoat);
        possibleChoices.remove(pickedDoor);

        String openDoor = pickRandom(possibleChoices);
        closedDoors.remove(openDoor);

        System.out.println("The door " + openDoor + " contains a Goat");

        System.out.println("\nKnowing where one of the Goats are, do you wish to stay on your current door, or do you want to change?");
        if(!automatic) {
            while(true) {
                changeornot = sc.nextLine().toLowerCase();
                System.out.println();

                if (changeornot.equals("1") || changeornot.equals("yes")) {
                    changeornot = "change";
                }
                else if (changeornot.equals("0") || changeornot.equals("no")) {
                    changeornot = "stay";
                }
                if(changeornot.equals("change") || changeornot.equals("stay")) break;
                System.out.println("choose either change or stay");
            }
        }
        if(changeornot.equals("change")) {
            closedDoors.remove(pickedDoor);
            pickedDoor = (String)closedDoors.toArray()[0];
        }
        String price = "goat";
        if(pickedDoor.equals(doorWithCar)) price = "car";
        System.out.print("Congratulations! You chose to " + changeornot + ", and won a " + price + ".");
        System.out.println();
        if(price.equals("car")) cars++;

        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        //String choice = "stay";
        String choice = "stay";
        for(int i = 0; i < 1000; i++) run(true, choice);
        System.out.println("You chose to " + choice + " and won a total of " + cars + " cars.");
    }
}
