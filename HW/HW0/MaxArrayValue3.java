public class MaxArrayValue3 {
   public static int max(int[] m) {
       int len = m.length;
       int maxValue = 0;
       for (int i=0;i<len; i+=1) {
       	if (maxValue < m [i]) {
       		maxValue = m[i];
       	} else {
       		continue;
       	}
       }
       return maxValue;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};    
      System.out.print(max(numbers))  ;
   }
}