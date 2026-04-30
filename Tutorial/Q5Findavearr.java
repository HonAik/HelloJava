package Tutorial;

public class Q5Findavearr {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int num = arr[0];
        for(int i =1; i<arr.length;i++){
            num+= arr[i];
        }
        int ave = num/ arr.length;

        System.out.println(ave);
    }

}
