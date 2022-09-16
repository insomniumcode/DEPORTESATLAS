
package deportesatlas.DTO;

import java.util.Date;
import java.util.regex.Pattern;

public class Usuario {
    private int ID;
    private String Nombre;
    private int Rut;
    private String DV;
    private Date Fechanacimiento;
    private int Telefono;
    private String Mail; 
    private String Nombreusuario;
    private String Contraseña;
      

    public Usuario(int ID, String Nombre, int Rut, String DV, Date Fechanacimiento, int Telefono, String Mail, String Nombreusuario, String Contraseña) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.DV = DV;
        this.Fechanacimiento = Fechanacimiento;
        this.Telefono = Telefono;
        this.Mail = Mail;
        this.Nombreusuario = Nombreusuario;
        this.Contraseña = Contraseña;
    }

   public Usuario() {
       this.ID = 0;
       this.Nombre = "";
       this.Rut = 0;
       this.DV = "";
       this.Fechanacimiento = new Date();
       this.Telefono = 0;
       this.Mail = "";
       this.Nombreusuario = "";
       this.Contraseña = "";
       
       }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
       if(Nombre.length() >= 4){
        this.Nombre = Nombre;
    }
       
       
    }

    public int getRut() {
        return Rut;
    }

    
    public void setRut(int Rut, char DV) {
    if(this.validarRut(Rut, DV)){
           this.Rut = Rut;
           this.DV = DV+"";
        }        
        
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date Fechanacimiento) {
        this.Fechanacimiento = Fechanacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
         if(Mail.contains("@"))
            if (Mail.contains(".com")|| Mail.contains(".cl")){
        this.Mail = Mail;
    }
    }

    public String getNombreusuario() {
        return Nombreusuario;
    }

    public void setNombreusuario(String Nombreusuario) {
        this.Nombreusuario = Nombreusuario;
    }
    
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    
    
    
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        if (PASSWORD_PATTERN.matcher(Contraseña).matches()) {
        this.Contraseña = Contraseña;
    }
   
 }
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }    

        }catch (java.lang.NumberFormatException e) {
        }catch (Exception e) {
        }
        return validacion;
       
  }
}      
