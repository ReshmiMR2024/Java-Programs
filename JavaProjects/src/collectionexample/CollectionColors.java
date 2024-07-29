package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionColors {
	ArrayList <String>ls=new ArrayList<String>();
	public void colors() {
		System.out.println("The name of Colors:");
		
		ls.add("Violet");
		ls.add("Indigo");
		ls.add("Blue");
		ls.add("Green");
		ls.add("Yellow");
		ls.add("Orange");
		ls.add("Red");
		System.out.println("list:"+ls);
			
	}
	public void iterateColors()
	{
		System.out.println("List using Iterator:");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public void removeColors()
	{
		ls.remove(2);//for removing an item from list
		System.out.println("After deletion:"+ls);
		
	}
	public void searchColors()
	{
		 System.out.println("list using for each loop:");
		    for(String element:ls)
		    {
		    	System.out.println(element);
		    }
		   
	
	}
	public void retrieveColors()
	{
		 for(int i=0;i<ls.size();i++)
		    {
		    	System.out.println("list:"+ls.get(1));
		    	break;
		    }
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionColors obj=new CollectionColors();
		obj.colors();
		obj.iterateColors();
		obj.removeColors();
		obj.searchColors();
		obj.retrieveColors();
		

	}

}
