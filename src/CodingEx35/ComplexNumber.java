package CodingEx35;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real+= real;
        this.imaginary+= imaginary;
    }

    public void add(ComplexNumber expression){
        add(expression.getReal(),expression.getImaginary());
    }
    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber expression){
        subtract(expression.getReal(),expression.getImaginary());
    }
    //this is a comment
}
