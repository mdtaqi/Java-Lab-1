package hit.day28;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CallDemo2 {

		public static void main(String[] args) {
			List<String> list=new LinkedList<String>();
			//hang him, not leave him
			//hang him not leave him
			
			list.add("hello");
			list.add("hai");
			list.add("world");
			
			System.out.println(list);
			
			System.out.println(list.get(0));
			System.out.println(list.size());
			System.out.println(list.contains("haiii"));
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
			System.out.println(list.isEmpty());
			list.remove(0);
			System.out.println(list);
			list.set(1, "newvalue");//it will replace the existing one at that place
			System.out.println(list);
			Object s[]=list.toArray();
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			for(String ss:list) {
				System.out.println(ss);
			}
			Iterator<String> iter=list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			System.out.println(iter.hasNext());
			
			ListIterator<String> listiter=list.listIterator();
			while(listiter.hasNext()) {
				System.out.println(listiter.next());
			}
			while(listiter.hasPrevious()) {
				System.out.println(listiter.previous());
			}
			
		}
	
}
