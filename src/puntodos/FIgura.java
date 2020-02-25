package puntodos;

public class FIgura implements PropiedadFigura {

    private double radio = 0;
    private double area = 0;

    public FIgura(){

    }

    public  FIgura(double radio){
        this.radio = radio;
        this.area = area;
    }

    @Override
    public String toString() {
        return "FIgura{" +
                "radio=" + radio +
                ", area=" + area +
                '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calculaAreaCirculo(double radio) {
        area = Math.PI * Math.pow(radio,2);
        return area;
    }
}
