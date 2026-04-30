public class ErrorDebug {

    //About 'Throw'
    //The throw statement allows you to create a custom error.
    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied");
        }else{
            System.out.println("Access successfully");
        }
    }

    public static void main(String[] args) {
        
        try{
            //  Block of code to try
            int x =10;
            int y =0;
            System.out.println(x/y);
        }catch(Exception e){
            //  Block of code to handle errors
            System.out.println("Something is wrong");
        }finally{
            //无论结果如何regardless of the result,it will execute the code after try...catch.
            System.out.println("Try is finished");
        }

        checkage(15);//check看如果小于18会如何

    }
    
//关于 multiple catch
/*
要用|
catch(ArrayIndexOutOfBoundsExcaption |ArithmeticException e){}
*/    
    
}
