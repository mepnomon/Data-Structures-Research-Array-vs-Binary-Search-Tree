package com.eeu436.binarysearchtree;

/**
 *ICP 2027 - Assignment 2
 * Due: 2016-05-06
 * Implementation of a BST Node
 * 
 * @author eeu436
 */
public class BSTNode {
    
    protected Comparable element;
    protected BSTNode left, right;
    
    /**
     * Constructor for BST
     * @param element 
     */
    protected BSTNode(Comparable element){
        
        this.element = element;
        this.left = null;
        this.right = null;
    }
}
