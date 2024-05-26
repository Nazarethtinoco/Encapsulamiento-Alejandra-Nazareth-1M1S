  //VehiculoCarga.java
  public class VehiculoCarga extends VEHICULO{
  private int capacidadCarga;

  //Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga=capacidadCarga;
    }
     
    //Getter y Setter para CapacidadCarga
    public int getcapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga=capacidadCarga;
    }
    
    //Sobrescribir el metodo 
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Capacidad de Carga: "+capacidadCarga +" kg");
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