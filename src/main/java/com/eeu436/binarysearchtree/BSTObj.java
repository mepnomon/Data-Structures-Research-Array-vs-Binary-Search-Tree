
package com.eeu436.binarysearchtree;

import java.util.Random;

/**
 *ICP 2027 - Assignment 2
 * Due: 2016-05-06
 * BST Object
 * @author eeu436
 */
public class BSTObj {
    
    private int[] tempData;
    private int[] arr;
    private Random generator;
    private final int TRIALS = 1000;
    private BST tree;
    private int treeSize;
    private float avgComparisons;
    
    /**
     * Constructor for BSTObj
     * @param treeSize 
     */
    public BSTObj(int treeSize){
        
        this.treeSize = treeSize;
        tempData = new int[TRIALS];
        tree = new BST();
        
        generator = new Random();
        
        arr = new int[treeSize];
        arr = populateArray(arr);
        arr = shuffleArray(arr);
        
        tree = populateBST(arr);
        tempData = searchRndTarget(tree);
        calculateAverage(tempData);
    }
    
    /**
     * Populates the Binary Search Tree
     * with random keys.
     * @param arr
     * @return a populated tree
     */
    private BST populateBST(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            tree.insert(arr[i]);
        }
        return tree;
    }
    
    /**
     * Linearly populates an array.
     * @param arr
     * @return a populated array
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
       
    /**
     * Generates a random integer and 
     * searches for it.
     * @param tree
     * @return an array with the number of comparisons for each search.
     */
    private int[] searchRndTarget(BST tree){
        
        for(int i = 0; i < TRIALS; i++){
            
            int target = generator.nextInt(treeSize);
            tempData[i] = tree.search(target);
        }
        return tempData;
    }
    
    /**
     * Calculates the average number of comparisons for 1000
     * trials.
     * @param tempData 
     */
    private void calculateAverage(int[] tempData){
        float tempVar = 0;
        for(int i = 0; i < TRIALS; i++){
            tempVar += tempData[i];
        }
        avgComparisons = (tempVar / TRIALS);
    }
    
    public float getAverage(){
        
        return avgComparisons;
    }
}
