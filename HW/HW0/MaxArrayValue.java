public class MaxArrayValue {
   public static int max(int[] m) {
       int len = m.length;
       int i = 0;
       int maxValue = 0;
       while (i<len) {
       	if (maxValue < m [i]) {
       		maxValue = m[i];
       	} else {
       		maxValue = maxValue;
       	}
       	i = i + 1;
       }
       return maxValue;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};    
      System.out.print(max(numbers))  ;
   }
}