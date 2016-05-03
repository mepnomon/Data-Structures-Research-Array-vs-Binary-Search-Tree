/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eeu436.binarysearchtree;

import java.util.Random;

/**
 *
 * @author Mepnomon
 */
public class BSTTester {
  
    public static void main(String[] args){
        
        Random generator = new Random();
        
        for(int i = 0; i < 1000; i++){
            BSTObj tree = new BSTObj(10000);
        }
        //tree.printArray();
        
        //System.out.println("RNG Test");
        //System.out.println(generator.nextInt(1000));
     
//        int[] arr = new int[100];
//        for(int i = 0; i < arr.length; i++){
//            
//            arr[i] = i;
//        }
//        
//        for(int i : arr){
//            
//            System.out.print(arr[i] + ", ");
//        }
//        
//        System.out.println("");
//        
//        shuffle(arr);
//        
//        for(int i : arr){
//            System.out.print(arr[i] + ", ");
//        }
//       
//        //checks for duplicates
//        for(int i : arr){
//            //int target = i;
//            int count = 0;
//            for(int j: arr){
//                
//                if(arr[i] == arr[j]){
//                    count++;
//                    System.out.println("C:" + count);
//                }
//                if(count > 1){
//                    System.out.println("Duplicate detected");
//                }
//            }
//        }
//        
//        //searching the array
//        for(int i: arr){
//            
//            if(arr[i] == 13){
//                
//                System.out.println("13 found at index:" + i);
//            }
//        }
//        
//        BST tree = new BST();
//        
//        //insert it into bst
//        for(int i : arr){
//            tree.insert(i);
//        }
        
//        tree.search(15);        
//        for(int i = 0; i < 10000; i++){
//            
//            int ins = generator.nextInt(10000)+100;
//            System.out.println("inserting" + ins);
//            tree.insert(ins);
//        }
//        tree.display(tree.search(2838));
        //System.out.println("Nodes traversed: " + tree.search(7722));
        //tree.display();
        //BSTNode search = tree.search(2);
        //System.out.println(search);
    }

}
