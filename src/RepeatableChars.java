import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatableChars {
	
	public static void main(String[] args) {
	
	String str = "aadjhfjsdgjiuskjdhfjdfhjghasdgeuhjjdjdjs";
	
	System.out.println(findMaxChar(str));
	char array[] = str.toCharArray();
	Set<Character> maxChars = new LinkedHashSet<Character>();
	maxChars.add(array[0]);
	for (Character ch : maxChars) {
		
	}
	String most="";
	
	for (int i = 0; i < str.length(); i++) {
		for (int j = 0; j < str.length(); j++) {
		if(str.charAt(i)==str.charAt(j)){
		most+=str.charAt(i);
		}
	}
	
	}
	}
	
	
	private static String findMaxChar(String str) {
	    char[] array = str.toCharArray();
	    Set<Character> maxChars = new LinkedHashSet<Character>();

	    int maxCount = 1;
	    maxChars.add(array[0]);

	    for(int i = 0, j = 0; i < str.length() - 1; i = j){
	        int count = 1;
	        while (++j < str.length() && array[i] == array[j]) {
	            count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxChars.clear();
	            maxChars.add(array[i]);
	        } else if (count == maxCount) {
	            maxChars.add(array[i]);
	        }
	    }

	    return (maxChars + " = " + maxCount);
	}
	
	
}
