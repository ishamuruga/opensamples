import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class MyString {

	public static void main(String[] args) {
		String name = "India"; //String Pool
		String country = new String("India");
		
		String accountNumber = "001-ABCD123232-TGY";
		
		
		System.out.println(name.indexOf("Dia"));
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,4));
		
		String dats[] = accountNumber.split("-");
		
		System.out.println(Arrays.toString(dats));
		
		
		List<String> names = Arrays.asList("My India","is","great ","always");
		
		String combined =  names.stream().collect(Collectors.joining(""));
		
		System.out.println(combined);
		
		String left="zebra";
		String right="in zoo";
		
		
		System.out.println(String.format("%s,%s", left,right));
		System.out.println(String.join("#", left,right));
		
		StringJoiner sj = new StringJoiner("%");
		sj.add(right);
		sj.add(left);
		
		System.out.println(sj.toString());
		
		
		
		country = country + " is Great";
		country = country.concat(" is Great");
		
		StringBuilder sb = new StringBuilder(name);
		sb.append(" is Great");
		sb.append(" always");
		
		StringBuffer sBuff = new StringBuffer(name);
		sBuff.append(" is Great");
		sBuff.append(" always");
		
		int aa =50;
		
		String acd = "India" + aa;
		
		System.out.println(acd);
		
		
		System.out.println(sb.toString());
		System.out.println(sBuff.reverse());
		
		//System.out.println(name==country); //false
		//System.out.println(name.equals(country)); //true
		//System.out.println(left.compareTo(right)); //0
		
				
		
		//name = "Chennai";
		//String abcd = "India";
		
		//String pool
		//India <<-- abcd
		//Chennai <<--- name
		//
		
//		System.out.println(name.charAt(0));
//		
//		char[] ch = {'I','N','D','I','A'};
//		String country = new String(ch);
		
		
		

	}

}
