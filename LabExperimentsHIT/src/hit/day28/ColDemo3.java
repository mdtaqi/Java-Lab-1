package hit.day28;

	import java.util.Collections;
	import java.util.Enumeration;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Vector;
	public class ColDemo3 {
		public static void main(String[] args) {
			Vector<String> list=new Vector<>(10,5);
			
			list.add("hello");
			list.add("hai");
			list.add("world");
			
			System.out.println(list);
			//list.ensureCapacity();
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
			//list.add("new value....");
			while(listiter.hasNext()) {
				System.out.println(listiter.next());
			}
			while(listiter.hasPrevious()) {
				System.out.println(listiter.previous());
			}
		
			Enumeration<String> en=list.elements();
			list.add("new value.....2222..........");
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
			
		}
	
}
