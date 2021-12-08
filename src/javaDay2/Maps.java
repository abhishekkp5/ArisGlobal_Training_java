package javaDay2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> hm = new TreeMap<Integer,String>();
       hm.put(2,"efg"); 
       hm.put(4, "hann");
       hm.put(1,"abc");
       hm.put(3, "hij");
       //String a = hm.remove(4);
      // System.out.println(a);
       System.out.println(hm);
       System.out.println(hm.keySet());
       System.out.println(hm.values());
       
       Map<Integer,String> h = new HashMap<>();
       System.out.println(h.hashCode());
       h.put(1,"data");
       System.out.println(h.get(1).hashCode());
       //System.out.println(h.hashCode());
       h.put(2,"data");
       System.out.println(h.get(2).hashCode());
       //System.out.println(h.hashCode());
       System.out.println(h.hashCode());
       h.put(3,"data");
       h.put(3,"data1");
       System.out.println(h.get(3).hashCode());
       //System.out.println(h.hashCode());
       //h.put(4,"last");
       System.out.println(h.hashCode());
       Iterator<Map.Entry<Integer,String>>  itr = h.entrySet().iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
    	//System.out.println(itr.hashCode());  
       }
       System.out.println(h.get(1).hashCode()+h.get(2).hashCode());     
	}
   

}
