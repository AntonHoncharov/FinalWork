package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

public class SalesView {

    Scanner scanner;
    Product model;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        System.out.println("Please input name product: ");
        model.setName(Validator.validateName(scanner));

        System.out.println("Please input quantity product: ");
        model.setQuantity(Validator.validateQuantityInput(scanner));

        System.out.println("Please input price product: ");
        model.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
