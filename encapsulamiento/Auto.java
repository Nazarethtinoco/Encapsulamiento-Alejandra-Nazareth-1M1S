 //Auto java
 public class Auto extends VehiculoPasajeros{
 private String tipoCombustible;

 //Constructor
 public Auto(String marca, String modelo, int año, int kilometraje, int cantidadPasajeros, double costoPorkilometro, double kilometrosRecorridos, String tipoCombustible) {
    super(marca, modelo, año, kilometraje, cantidadPasajeros);
    this.tipoCombustible=tipoCombustible;
}

    //Getter y Setter para el tipo de combustible
    public String gettipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

    //sobrescribir el metodo
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Tipo de combustible: "+tipoCombustible);
    }

    // Método para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento(double costoPorKilometro, double kilometrosRecorridos) {
        double costoTotal = costoPorKilometro * kilometrosRecorridos;
        return costoTotal;
    }

}

