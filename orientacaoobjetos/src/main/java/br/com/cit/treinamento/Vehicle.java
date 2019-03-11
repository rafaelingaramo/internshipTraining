package br.com.cit.treinamento;

import java.util.Objects;

public class Vehicle {
    private Double value;
    private String name;

    public Vehicle(Double value, String name) {
        this.value = value;
        this.name = name;
    }

    public Vehicle() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(value, vehicle.value) &&
            Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
            "value=" + value +
            ", name='" + name + '\'' +
            '}';
    }
}
