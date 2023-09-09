/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author DELL
 */
public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int sizeArray;

    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        this.library = new Library();
        this.algorithm = new Algorithm();
        this.array = element.getArray();
        this.sizeArray = element.getSizeArray();
    }

    @Override
    public void execute(int n) {

        switch (n) {
            case 1:
                linearSearch();
                break;
            case 2:
                binarySearch();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void linearSearch() {
        library.display(array);
        int value = library.getIntData("\nEnter number to find: ", 1, 100);
        int a = algorithm.linearSearch(array, value);
        if(a == 0){
            System.out.println("NOT FOUND");
        }
        else System.out.println("FOUND");
       
    }
    
    public void binarySearch(){
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getIntData("\nEnter number to find: ", 1, 100);
        int a = algorithm.binarySearch(array, value);
        if(a < 0){
            System.out.println("NOT FOUND");
        }
        else System.out.println("FOUND");
    }

}
