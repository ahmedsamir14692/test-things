
package testthings;



public class Testthings {
    
    
    public static String String ="ahmed";
    public String name;
    final static int num= 't';
    final int number;
    final int year;
    
    
   
    public static void main(String[] args) {
      System.out.println(Testthings.num);  // Testthings.num loded now not erroe
//        System.out.println(Testthings.nested);
        Testthings Testthings = new  Testthings ();
       
        
        System.out.println(Testthings.nested.class.getName());// output testthings.Testthings$nested
        
//        Testthings.String=null;
//        Testthings Testthing =new Testthings ();
//        Testthing.String=null;
      //  System.out.println(Testthings.num);  // error  /*
      /*
         System.out.println(Testthings.num);  // Testthings.num loded now not erroe
        لو في اوبجيكت بنفس اسم الكلاس وبعد تعريف الا وبجيكت
        حاولت ان تصل  احد محتويات الكلاس الستاتيك كن خلال اسم اكلاس زي
         Testthings Testthings ;
         System.out.println(Testthings.num);  // error 
        ليه  فهم تستسينجس هنا علي انها الكلاس عشان الكلاسل هو القرب
        
        */  
        System.out.println(Testthings); 
        
      int [] array2 = new int []{1,3,5,7,9,11};
     System.out.println(java.util.Arrays.toString(array2));
     System.out.println(array2);
 int isertionindex = 2;
 int insertionvalue = 2;
 System.out.println(array2[array2.length-1]);
 for(int forb = array2.length-1; forb> isertionindex; forb--  )
 {
     array2[forb]= array2[forb-1];
     
     
 }
 array2[isertionindex]= insertionvalue;
 System.out.println(array2[array2.length-1]);
    }
    
    
    private Testthings  ()
    {
        year=4;
        number= 6;
       //num=45;
        
    }
    
    public static  class nested {
         private static String name;
        
        
    }
     public Testthings  (int e)
    {
        year=4;
        number= 6;
       //num=45;
        
    }
     public void asd(){
         
         
         
     }
     private void asd(int y ){
         
         
       
     }
     
      void  varges (int...v){
          System.out.println(v[0]);
         
     }
    void  varges (int v){
          System.out.println(v+1); 
         
     }
}
