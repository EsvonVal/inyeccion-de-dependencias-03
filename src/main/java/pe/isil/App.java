package pe.isil;



import pe.isil.red.Whatsapp;
import pe.isil.user.Charly;

public class App {

    public static void main(String[] args) {

     

       Charly charly = new Charly();
      

         
        charly.setRed(new Whatsapp()); // inyeccion por setter
      

        
        charly.showRedName();
        
    }

}
