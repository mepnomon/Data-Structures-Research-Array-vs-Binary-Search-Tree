package com.eeu436.binarysearchtree;

import java.util.Arrays;
import java.util.Random;

/**
 *ICP 2027 - Assignment 2
 * Due: 2016-05-06
 * Binary Search Object
 * @author eeu436
 */
public class BinarySearchObj {

    Random generator;
    final int TRIALS = 1000;
    int arrSize;
    int arr[];
    int tempData[];
    float avgComparisons;
    
    
    
    /**
     * Constructor for Binary Search Object
     * @param arrSize
     */
    public BinarySearchObj(int arrSize){
        
        generator = new Random();
        this.arrSize = arrSize;
        arr = new int[arrSize];
        tempData = new int[TRIALS];
        populateArray();
        searchRndTarget();
        calculateAvg();
        
    }
    
    /**
     * Populates an array
     */
    private void populateArray(){
        
        for(int i = 0; i < arrSize; i++){
            
            arr[i] = i;
        }
    }
    
    /**
     * Generates a random integer, searches for it
     * and stores number of comparisons in an array.
     */
    private void searchRndTarget(){
        
        for(int i = 0; i < TRIALS; i++){
            int target = generator.nextInt(arrSize);
            tempData[i] = binarySearch(target);
        }
    }
    
    /**
     * Uses binary search algorithm on array
     * @param target the target sought for
     * @return the steps it took to find target
     */
    private int binarySearch(Comparable target){
        int steps = 0;
        int l = 0, r = arr.length;
        //System.out.println("Searching for" + target);
        while(l <= r){
            int m = (l + r)/2;
            int comp = target.compareTo(arr[m]);
            ++steps;
            if(comp == 0){
                //System.out.println("Target:" + target + "found in:" + steps);
                return steps;
            }else if(comp < 0){
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return 0;
    }
    
    /**
     * Calculates average comparisons from sample data.
     * @param tempData temporary sample data
     */
    private void calculateAvg(){
        float tempVar = 0;
        for(int i = 0; i < TRIALS; i++){
            
            tempVar += tempData[i];
        }
        avgComparisons = (tempVar / TRIALS);
    }
    
    /**
     * Returns average comparisons
     * @return average comparisons.
     */
    public float getAverage(){
        
        return avgComparisons;
    }
    
    public void printArray(){
        
        System.out.println(Arrays.toString(arr));
    }
}
