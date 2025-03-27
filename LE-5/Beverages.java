abstract class Beverages{
    private void pour (int qty){
        System.out.println("pour" + qty + "ml of bevrages in a glass");
    }
    abstract void add codiment();
    void stir();
    private void serve (){
        System.out.println("serve through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        add codiment();
        stir();
        serve();
    }
}



