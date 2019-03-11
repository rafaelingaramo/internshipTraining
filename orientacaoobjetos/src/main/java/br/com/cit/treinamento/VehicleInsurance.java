package br.com.cit.treinamento;

public class VehicleInsurance {
    public Double doSimulation(Person person, Vehicle vehicle) {
        Ipva ipva = new Ipva();
        final Double ipvaFromVehicle = ipva.getIpvaFromVehicle(vehicle);

        RiskAssessment riskAssessment = new RiskAssessment();
        final Double riskPercentual = riskAssessment.getRiskPercentual(person);

        Double riskValue = vehicle.getValue() * riskPercentual;
        Double returnValue = riskValue + (ipvaFromVehicle*0.6);

        return returnValue;
    }
}
