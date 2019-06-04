public class HelloWorld{

    public static void main(String []args){
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        int len = arr.length;
        
        Integer[] a = new Integer[len];
        Integer[] b = new Integer[len];
        Integer[] ans = new Integer[len];
        
        
        
        for(int i = 0; i < len; i++) {
            a[i] = 1;
            b[i] = 1;
        }
        for(int i = 0; i < len; i++) {
            int j = len - i - 1;
            if(i == 0) {
                a[i] = 1;
                b[j] = 1;
            }
            else {
                a[i] = a[i-1] * arr[i-1];
                b[j] = b[j+1] * arr[j+1];
            }
        }
        for(int i = 0; i < len; i++) {
            ans[i] = a[i] * b[i];
            System.out.println(ans[i]);
        }
        
    }
}