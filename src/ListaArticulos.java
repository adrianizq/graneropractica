import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
    private List <Articulo> articuloList;

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

}
