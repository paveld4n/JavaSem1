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
        //setWight(wight);
        //setHeight(height);
        super(wight,height); // обратились к родительскому конструктору
        // super-первым оператром в конструкторе
        this.style = style;// поле кот нет в конструкторе
    }
    public Triangle() { // конструктор по уморчанию род класса
        super();
        style = "none";
    }
    public Triangle(double x) { // конструктор с одной переменной
        super(x);
        style = "none";
    }
    
}
