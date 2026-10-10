public class Producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
        System.out.println("precio"+precio);
        System.out.println("Categoria"+categoria);
        System.out.println("diponible"+disponible);

    }
    public void cambiarDisponibilidad(boolean nuevaDisponiblidad){
        disponible=nuevaDisponiblidad;

    }
        void mostrarPrecio(){
            System.out.println("Precio: "+precio);
        }
        void mostrarDisponiblidad(){
          if(disponible){
            System.out.println("Esta disponible");
          } else {
            System.out.println("No disponible");
          }
        }


}
