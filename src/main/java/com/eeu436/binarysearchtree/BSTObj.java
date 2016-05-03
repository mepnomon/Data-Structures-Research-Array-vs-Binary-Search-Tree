
package com.eeu436.binarysearchtree;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eeu436
 */
public class BSTObj {
    
    private String[] data;
    private int[] arr;
    private int steps;
    private Random generator;
    BST tree;
    CSVWriter writer;
    
    /**
     * Constructor for BSTObj
     * @param treeSize 
     */
    public BSTObj(int treeSize){
        
        generator = new Random();
        tree = new BST();
        try {
            writer = new CSVWriter(new FileWriter("bstdata.csv"), ',',
                    CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.NO_ESCAPE_CHARACTER);
        } catch (IOException ex) {
            Logger.getLogger(BSTObj.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr = new int[treeSize];
        arr = populateArray(arr);
        arr = shuffleArray(arr);
        tree = populateBST(arr);
        int target = generator.nextInt(treeSize);
        System.out.println("Target:" + target);
        steps = tree.search(target);
        System.out.println("Steps:" + steps);
        //data = Integer.toString(steps);
        //writer.writeNext(String[] steps);
    }
    
    private BST populateBST(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            
            tree.insert(arr[i]);
        }
        return tree;
    }
    
    /**
     * 
     * @param arr
     * @return 
     */
    private int[] populateArray(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = i;
        }
        return arr;
    }
    
    /**
     * Fisher Yates Shuffle algorithm
     * @param arr 
     */
    private int[] shuffleArray(int[] arr){
        
        int n = arr.length;
        
        for(int i : arr){
            int rand = i+ (int) (Math.random()* (n-i));
            int randElem = arr[rand];
            arr[rand] = arr[i];
            arr[i] = randElem;
        }
        return arr;
    }
    
    public void printArray(){
        
        for(int i : arr){
            
            System.out.print(arr[i] + ", ");
        }
    }
}
