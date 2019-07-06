public class Main
{
	public static void main(String[] args) {
        int a[] = {1, 2, 3, -4, 5, 6, -7, -8, 9, 10};
        int inc = a[0];
        int exc = 0;
        for(int i = 1; i < 10; i++) {
            int temp_exc = Math.max(inc, exc);
            int temp_inc = exc + a[i];
            exc = temp_exc;
            inc = temp_inc;
        }
        System.out.println(Math.max(inc, exc));
	}
}
