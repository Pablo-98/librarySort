import java.util.Scanner; //scan file

import java.io.*; //  file readder

public class Tester {

    public static void main (String[] args) throws IOException {
        File myFile = new File("dictionary.txt");

        File fileOutput = new File ("results.txt");

        PrintWriter output = new PrintWriter(fileOutput);

        long startTime;
        long endTime;

        Scanner scnr = new Scanner (myFile);

        int size = findSize(scnr);

        scnr.close();


        String [] a = new String [size];
        arrayGenerate(a, myFile);
        //copy() :copies the content of one array into another

        String [] b = copy(a);
        String [] c = copy(a);
        String [] d = copy(a);
        String [] e = copy(a);
        String [] f = copy(a);
        // !!!!!!!!!!!!!!!!!!!!!!!!!!
        // callBacks to Sorting.java


        startTime = System.nanoTime();
        Sorting.bubbleSort(a);
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "bubble sort");

        startTime = System.nanoTime();
        Sorting.selectionSort(b);
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "selection sort");

        startTime = System.nanoTime();
        Sorting.insertionSort(c);
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "insertion sort");

        startTime = System.nanoTime();
        Sorting.quickSort(d);
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "quick sort");

        startTime = System.nanoTime();
        Sorting.mergeSort(e);
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "merge sort");

      //  startTime = System.nanoTime();
       // Sorting.;
       // endTime = System.nanoTime();
       // addResult(output, startTime, endTime, "cocktail sort");


// part II test execution time of each algorithm 
        startTime = System.nanoTime();
        seqSearch(a, "yellow-earth");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "sequential search for yellow-earth" );

        startTime = System.nanoTime();
        biSearch(a, "yellow-earth");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "binary search for yellow-earth");

        startTime = System.nanoTime();
        seqSearch(a, "AMARyYO");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "sequential search for AMARyYo" );

        startTime = System.nanoTime();
        biSearch(a, "AMARyYO");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "binary search for AMARyYO");

        startTime = System.nanoTime();
        seqSearch(a, "amarillo");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "sequential search for amarillo" );

        startTime = System.nanoTime();
        biSearch(a, "amarillo");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "binary search for amarillo");

        startTime = System.nanoTime();
        seqSearch(a, "yellow");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "sequential search for yellow" );

        startTime = System.nanoTime();
        biSearch(a, "yellow");
        endTime = System.nanoTime();
        addResult(output, startTime, endTime, "binary search for yellow");
        output.close();
    }

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   public static void addResult(PrintWriter output, long startTime, long endTime, String sortType){
        output.println(sortType + (" took: " + (endTime - startTime) + " nanoseconds to sort/search."));
    }

   public static int findSize(Scanner scnr){
        int count = 0;
        while(scnr.hasNext()){
            scnr.nextLine();
            count++;
        }
        return count;
    }
          public static void arrayGenerate(String [] a, File file)throws IOException{
        Scanner scnr = new Scanner(file);
        for (int i = 0; i < a.length; i++) {
            a[i] = scnr.nextLine();
        }
        scnr.close();
    }


    //prints out an array
    public static void print(String [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    //Used to copy the original array by value.
    public static String [] copy(String [] a){
        String [] b = new String [a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static boolean seqSearch(String [] a, String target){
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(target)){
                return true;
            }
        }
        return false;
    }
    public static boolean biSearch(String [] a, String target){
        return biSearch(a, target, 0, a.length-1);
    }
    private static boolean biSearch(String [] a, String target, int low, int high){
        int midpoint = (low + high) / 2;
        if(low > high){
            return false;
        }
        else if(a[midpoint].equals(target)){
            return true;
        }
        else if(a[midpoint].compareTo(target) < 0){
            return biSearch(a, target, ++midpoint, high);
        }
        else{
            return biSearch(a, target, low, --midpoint);
        }
    }



  

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
    





