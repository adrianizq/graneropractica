public class Articulo {
    private String codigo;
    private String nombre;
    //private String categoria;
    //Atributo como objeto Categoria
    private Categoria categoria;
    private long cantidad;
    private double valorCompra;
    private double valorVenta;

    public Articulo(String codigo, String nombre, Categoria categoria, long cantidad, double valorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
    }

    public Articulo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public void showInfo(){
        System.out.println( this.getCodigo() );
        System.out.println( this.getNombre() );
        System.out.println( this.getCategoria().getCodigo() );
        System.out.println( this.getCantidad() );
        System.out.println( this.getValorCompra() );
        System.out.println(this.getValorVenta());
    }

    public void setValorVenta(ListaCategorias listaCategorias){
         this.valorVenta = this.valorCompra * (1+ this.categoria.getGanancia());
    }

}
