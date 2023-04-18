package Ejercicio2.Model;

import java.io.Serializable;

public class FuelPoints implements Serializable {
    public int Id;
    private String clientName;
    private int fuelPrice;
    private int ptsAccum;

    public FuelPoints(int id, String clientName, int fuelPrice, int ptsAccum) {
        Id = id;
        this.clientName = clientName;
        this.fuelPrice = fuelPrice;
        this.ptsAccum = ptsAccum;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public int getPtsAccum() {
        return ptsAccum;
    }

    public void setPtsAccum(int ptsAccum) {
        this.ptsAccum = ptsAccum;
    }

    @Override
    public String toString() {
        return "Id=" + Id + ", Client name=" + clientName + ", Fuel Price=" + fuelPrice + ", Total Points =" + ptsAccum + "]";
    }
}