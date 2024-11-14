public class Rectangle {

    private final double height;
    private final double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*width + 2*height;
    }

    public double getDiagonal(){
       return Math.sqrt(width*width + height*height);
    }

//    getters
    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}
