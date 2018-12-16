
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProductDetailService {

    static String usercurrent;
    static String blue = "น้ำเงิน";
    static String gray = "เทา";
    static String red = "แดง";
    static String brown = "น้ำตาล";
    static String pink = "ชมพู";
    static String black = "ดำ";
    static String yellow = "เหลือง";

    public static void showProductDetail() {
        ProductDetailFrame productdetail = new ProductDetailFrame();
        productdetail.setVisible(true);
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    public static String changeEngtoThaiColor(String color) {
        if (color.equals("blue")) {
            return blue;
        } else if (color.equals("gray")) {
            return gray;
        } else if (color.equals("red")) {
            return red;
        } else if (color.equals("brown")) {
            return brown;
        } else if (color.equals("pink")) {
            return pink;
        } else if (color.equals("yellow")) {
            return yellow;
        }
        return black;
    }

    public static void getDetailProduct(Product pid) {

        String setcolor = changeEngtoThaiColor(pid.getColor());
        getPicture(pid);
        ProductDetailFrame.nameproduct.setText(pid.getName().toUpperCase());
        ProductDetailFrame.bandtxt.setText(pid.getBrand());
        ProductDetailFrame.colortxt.setText(setcolor);
        ProductDetailFrame.sizetxt.setText(pid.getColor());
        ProductDetailFrame.pricetxt.setText("" + pid.getPrice());

    }

    public static void getPicture(Product pid) {
        if (pid.getId().equals("S01")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S01");

        } else if (pid.getId().equals("S02")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S02");
        } else if (pid.getId().equals("S03")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S03");
        } else if (pid.getId().equals("S04")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S04");
        } else if (pid.getId().equals("S05")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S05");
        } else if (pid.getId().equals("S06")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S06");
        } else if (pid.getId().equals("S07")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S07");
        } else if (pid.getId().equals("S08")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S08");
        } else if (pid.getId().equals("S09")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S09");
        } else if (pid.getId().equals("S10")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S10");
        } else if (pid.getId().equals("S11")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S11");
        } else if (pid.getId().equals("S12")) {
            ProductDetailFrame.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailFrame.pIdtxt.setText("S12");
        }
    }

    public static void increaseNumofProduct() {
        int index = Integer.parseInt(ProductDetailFrame.numtxt.getText());
        index = index + 1;
        ProductDetailFrame.numtxt.setText("" + index);
    }

    public static void decreaseNumofProduct() {
        int index = Integer.parseInt(ProductDetailFrame.numtxt.getText());
        index = index - 1;
        if (index > 0) {
            ProductDetailFrame.numtxt.setText("" + index);
        }

    }

    public static void showComfirmProductToCart() {
        JOptionPane.showMessageDialog(null, "คุณได้ทำการเพิ่มสินค้าไปยังตะกร้าเรียบร้อยแล้ว");
        int index = JOptionPane.showConfirmDialog(null,
                "คุณต้องการไปยังหน้าตะกร้าสินค้าเลยหรือไม่ ??", "Go to Cart or Not?",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        showCartPage(index);
    }

    public static void showCartPage(int index) {
        if (index == 0) {
            CartService.showCartPage();
            CartService.showList();
        }

    }

    public static void addProductToCart() {
        usercurrent = LoginForm.userCurrent;
        User user = UserService.getUser(usercurrent);
        Product product = ProductService.getProduct(ProductDetailFrame.pIdtxt.getText());
        int num = Integer.parseInt(ProductDetailFrame.numtxt.getText());
//        System.out.println(user + " " + product + " " + num);
        CartService.addToCart(user, product, num);

    }

}
