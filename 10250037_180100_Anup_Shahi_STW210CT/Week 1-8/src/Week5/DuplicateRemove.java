package Week5;

public class DuplicateRemove {
	 Node head; 
	   
	    class Node 
	    { 
	        int info; 
	        Node then; 
	        Node(int a) {info = a; then = null; } 
	    } 
	  
	    void removeDuplicates() 
	    { 
	        
	        Node present = head; 
	        while (present != null) { 
	             Node temp = present; 
	            while(temp!=null && temp.info==present.info) { 
	                temp = temp.then; 
	            } 
	            present.then = temp; 
	            present = present.then; 
	        } 
	    } 
	                      
	   
	    public void push(int new_data) 
	    { 
	        
	        Node new_node = new Node(new_data); 
	   
	     
	        new_node.then = head; 
	   
	      
	        head = new_node; 
	    } 
	  
	   
	     void printList() 
	     { 
	         Node temp = head; 
	         while (temp != null) 
	         { 
	            System.out.print(temp.info+" "); 
	            temp = temp.then; 
	         }   
	         System.out.println(); 
	     } 
	    public static void main(String args[]) 
	    { 
	        DuplicateRemove llist = new DuplicateRemove(); 
	        llist.push(3); 
	        llist.push(3); 
	        llist.push(6); 
	        llist.push(5); 
	        llist.push(5); 
	        llist.push(5);
                llist.push(4);
                llist.push(0);
	          
	        llist.removeDuplicates(); 
	          
	        System.out.println("List after removal of duplicate elements"); 
	        llist.printList(); 
	    } 
}
