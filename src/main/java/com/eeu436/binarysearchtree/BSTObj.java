
package com.eeu436.binarysearchtree;

import com.opencsv.CSVWriter;
import java.util.Random;

/**
 *
 * @author eeu436
 */
public class BSTObj {
    
    private int[] arr;
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
        arr = new int[treeSize];
        arr = populateArray(arr);
        arr = shuffleArray(arr);
        tree = populateBST(arr);
        int target = generator.nextInt(treeSize);
        System.out.println("Found in " + tree.search(target));
        
        //System.out.println("Found in: " + tree.search(generator.nextInt(treeSize)));
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
