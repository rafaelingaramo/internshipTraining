package br.com.cit.treinamento;

public class Main {

    public static void main(String[] args) {

        Person john = new Person();
        john.setAge(20);
        john.setName("John");
        john.setSerasa(false);

        Vehicle marea = new Vehicle();
        marea.setName("Marea Bomba Teleguiada");
        marea.setValue(25000.00);

        VehicleInsurance insurance = new VehicleInsurance();
        final Double simulatedValue = insurance.doSimulation(john, marea);
        System.out.println(simulatedValue);
    }

}
