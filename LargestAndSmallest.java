public class LargestAndSmallest {
    public int[] ReverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={3,44,56,4,55,22};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
    

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
       
        ReverseArray(arr);
    }
    
    }
