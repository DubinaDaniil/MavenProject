package org.example;

public class PrintMyName {

    private String name;
    private String lastName;


    public PrintMyName(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PrintMyName{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
