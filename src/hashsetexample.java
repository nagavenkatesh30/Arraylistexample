import java.util.HashSet;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("India");
hs.add("INDIA");
hs.add("INDIA");
hs.add("USA");
hs.add("UK");


System.out.println(hs);
System.out.println(hs.remove("UK"));

System.out.println(hs);
System.out.println(hs.contains("USA"));

System.out.println(hs.size());
System.out.println(hs);

System.out.println(hs.isEmpty());
	}

}
