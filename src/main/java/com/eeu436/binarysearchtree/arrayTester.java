package com.eeu436.binarysearchtree;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eeu436
 */
public class arrayTester {
    
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("arrData.csv");
        for(int i = 100; i < 10000; i++){
            BinarySearchObj arr = new BinarySearchObj(i);
            writer.append(Double.toString(arr.getAverage())+ ",");
        }
    }
}
