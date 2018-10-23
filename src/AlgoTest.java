import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test //Node Coverage by decreasing array input
	   public void nodeCoverage() {
	      
	       int arr[] = new int[] {100,90,80,70,60,50,40,30,20,10,0};
	       Item items[] = new Item[arr.length];
	       Item items1[] = new Item[arr.length];
	       Item items2[] = new Item[arr.length];
	       Item items3[] = new Item[arr.length];
	       Item items4[] = new Item[arr.length];
	       Item items5[] = new Item[arr.length];
	       
	       for(int i=0;i<arr.length;i++) {
	       		items[i] = new Item(arr[i]);
	       		items1[i] = new Item(arr[i]);
	       		items2[i] = new Item(arr[i]);
	       		items3[i] = new Item(arr[i]);
	       		items4[i] = new Item(arr[i]);
	       		items5[i] = new Item(arr[i]);
	       }
	      
	       SortAlgos.bubbleSort(items);
	       SortAlgos.quickSort(items1);
	       SortAlgos.mergeSort(items2);
	       SortAlgos.selectionSort(items3);
	       SortAlgos.insertionSort(items4);
	       SortAlgos.heapSort(items5);
	       
	       
	  }
	@Test //Node Coverage by random array input
		public void nodeCoverageRandom()
		{
			int arr[] = new int[] {83,27,43,10,0,33,76,22,31,90,100};
			   Item items[] = new Item[arr.length];
		       Item items1[] = new Item[arr.length];
		       Item items2[] = new Item[arr.length];
		       Item items3[] = new Item[arr.length];
		       Item items4[] = new Item[arr.length];
		       Item items5[] = new Item[arr.length];
		       
		       for(int i=0;i<arr.length;i++) {
		       		items[i] = new Item(arr[i]);
		       		items1[i] = new Item(arr[i]);
		       		items2[i] = new Item(arr[i]);
		       		items3[i] = new Item(arr[i]);
		       		items4[i] = new Item(arr[i]);
		       		items5[i] = new Item(arr[i]);
		       }
		       SortAlgos.bubbleSort(items);
		       SortAlgos.quickSort(items1);
		       SortAlgos.mergeSort(items2);
		       SortAlgos.selectionSort(items3);
		       SortAlgos.insertionSort(items4);
		       SortAlgos.heapSort(items5);
			
		    
			
		}

	@Test //Edge Coverage by sorted array input
	   public void edgeCoverageSorted() {
	       int arr[]  = new int[] {0,10,20,30,40,50,60,70,80,90,100};
	       Item items[] = new Item[arr.length];
	       Item items1[] = new Item[arr.length];
	       Item items2[] = new Item[arr.length];
	       Item items3[] = new Item[arr.length];
	       Item items4[] = new Item[arr.length];
	       Item items5[] = new Item[arr.length];
	       
	       for(int i=0;i<arr.length;i++)
	       {
	       		items[i] = new Item(arr[i]);
	       		items1[i] = new Item(arr[i]);
	       		items2[i] = new Item(arr[i]);
	       		items3[i] = new Item(arr[i]);
	       		items4[i] = new Item(arr[i]);
	       		items5[i] = new Item(arr[i]);
	       }
	       
	       
	       SortAlgos.bubbleSort(items);
	       SortAlgos.quickSort(items1);
	       SortAlgos.mergeSort(items2);
	       SortAlgos.selectionSort(items3);
	       SortAlgos.insertionSort(items4);
	       SortAlgos.heapSort(items5);

	   }

	@Test //Edge Coverage by null input
	   public void edgeCoverage() {
	       int arr[]  = new int[] {};
	       Item items[] = new Item[arr.length];
	       
	       SortAlgos.bubbleSort(items);

	   }

	@Test //Edge Coverage by single element array input
	   public void edgeCoverageSingle() {
	       int arr[] = new int[] {10};
	       Item items[] = new Item[arr.length];
	       Item items1[] = new Item[arr.length];
	       Item items2[] = new Item[arr.length];
	       Item items3[] = new Item[arr.length];
	       Item items4[] = new Item[arr.length];
	       Item items5[] = new Item[arr.length];
	       
	       for(int i=0;i<arr.length;i++)
	       {
	       	items[i] = new Item(arr[i]);
	       	items1[i] = new Item(arr[i]);
       		items2[i] = new Item(arr[i]);
       		items3[i] = new Item(arr[i]);
       		items4[i] = new Item(arr[i]);
       		items5[i] = new Item(arr[i]);
	       }	
	       SortAlgos.bubbleSort(items);
	       SortAlgos.quickSort(items1);
	       SortAlgos.mergeSort(items2);
	       SortAlgos.selectionSort(items3);
	       SortAlgos.insertionSort(items4);
	       SortAlgos.heapSort(items5);
	       
	   }
	
	@Test //Edge Coverage by random input
		public void edgeCoverageRandom()
		{
			int arr[] = new int[] {10};
			Item items[] = new Item[arr.length];
			Item items1[] = new Item[arr.length];
		    Item items2[] = new Item[arr.length];
		    Item items3[] = new Item[arr.length];
		    Item items4[] = new Item[arr.length];
		    Item items5[] = new Item[arr.length];
			
			for(int i=0;i<arr.length;i++)
			{
				items[i] = new Item(arr[i]);
				items1[i] = new Item(arr[i]);
	       		items2[i] = new Item(arr[i]);
	       		items3[i] = new Item(arr[i]);
	       		items4[i] = new Item(arr[i]);
	       		items5[i] = new Item(arr[i]);
		       }	
		       SortAlgos.bubbleSort(items);
		       SortAlgos.quickSort(items1);
		       SortAlgos.mergeSort(items2);
		       SortAlgos.selectionSort(items3);
		       SortAlgos.insertionSort(items4);
		       SortAlgos.heapSort(items5);
		
			
		
		}

	@Test //Condition Coverage by random array input
	   public void conditionCoverage() {

	       int arr[] = new int[] {7,5,3,9,1,4,8,2,10,6,0};
	       Item items[] = new Item[arr.length];
	       Item items1[] = new Item[arr.length];
	       Item items2[] = new Item[arr.length];
	       Item items3[] = new Item[arr.length];
	       Item items4[] = new Item[arr.length];
	       Item items5[] = new Item[arr.length];
	       
	       for(int i=0;i<arr.length;i++) 
	       {
	       	items[i] = new Item(arr[i]);
	       	items1[i] = new Item(arr[i]);
       		items2[i] = new Item(arr[i]);
       		items3[i] = new Item(arr[i]);
       		items4[i] = new Item(arr[i]);
       		items5[i] = new Item(arr[i]);
	       }
	       SortAlgos.bubbleSort(items);
	       SortAlgos.quickSort(items1);
	       SortAlgos.mergeSort(items2);
	       SortAlgos.selectionSort(items3);
	       SortAlgos.insertionSort(items4);
	       SortAlgos.heapSort(items5);
	       
	   }
}