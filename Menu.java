import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu 
{
	 protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 private static int checkString = 0;
	 private static MinHeap MH= new MinHeap(100);
	 public static void main(String args[]) throws IOException
	 {
		 boolean done = false;
		 do
		 {
			 System.out.println("Select from the following menu: "
					 + "\n1. Check if MinHeap is empty."
					 + "\n2. Insert key in MinHeap."
					 + "\n3. Delete min key from MinHeap."
					 + "\n4. Decrease key in MinHeap."
					 + "\n5. Display items in MinHeap in array order."
					 + "\n6. Exit program.");
			 System.out.println("Make your menu selection now: ");
			 
			 checkString = Integer.parseInt(br.readLine());
			 System.out.println(checkString);
			 switch (checkString)
			 {
			 case 1:
			 if(MH.isEmpty()==true)
				 System.out.println("Heap is empty");
			
			 else 
				 System.out.println("Heap is not empty");
				 
			 break;
			 case 2:
				 System.out.println("input integer to insert:");
				 MH.insert(Integer.parseInt(br.readLine()));
					 
				 break;
			 case 3:
				 MH.deleteMin();
				 
				 break;
			 case 4:
				 
				 
				 break;
			 case 5:
				 System.out.println(MH.DisplayArray());
				 
				 break;
				 
			 }//end switch
			 
		 }
		 while(done != true);
	 }
}	




