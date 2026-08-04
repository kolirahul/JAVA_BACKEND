package collection;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {

		String str= " hello java hello python";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==' ')continue;
			
			if(map.get(ch)==null)
		{
				map.put(ch, 1);
				
		}
			else {
				int k=map.get(ch);
				k++;
				map.put(ch, k);
			}
		}
		System.out.println(map);
		
	}

	
}
