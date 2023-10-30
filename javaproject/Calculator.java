package javaproject;

public interface Calculator<T extends Number> {
    double calculatorFees(T clubID);     
}
