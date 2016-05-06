package com.eeu436.binarysearchtree;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ICP 2027 - Assignment 2
 * Due: 2016-05-06
 * Array Tester
 * @author eeu436
 */
public class ArrayTester {   
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("arrData.csv");
        for(int i = 100; i <= 10000; i++){
            BinarySearchObj arr = new BinarySearchObj(i);
            writer.append(Double.toString(arr.getAverage())+ ",");
        }
    }
}
