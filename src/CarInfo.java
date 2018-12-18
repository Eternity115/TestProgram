
public class CarInfo {

    public static void main(String[] args) {
        TestCar cc = new TestCar("Mazda","MPV", 2010, 10000);
        for (int i = 0; i < cc.getAge(2018); i++) {
            cc.depriciate();
        }
        System.out.format("$%.2f", cc.getPrice());
        System.out.println(cc);
    }
    
}
