package Week8;

import java.util.LinkedList;

public class DirectedGraph {

	        int vertex; 
	        LinkedList<Integer> adjacencyListArray[]; 
	        
	          
	        
	        DirectedGraph(int vertex) 
	        { 
	            this.vertex = vertex; 
	            adjacencyListArray = new LinkedList[vertex];
	            for(int i = 0; i < vertex ; i++){ 
	                adjacencyListArray[i] = new LinkedList<>(); 
	            } 
	        } 
	
	        public static void main(String args[]) 
		    { 
		        int vertex = 5; 
		        DirectedGraph DirGraph = new DirectedGraph(vertex); 
		        addEdge(DirGraph, 0, 1); 
		        addEdge(DirGraph, 0, 2);
		        addEdge(DirGraph, 1, 2); 
		        addEdge(DirGraph, 1, 3); 
		        addEdge(DirGraph, 2, 3);
		        addEdge(DirGraph, 4, 2);
		        addEdge(DirGraph, 3, 4); 
		        printDirectedGraph(DirGraph); 
		    } 

	    static void addEdge(DirectedGraph DirectedGraph, int source, int destination) 
	    { 
	      
	        DirectedGraph.adjacencyListArray[source].add(destination); 
	     
	    } 
	       
	    
	    static void printDirectedGraph(DirectedGraph DirectedGraph) 
	    {        
	        for(int vertex = 0; vertex < DirectedGraph.vertex; vertex++) 
	        { 
	            System.out.println("Vertex "+ vertex); 
	             
	            for(Integer Values: DirectedGraph.adjacencyListArray[vertex]){ 
	                System.out.print(" --> "+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
	       
	   
	}
