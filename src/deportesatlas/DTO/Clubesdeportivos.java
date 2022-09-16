
package deportesatlas.DTO;



public class Clubesdeportivos {
    private String Codigoequipo;
    private String Nombreclubes;
    private String Nombrefundador;
    private String Añofundacion;
    private String Paisorigen; 
    private String Lema;
    private String colores;
    private int Valorsuscripcion;
    
    

    public Clubesdeportivos(String Codigoequipo, String Nombreclubes, String Nombrefundador, String Añofundacion, String Paisorigen, String Lema, String colores, int Valorsuscripcion) {
        this.Nombreclubes = Nombreclubes;
        this.Nombrefundador = Nombrefundador;
        this.Añofundacion = Añofundacion;
        this.Paisorigen = Paisorigen;
        this.Lema = Lema;
        this.colores = colores;
        this.Valorsuscripcion = Valorsuscripcion;
    }
    
    public Clubesdeportivos() {
    this.Codigoequipo = "";   
    this.Nombreclubes = "";
    this.Nombrefundador = "";
    this.Añofundacion = "";
    this.Paisorigen = "";
    this.Lema = "";
    this.colores = "";
    this.Valorsuscripcion = 0;
}

    public String getCodigoequipo() {
        return Codigoequipo;
    }

    public void setCodigoequipo(String Codigoequipo) {
        this.Codigoequipo = Codigoequipo;
    }
    

    public String getNombreclubes() {
        return Nombreclubes;
    }

    public void setNombreclubes(String Nombreclubes) {
        this.Nombreclubes = Nombreclubes;
    }

    public String getNombrefundador() {
        return Nombrefundador;
    }

    public void setNombrefundador(String Nombrefundador) {
        this.Nombrefundador = Nombrefundador;
    }

    public String getAñofundacion() {
        return Añofundacion;
    }

    public void setAñofundacion(String Añofundacion) {
        this.Añofundacion = Añofundacion;
    }

    public String getPaisorigen() {
        return Paisorigen;
    }

    public void setPaisorigen(String Paisorigen) {
        this.Paisorigen = Paisorigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getValorsuscripcion() {
        return Valorsuscripcion;
    }

    public void setValorsuscripcion(int Valorsuscripcion) {
        this.Valorsuscripcion = Valorsuscripcion;
    }
    
    
    
}
