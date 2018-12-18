
public class TestCar {
    private String make, model;
    private int year;
    private double price;
    
    public TestCar(String ma, String mo, int y, double p){
        make=ma;
        model=mo;
        year=y;
        price=p;      
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getAge(int cy){
        int age=cy-year;
        return age;
    }
    
    public void depriciate(){
        price=price*0.7;
    }
    
    
    public String toString(){
        String c = "\nHere is the car:";
        c+= "\nThe make: " + make;
        c+= "\nThe model: " + model;
        c+= "\nThe year: " + year;
        c+= String.format("\nThe price: $%.2f", price);
        return c;
    }
    
}
