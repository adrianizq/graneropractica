public class Venta {
    private String codigo;
    //private String codigoArticulo;
    //atributo objeto Articulo
    private Articulo articulo;
    private double cantidad;

    public Venta() {
    }

    public Venta(String codigo, Articulo articulo, double cantidad) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void showInfo(){
        System.out.println(this.getCodigo());
        System.out.println(this.getArticulo().getCodigo());
        System.out.println(this.getCantidad());
    }

}
