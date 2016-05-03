
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
    
    private int[] tempData;
    private int[] arr;
    private static int[] writeData;
    private int steps;
    private Random generator;
    private final int TRIALS = 1000;
    private BST tree;
    private CSVWriter writer;
    private int treeSize;
    private float averageCompares;
    
    /**
     * Constructor for BSTObj
     * @param treeSize 
     */
    public BSTObj(int treeSize){
        
        this.treeSize = treeSize;
        generator = new Random();
        tree = new BST();
        tempData = new int[TRIALS];
        arr = new int[treeSize];
        arr = populateArray(arr);
        arr = shuffleArray(arr);
        tree = populateBST(arr);
        tempData = runTest(tree);
        calculateAverage(tempData);
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
    
    private int[] runTest(BST tree){
        
        for(int i = 0; i < TRIALS; i++){
            
            int target = generator.nextInt(treeSize);
            //System.out.println("Target:" + target);
            steps = tree.search(target);
            //System.out.println("Steps:" + steps);
            tempData[i] = tree.search(target);
        }
        return tempData;
    }
    
    private void calculateAverage(int[] tempData){
        float tempVar = 0;
        for(int i = 0; i < TRIALS; i++){
            
                tempVar += tempData[i];
  
        }
        
        averageCompares = (tempVar / TRIALS);
        //System.out.println("avg: " + averageCompares);
    }
    
    public float getAverage(){
        
        return averageCompares;
    }
}
