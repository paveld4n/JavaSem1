public class Triangle extends Shape {
    
    String style;

    double area() {
        return getWight() * getHeight() / 2;
    }
    void show_style(){
        System.out.println(style);
    }
}
