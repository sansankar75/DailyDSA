public class dc {

    private static int binarySearch(int first,int last,int arr[],int target)
    {
        if(first>last)
        {
            return -1;
        }

        int mid=(first+last)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(first,mid-1,arr,target);
        }
        else{
            return binarySearch(mid+1,last,arr,target);
        }
    }
    public static void main(String []args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=0;
        int s=arr[k++];
        System.out.println(k);
        int l=arr.length;
       System.out.println(binarySearch(0,arr.length-1,arr,69));
    }
}

// its stage 3 its a divide and conqure so its hard but its not so hard but 
// i need to use the visualalgo website to learn this 
