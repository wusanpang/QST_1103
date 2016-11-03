package No4;

import java.util.HashSet;
import java.util.Scanner;

public class ReducerOfIPFilter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String key = null;
		HashSet<String> setKey = new HashSet<String>();
		while (scanner.hasNext()){
			key = scanner.next();
			setKey.add(key);
		}
		System.out.println(setKey.size());
	}
}
