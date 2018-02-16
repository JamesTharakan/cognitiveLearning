package puzzles.hanckerRank.code30days;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class startsWith {
	Hashtable <Character, Hashtable>tables = new Hashtable <Character, Hashtable>();
    public static void main(String[] args) {
    	startsWith sol = new startsWith();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            String contact   = scan.next();
            if (operation.equals("add")) {
                 sol.add(contact);
            } else if (operation.equals("find")) {
                sol.find(contact);
            }
        }
       scan.close();
    }

	  void add(String contact) {
		Hashtable  temp =tables.get(contact.charAt(0));
		if( temp == null ){
			Hashtable  newtable = new Hashtable();
			tables.put(contact.charAt(0), newtable);
			temp = newtable;
		}
		temp.put(contact, "");
	}

	private  void find(String contact) {
		int i =0;
		Hashtable  temp =tables.get(contact.charAt(0));
		if(null != temp){
			Iterator itr =temp.keySet().iterator();
			while(itr.hasNext()){
				String s = (String)itr.next();
				if(s.startsWith(contact))
					i++;
			}
		}
		
		System.out.println("Solution2.find():;"+ i);
	}
}
;