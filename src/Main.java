public class Main {
    public static void main(String[] args) {

        point pen_point =new point(50,50);
        System.out.println("Initial"+pen_point.getPosition());
        pen_point.setAxis(120,220);
        System.out.println("Updated point"+pen_point.getPosition());
        System.out.println("X "+pen_point.getX());
        System.out.println("Y "+pen_point.getY());

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