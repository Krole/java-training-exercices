package io.robusta.java.classic;

import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

    int[] buildArray(int a, int b, int c){
    	
    	int [] arrays = { a, b, c};
		return arrays;
    	
    }


    boolean equality(int[] array1, int[] array2){	    	
        return Arrays.equals(array1, array2) ;
    }

    String asString (int [] numbers){
    	String tests = "";
    	int i =0;
    	while (i < numbers.length){
    		tests+= Integer.toString(numbers[i])+":";
    		i++;
    	}		
    	
        return tests;
    }

    String asStringJoin (int [] numbers){
    	String tests = "";
    	int j = 0;
    	
    	for (int i : numbers){
    		j++;
    		
    		if (j < numbers.length ){
 
    			tests+= Integer.toString(i)+":";
    		}else{    			
    			tests+= Integer.toString(i);
    		} 		
    	}		
        return tests;
    }

    String asString (String [] strings){
    	String join = String.join(" ", strings);
        return join;
    }

    String asString (Card [] cards){
    	
    	/*for(int i : cards ){
    		Card.value + Card.color..
    	}*/
        return null;
    }

}
