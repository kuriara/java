package EntregaDeEncomendas;

public class Rota {

    private double distanciaKm;
    private double pedagio;

    public Rota(double distanciaKm, double pedagio) {
        this.distanciaKm = distanciaKm;
        this.pedagio = pedagio;
    }

    public double custoBase() {
        if (distanciaKm <= 0) {
            return 0;
        }
        return distanciaKm * 1 + pedagio;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
