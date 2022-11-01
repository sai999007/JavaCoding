import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,11,23,34,12,45,12,43,98,56,11,987,234,134};
        int key = 30;
        Arrays.sort(arr);

        int result = Arrays.binarySearch(arr,key);

        System.out.println(Arrays.toString(arr));


        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result + " Element Key is :" +arr[result]);

        int indexElement = binarySearchRecursive(arr,0, arr.length, 30);

        System.out.println(indexElement);

        int indexElementIterative = binarySearchIterative(arr,30);
        System.out.println("Iteratove"+indexElementIterative);

        int sqrRoot = sqrBinarySearch(11);

        System.out.println("Square Root :"+ sqrRoot);

    }


    public static int binarySearchRecursive(int arr[],int l, int r, int x){

       int mid = l + ((r-l)/2);

       if(x == arr[mid]){
           return mid;
       }else if(x<arr[mid]){
           return binarySearchRecursive(arr,l,mid-1,x);
        }else if(x>arr[mid]){
           return binarySearchRecursive(arr,mid+1,r,x);
       }
       return mid;
    }


    public static int binarySearchIterative(int array[],int x){
        int left = 0;
        int right = array.length-1;

        while(left<=right) {
            int mid = left + ((right-left)/2);
            if (x == array[mid]) {
                return mid;
            } else if (x < array[mid]) {
                right = mid-1;
            }else if (x>array[mid]){
                left = mid+1;
            }
        }

        return -1;

    }


    public static int sqrRoot(int x){

        int sqr = (int)Math.sqrt(x);
        int result = (int)sqr;

        return result;
    }

    public static int sqrBinarySearch(int x){


        LinkedList ll = new LinkedList();

        if(x==0 || x==1){
            return x;
        }

        long start = 1;
        long end = x/2;
        long ans = 0;

        while (start<=end){

            long mid=start+((end-start)/2);

            if(mid*mid == x){
                return (int)mid;
            }else if (mid*mid >x){
                end = mid-1;

            }else if(mid*mid <x){
                start = mid+1;
                ans = mid;
            }

        }


        return (int)ans;
    }

}
