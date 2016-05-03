package com.eeu436.binarysearchtree;

/**
 * Implementation of a binary search tree.
 * @author eeu436
 */
public class BST {
    
    private BSTNode root;
    
    /**
     * constructor for a binary search tree.
     */
    public BST(){
        
        root = null;
    }
   
    /**
     * Searches for a specific node in the binary search tree.
     * @param target
     * @return 
     */
    public int search(Comparable target){
        
        int direction = 0;
        int comparisonCount = 0; //counter for traversed nodes
        BSTNode curr = root;
        for(;;){
            ++comparisonCount;
            if (curr == null){
                return 0;
                
            }
            direction = target.compareTo(curr.element);
            //count++;
            if(direction == 0){
                 return comparisonCount;
            } else if(direction < 0){
                curr = curr.left;
            } else { //if > 0
                curr = curr.right;
            }       
        }
    }
    
    /**
     * Inserts a BSTNode
     * @param elem
     */
    public void insert(Comparable elem){
        
        int direction = 0;
        BSTNode parent = null, curr = root;
        for(;;){
            
            if(curr == null){    
            BSTNode ins = new BSTNode(elem);
            
                if(root == null)
                    root = ins;
                else if (direction < 0)
                    parent.left = ins;
                else
                    parent.right = ins;
                return;
            }
            direction = elem.compareTo(curr.element);
            if(direction == 0)
                return;
            parent = curr;
            if (direction < 0)
                curr = curr.left;
            else 
                curr = curr.right;
        }
    }
    
    /**
     * attempt at displaying the tree
     * @param root 
     */
    public void display(BSTNode root){
        
        if(root != null){
            display(root.left);
            System.out.println(" " + root.element);
            display(root.right);
        }
    }
}
