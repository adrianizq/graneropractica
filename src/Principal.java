import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //System.out.println("Bienvenidos a POO con java");

        //crear un articulo
        //Articulo articulo1 = new Articulo("001","Arroz","0-A",50,2500);

       /* System.out.println( articulo1.getCodigo() );
        System.out.println( articulo1.getNombre() );
        System.out.println( articulo1.getCategoria() );
        System.out.println( articulo1.getCantidad() );
        System.out.println( articulo1.getValorCompra() ); */

        //articulo1.showInfo();

        //Articulo articulo2 = new Articulo("002","Cafe","0-A",30,4000);
        //articulo2.showInfo();

     /*   List<Articulo> listaArticulo = new ArrayList<>();

        listaArticulo.add(new Articulo("001","Arroz","0-A",50,2500));
        listaArticulo.add(new Articulo("002","Cafe","0-A",30,4000));


        //recorrer la lista de articulos para mostrar la información de cada articulo
        for (Articulo articulo:listaArticulo){
            articulo.showInfo();
        }*/
        /*
        ListaArticulos articulos = new ListaArticulos();
        articulos.addArticuloToList(new Articulo("001","Arroz","0-A",50,2500));
        articulos.addArticuloToList(new Articulo("002","Cafe","0-A",30,4000));
        articulos.showList();

         */

        /*
        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0B","Aseo",0.15));

        categorias.showList(); */

        /*
        ListaVentas ventas = new ListaVentas();
        ventas.addVentaToList(new Venta("0009","001",5));
        ventas.addVentaToList(new Venta("0009","002",3));

        ventas.showList();
    */

        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0-A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0-B","Aseo",0.15));

        Categoria c;
        ListaArticulos articulos = new ListaArticulos();

        c = categorias.getCategoriaByCodigo("0-A");
        articulos.addArticuloToList(new Articulo("001","Arroz",c,50,2500));
        articulos.addArticuloToList(new Articulo("002","Cafe",c,30,4000));
        c = categorias.getCategoriaByCodigo("0-B");
        articulos.addArticuloToList(new Articulo("003","Jabon",c,30,5000));
        articulos.generarGanancias(categorias);

        articulos.showList();

        ListaVentas ventas = new ListaVentas();
        Articulo a;
        a = articulos.getArticuloByCodigo("001");
        ventas.addVentaToList(new Venta("V001",a,5));
        a = articulos.getArticuloByCodigo("002");
        ventas.addVentaToList(new Venta("V001",a,5));
        a = articulos.getArticuloByCodigo("003");
        ventas.addVentaToList(new Venta("V002",a,3));

    }
}
