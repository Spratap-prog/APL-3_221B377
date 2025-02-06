public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display(); 
        
        AbsTest absTest = new AbsTest() {
            public void display() {
                System.out.println("This is the display method in the AbsTest subclass.");
            }
        };
        absTest.display(); 
    }
}
