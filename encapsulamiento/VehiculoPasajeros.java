 //vehiculoPasajero.java
    public class VehiculoPasajeros extends VEHICULO{

        private int numPasajeros;
    
        //constructor
        public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
            super(marca, modelo, año, kilometraje);
            this.numPasajeros=numPasajeros;
        }
    
        //getter y setter para numPasajeros
        public int getNumPasajeros(){
            return numPasajeros;
        }
    
        public void setNumPasajeros(int numPasajeros){
            this.numPasajeros=numPasajeros;
        }
    
        //Sobrescribir el metodo mostrarInfo()
        @Override
        public void MostrarInfo(){
            super.MostrarInfo();
            System.out.println("Numero de Pasajeros: "+numPasajeros);
        }

        
    }   