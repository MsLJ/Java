import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
		
	
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	String a=sc.next();
	
a=a.toUpperCase();
HashMap<Character, Integer> aa=new HashMap<>();
for (int i = 0; i < a.length(); i++) {
	char c=a.charAt(i);
	if (aa.containsKey(c)) {
		int val=aa.get(c);
		aa.put(c, val+1);
	}else {
		aa.put(c,1);
		
	}
}
Integer maxValue = Collections.max(aa.values());
aa.values(maxValue);
sc.close();
}
	
}

