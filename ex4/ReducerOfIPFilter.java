package No4;

import java.util.HashSet;
import java.util.Scanner;

public class ReducerOfIPFilter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int keycount = 0;
		String key = null;
		HashSet<String> setKey = new HashSet<String>();
		while (scanner.hasNext()){
			String line = scanner.nextLine();
			String[] tokens = line.split("\t");
			key = tokens[0];
			setKey.add(key);
		}
		System.out.println(setKey.size());
	}
}
