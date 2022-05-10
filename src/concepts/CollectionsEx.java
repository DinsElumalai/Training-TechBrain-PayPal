package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LinkedList arrList = new LinkedList();

		arrList.add("Tanish");
		arrList.add("Zexing");
		arrList.add("Chen");
		arrList.add("Di Lin");
		arrList.add("Charles");
		arrList.add("Zexing");
		arrList.add("Chen");
		
		System.out.println(arrList);
		System.out.println(arrList.contains("Chen"));
		System.out.println(arrList.get(3));
		System.out.println(arrList.size());
		System.out.println(arrList.remove("Di Lin"));
		System.out.println(arrList);
		
		HashSet tr = new HashSet();
		
		tr.add("Tanish");
		tr.add("Zexing");
		tr.add("Chen");
		tr.add("Di Lin");
		tr.add("Charles");
		tr.add("Zexing");
		tr.add("Chen");
		
		System.out.println(tr);
		
		
		HashMap hm = new HashMap();
		hm.put(1001, "Tanish");
		hm.put(1002, "DI Lin");
		hm.put(1003, "Chen");
		hm.put(1004, "Charles");
		hm.put(1005, "Zexing");
		
		System.out.println(hm);
		System.out.println(hm.containsKey(1004));
		System.out.println(hm.containsValue("Chen"));
		System.out.println(hm.get(1003));
		System.out.println(hm.remove(1002));
		System.out.println(hm.size());
		System.out.println(hm);
		
		
		
		
	}

}
