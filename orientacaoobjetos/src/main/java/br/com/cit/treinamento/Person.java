package br.com.cit.treinamento;

import java.util.Objects;

public class Person {
    private Integer age;
    private Boolean serasa;
    private String name;

    public Person(Integer age, Boolean serasa, String name) {
        this.age = age;
        this.serasa = serasa;
        this.name = name;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSerasa() {
        return serasa;
    }

    public void setSerasa(Boolean serasa) {
        this.serasa = serasa;
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
        Person person = (Person) o;
        return Objects.equals(age, person.age) &&
            Objects.equals(serasa, person.serasa) &&
            Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, serasa, name);
    }

    @Override
    public String toString() {
        return "Person{" +
            "age=" + age +
            ", serasa=" + serasa +
            ", name='" + name + '\'' +
            '}';
    }
}
