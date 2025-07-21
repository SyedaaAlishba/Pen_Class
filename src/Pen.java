public class Pen {
    color penColor;
    type penType;
    isVisible visibility;

   public void setPenDetails(color penColor,type penType,isVisible visibility){
       this.penColor = penColor;
       this.penType = penType;
       this.visibility = visibility;
   }
   public void display(){
       System.out.println(penColor.color);
       System.out.println(penType.type);
       System.out.println(visibility.isVisible);
   }
}
