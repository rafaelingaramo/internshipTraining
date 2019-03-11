package br.com.cit.treinamento;

public class RiskAssessment {
    public Double getRiskPercentual(Person person) {
        Double risk = null;

        final Integer age = person.getAge();

        if (age < 18) {
            throw new RuntimeException("Condutor não habilitado");
        }

        if (age >= 18 && age < 26) {
            risk = 0.6;
        } else if (age >= 26 && age < 36) {
            risk = 0.4;
        } else if (age >= 36 && age < 50) {
            risk = 0.2;
        } else if (age >= 50) {
            risk = 0.95;
        }

        if (person.getSerasa()) {
            risk += 0.4;
        }

        return risk;
    }
}
