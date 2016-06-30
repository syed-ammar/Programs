import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindDuplicate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("syed");
		list.add("Syed");
		
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		
		
		System.out.println(set.size());

	}

}
