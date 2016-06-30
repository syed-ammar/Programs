
public class Recursion {

	public static void main(String[] args) {
		System.out.println(reverse("Syed"));

	}

	static int sum(int num){
		if(num == 1){
			return 1;
		}
		return sum(num -1)+num;
	}
	
	static int fact(int n){
		if(n == 0){
			return 1;
		}
		
		return fact(n-1)*n;
	}
	
	static String reverse(String s){
		if(s.length() == 1){
			return s;
		}
		
		String s1 = "";
		/*for(int i =s.length()-1 ; i>=0 ;i--){
			s1 += s.charAt(i);
		}*/
		
		return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
	}
}
