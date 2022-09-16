
package deportesatlas.DTO;

import java.util.Date;

public class Suscripcion {
    private String Usuarios;
    private int Numerosuscripcion;
    private Date Fechainicio;
    private int Valorsuscripcion;
    private String Equipos;
    private int AbonoTotal;
    private int Correlativoventa;

    public Suscripcion(String Usuarios ,int Numerosuscripcion ,Date Fechainicio, int Valorsuscripcion, String Equipos, int AbonoTotal, int Correlativoventa) {
        this.Usuarios = Usuarios;
        this.Numerosuscripcion = Numerosuscripcion;
        this.Fechainicio = Fechainicio;
        this.Valorsuscripcion = Valorsuscripcion;
        this.Equipos = Equipos;
        this.AbonoTotal = AbonoTotal;
        this.Correlativoventa = Correlativoventa;
    }
    
    public Suscripcion() {
    this.Usuarios = "";
    this.Numerosuscripcion = 0;    
    this.Fechainicio = new Date();
    this.Valorsuscripcion = 0;
    this.Equipos = "";
    this.AbonoTotal = 0;
    this.Correlativoventa = 0;
      
    
}

    public String getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String Usuarios) {
        this.Usuarios = Usuarios;
    }
    
    
    public int getNumerosuscripcion() {
        return Numerosuscripcion;
    }

    public void setNumerosuscripcion(int Numerosuscripcion) {
         if(Numerosuscripcion > 0){
            this.Numerosuscripcion = Numerosuscripcion;
        this.Numerosuscripcion = Numerosuscripcion;
    } 
    
    }
    public Date getFechainicio() {
        return Fechainicio;
    }

    public void setFechainicio(Date Fechainicio) {
        this.Fechainicio = Fechainicio;
    }

    public int getValorsuscripcion() {
        return Valorsuscripcion;
    }

    public void setValorsuscripcion(int Valorsuscripcion) {
        this.Valorsuscripcion = Valorsuscripcion;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public int getCorrelativoventa() {
        return Correlativoventa;
    }

    public void setCorrelativoventa(int Correlativoventa) {
        this.Correlativoventa = Correlativoventa;
    }

    
    
    
}