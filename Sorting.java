public class Sorting{

    public static void bubbleSort(String words){
        // comparing each element in a list , swapping items if necessart, and repeating the pass throug as needed
        // sample code from csoer

        // compareTo() hello.compareTo(hello) returns zero because they are the same. If first var
        // if var1.compareTo(var2) > 0, var 1 is lexicographically greater thatn the other string
        for (int i =0; i< a.length; i++){
            for (int j = 0; j < words.length -1 -i; j++){
                if (words[j].compareTo(words[j+1]) > 0) // if a[j] is lexicographically greater than a[j+1]
                {
                    int temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

    }
    public static void selectionSort(String words){
        int smallest;
        String temp;

        for (int i =0; i < words.length; i++){

            indexSmallest = i;
            for (int j= i+1; i <words.length; j++){
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
    }
    public static void insertionSort(String words){
  String temp; 
  int j;
  for (int i =0; i<words.length; i++){
    j=1;
    while (j >0 && words[j].compareTo(words[j-1]<0) ){
        temp = words[j];
        words[j] = words[j-1];
        words[j-1] =temp;
        j--;
    }
    }
    }

     public static void mergeSort(String words){
        
    }

    private static void merge(String a)
     public static void quickSort(String words){
        
    }
     public static void stalinSort(String words){
        // needs configuring, sample code from geeks
        int j =0;

        while(true){

            int moved = 0;

            for(inti = 0; i < (words.size -1 -j); i++){
                if (arr[i] >arr[i+1]){

                    vector <int>:: iterator index;
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
        }
    }
}