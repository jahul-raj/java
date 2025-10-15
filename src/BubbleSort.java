public class BubbleSort{
    public int[] sort(int[] arr){
        int num = arr.length;
        int temp;
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}