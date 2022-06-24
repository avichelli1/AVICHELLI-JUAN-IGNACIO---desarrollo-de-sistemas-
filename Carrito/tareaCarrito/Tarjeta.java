public class Tarjeta {
    private int numero;
    private String fechaVencimiento;
    private boolean verificada;

    public Tarjeta(int numero, String fechaVencimiento, boolean verificada) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.verificada = verificada;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isVerificada() {
        return this.verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }
}
