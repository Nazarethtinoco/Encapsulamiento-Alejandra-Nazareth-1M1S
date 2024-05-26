public class VEHICULO {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    
    
    //Constructor
    public VEHICULO(String marca, String modelo, int año, int kilometraje){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.kilometraje=kilometraje;
        
    }
    
     //gettern
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public int getaño(){
        return año;
    }
    public int getkilometraje(){
        return kilometraje;
    }
    
    // setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setAño(int año){
        this.año=año;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje=kilometraje; 
    }    
  
    
    //Metodo Mostrar informacion de un vehiculo
    public void MostrarInfo(){
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Año: "+año);
     System.out.println("Kilometraje: "+kilometraje);
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

    
