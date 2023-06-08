public class Main {
    
    public static void main (String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setHeight(4); 
        t1.setWight(2);
        t1.style ="filled";
        t1.show_shape();
        t1.show_style();

        t2.setHeight(3);
        t2.setWight(2);
        t2.style = "Empty";
        t2.show_shape();
        t2.show_style();

    }

    
}
