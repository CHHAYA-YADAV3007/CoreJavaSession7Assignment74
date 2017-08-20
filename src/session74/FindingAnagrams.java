/**
 * FindingAnagrams.java  1.1 20-Aug-2017
 * 
 */
package session74;

//importing java.util package for using functions of Arrays class

import java.util.Arrays;
/**
 * This class finds all anagram sets from a list of words. Anagrams are those words in
 * which there are same characters jumbled.
 * @author chhaya yadav
 *
 *version 1.1
 *
 *compiled on 20-AUG-2017
 */
//class declaration
public class FindingAnagrams {

//main method declaration
public static void main(String[] args) {
		
//String array declaration , instantiation and initialization
	
		String[] ana = new String[]{"listen", "pot", "part","dog","opt", "trap", "silent", 
				                    "top", "this","hello", "hits", "what", "shit","god"} ;
//character array declaration		
		char[] chk ;
		
		char[] chp ;

//boolean array declaration and instantiation		
		boolean[] flag = new boolean[ana.length];
		
//boolean array initialization with false for all array elements		
		
		Arrays.fill(flag, false);
		
		
System.out.println("Anagrams displayed below :");

System.out.println("____________________________________");

		
//traversing through all the String array element for which flag is set to false

for(int n = 0 ; n < ana.length     ; n++){
			
	  if (flag[n] == false)   { 
	
//conversion of single string element to character array
		  
	        chk = ana[n].toCharArray();   

//sorting the character array for each String element with sort method of Arrays class
	        
			Arrays.sort(chk);
			
	        for(int p = 0 ; p < ana.length   ; p++){
	        	
//conversion of single string element to character array	        	
			
	            chp = ana[p].toCharArray();
	            
//sorting the character array for each String element with sort method of Arrays class	            

		        Arrays.sort(chp);
		        
// for matching the anagram , don't select the same element and flag should be false	
// equals method of Array class check whether the two sorted characters arrays are same or not.
				
		    	if((flag[p] == false) && (n!=p) && (Arrays.equals(chk, chp))){
				
//set the flag to true ,in order to avoid printing the same String element more than once
		    		 
					     flag[n] = true ;
					 
					     flag[p] = true;
					 
					     System.out.print(ana[p] + ",");
		
		           }
		    	 
		    }
			
	        
//print the string element only if match is found and thus flag is set to true
	        
			if(flag[n]) {
				
			 System.out.println(ana[n]);
			 System.out.println("____________________________________");
			 }
			
				
			
}
		

}

}
}