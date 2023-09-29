public class Venta {
    private String codigo;
    private String codigoArticulo;
    private double cantidad;

    public Venta() {
    }

    public Venta(String codigo, String codigoArticulo, double cantidad) {
        this.codigo = codigo;
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void showInfo(){
        System.out.println(this.getCodigo());
        System.out.println(this.getCodigoArticulo());
        System.out.println(this.getCantidad());
    }

}
