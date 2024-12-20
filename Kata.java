public class NoBoring {
  
    public static int noBoringZeros(int n) {
        
      int result = 0;
      int sumZeros = 0;
       
      if(n != 0){
        
        Integer fullDigitsInteger = (Integer) n;
        String fullDigitsString = fullDigitsInteger.toString();
      
          System.out.println("fullDigitsString " + fullDigitsString);
        
        
          int lengthString = fullDigitsString.length() - sumZeros;
           System.out.println("sumZeros before incrementing =  " + sumZeros);
            System.out.println("lengthString before lowering it =  " + lengthString);
            System.out.println("fullDigitsString after while =  " + fullDigitsString);
        
        
          //from right to left count the 0 values
          for(int i = lengthString; i > 0; i--){
          
          
              char lastDigit = fullDigitsString.charAt(fullDigitsString.length() - 1);
                System.out.println("this is the last digit of the string " + lastDigit);
          
          
                if(lastDigit == '0'){
            
                sumZeros = sumZeros + 1;
                  System.out.println("sum of zeros incremented " + sumZeros);
            
                lengthString--;   
                  System.out.println("lengthString lowered =  " + lengthString);
          
          }//end of if inside for
          
              fullDigitsString = fullDigitsString.substring(0, lengthString);
              System.out.println("fullDigitsString after taking out 0 =  " + fullDigitsString);
          
           
        }//end of for loop
        
        
        double exp = Math.pow(10, sumZeros);
        int expInt = (int) exp;
          System.out.println("\nexponential value =  " + expInt);
        
              
        result =  n / expInt; //base 10 exponent sumZeros
          System.out.println("\nresult after doing m / 10 * sumZeros =  " + result);
           
     }//end of first if
      
       
     return result;
    }
}


