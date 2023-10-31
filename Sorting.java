public class Sorting{

    public static void bubbleSort(String []words){
        // comparing each element in a list , swapping items if necessart, and repeating the pass throug as needed
        String temp;
        // if var1.compareTo(var2) > 0, var 1 is lexicographically greater thatn the other string
        for (int i =0; i< words.length; i++){
            for (int j = 0; j < words.length -1 -i; j++){
                if (words[j].compareTo(words[j+1]) > 0) // if a[j] is lexicographically greater than a[j+1]
                {
                   temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

    }
    public static void selectionSort(String[] words){
        int indexSmallest;
        String temp;

        for (int i =0; i < words.length; i++){

            indexSmallest = i;
            for (int j= i+1; j <words.length; j++){
                if (words[j].compareTo(words[indexSmallest]) < 0)// if a[j] is lexicographically smaller than a at the smallestIndex
                {
                    indexSmallest = j;

                }
            }
            temp = words[i];
            words[i] = words[indexSmallest];
            words[indexSmallest] = temp;
        }
}
    
    public static void insertionSort(String[] words){
  String temp; 
  int j;
  for (int i =0; i<words.length; i++){
    j=i;
    while (j >0 && words[j].compareTo(words[j-1]) < 0 ){
        temp = words[j];
        words[j] = words[j-1];
        words[j-1] =temp;
        --j;
    }
    }
    }

     public static void merge(String[] words, int i, int j, int k){
        int mergedSize = k - i +1;
        String mergedString[] = new String [mergedSize];
        int mergePosition;
        int leftPosition;
        int rightPosition;

        mergePosition = 0;

        leftPosition = i;

        rightPosition = j + 1;

        while (leftPosition <= j && rightPosition <= k){

            if (words[leftPosition].compareTo(words[rightPosition]) <0){
                mergedString[mergePosition] = words[leftPosition];
                leftPosition++;
            } else{
                mergedString[mergePosition] = words[rightPosition];
                rightPosition++;
            }
            mergePosition++;
        }
       while(leftPosition <= j){
            mergedString[mergePosition] = words[leftPosition];
            ++leftPosition;
            ++mergePosition;
        }

        while(rightPosition <= k){
            mergedString[mergePosition] = words[rightPosition];
            ++rightPosition;
            ++mergePosition;
        }

        for(mergePosition = 0; mergePosition < mergedSize; ++mergePosition){
            words[i + mergePosition] = mergedString[mergePosition];
        }
    }
    

    private static void mergeSort(String [] words, int i, int k){
            int j;

        if(i < k){
            j = (i + k) / 2;

            mergeSort(words, i, j);
            mergeSort(words, j + 1, k);

            merge(words, i, j, k);
    }
    }

    public static void mergeSort(String[] words){

        mergeSort(words, 0 , words.length-1);
    }
    public static int partition(String [] a, int i, int k) {
        int midpoint;
        int low;
        int high;
        String pivot;
        String temp;
        boolean done;

        midpoint = i + (k - i) / 2;
        pivot = a[midpoint];

        done = false;
        low = i;
        high = k;

        while(!done){
            while(a[low].compareTo(pivot) < 0){
                ++low;
            }
            while(a[high].compareTo(pivot) > 0){
                --high;
            }
            if(low >= high){
                done = true;
            }
            else {
                temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                ++low;
                --high;
            }
        }
        return high;
    }
    private static void quickSort(String [] words, int i, int k) {
        int j;
        if(i >= k){
            return;
        }

        j = partition(words, i, k);

        quickSort(words, i, j);
        quickSort(words, j + 1, k);
   }
    public static void quickSort(String [] a){
        quickSort(a, 0, a.length-1);
   }
     public static void stalinSort(String words){
        // needs configuring, sample code from geeks
     
     
     /*   int j =0;

        while(true){

            int moved = 0;

            for(int i = 0; i < (words.size -1 -j); i++){
                if (arr[i].compareTo(arr[i+1]) > 0){

                /   vector <int>:: iterator index;
                    int temp;
                    index = words.begin() +i +1;
                    temp = arr[i+1];
                    words.erase(index);

                    words.insert(words.begin() + moved, temp);
                    moved++
                }
            }
            j++
            if(moved ==0){
                break;
            }
        }
        for (int i = 0; i < words.size(); i++){
            cout << words[i] << ", ";

            */
        }
    }
