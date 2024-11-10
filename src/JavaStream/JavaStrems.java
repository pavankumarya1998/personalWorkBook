package JavaStream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaStrems {
	
	@Test
	
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Pavan");
		names.add("Prakash");
		names.add("Ram");
		names.add("Hanuman");
		names.add("Rashtrapal"); 
		names.add("Pankaj");
		int count = 0;
		
		
		for (int i =0; i<names.size(); i++) {
			String nam = names.get(i);
			
			if(nam.startsWith("P")) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	@Test	
	public void Streams() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Pavan");
		names.add("Prakash");
		names.add("Ram");
		names.add("Hanuman");
		names.add("Rashtrapal");
		names.add("Pankaj");
		
	Long nam1 = names.stream().filter(a-> a.startsWith("R")).count();
		
		System.out.println(nam1);
		
	}

}
