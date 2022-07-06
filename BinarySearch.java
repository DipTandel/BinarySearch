import java.util.Arrays;

//Binary Search
//ICS4U1, Dip Tandel
//Jan 11, 2022

public class BinarySearch {

  public static void main(String[] args) {
    //creates an array from index 0 to 8 (length: 9)
    int[] arr = { 32, 1, 543, 763, 23, 43, 4, 12, 1 };

    //Sorts the array and prints it
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();

    //passes array through search method, looking for index of number "4"
    System.out.println("Index (-1 = not available): " + BinarySearch(arr, 4));
  }

  public static int BinarySearch(int[] arr, int target) {
    int low = 0; //lowest index
    int high = arr.length - 1; //highest index
    while (low <= high) { //splices until not possible
      int mid = (low + high) / 2; //middle index
      if (target < arr[mid]) { //if the target is under the middle (left half)
        high = mid - 1; //the highest point now becomes just under the middle (cuts off right half of array)
      } else if (target > arr[mid]) { //otherwise, if the target is above the middle (right half)
        low = mid + 1; //the highest point now becomes just above the middle (cuts off left half of array)
      } else {
        return mid; //if its not above or under mid, it must be mid
      }
    }
    //If the "target" value is not in the array, a negative number is returned to show its not there
    return -1;
  }

  public static void sort(int[] arr) {
    Arrays.sort(arr); //sorts array least to greatest
  }
}
