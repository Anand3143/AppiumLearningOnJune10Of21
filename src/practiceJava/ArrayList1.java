
package practiceJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Anand");
		a.add('a');
		a.add(10.12);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(1));
		System.out.println(a.isEmpty());
		System.out.println(a.toArray());
		
		ArrayList b = new ArrayList();
		b.add(100);
		b.add("Raja");
		b.addAll(a);
		
		ArrayList<String> c = new ArrayList<String>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
		c.remove(9);
		System.out.println(c);
	//	c.set(9, "all");
		c.add(9, "heello");
		System.out.println(c);
	//	c.removeAll(c);
	//	System.out.println(c);
	// for each loop
		for(Object e:c)
		{
			System.out.println(e);
		}
		//for loop
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		Iterator it = c.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
	}
}
