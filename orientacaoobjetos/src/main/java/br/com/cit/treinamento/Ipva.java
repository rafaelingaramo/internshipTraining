package br.com.cit.treinamento;

public class Ipva {
    public Double getIpvaFromVehicle(Vehicle vehicle) {
        Double ipva = vehicle.getValue() * 0.04;
        return ipva;
    }
}
