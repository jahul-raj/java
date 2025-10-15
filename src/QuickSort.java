public class QuickSort {
    public int partition(int[] arr,int low,int hight){
        int i = low -1;
        int pivot = arr[low];
        int j;
        int temp;
        for(j=low;j<hight;j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[hight];
        arr[hight] = temp;
        return i+1;
    }
    public static void main(){
        int[] arr = {2,1,4,3,5,6,7};
        QuickSort obj = new QuickSort();

        System.out.println(obj.partition(arr,arr[6], arr.length-1));
    }
}
