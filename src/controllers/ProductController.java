package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        double income = Rounder.rounding(model.incomeCalculation(model.getQuantity(), model.getPrice()));
        double taxSum = Rounder.rounding(model.incomeCalculation(income, model.getTaxRate()));
        double netIncome = Rounder.rounding(model.taxCalculation(income, taxSum));

        String output = "Product name: " + model.getName() + "\n" +
                "Total income: " + income + "\n" +
                "Tax amount: " + taxSum + "\n" +
                "Net income: " + netIncome;

        view.getOutput(output);
    }
}
