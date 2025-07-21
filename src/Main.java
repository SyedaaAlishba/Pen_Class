public class Main {
    public static void main(String[] args) {

        color pen_color= new color();
        pen_color.setColor("Black");

        type pen_type= new type();
        pen_type.setType("Pointer");

        isVisible pen_isVisible=new isVisible();
        pen_isVisible.setVisiblity(false);

        Pen p1= new Pen();
        p1.setPenDetails(pen_color,pen_type,pen_isVisible);
        p1.display();
    }
}