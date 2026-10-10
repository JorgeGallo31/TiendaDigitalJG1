    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    Producto producto1 = new Producto();
    Producto producto2 = new Producto();
    Producto producto3 = new Producto();

    producto1.nombre="Monitor";
    producto1.precio=200;
    producto1.categoria="Periferico";
    producto1.disponible=true;

    producto2.nombre="Mouse";
    producto2.precio=60;
    producto2.categoria="Periferico";
    producto2.disponible=false;

    producto3.nombre="Procesador";
    producto3.precio=350;
    producto3.categoria="Hardware";
    producto3.disponible=true;

    System.out.println("------------------------");
    producto1.mostrarInformacion();
    producto1.mostrarDisponiblidad();
    System.out.println("------------------------");
    producto2.mostrarInformacion();
    producto2.mostrarDisponiblidad();
    System.out.println("------------------------");
    producto3.mostrarInformacion();
    producto3.mostrarDisponiblidad();




}
