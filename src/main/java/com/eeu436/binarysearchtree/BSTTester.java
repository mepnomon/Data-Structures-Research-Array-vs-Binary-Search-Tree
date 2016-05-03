package com.eeu436.binarysearchtree;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eeu436
 */
public class BSTTester {
  
    
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("bstdata.csv");
        
        for(int i = 100; i < 10000; i++){
            
            BSTObj tree = new BSTObj(i);
            writer.append(Double.toString(tree.getAverage())+ ",");
        }
    }
}