package Knoldus.com;
import java.util.*;

public class ReducingArray {
        public static void reducingArray(int array[], int size){
            int temp_array[] = array.clone();

            //sorting the given unsorted array
            Arrays.sort(temp_array);
            HashMap<Integer, Integer> array_map = new HashMap<>();
            int value = 0;

            //Putting the elements of the sorted temp_array as key and assigning them index values from 0 to size-1
            for (int index = 0; index < size; index++)
                array_map.put(temp_array[index], value++);


            //index values mapped to the elements are fetched from map and replaced in the original array
            for (int index = 0; index < size; index++)
            {
                array[index] = array_map.get(array[index]);

            }
            printArray(array, size);
        }

        //function to print the reduced array
        static void printArray(int array[],int size) {
            for(int index =0; index<size; index++) {
                System.out.println(array[index]);

            }

        }


        public static void main(String[] args) {
            //User input for the array
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");
            int array_size = sc.nextInt();
            int [] array = new int[array_size];
            System.out.println("Enter the elements ");
            for(int index =0; index <= array_size-1; index++){
                array[index] = sc.nextInt();
            }
            reducingArray(array, array_size);


        }
    }

