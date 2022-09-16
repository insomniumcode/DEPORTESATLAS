
package deportesatlas;


import deportesatlas.DTO.Clubesdeportivos;
import deportesatlas.DTO.Suscripcion;
import deportesatlas.DTO.Usuario;

public class MAIN {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario Usua1 = new Usuario();
        Usua1.setNombreusuario("dcog");
        Usua1.setContraseña("Afds22231");
        Usua1.setMail("david.cogiolle@gmail.com ");
        Usua1.setID(1000);
        
        System.out.println("Nombre Usuario: " + Usua1.getNombreusuario());
        System.out.println("Contraseña: " + Usua1.getContraseña());
        System.out.println("Mail: " + Usua1.getMail());
        System.out.println("ID: " + Usua1.getID());
        
        Usuario Usua2 = new Usuario();
        Usua2.setNombreusuario("ggft");
        Usua2.setContraseña("G1ovanniGg34");
        Usua2.setMail("gerr.adere@live.cl");
        Usua2.setID(1001);
        
        System.out.println("Nombre Usuario: " + Usua2.getNombreusuario());
        System.out.println("Contraseña: " + Usua2.getContraseña());
        System.out.println("Mail: " + Usua2.getMail());
        System.out.println("ID: " + Usua2.getID());
        
    
        Usuario Usua3 = new Usuario();
        Usua3.setNombreusuario("scodiio");
        Usua3.setContraseña("5534Gato33");
        Usua3.setMail(" sergio.villanueva@gmail.com");
        Usua3.setID(1002);
        
        
        System.out.println("Nombre Usuario: " + Usua3.getNombreusuario());
        System.out.println("Contraseña: " + Usua3.getContraseña());
        System.out.println("Mail: " + Usua3.getMail());
        System.out.println("ID: " + Usua3.getID());
        
        
        
        Clubesdeportivos Club1 = new Clubesdeportivos();
        Club1.setCodigoequipo("ARH11");
        Club1.setNombreclubes("Arsenal de Coquimbo");
        Club1.setLema("Cañones a los puertos ");
        Club1.setValorsuscripcion(10050);
        Club1.setColores("Amarillo, Rojo");
        
        System.out.println("Codigo de Equipo: " + Club1.getCodigoequipo());
        System.out.println("Nombre de Equipo: " + Club1.getNombreclubes());
        System.out.println("Lema: " + Club1.getLema());
        System.out.println("Valor Suscripcion:" + Club1.getValorsuscripcion());
        System.out.println("Colores: " + Club1.getColores());
              
        
        Clubesdeportivos Club2 = new Clubesdeportivos();
        Club2.setCodigoequipo("MCH12");
        Club2.setNombreclubes("Manquehue City");
        Club2.setLema("Vivir y Fuerza ");
        Club2.setValorsuscripcion(15100);
        Club2.setColores("Celeste, Blanco");
        
        System.out.println("Codigo de Equipo: " + Club2.getCodigoequipo());
        System.out.println("Nombre de Equipo: " + Club2.getNombreclubes());
        System.out.println("Lema: " + Club2.getLema());
        System.out.println("Valor Suscripcion:" + Club2.getValorsuscripcion());
        System.out.println("Colores: " + Club2.getColores());
        
        
        Clubesdeportivos Club3 = new Clubesdeportivos();
        Club3.setCodigoequipo("LCH13");
        Club3.setNombreclubes("Los Cóndores Unidos");
        Club3.setLema("Desde lo alto al sol");
        Club3.setValorsuscripcion(13200);
        Club3.setColores("Amarillo, Naranjo”");
        
        System.out.println("Codigo de Equipo: " + Club3.getCodigoequipo());
        System.out.println("Nombre de Equipo: " + Club3.getNombreclubes());
        System.out.println("Lema: " + Club3.getLema());
        System.out.println("Valor Suscripcion:" + Club3.getValorsuscripcion());
        System.out.println("Colores: " + Club3.getColores());
        
        
        
        Suscripcion Usuario1 = new Suscripcion();
        Usuario1.setNumerosuscripcion(1010);
        Usuario1.setUsuarios("Usuario1");
        Usuario1.setAbonoTotal(25150);
        Usuario1.setEquipos("ARH11 $10.050, MCH12 $15.100");
        
        System.out.println("Numero suscripcion: " + Usuario1.getNumerosuscripcion());
        System.out.println("Usuario: " + Usuario1.getUsuarios());
        System.out.println("Abono Total: " + Usuario1.getAbonoTotal() );
        System.out.println("Equipos: " + Usuario1.getEquipos());
        
        
        Suscripcion Usuario2 = new Suscripcion();
        Usuario2.setNumerosuscripcion(1020);
        Usuario2.setUsuarios("Usuario2");
        Usuario2.setAbonoTotal(13200);
        Usuario2.setEquipos("“LCH13 $13.200");
        
        System.out.println("Numero suscripcion: " + Usuario2.getNumerosuscripcion());
        System.out.println("Usuario: " + Usuario2.getUsuarios());
        System.out.println("Abono Total: " + Usuario2.getAbonoTotal() );
        System.out.println("Equipos: " + Usuario2.getEquipos());
       
        Suscripcion Usuario3 = new Suscripcion();
        Usuario3.setNumerosuscripcion(1030);
        Usuario3.setUsuarios("Usuario2");
        Usuario3.setAbonoTotal(18300);
        Usuario3.setEquipos("LCH13 $13.200, MCH12 $15.100");
        
        System.out.println("Numero suscripcion: " + Usuario3.getNumerosuscripcion());
        System.out.println("Usuario: " + Usuario3.getUsuarios());
        System.out.println("Abono Total: " + Usuario3.getAbonoTotal() );
        System.out.println("Equipos: " + Usuario3.getEquipos());
        
        
        
        
        
        
      
    
                
                
                
       
        
                
    }
    
}
