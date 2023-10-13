import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
    private List <Articulo> articuloList;

    ListaCategorias listaCategorias;

    public ListaArticulos(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    public ListaArticulos() {
        articuloList = new ArrayList<>();
    }

    //metodo para agregar un articulo a la lista

    public void addArticuloToList(Articulo a){
        this.articuloList.add(a);

    }

    public void showList(){
        for(Articulo a : this.articuloList){
            a.showInfo();
        }
    }

    public void generarGanancias(ListaCategorias listaCategorias){
        for(Articulo a: articuloList){
            a.setValorVenta(listaCategorias);
        }
    }

    //metodo para buscar un articulo por el codigo
    //retorna un Articulo, recibe un codigo String
    Articulo getArticuloByCodigo(String codigo){
        for (Articulo a: articuloList) {
            if(a.getCodigo().compareTo(codigo)==0){
                return a;
            }
        }
        return null;
    }


    public void leerDatos() {
        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0B","Aseo",0.15));



        String linea;
        Articulo articulo = null;
        String seccion = null;

        try (BufferedReader br = new BufferedReader(new FileReader("Granero.txt"))) {
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.isEmpty()) {
                    continue; // Ignorar líneas en blanco
                }

                if (linea.startsWith("#")) {
                    seccion = linea;
                    continue; // Saltar la línea de sección
                }

                if ("#Articulos".equals(seccion)) {
                    String[] tokens = linea.split(";");
                    if (tokens.length >= 5) {
                        String codigo = tokens[0];
                        String name = tokens[1];
                        String categoria= tokens[2];
                        String cantidad = tokens[3];
                        String valorCompra = tokens[4];

                        Categoria cat = new Categoria();
                        cat = categorias.getCategoriaByCodigo(categoria);

                        articulo = new Articulo(codigo, name, cat, Utils.stringtoint(cantidad), Utils.stringtodouble(valorCompra));
                        //this.LArticulo.add(articulo);
                        articuloList.add(articulo);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo básico de errores, puedes personalizarlo según tus necesidades
        }
    }

}
