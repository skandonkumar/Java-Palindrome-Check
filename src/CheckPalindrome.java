import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CheckPalindrome {
	public boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		String revstr = "";
		List<String> list = Arrays.asList(str.split(""));
        Collections.reverse(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
        	revstr += it.next();
        }
        System.out.println(revstr);
		return str.matches(revstr);
        
    }
	
	public static void main(String args[]) {
		int num = 101;
		CheckPalindrome obj = new CheckPalindrome();
		System.out.println(obj.isPalindrome(num));
	}
}