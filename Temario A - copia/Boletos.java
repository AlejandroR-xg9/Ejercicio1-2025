
public class Boletos{
    private double Localidad;
    private int Espacio1;
    private int Espacio2;
    private int Espacio3;
    private int Precio;

    
    public void Espacio(){
        this.Espacio1 = 20;
        this.Espacio2 = 20;
        this.Espacio3 = 20;
    }

    public Boletos() {
    }

    public void AsignarPrecio(){
        if(Localidad == 1){
        Precio = 100;
        }
        else if(Localidad == 2){
        Precio = 500;
        }
        else if (Localidad == 3){
            Precio = 1000;
        }
    }

    public double getLocalidad(){
        return Localidad;
    }
    public void setLocalidad(double localidad){
        this.Localidad = localidad;
    }
    public int getEspacio2(){
        return Espacio2;
    }
    public void setEspacio2(int espacio2){
        this.Espacio2 = espacio2;
    }
    public int getEspacio3(){
        return Espacio3;
    }
    public void setEspacio3(int espacio3){
        this.Espacio3 = espacio3;
    }
    public int getEspacio1(){
        return Espacio1;
    }
    public void setEspacio1(int espacio){
        this.Espacio1 = espacio;
    }
    public int getPrecio(){
        return Precio;
    }
    public void setPrecio(int precio){
        this.Precio = precio;
    }
    
    
}


