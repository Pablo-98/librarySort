public class Sorting{

    public static void bubbleSort(String words){
        // comparing each element in a list , swapping items if necessart, and repeating the pass throug as needed
        // sample code from csoer
        for (int i =0; i< a.length; i++){
            for (int j = 0; j < a.length -1 -i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
    public static void selectionSort(String words){
        
/* sample code from zybooks 

2

3

4

5

6

7
9
3
18
8
Unsorted
Sorted
for (i = 0; i < numbers.length - 1; ++i) {

   // Find index of smallest remaining element
   indexSmallest = i;
   for (j = i + 1; j < numbers.length; ++j) {

      if (numbers[j] < numbers[indexSmallest]) {
         indexSmallest = j;
      }
   }

   // Swap numbers[i] and numbers[indexSmallest]
   temp = numbers[i];
   numbers[i] = numbers[indexSmallest];
   numbers[indexSmallest] = temp; */
}
    }
    public static void insertionSort(String words){
        /* sample code from zybooks
        for (i = 1; i < numbers.length; ++i) {
  j = i;
  // Insert numbers[i] into sorted part
  // stopping once numbers[i] in correct position
  while (j > 0 && numbers[j] < numbers[j - 1]) {
   
     // Swap numbers[j] and numbers[j - 1]
     temp = numbers[j];
     numbers[j] = numbers[j - 1];
     numbers[j - 1] = temp;
     --j;
  }
}
        */
    }
     public static void mergeSort(String words){
        
    }
     public static void quickSort(String words){
        
    }
     public static void stalinSort(String words){
        
    }
}