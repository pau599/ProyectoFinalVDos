package Modelo;

public class Turn implements Comparable<Turn> {
    
    private String nombreCliente;
    private int edadCliente;
    private String generoCliente;
    private double valorFactura;
    private int idFactura;
    private String premio;
    private String ciudad;
    private double PrecioUnitario;
    

    public Turn(String nombreCliente, int edadCliente, String generoCliente, double valorFactura, int idFactura, String premio, String ciudad) {
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.generoCliente = generoCliente;
        this.valorFactura = valorFactura;
        this.idFactura = idFactura;
        this.premio = premio;
        this.ciudad = ciudad;
        this.PrecioUnitario = PrecioUnitario;
        
    }

    public Turn(Cliente cliente, int valor, Long id, String _Entradas_para_Cine_y_un_iPhone_15_Pro_Ma, int prioridad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    @Override
    public int compareTo(Turn o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

		
	}

