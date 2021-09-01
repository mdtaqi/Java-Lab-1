package hit.day40;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/*
 * There are four types of references
 * 1. Strong Reference - by default
 * 2. Soft Reference - are those objects which can be recreated after some time
 * 3. Weak Reference - are those objects whom garbage collection can collect
 * 4. Phantom Reference
 */
public class GarbageDemo {
	public static void main(String[] args) {
		Map<String, String> wmap=new WeakHashMap<String, String>();
		
		String key1=new String("a1");
		String key2=new String("a2");
		
		wmap.put(key1,"hello world");
		wmap.put(key2, "hai world");
		
		System.out.println(wmap);
		
		key1=null;
		System.gc();
		System.out.println(wmap);
	}
}