public class App {
    public static void main(String[] args) throws Exception {
       
        //crear instancia de tipo de vehiculo
        Auto auto=new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

    
        Camion camion=new Camion("Volvo", "FH", 2019, 75000,  20000,4);

        //mostrar la info de cada vehiculo
        System.out.println("Informacion del auto");
        auto.MostrarInfo();

        System.out.println("Informacion del camion");
        camion.MostrarInfo();
    

    }
}
