import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    List <Venta> ventaList;

    public ListaVentas(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public ListaVentas() {
        this.ventaList = new ArrayList<>();
    }

    public void addVentaToList(Venta v){
        this.ventaList.add(v);
    }

    public void showList(){
        for (Venta v: this.ventaList){
            v.showInfo();
        }
    }
}
