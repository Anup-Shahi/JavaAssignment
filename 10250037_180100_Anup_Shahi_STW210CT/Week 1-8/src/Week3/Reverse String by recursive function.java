package Week3;

class StringReverse 
{ 
    
    void reverse(String app) 
    { 
        if ((app==null)||(app.length() <= 1)) 
           System.out.println(app); 
        else
        { 
            System.out.print(app.charAt(app.length()-1)); 
            reverse(app.substring(0,app.length()-1)); 
        } 
    }
    public static void main(String[] args)  
    { 
        String app = "Musician"; 
        StringReverse obj = new StringReverse(); 
        obj.reverse(app); 
    }     
}