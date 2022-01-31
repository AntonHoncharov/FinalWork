package models;

import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private final double taxRate = 0.05;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double incomeCalculation(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double taxCalculation(double income, double netIncome) {
        return income - netIncome;
    }

    @Override
    public double incomeCalculation(double income, double taxRate) {
        return income * taxRate;

    }
}
