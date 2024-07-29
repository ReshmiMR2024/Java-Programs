package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>ls=new ArrayList<String>();
		//ArrayList <Integer>lst=new ArrayList<Integer>();
		ls.add("Reshmi");
		ls.add("Tiffani");
		ls.add("Pallavi");
		ls.add("nitha");
		ls.add("sebin");
		ls.add("sebin");
		//ls.add(1234;)
		System.out.println("list:"+ls);
		ls.remove(4);//for removing an item from list
		System.out.println("After deletion:"+ls);
	    Collections.sort(ls);
	    System.out.println("After Sorting :"+ls);
	    System.out.println("List using for loop:"+ls);
	    for(int i=0;i<ls.size();i++)
	    {
	    	System.out.println("list:"+ls.get(i));
	    }
	    
	    System.out.println("list using for each loop:");
	    for(String element:ls)
	    {
	    	System.out.println(element);
	    }
	    System.out.println("List using Iterator:");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
