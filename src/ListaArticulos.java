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

}
