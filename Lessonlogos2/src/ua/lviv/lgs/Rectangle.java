package ua.lviv.lgs;

public class Rectangle {
 
    private int width;
    private int height;
    private int square;
    private int perimeter;

    
    
    public Rectangle (){
        this.width = 4;
        this.height = 3;
        square = width * height;
        perimeter = 2*(width + height);
    }
    
        Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
        square = width * height;
        perimeter = 2*(width + height);
    }
    

    public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
     

    public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }


    public String toString() {
        return "Площа прямокутника = " + square + ", Периметр прямокутника = " + perimeter;
    }
    
}
  

