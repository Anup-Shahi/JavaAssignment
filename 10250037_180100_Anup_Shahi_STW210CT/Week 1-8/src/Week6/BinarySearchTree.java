package Week6;
        
public class BinarySearchTree {

	public static void main(String[] args) {
		  Node root = null;  
		    root = insertNode(root, 230);  
		           insertNode(root, 500);  
		           insertNode(root, 120);  
		           insertNode(root, 100);  
		           insertNode(root, 50);  
		           insertNode(root, 140);  
		           insertNode(root, 50); 
		 Inorder(root);  

	}
	
	static class Node {  
		int data;  
	    Node left, right;  
	};  
	static Node insertNode(Node root, int num)  
	{  
	   
	    Node insert = insert(num);  
	    
	    
	    Node RootValue = root;  
	     
	    Node value = null;  
	    
	    while (RootValue != null) {  
	        value = RootValue;  
	        if (num < RootValue.data)  
	            RootValue = RootValue.left;  
	        else
	            RootValue = RootValue.right;  
	    }  
	  
	    if (value == null)  
	        value = insert;  
	    
	    else if (num < value.data)  
	        value.left =insert;  
	    
	    
	    else
	        value.right =insert;  
	    
	   
	    return value;  
	}  
	
	static Node insert(int data)  
	{  
		 
	    Node input = new Node();  
	    
	    input.data = data;  
	    
	    input.left = null;  
	    input.right = null;  
	    
	    return input;  
	} 
	 
	static void Inorder(Node root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        Inorder(root.left);  
	        System.out.print( root.data +" ");  
	        Inorder(root.right);  
	    }  
	}  
	    


}
