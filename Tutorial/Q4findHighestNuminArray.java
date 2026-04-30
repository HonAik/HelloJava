package Tutorial;

public class Q4findHighestNuminArray {
    public static void main(String[] args) {
        int [] arr = {3, 7, 2, 9, 4, 1};
        int num =0;//int num = arr[0] 比较好 因为如果arr里面的号码全部都是负数会导致一开始就错了
        for(int i =0; i< arr.length; i++){
            if(arr[i]-num >0){//写成 arr[i]>num
                num = arr[i];
            }
        }
        System.out.println(num);
        }

}
