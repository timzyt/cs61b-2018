public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    int len = a.length;
    for (int i=0; i<len; i+=1) {
      if(a[i] < 0) {
        continue;
      } 
      for (int j=1; j<=n; j+=1) {
        a[i] = a[i] + a[i+j];
        if (i+j==len-1) {
          break;
        } 
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}