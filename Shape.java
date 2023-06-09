public class Shape {
    
    private double wight;
    private double height;

    public Shape (double wight, double height) { 
        // Создали родительский конструктор
        this.height = height;
        this.wight = wight;
    }

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