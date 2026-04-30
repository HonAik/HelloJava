package Tips;
public class Array {
    public static void main(String[] args) {
        
        //array,用来store numerous values into a variable，避免一直去declare；
        String[] cars= {"Toyota","BMW","Mazdo","Volvo"};
        System.out.println(cars[0]);

        //change value
        cars[0]="Vios";
        System.out.println(cars[0]);

        //find length(.length)
        System.out.println(cars.length);

        //new,用来create一个还不知道里面要放什么value的array，可以先开size先
        int[] num = new int[5];
        num[0]=3;
        num[1]=5;
        num[2]=0;
        num[3]=8;
        num[4]=0;
        System.out.println(num[2]);

        //也可以
        String[] num1 = new String[] {"a","b","c"};
        System.out.println(num1[1]);

        //Use array and loop to calculate the sum of the elements
        int[] num2={1,4,2,5,6};
        int sum = 0;

        for(int i=0;i<num2.length;i++){
            sum += num2[i];
        }
        System.out.println(sum);

        //for-each loop
        //for (type variable : arrayname) {}
        //The colon (:) is read as "in". So you can read the loop as: "for each variable in array".

        int[] num3 = {1,2,3,4,5};
        for(int num4 : num3){
            System.out.println(num4);//print all the value in the array;
        }

        //Example
        //To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        double sum1 = 0;

        for(int i = 0; i<ages.length;i++){
            sum1 += ages[i];
        }

        double ave1 = sum1/ages.length;
        System.out.println(ave1);

        //if use for-each loop
        double sum3=0;
        int length = ages.length;
        
        for(int agesum :ages){
            sum3 += agesum;
        }

        double avg = sum3/length;
        System.out.println(avg);

        //example:
        //Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:
        int[] numbers = {3, -1, 7, 0, 9};

        for(int numbers1 : numbers){
            if(numbers1<0){
                continue;
            }else if(numbers1==0){
                break;
            }else{
                System.out.println(numbers1);
            }
        }

        //Create a program that keeps track of the highest and lowest values in an array:
        int[] nums = {45, 12, 98, 33, 27};
        int high = nums[0];
        int low = nums[0];

        for(int nums1:nums){
            if(high<nums1){
                high=nums1;
            }
            if(low>nums1){
                low=nums1;
            }
           
        } 
        
        System.out.println("The highest value is:"+high+" and the lowest is:"+low);

        //multidimensional array
        int[][] multiarray = {{1,2,3},{4,5,6}};
        System.out.println(multiarray[1][2]);
        //Attention:第一个[]代表row，第二个[]代表column
        
        //改value
        multiarray[0][1] = 9;
        System.out.println(multiarray[0][1]);
       
        //print全部
        for(int row =0;row<multiarray.length;row++){
            for(int col =0;col<multiarray[1].length;col++){
                System.out.println("The numbers of row "+row+" at column "+col+ " is " +multiarray[row][col] );
                //这样写：
                System.out.println("multiarray"+"["+row+"]"+"["+col+"]"+"="+multiarray[row][col]);
            }
        }

        //也可以用简单方式：
        int[][] multiarray1 = {{1,2,3},{4,5,6}};
        for(int[] row1 : multiarray1){
            for(int numA : row1 ){
                System.out.println(numA);
            }
        }
    }
}


