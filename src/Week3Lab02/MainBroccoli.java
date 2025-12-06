package Week3Lab02;

public class Main {
	
	public class main {
		   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);

		      boolean[] chptList = new boolean[16]; 
		      int includeChpt;
		      int i, j;
		      boolean anySelected = false; 

		      
		      for (i = 1; i <= 15; ++i) {
		         includeChpt = scnr.nextInt();
		         if (includeChpt == 1) {
		            chptList[i] = true;
		         } else {
		            chptList[i] = false;
		         }
		      }

		      for (i = 1; i <= 15; ++i) {
		         if (chptList[i]) {
		            anySelected = true;

		            j = i;
		            while (j + 1 <= 15 && chptList[j + 1]) {
		               j++;
		            }

		            if ((j - i + 1) >= 3) {
		               System.out.print(i + "-" + j + " ");
		               i = j; 
		            } 
		            else {
		               System.out.print(i + " ");
		            }
		         }
		      }

		      if (!anySelected) {
		         System.out.print("None ");
		      }

		      System.out.println(); 
		   }
	}
}
		 


