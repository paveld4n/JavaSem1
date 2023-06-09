public class Main {
    
    public static void main (String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        Triangle t3 = new Triangle(8);
        Triangle t4 = new Triangle(4);

        Triangle t5 = new Triangle(4.0, 2.0, "color RED");
        Triangle t6 = new Triangle(3, 12, "color BLUE");

        //t1.setHeight(4); 
        //t1.setWight(2);
        //t1.style ="filled";
        t1.show_shape();
        t1.show_style();

        //t2.setHeight(3);
        //t2.setWight(2);
        //t2.style = "Empty";
        t2.show_shape();
        t2.show_style();
        t3.show_shape();
        t3.show_style();
        t4.show_shape();
        t4.show_style();
        t5.show_shape();
        t5.show_style();
        t6.show_shape();
        t6.show_style();

    }
   
}
