package com.epam.MovieTicketBooking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionDB implements DBoperations {
	public void insert(Object element) {

	};

	public void update(Object element) {

	};

	public void delete(Object element) {

	};

	public void display(Object element) {

		Iterator iterator = ((List)element).iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	};

	public void display(Object element, Object choice) {

		Iterator iterator = ((Map)element).entrySet().iterator();
	       while(iterator.hasNext())
	       {
	    	   Map.Entry mapElement = (Map.Entry)iterator.next(); 
	    	   if(((String)mapElement.getKey()).equalsIgnoreCase((String)choice))
	    	   {
	    		   Iterator itr = ((ArrayList<String>)mapElement.getValue()).iterator();
	    		   while(itr.hasNext())
	    		   System.out.println(itr.next());
	    		   break;
	    	   }	
	       }
	};

}