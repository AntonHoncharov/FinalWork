import controllers.ProductController;
import models.Product;
import views.SalesView;

public class App {

    public static void main(String[] args) {

        Product product = new Product();
        SalesView salesView = new SalesView(product);
        ProductController productController = new ProductController(product, salesView);
        productController.runApp();
    }
}
