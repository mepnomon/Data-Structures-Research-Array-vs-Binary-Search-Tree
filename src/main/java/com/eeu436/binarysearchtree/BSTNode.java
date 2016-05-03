package com.eeu436.binarysearchtree;

/**
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
