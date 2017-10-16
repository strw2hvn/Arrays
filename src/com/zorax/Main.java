package com.zorax;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();break;
                case 1:
                    groceryList.printGroceryList();break;
                case 2:
                    addItem();break;
                case 3:
                    modifyItem();break;
                case 4:
                    removeItem();break;
                case 5:
                    searchForItem(); break;
                case 6:
                    quit = true;break;
            }
        }







        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
        /*int []myIntArray = {12,56,88,94,1,67,3};
        int[] newArray= sortIntegers(myIntArray);*/

        /*System.out.println("Array now: " + newArray[0] + "," +
                newArray[1] + "," +
                newArray[2] + "," +
                newArray[3] + "," +
                newArray[4] + "," +
                newArray[5] + "," +
                newArray[6]);*/

    }

    public static int[] sortIntegers (int[] array){
        int tempArray;
        for (int x=0; x<array.length; x++) {
                for (int i = 1; i < array.length; i++) {
                    if (array[i-1] < array[i]) {
                        tempArray = array[i];
                        array[i] = array[i-1];
                        array[i-1] = tempArray;
                    }
                }
        }
        return array;
    }

    public static void printArray(int [] array){
        System.out.println("Print Array:" + "\n");
        for (int x=0; x<array.length; x++){
            if (x==array.length-1){
                System.out.println(array[x]);
            }else {
                System.out.println(array[x] + ",\n");
            }
        }
    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int x=0; x<array.length; x++){
            array[x] = scanner.nextInt();
        }
        return array;
    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery list item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item; ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);

    }
    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.print("Enter to search for : ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        }else{
            System.out.println(searchItem = "not on file.");
        }
    }
}
