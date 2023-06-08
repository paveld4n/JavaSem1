public class Triangle extends Shape {
    
    String style;

    double area() {
        return getWight() * getHeight() / 2;
    }
    void show_style(){
        System.out.println("Форма =" + style);
    }
    @Override
    void show_shape() {
        System.out.println("Гипотенуза =" + Math.sqrt(getWight()*getWight()
        +getHeight()*getHeight()));
        // Переопределение позволяет подклассу по своему
        // использовать метод родителя
    }
    public Triangle( double wight, double height, String style) {
        // задаем кастомный конструктор
        setWight(wight);
        setHeight(height);
        this.style = style;
    }
}
