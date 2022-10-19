public class RightTriangles {
    double base;
    double height;

    public RightTriangles(double tBase,double tHeight){
        base = tBase;
        height = tHeight;
    }

    public double hypotenuse(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
    }


}
