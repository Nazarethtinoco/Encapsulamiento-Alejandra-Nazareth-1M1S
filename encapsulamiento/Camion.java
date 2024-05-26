//camion.java
public class Camion extends VehiculoCarga {
    private int numEjes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes=numEjes;
    }

      //Getter y Setter para numEjes
    public int getnumejes(){
        return numEjes;
    }
    public void setNumejes(int numEjes){
        this.numEjes=numEjes;
    }

    //sobrescribir el metodo
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Numero de ejes: "+numEjes);
    }
     // Método para calcular el costo de mantenimiento
         public double calcularCostoMantenimiento(double costoPorKilometro, double kilometrosRecorridos) {
          double costoTotal = costoPorKilometro * kilometrosRecorridos;
         return costoTotal;
        }



    public void RealizarMantenimiento(){
        System.out.println("Se realizó: ");
        System.out.println("1. Revision de presion de neumatico");
        System.out.println("2. Cambio de aceite y filtro de aceite");
        System.out.println("3. mantenimiento de bateria");
        System.out.println("4. Limpieza del motor");
        System.out.println("5. Comprobación de las luces y señalizaciones.");
    }
    
}

