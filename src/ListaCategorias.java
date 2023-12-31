import java.util.ArrayList;
import java.util.List;

public class ListaCategorias {
    List<Categoria> categoriaList;

    public ListaCategorias(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public ListaCategorias() {
        this.categoriaList = new ArrayList<>();
    }

    public void addCategoriaToList(Categoria c){
        this.categoriaList.add(c);
    }

    public void showList(){
        for (Categoria c: this.categoriaList ){
            c.showInfo();
        }
    }
    //crear un metodo que reciba un String (codigo categoria) y retorne
    //la categoria con ese codigo
    Categoria getCategoriaByCodigo(String codigo){
        //recorremos nuestra lista en busca de la categoria con ese codigo
        for (Categoria c:categoriaList) {
            if(c.getCodigo().compareTo(codigo)==0){
                return c;
            }
        }
        return null;
    }
}
