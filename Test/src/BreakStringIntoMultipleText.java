import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class BreakStringIntoMultipleText {

	static String temp = "";
	public static void main(String args[]) {
		String mainStr = "the quick brown fox jumps over the lazy elephant135";
		//String mainStr = "0123456789 1234 12345 12345 12345";
		int limit = 10;
		String[] arr = mainStr.split(" ");
		List<String> resultArr = new ArrayList<String>();
		String currString = "";
		String tempString = "";
		for(int i=0; i<arr.length;i++) {
			//tempString = tempString.concat(arr[i]).concat(" ");
			if(tempString.concat(arr[i]).length() > limit) {
				resultArr.add(tempString);
				tempString = "";
				if(i == arr.length - 1) {
					tempString = tempString.concat(arr[i]);
				} else {
					tempString = tempString.concat(arr[i]).concat(" ");
				}
			} else {
				if(i == arr.length - 1) {
					tempString = tempString.concat(arr[i]);
				} else {
					tempString = tempString.concat(arr[i]).concat(" ");
				}
			}

			if(i == (arr.length - 1) && tempString.length() <= 10) {
				resultArr.add(tempString);
			}
			//currString = tempString;
		}
		System.out.println("Final list : "+resultArr.toString());
		List<String> mainList = Arrays.asList(arr);
		System.out.println(getStringList(mainList,limit).toString());
	}
	
	public static List<String> getStringList(List<String> mainList, int limit){		
		List<String> finalList = new ArrayList<String>();		
		mainList.stream().forEach(item ->{ 

			if((temp +item).length() > limit) {
				temp = temp.substring(0, temp.length() - 1);
				finalList.add(temp);
				temp = item + " ";
			}
			else {
				temp = temp +item+" ";
			}});
		finalList.add(temp.substring(0, temp.length() - 1));

		return finalList;

	}
}
