package edu.poniperro.domain;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoCarrera;
    private int TiempoEsperado;
    private double costeTotal;
    private int propina; 

    private Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos) {
        this.TiempoEsperado = tiempoEsperadoMinutos;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = TiempoEsperado;
    }

    
    public String getOrigen() {
        return this.origen;
    }
    
    public String getDestino() {
        return this.destino;
    }
    
    public double getDistancia() {
        return this.distancia;
    }
    
    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }
    
    public int getTiempoEsperado() {
        return this.TiempoEsperado;
    }
    
    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public Conductor getConductor() {
        return this.conductor;
    }
    
    public void asignarConductor(PoolConductores conductor) {
        setConductor(conductor.asignarConductor());
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public int getPropina() {
        return  this.propina;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
}
