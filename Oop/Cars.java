
class Cars { //superclass

    protected String brand = "Brand A";// attribute
    //关于protected,同一个 package 可以用 + 子类(subclass)也可以用（即使不同 package） 
    
    public void honk(){
        System.out.println("Pik Pik"); // method
    }
    
}

class ScfCar extends Cars{ // ScfCar is subclass
    
    private String modelname = "Jack";

    public static void main(String[] args) {
        ScfCar car1 = new ScfCar();
        car1.honk();
        System.out.println(car1.modelname + " "+ car1.brand);
    }
}