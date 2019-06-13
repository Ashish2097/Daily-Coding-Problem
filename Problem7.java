
public class Main
{
    public static int func(String s, int i) {
        if(i == s.length())
            return 1;
        
        if(i < s.length()-1 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
                return func(s, i+1) + func(s, i+2);
        }
        
        return func(s, i+1);
    }
	public static void main(String[] args) {
        String s = new String("111");
        int ans = func(s, 0);
        System.out.println(ans);
	}
}
