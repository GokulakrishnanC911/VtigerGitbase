package Selenium_Basic;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MergeSortedArrays {
	 public static void main(String[] args)
	 {
	        String input1 = "qwertyuiop";
	        String input2 = "qwesrtwop";
	        String input3 = "plotfro";

	        System.out.println(hasUniqueCharacters(input1));  
	        System.out.println(hasUniqueCharacters(input2));  
	        System.out.println(hasUniqueCharacters(input3));  
	    }

	    public static boolean hasUniqueCharacters(String input) 
	    {
	        int length = input.length();

	                if (length < 2)
	      {
	            return true;
	        }

	        
	        for (int i = 0; i < length - 1; i++) {
	            for (int j = i + 1; j < length; j++)
	         {
	                if (input.charAt(i) == input.charAt(j))
	       {
	                    return false;           
	       }
	            }
	        }

	        return true;   
	   }


}
