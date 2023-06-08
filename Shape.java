public class Shape {
    
    private double wight;
    private double height;

    void show_shape() {
        System.out.println( "Ширина = " + wight);
        System.out.println( "Высота = " + height);
    }
    void setWight(double wight) {
        this.wight = wight;
    }
    void setHeight(double height) {
        this.height = height;
    }
    double getWight() {
        return wight;
    }
    double getHeight() {
        return height;
    }
    
}