
import java.util.*;
import javax.swing.ImageIcon;

public abstract class ProductService {

    public static ArrayList<Product> showAllProduct() {
        return ProductDao.getAllProducts();
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    public static boolean addProduct(Product product) {
        return ProductDao.addProduct(product);
    }

    public static void getInfo(String page) {
        ArrayList<Product> product = ProductService.showAllProduct();
        int i = 1;
        for (Product e : product) {
            Product product1 = ProductService.getProduct(e.getId());
            if (page.equals("1")) {
                if (i == 1) {
                    MainPage.lbl_Name1.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic1.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 2) {
                    MainPage.lbl_Name2.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic2.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 3) {
                    MainPage.lbl_Name3.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic3.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 4) {
                    MainPage.lbl_Name4.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic4.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 5) {
                    MainPage.lbl_Name5.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic5.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 6) {
                    MainPage.lbl_Name6.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic6.setIcon(new ImageIcon(e.getPicture()));

                }

            } else if (page.equals("2")) {
                if (i == 7) {
                    MainPage.lbl_Name1.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic1.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 8) {
                    MainPage.lbl_Name2.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic2.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 9) {
                    MainPage.lbl_Name3.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic3.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 10) {
                    MainPage.lbl_Name4.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic4.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 11) {
                    MainPage.lbl_Name5.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic5.setIcon(new ImageIcon(e.getPicture()));
                } else if (i == 12) {
                    MainPage.lbl_Name6.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic6.setIcon(new ImageIcon(e.getPicture()));

                }

            }
            i++;
        }
    }

//    public static void createNewBotton() {
//        if (MainPage.lbl_Page1.getForeground().equals("blue")) {
//            MainPage.btn_Detail1.setVisible(true);
//            MainPage.btn_Detail2.setVisible(true);
//            MainPage.btn_Detail3.setVisible(true);
//            MainPage.btn_Detail4.setVisible(true);
//            MainPage.btn_Detail5.setVisible(true);
//            MainPage.btn_Detail6.setVisible(true);
//            MainPage.btn_Detail7.setVisible(false);
//            MainPage.btn_Detail8.setVisible(false);
//            MainPage.btn_Detail9.setVisible(false);
//            MainPage.btn_Detail10.setVisible(false);
//            MainPage.btn_Detail11.setVisible(false);
//            MainPage.btn_Detail12.setVisible(false);
//        } else {
//            MainPage.btn_Detail1.setVisible(false);
//            MainPage.btn_Detail2.setVisible(false);
//            MainPage.btn_Detail3.setVisible(false);
//            MainPage.btn_Detail4.setVisible(false);
//            MainPage.btn_Detail5.setVisible(false);
//            MainPage.btn_Detail6.setVisible(false);
//            MainPage.btn_Detail7.setVisible(true);
//            MainPage.btn_Detail8.setVisible(true);
//            MainPage.btn_Detail9.setVisible(true);
//            MainPage.btn_Detail10.setVisible(true);
//            MainPage.btn_Detail11.setVisible(true);
//            MainPage.btn_Detail12.setVisible(true);
//        }
//    }
}
