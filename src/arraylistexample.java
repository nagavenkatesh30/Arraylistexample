import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("venkatesh");
a.add("sunil");
a.add("aditya");
a.add("vijay");
System.out.println(a);
a.add(0, "sudheer");

System.out.println(a);

a.remove(4);
System.out.println(a);
a.remove("sudheer");
System.out.println(a);

System.out.println(a.get(2));
System.out.println(a.contains("aditya"));

System.out.println(a.indexOf("aditya"));
System.out.println(a.isEmpty());
System.out.println(a.size());

	}

}
