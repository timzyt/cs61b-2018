public class TriangleDrawer {
   public static void drawTriangle(int N) {
   	int row = 0;
   	int col = 0;
   	while (row<=5){
   		col=0;
   		while (col<=row){
   			System.out.print("*");
   			col = col + 1;
   		}
   		System.out.println();
   		row=row+1;
   	}
   }
   
   public static void main(String[] args) {
      drawTriangle(10);
   }
}