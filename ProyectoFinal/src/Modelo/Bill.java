package Modelo;

import java.util.List;


public class Bill {
    
    
    private int idFactura;
    private String idVendedor;
    private String idComprador;
    private String idProducto;
    private int cantidad;
    private double precioUnitario;
    private String nombreCliente;
    private int edadCliente;
    private String generoCliente;
    private Ciudad ciudad;
    private int Id;
    private int Total;
    private String Fecha;
    private Empleado empleado;
    private Cliente cliente;
    private List <General> general;
    private Producto producto;

    
        

    public Bill(int idFactura, String idVendedor, String idComprador, String idProducto, int cantidad, double precioUnitario, String nombreCliente, int edadCliente, String generoCliente, 
            Ciudad ciudad, int Total, int Id, String Fecha, Empleado empleado, Cliente cliente, List <General> general, Producto producto) {
        this.idFactura = idFactura;
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.generoCliente = generoCliente;
        this.ciudad = ciudad;
        this.Total = Total;
        this.Id = Id;
        this.Fecha = Fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.general = general;
        this.producto = producto;
                }

    public Bill(String idFactura, String idVendedor, String idComprador, String valorUnitario, String fecha, String vendedorNombre, String comprador, String compradorFN, String compradorG, String idDetalleFactura, String codigoProduc, String nombreProduc, String cantidad, String categoria, String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    public Long getId() {
        Long id = null;
        return id;
    }

    public int getTotal() {
        return Total;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<General> getGeneral() {
        return general;
    }

    public void setGeneral(List<General> general) {
        this.general = general;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
    

    }