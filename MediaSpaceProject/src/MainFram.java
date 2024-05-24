
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFram extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */
    
    private CentralUnit unit;
    private Branch branch;
   
    public MainFram() throws IOException {
    
        this.branch = new Branch();
        initializeUnit();
        initComponents();
        MenuPanel_1.setVisible(false);
        MenuPanel_2.setVisible(false);
        showNum1.setText("0");
        showNum2.setText("0");
        showNum3.setText("0");
        showNum4.setText("0");
        showNum5.setText("0");
        showNum6.setText("0");
        showNum7.setText("0");
        showNum8.setText("0");
        showNum9.setText("0");
        showNum10.setText("0");
        showNum11.setText("0");
        showNum12.setText("0");
        showNum13.setText("0");
        showNum14.setText("0");
        showNum15.setText("0");
        showNum16.setText("0");
        showNum17.setText("0");
        showNum18.setText("0");
        showNum19.setText("0");
        showNum20.setText("0");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                unit.saveUsers();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                unit.saveUsers();
            }
        });
        if (unit.activeUserIndex >= 0) {
            SignUpIcon.setVisible(false);
            LoginIcon.setText("Logout");
            GetStartedIcon.setVisible(false);
            GetStarted.setVisible(false);
        }
      
    }

    public MainFram(User u) throws IOException {
        
        this.branch = new Branch();
        initializeUnit();
        if (!unit.register(u)) {
            SignUpFrame su = new SignUpFrame();
            su.show();
            JOptionPane.showMessageDialog(this, "UserName is Alredy Used");
            SwingUtilities.invokeLater(() -> {
                dispose();
            });
        }
        else {
            initComponents();
            MenuPanel_1.setVisible(false);
            MenuPanel_2.setVisible(false);
            showNum1.setText("0");
            showNum2.setText("0");
            showNum3.setText("0");
            showNum4.setText("0");
            showNum5.setText("0");
            showNum6.setText("0");
            showNum7.setText("0");
            showNum8.setText("0");
            showNum9.setText("0");
            showNum10.setText("0");
            showNum11.setText("0");
            showNum12.setText("0");
            showNum13.setText("0");
            showNum14.setText("0");
            showNum15.setText("0");
            showNum16.setText("0");
            showNum17.setText("0");
            showNum18.setText("0");
            showNum19.setText("0");
            showNum20.setText("0");
            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    unit.saveUsers();
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    unit.saveUsers();
                }
            });
            if (unit.activeUserIndex >= 0) {
                SignUpIcon.setVisible(false);
                LoginIcon.setText("Logout");
                GetStartedIcon.setVisible(false);
                GetStarted.setVisible(false);

            }
        }
    }

    public MainFram(String userName, String password, boolean rememberMe) throws IOException {
        
        this.branch = new Branch();
        initializeUnit();
        int login = unit.login(userName, password, rememberMe);
        if (login == 2) {
            LoginFrame lf = new LoginFrame();
            lf.show();
            JOptionPane.showMessageDialog(this, "Wrong Password");
            SwingUtilities.invokeLater(() -> {
                dispose();
            });
        }
        else if (login == 3) {
            LoginFrame lf = new LoginFrame();
            lf.show();
            JOptionPane.showMessageDialog(this, "User Not Found");
            SwingUtilities.invokeLater(() -> {
                dispose();
            });
        }
        else {
            initComponents();
            MenuPanel_1.setVisible(false);
            MenuPanel_2.setVisible(false);
            showNum1.setText("0");
            showNum2.setText("0");
            showNum3.setText("0");
            showNum4.setText("0");
            showNum5.setText("0");
            showNum6.setText("0");
            showNum7.setText("0");
            showNum8.setText("0");
            showNum9.setText("0");
            showNum10.setText("0");
            showNum11.setText("0");
            showNum12.setText("0");
            showNum13.setText("0");
            showNum14.setText("0");
            showNum15.setText("0");
            showNum16.setText("0");
            showNum17.setText("0");
            showNum18.setText("0");
            showNum19.setText("0");
            showNum20.setText("0");
            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    unit.saveUsers();
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    unit.saveUsers();
                }
            });
            if (unit.activeUserIndex >= 0) {
                SignUpIcon.setVisible(false);
                LoginIcon.setText("Logout");
                GetStartedIcon.setVisible(false);
                GetStarted.setVisible(false);
            }
        }
    }
   
    private void initializeUnit() {
      
        try {
            unit = new CentralUnit();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error while initializing the program, may some files are not found " + e, "Error", JOptionPane.WARNING_MESSAGE); 
            System.exit(1);
        }
        
    }
    
    public void changePanel(JPanel panel) {

        mainLayeredPane.removeAll();
        mainLayeredPane.add(panel);
        mainLayeredPane.repaint();
        mainLayeredPane.revalidate();

    }

    public void changePanel2(JPanel panel) {

        spaceLayeredPane.removeAll();
        spaceLayeredPane.add(panel);
        spaceLayeredPane.repaint();
        spaceLayeredPane.revalidate();

    }

    public void changePanel3(JPanel panel) {

        pyramidLayeredPane3.removeAll();
        pyramidLayeredPane3.add(panel);
        pyramidLayeredPane3.repaint();
        pyramidLayeredPane3.revalidate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        CloseButton = new PanelRound();
        CloseIcon = new javax.swing.JLabel();
        logobg2 = new javax.swing.JLabel();
        logobg = new javax.swing.JLabel();
        BarBG = new javax.swing.JPanel();
        HomeButton = new javax.swing.JPanel();
        HomeIcon = new javax.swing.JLabel();
        SpacePharmacyButton = new javax.swing.JPanel();
        SpacePharmacyIcon = new javax.swing.JLabel();
        PyramidPharmacyButton = new javax.swing.JPanel();
        PyramidPharmacyIcon = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JPanel();
        SignUpIcon = new javax.swing.JLabel();
        LoginButton = new javax.swing.JPanel();
        LoginIcon = new javax.swing.JLabel();
        CartButton = new PanelRound();
        CartIcon = new javax.swing.JLabel();
        mainLayeredPane = new javax.swing.JLayeredPane();
        HomeContent = new javax.swing.JPanel();
        Line = new javax.swing.JPanel();
        WelcomeHome1 = new javax.swing.JLabel();
        WelcomeHome2 = new javax.swing.JLabel();
        WelcomeHome3 = new javax.swing.JLabel();
        WelcomeHome4 = new javax.swing.JLabel();
        GetStarted = new PanelRound();
        GetStartedIcon = new javax.swing.JLabel();
        HomeBackground = new javax.swing.JLabel();
        SpacePharmacyContent = new javax.swing.JPanel();
        Menu_1 = new RoundedPanel(25);
        menuLabel_1 = new javax.swing.JLabel();
        MenuPanel_1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        products_1 = new RoundedPanel(20);
        productsLabel_1 = new javax.swing.JLabel();
        aboutUs_1 = new RoundedPanel(20);
        aboutUs_label_1 = new javax.swing.JLabel();
        contact_1 = new RoundedPanel(20);
        contact_label_1 = new javax.swing.JLabel();
        sale_1 = new RoundedPanel(20);
        saleLabel_1 = new javax.swing.JLabel();
        spaceLayeredPane = new javax.swing.JLayeredPane();
        productsPanel_1 = new javax.swing.JPanel();
        ProductsTitle = new PanelRound();
        ProductsTitleIcon = new javax.swing.JLabel();
        LineSpace_1 = new javax.swing.JPanel();
        ProductsContainer = new PanelRound();
        productContainer7 = new PanelRound();
        ProductImage7 = new PanelRound();
        jLabel31 = new javax.swing.JLabel();
        Description7 = new PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        minus7 = new javax.swing.JLabel();
        plus8 = new javax.swing.JLabel();
        showNum7 = new javax.swing.JLabel();
        productContainer9 = new PanelRound();
        ProductImage9 = new PanelRound();
        jLabel29 = new javax.swing.JLabel();
        Description9 = new PanelRound();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        minus9 = new javax.swing.JLabel();
        plus10 = new javax.swing.JLabel();
        showNum9 = new javax.swing.JLabel();
        productContainer8 = new PanelRound();
        ProductImage8 = new PanelRound();
        jLabel30 = new javax.swing.JLabel();
        Description8 = new PanelRound();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        minus8 = new javax.swing.JLabel();
        plus9 = new javax.swing.JLabel();
        showNum8 = new javax.swing.JLabel();
        productContainer10 = new PanelRound();
        ProductImage10 = new PanelRound();
        jLabel28 = new javax.swing.JLabel();
        Description10 = new PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        minus10 = new javax.swing.JLabel();
        plus11 = new javax.swing.JLabel();
        showNum10 = new javax.swing.JLabel();
        productContainer6 = new PanelRound();
        ProductImage6 = new PanelRound();
        jLabel32 = new javax.swing.JLabel();
        Description6 = new PanelRound();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        minus6 = new javax.swing.JLabel();
        plus7 = new javax.swing.JLabel();
        showNum6 = new javax.swing.JLabel();
        productContainer5 = new PanelRound();
        ProductImage5 = new PanelRound();
        jLabel23 = new javax.swing.JLabel();
        Description5 = new PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        minus5 = new javax.swing.JLabel();
        plus6 = new javax.swing.JLabel();
        showNum5 = new javax.swing.JLabel();
        productContainer4 = new PanelRound();
        ProductImage4 = new PanelRound();
        jLabel24 = new javax.swing.JLabel();
        Description4 = new PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        minus4 = new javax.swing.JLabel();
        plus5 = new javax.swing.JLabel();
        showNum4 = new javax.swing.JLabel();
        productContainer3 = new PanelRound();
        ProductImage3 = new PanelRound();
        jLabel25 = new javax.swing.JLabel();
        Description3 = new PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        minus3 = new javax.swing.JLabel();
        plus4 = new javax.swing.JLabel();
        showNum3 = new javax.swing.JLabel();
        productContainer2 = new PanelRound();
        ProductImage2 = new PanelRound();
        jLabel26 = new javax.swing.JLabel();
        Description2 = new PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        minus2 = new javax.swing.JLabel();
        plus3 = new javax.swing.JLabel();
        showNum2 = new javax.swing.JLabel();
        productContainer1 = new PanelRound();
        ProductImage1 = new PanelRound();
        jLabel27 = new javax.swing.JLabel();
        Description1 = new PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        minus1 = new javax.swing.JLabel();
        plus2 = new javax.swing.JLabel();
        showNum1 = new javax.swing.JLabel();
        BigDealOffer = new PanelRound();
        BigDealOfferIcon = new javax.swing.JLabel();
        AddToCartButton15 = new PanelRound();
        AddToCartIcon15 = new javax.swing.JLabel();
        AddToCartWord15 = new javax.swing.JLabel();
        AddToCartButton13 = new PanelRound();
        AddToCartIcon13 = new javax.swing.JLabel();
        AddToCartWord13 = new javax.swing.JLabel();
        AddToCartButton16 = new PanelRound();
        AddToCartIcon16 = new javax.swing.JLabel();
        AddToCartWord16 = new javax.swing.JLabel();
        AddToCartButton17 = new PanelRound();
        AddToCartIcon17 = new javax.swing.JLabel();
        AddToCartWord17 = new javax.swing.JLabel();
        AddToCartButton18 = new PanelRound();
        AddToCartIcon18 = new javax.swing.JLabel();
        AddToCartWord18 = new javax.swing.JLabel();
        AddToCartButton19 = new PanelRound();
        AddToCartIcon19 = new javax.swing.JLabel();
        AddToCartWord19 = new javax.swing.JLabel();
        AddToCartButton20 = new PanelRound();
        AddToCartIcon20 = new javax.swing.JLabel();
        AddToCartWord20 = new javax.swing.JLabel();
        AddToCartButton21 = new PanelRound();
        AddToCartIcon21 = new javax.swing.JLabel();
        AddToCartWord21 = new javax.swing.JLabel();
        AddToCartButton22 = new PanelRound();
        AddToCartIcon22 = new javax.swing.JLabel();
        AddToCartWord22 = new javax.swing.JLabel();
        AddToCartButton23 = new PanelRound();
        AddToCartIcon23 = new javax.swing.JLabel();
        AddToCartWord23 = new javax.swing.JLabel();
        AddToCartButton14 = new PanelRound();
        AddToCartIcon14 = new javax.swing.JLabel();
        AddToCartWord14 = new javax.swing.JLabel();
        AddToCartButton24 = new PanelRound();
        AddToCartIcon24 = new javax.swing.JLabel();
        AddToCartWord24 = new javax.swing.JLabel();
        AddToCartButton5 = new PanelRound();
        AddToCartIcon5 = new javax.swing.JLabel();
        AddToCartWord5 = new javax.swing.JLabel();
        AddToCartButton4 = new PanelRound();
        AddToCartIcon4 = new javax.swing.JLabel();
        AddToCartWord4 = new javax.swing.JLabel();
        AddToCartButton6 = new PanelRound();
        AddToCartIcon6 = new javax.swing.JLabel();
        AddToCartWord6 = new javax.swing.JLabel();
        AddToCartButton7 = new PanelRound();
        AddToCartIcon7 = new javax.swing.JLabel();
        AddToCartWord7 = new javax.swing.JLabel();
        AddToCartButton8 = new PanelRound();
        AddToCartIcon8 = new javax.swing.JLabel();
        AddToCartWord8 = new javax.swing.JLabel();
        AddToCartButton9 = new PanelRound();
        AddToCartIcon9 = new javax.swing.JLabel();
        AddToCartWord9 = new javax.swing.JLabel();
        AddToCartButton10 = new PanelRound();
        AddToCartIcon10 = new javax.swing.JLabel();
        AddToCartWord10 = new javax.swing.JLabel();
        AddToCartButton11 = new PanelRound();
        AddToCartIcon11 = new javax.swing.JLabel();
        AddToCartWord11 = new javax.swing.JLabel();
        AddToCartButton12 = new PanelRound();
        AddToCartIcon12 = new javax.swing.JLabel();
        AddToCartWord12 = new javax.swing.JLabel();
        AddToCartButton3 = new PanelRound();
        AddToCartIcon3 = new javax.swing.JLabel();
        AddToCartWord3 = new javax.swing.JLabel();
        AddToCartButton2 = new PanelRound();
        AddToCartIcon2 = new javax.swing.JLabel();
        AddToCartWord2 = new javax.swing.JLabel();
        AddToCartButton1 = new PanelRound();
        AddToCartIcon1 = new javax.swing.JLabel();
        AddToCartWord1 = new javax.swing.JLabel();
        SpacePharmacyBackground_1 = new javax.swing.JLabel();
        aboutUsPanel_1 = new javax.swing.JPanel();
        LineSpace_3 = new javax.swing.JPanel();
        AboutUsBackground = new PanelRound();
        aboutUs = new javax.swing.JLabel();
        about1 = new javax.swing.JLabel();
        about2 = new javax.swing.JLabel();
        about3 = new javax.swing.JLabel();
        about4 = new javax.swing.JLabel();
        SpacePharmacyBackground_3 = new javax.swing.JLabel();
        contactPanel_1 = new javax.swing.JPanel();
        LineSpace_4 = new javax.swing.JPanel();
        Contact = new PanelRound();
        ContactUs = new javax.swing.JLabel();
        about6 = new javax.swing.JLabel();
        about7 = new javax.swing.JLabel();
        about8 = new javax.swing.JLabel();
        about9 = new javax.swing.JLabel();
        about10 = new javax.swing.JLabel();
        about11 = new javax.swing.JLabel();
        about12 = new javax.swing.JLabel();
        SpacePharmacyBackground_4 = new javax.swing.JLabel();
        salePanel_1 = new javax.swing.JPanel();
        LineSpace_2 = new javax.swing.JPanel();
        transparency = new javax.swing.JPanel();
        sorry = new javax.swing.JLabel();
        SpacePharmacyBackground_2 = new javax.swing.JLabel();
        PyramidPharmacyContent = new javax.swing.JPanel();
        Menu_2 = new RoundedPanel(25);
        menuLabel_2 = new javax.swing.JLabel();
        MenuPanel_2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        products_2 = new RoundedPanel(20);
        productsLabel_2 = new javax.swing.JLabel();
        aboutUs_2 = new RoundedPanel(20);
        aboutUs_label_2 = new javax.swing.JLabel();
        contact_2 = new RoundedPanel(20);
        contact_label_2 = new javax.swing.JLabel();
        sale_2 = new RoundedPanel(20);
        saleLabel_2 = new javax.swing.JLabel();
        pyramidLayeredPane3 = new javax.swing.JLayeredPane();
        productsPanel_2 = new javax.swing.JPanel();
        LinePyramid_1 = new javax.swing.JPanel();
        ProductsTitle1 = new PanelRound();
        ProductsTitleIcon1 = new javax.swing.JLabel();
        ProductsContainer1 = new PanelRound();
        productContainer11 = new PanelRound();
        ProductImage11 = new PanelRound();
        jLabel41 = new javax.swing.JLabel();
        Description11 = new PanelRound();
        pr11 = new javax.swing.JLabel();
        price11 = new javax.swing.JLabel();
        minus11 = new javax.swing.JLabel();
        plus12 = new javax.swing.JLabel();
        showNum11 = new javax.swing.JLabel();
        productContainer12 = new PanelRound();
        ProductImage12 = new PanelRound();
        jLabel39 = new javax.swing.JLabel();
        Description12 = new PanelRound();
        pr12 = new javax.swing.JLabel();
        price12 = new javax.swing.JLabel();
        minus12 = new javax.swing.JLabel();
        plus13 = new javax.swing.JLabel();
        showNum12 = new javax.swing.JLabel();
        productContainer13 = new PanelRound();
        ProductImage13 = new PanelRound();
        jLabel40 = new javax.swing.JLabel();
        Description13 = new PanelRound();
        pr13 = new javax.swing.JLabel();
        price13 = new javax.swing.JLabel();
        minus13 = new javax.swing.JLabel();
        plus14 = new javax.swing.JLabel();
        showNum13 = new javax.swing.JLabel();
        productContainer14 = new PanelRound();
        ProductImage14 = new PanelRound();
        jLabel38 = new javax.swing.JLabel();
        Description14 = new PanelRound();
        pr14 = new javax.swing.JLabel();
        price14 = new javax.swing.JLabel();
        minus14 = new javax.swing.JLabel();
        plus15 = new javax.swing.JLabel();
        showNum14 = new javax.swing.JLabel();
        productContainer15 = new PanelRound();
        ProductImage15 = new PanelRound();
        jLabel42 = new javax.swing.JLabel();
        Description15 = new PanelRound();
        pr15 = new javax.swing.JLabel();
        price15 = new javax.swing.JLabel();
        minus15 = new javax.swing.JLabel();
        plus16 = new javax.swing.JLabel();
        showNum15 = new javax.swing.JLabel();
        productContainer16 = new PanelRound();
        ProductImage16 = new PanelRound();
        jLabel33 = new javax.swing.JLabel();
        Description16 = new PanelRound();
        pr16 = new javax.swing.JLabel();
        price16 = new javax.swing.JLabel();
        minus16 = new javax.swing.JLabel();
        plus17 = new javax.swing.JLabel();
        showNum16 = new javax.swing.JLabel();
        productContainer17 = new PanelRound();
        ProductImage17 = new PanelRound();
        jLabel34 = new javax.swing.JLabel();
        Description17 = new PanelRound();
        pr17 = new javax.swing.JLabel();
        price17 = new javax.swing.JLabel();
        minus17 = new javax.swing.JLabel();
        plus18 = new javax.swing.JLabel();
        showNum17 = new javax.swing.JLabel();
        productContainer18 = new PanelRound();
        ProductImage18 = new PanelRound();
        jLabel35 = new javax.swing.JLabel();
        Description18 = new PanelRound();
        pr18 = new javax.swing.JLabel();
        price18 = new javax.swing.JLabel();
        minus18 = new javax.swing.JLabel();
        plus19 = new javax.swing.JLabel();
        showNum18 = new javax.swing.JLabel();
        productContainer19 = new PanelRound();
        ProductImage19 = new PanelRound();
        jLabel36 = new javax.swing.JLabel();
        Description19 = new PanelRound();
        pr19 = new javax.swing.JLabel();
        price19 = new javax.swing.JLabel();
        minus19 = new javax.swing.JLabel();
        plus20 = new javax.swing.JLabel();
        showNum19 = new javax.swing.JLabel();
        productContainer20 = new PanelRound();
        ProductImage20 = new PanelRound();
        jLabel37 = new javax.swing.JLabel();
        Description20 = new PanelRound();
        pr20 = new javax.swing.JLabel();
        price20 = new javax.swing.JLabel();
        minus20 = new javax.swing.JLabel();
        plus21 = new javax.swing.JLabel();
        showNum20 = new javax.swing.JLabel();
        BigDealOffer1 = new PanelRound();
        BigDealOfferIcon1 = new javax.swing.JLabel();
        AddToCartButton25 = new PanelRound();
        AddToCartIcon25 = new javax.swing.JLabel();
        AddToCartWord25 = new javax.swing.JLabel();
        AddToCartButton26 = new PanelRound();
        AddToCartIcon26 = new javax.swing.JLabel();
        AddToCartWord26 = new javax.swing.JLabel();
        AddToCartButton27 = new PanelRound();
        AddToCartIcon27 = new javax.swing.JLabel();
        AddToCartWord27 = new javax.swing.JLabel();
        AddToCartButton28 = new PanelRound();
        AddToCartIcon28 = new javax.swing.JLabel();
        AddToCartWord28 = new javax.swing.JLabel();
        AddToCartButton29 = new PanelRound();
        AddToCartIcon29 = new javax.swing.JLabel();
        AddToCartWord29 = new javax.swing.JLabel();
        AddToCartButton30 = new PanelRound();
        AddToCartIcon30 = new javax.swing.JLabel();
        AddToCartWord30 = new javax.swing.JLabel();
        AddToCartButton31 = new PanelRound();
        AddToCartIcon31 = new javax.swing.JLabel();
        AddToCartWord31 = new javax.swing.JLabel();
        AddToCartButton32 = new PanelRound();
        AddToCartIcon32 = new javax.swing.JLabel();
        AddToCartWord32 = new javax.swing.JLabel();
        AddToCartButton33 = new PanelRound();
        AddToCartIcon33 = new javax.swing.JLabel();
        AddToCartWord33 = new javax.swing.JLabel();
        AddToCartButton34 = new PanelRound();
        AddToCartIcon34 = new javax.swing.JLabel();
        AddToCartWord34 = new javax.swing.JLabel();
        AddToCartButton35 = new PanelRound();
        AddToCartIcon35 = new javax.swing.JLabel();
        AddToCartWord35 = new javax.swing.JLabel();
        AddToCartButton36 = new PanelRound();
        AddToCartIcon36 = new javax.swing.JLabel();
        AddToCartWord36 = new javax.swing.JLabel();
        AddToCartButton37 = new PanelRound();
        AddToCartIcon37 = new javax.swing.JLabel();
        AddToCartWord37 = new javax.swing.JLabel();
        AddToCartButton38 = new PanelRound();
        AddToCartIcon38 = new javax.swing.JLabel();
        AddToCartWord38 = new javax.swing.JLabel();
        AddToCartButton39 = new PanelRound();
        AddToCartIcon39 = new javax.swing.JLabel();
        AddToCartWord39 = new javax.swing.JLabel();
        AddToCartButton40 = new PanelRound();
        AddToCartIcon40 = new javax.swing.JLabel();
        AddToCartWord40 = new javax.swing.JLabel();
        AddToCartButton41 = new PanelRound();
        AddToCartIcon41 = new javax.swing.JLabel();
        AddToCartWord41 = new javax.swing.JLabel();
        AddToCartButton42 = new PanelRound();
        AddToCartIcon42 = new javax.swing.JLabel();
        AddToCartWord42 = new javax.swing.JLabel();
        AddToCartButton43 = new PanelRound();
        AddToCartIcon43 = new javax.swing.JLabel();
        AddToCartWord43 = new javax.swing.JLabel();
        AddToCartButton44 = new PanelRound();
        AddToCartIcon44 = new javax.swing.JLabel();
        AddToCartWord44 = new javax.swing.JLabel();
        AddToCartButton45 = new PanelRound();
        AddToCartIcon45 = new javax.swing.JLabel();
        AddToCartWord45 = new javax.swing.JLabel();
        AddToCartButton46 = new PanelRound();
        AddToCartIcon46 = new javax.swing.JLabel();
        AddToCartWord46 = new javax.swing.JLabel();
        AddToCartButton47 = new PanelRound();
        AddToCartIcon47 = new javax.swing.JLabel();
        AddToCartWord47 = new javax.swing.JLabel();
        AddToCartButton48 = new PanelRound();
        AddToCartIcon48 = new javax.swing.JLabel();
        AddToCartWord48 = new javax.swing.JLabel();
        SpacePharmacyBackground_5 = new javax.swing.JLabel();
        aboutUsPanel_2 = new javax.swing.JPanel();
        LinePyramid_2 = new javax.swing.JPanel();
        AboutUsBackground2 = new PanelRound();
        aboutUs2 = new javax.swing.JLabel();
        AboutUsBackground1 = new PanelRound();
        aboutUs1 = new javax.swing.JLabel();
        about14 = new javax.swing.JLabel();
        about15 = new javax.swing.JLabel();
        about16 = new javax.swing.JLabel();
        about17 = new javax.swing.JLabel();
        SpacePharmacyBackground_6 = new javax.swing.JLabel();
        contactPanel_2 = new javax.swing.JPanel();
        LinePyramid_3 = new javax.swing.JPanel();
        Contact1 = new PanelRound();
        ContactUs1 = new javax.swing.JLabel();
        about18 = new javax.swing.JLabel();
        about19 = new javax.swing.JLabel();
        about20 = new javax.swing.JLabel();
        about21 = new javax.swing.JLabel();
        about22 = new javax.swing.JLabel();
        about23 = new javax.swing.JLabel();
        about24 = new javax.swing.JLabel();
        SpacePharmacyBackground_7 = new javax.swing.JLabel();
        salePanel_2 = new javax.swing.JPanel();
        LinePyramid_4 = new javax.swing.JPanel();
        transparency1 = new javax.swing.JPanel();
        sorry1 = new javax.swing.JLabel();
        SpacePharmacyBackground_8 = new javax.swing.JLabel();
        SignUpContent = new javax.swing.JPanel();
        LoginContent = new javax.swing.JPanel();
        CartContent = new javax.swing.JPanel();
        AddToCartButton49 = new PanelRound();
        AddToCartWord49 = new javax.swing.JLabel();
        AddToCartIcon49 = new javax.swing.JLabel();
        WelcomeHome5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        price = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        buy = new javax.swing.JTextArea();
        HomeBackground1 = new javax.swing.JLabel();
        salePanel_3 = new javax.swing.JPanel();
        LineSpace_5 = new javax.swing.JPanel();
        transparency2 = new javax.swing.JPanel();
        sorry2 = new javax.swing.JLabel();
        SpacePharmacyBackground_9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 45));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-removebg-preview.png"))); // NOI18N
        mainTitle.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 210, 98));

        CloseButton.setBackground(new java.awt.Color(102, 0, 0));
        CloseButton.setRoundBottomLeft(15);
        CloseButton.setRoundBottomRight(15);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });

        CloseIcon.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        CloseIcon.setForeground(new java.awt.Color(255, 255, 255));
        CloseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseIcon.setText("X");
        CloseIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CloseButtonLayout = new javax.swing.GroupLayout(CloseButton);
        CloseButton.setLayout(CloseButtonLayout);
        CloseButtonLayout.setHorizontalGroup(
            CloseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CloseIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        CloseButtonLayout.setVerticalGroup(
            CloseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseButtonLayout.createSequentialGroup()
                .addComponent(CloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainTitle.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 40, 30));

        logobg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoBackground.png"))); // NOI18N
        mainTitle.add(logobg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 730, 150));

        logobg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoBackground.png"))); // NOI18N
        mainTitle.add(logobg, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, -10, 570, 130));

        getContentPane().add(mainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 108));

        BarBG.setBackground(new java.awt.Color(1, 62, 125));
        BarBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(1, 62, 125));
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-26.png"))); // NOI18N
        HomeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeIconMouseExited(evt);
            }
        });
        HomeButton.add(HomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 1, 180, 60));

        BarBG.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SpacePharmacyButton.setBackground(new java.awt.Color(1, 62, 125));
        SpacePharmacyButton.setForeground(new java.awt.Color(255, 255, 255));
        SpacePharmacyButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpacePharmacyIcon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        SpacePharmacyIcon.setForeground(new java.awt.Color(255, 255, 255));
        SpacePharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpacePharmacyIcon.setText("Space Parmachy");
        SpacePharmacyIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpacePharmacyIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SpacePharmacyIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SpacePharmacyIconMouseExited(evt);
            }
        });
        SpacePharmacyButton.add(SpacePharmacyIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        BarBG.add(SpacePharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 60));

        PyramidPharmacyButton.setBackground(new java.awt.Color(1, 62, 125));
        PyramidPharmacyButton.setForeground(new java.awt.Color(255, 255, 255));
        PyramidPharmacyButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PyramidPharmacyIcon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        PyramidPharmacyIcon.setForeground(new java.awt.Color(255, 255, 255));
        PyramidPharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PyramidPharmacyIcon.setText("Pyramid Pharmacy");
        PyramidPharmacyIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PyramidPharmacyIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PyramidPharmacyIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PyramidPharmacyIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PyramidPharmacyIconMouseExited(evt);
            }
        });
        PyramidPharmacyButton.add(PyramidPharmacyIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        BarBG.add(PyramidPharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 60));

        SignUpButton.setBackground(new java.awt.Color(1, 62, 125));
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpIcon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        SignUpIcon.setForeground(new java.awt.Color(255, 255, 255));
        SignUpIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpIcon.setText("Sign Up");
        SignUpIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpIconMouseExited(evt);
            }
        });
        SignUpButton.add(SignUpIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        BarBG.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 110, 60));

        LoginButton.setBackground(new java.awt.Color(1, 62, 125));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginIcon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LoginIcon.setForeground(new java.awt.Color(255, 255, 255));
        LoginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginIcon.setText("Login");
        LoginIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginIconMouseExited(evt);
            }
        });
        LoginButton.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        BarBG.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 100, 60));

        CartButton.setBackground(new java.awt.Color(255, 255, 255));
        CartButton.setRoundBottomLeft(60);
        CartButton.setRoundBottomRight(60);
        CartButton.setRoundTopLeft(60);
        CartButton.setRoundTopRight(60);
        CartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartButtonMouseClicked(evt);
            }
        });

        CartIcon.setBackground(new java.awt.Color(255, 255, 255));
        CartIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cart-30.png"))); // NOI18N
        CartIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CartIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CartIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CartButtonLayout = new javax.swing.GroupLayout(CartButton);
        CartButton.setLayout(CartButtonLayout);
        CartButtonLayout.setHorizontalGroup(
            CartButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        CartButtonLayout.setVerticalGroup(
            CartButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        BarBG.add(CartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 60, 60));

        getContentPane().add(BarBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1300, -1));

        mainLayeredPane.setLayout(new java.awt.CardLayout());

        HomeContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Line.setBackground(new java.awt.Color(8, 34, 4));
        Line.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        HomeContent.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 10));

        WelcomeHome1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        WelcomeHome1.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeHome1.setText("Welcome to MediScape. Your health matters to us.");
        HomeContent.add(WelcomeHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 440, 30));

        WelcomeHome2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        WelcomeHome2.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeHome2.setText(" Trust our expert pharmacists for personalized care, ");
        HomeContent.add(WelcomeHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 280, 420, 20));

        WelcomeHome3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        WelcomeHome3.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeHome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeHome3.setText("convenient services, and quality products. Explore");
        HomeContent.add(WelcomeHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 440, -1));

        WelcomeHome4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        WelcomeHome4.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeHome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeHome4.setText(" our site for all your health needs.");
        HomeContent.add(WelcomeHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 320, 520, -1));

        GetStarted.setBackground(new java.awt.Color(1, 61, 123));
        GetStarted.setRoundBottomRight(60);
        GetStarted.setRoundTopLeft(60);

        GetStartedIcon.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        GetStartedIcon.setForeground(new java.awt.Color(255, 255, 255));
        GetStartedIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GetStartedIcon.setText("Get Started");
        GetStartedIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GetStartedIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetStartedIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GetStartedIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GetStartedIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GetStartedLayout = new javax.swing.GroupLayout(GetStarted);
        GetStarted.setLayout(GetStartedLayout);
        GetStartedLayout.setHorizontalGroup(
            GetStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GetStartedIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        GetStartedLayout.setVerticalGroup(
            GetStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GetStartedLayout.createSequentialGroup()
                .addComponent(GetStartedIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        HomeContent.add(GetStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 160, 40));

        HomeBackground.setBackground(new java.awt.Color(255, 255, 255));
        HomeBackground.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        HomeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PharmacyHomePageContent.png"))); // NOI18N
        HomeContent.add(HomeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        mainLayeredPane.add(HomeContent, "card7");

        SpacePharmacyContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_1.setBackground(new java.awt.Color(255, 255, 255));
        Menu_1.setForeground(new java.awt.Color(0, 0, 0));
        Menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_1MouseClicked(evt);
            }
        });
        Menu_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel_1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        menuLabel_1.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-menu-40.png"))); // NOI18N
        menuLabel_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabel_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuLabel_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuLabel_1MouseExited(evt);
            }
        });
        Menu_1.add(menuLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        SpacePharmacyContent.add(Menu_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
        Menu_1.setOpaque(false);

        MenuPanel_1.setBackground(new java.awt.Color(242, 247, 247));
        MenuPanel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-removebg-preview.png"))); // NOI18N
        MenuPanel_1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 210, 100));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("_________________________________________");
        MenuPanel_1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, -1));

        products_1.setBackground(new java.awt.Color(0, 0, 0));
        products_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        products_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productsLabel_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        productsLabel_1.setForeground(new java.awt.Color(255, 255, 255));
        productsLabel_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsLabel_1.setText("Products");
        productsLabel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsLabel_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsLabel_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsLabel_1MouseExited(evt);
            }
        });
        products_1.add(productsLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        MenuPanel_1.add(products_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 30));
        products_1.setOpaque(false);

        aboutUs_1.setBackground(new java.awt.Color(0, 0, 0));
        aboutUs_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutUs_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutUs_label_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        aboutUs_label_1.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs_label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUs_label_1.setText("About Us");
        aboutUs_label_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUs_label_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutUs_label_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutUs_label_1MouseExited(evt);
            }
        });
        aboutUs_1.add(aboutUs_label_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        MenuPanel_1.add(aboutUs_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 30));
        aboutUs_1.setOpaque(false);

        contact_1.setBackground(new java.awt.Color(0, 0, 0));
        contact_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        contact_label_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        contact_label_1.setForeground(new java.awt.Color(255, 255, 255));
        contact_label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact_label_1.setText("Contact");
        contact_label_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_label_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_label_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_label_1MouseExited(evt);
            }
        });
        contact_label_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contact_label_1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout contact_1Layout = new javax.swing.GroupLayout(contact_1);
        contact_1.setLayout(contact_1Layout);
        contact_1Layout.setHorizontalGroup(
            contact_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contact_label_1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        contact_1Layout.setVerticalGroup(
            contact_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contact_label_1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuPanel_1.add(contact_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));
        contact_1.setOpaque(false);

        sale_1.setBackground(new java.awt.Color(0, 0, 0));
        sale_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        saleLabel_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        saleLabel_1.setForeground(new java.awt.Color(255, 255, 255));
        saleLabel_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleLabel_1.setText("Sales");
        saleLabel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleLabel_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleLabel_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleLabel_1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout sale_1Layout = new javax.swing.GroupLayout(sale_1);
        sale_1.setLayout(sale_1Layout);
        sale_1Layout.setHorizontalGroup(
            sale_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleLabel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        sale_1Layout.setVerticalGroup(
            sale_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleLabel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuPanel_1.add(sale_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 30));
        sale_1.setOpaque(false);

        SpacePharmacyContent.add(MenuPanel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 570));

        spaceLayeredPane.setLayout(new java.awt.CardLayout());

        productsPanel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductsTitle.setBackground(new java.awt.Color(0, 0, 0));
        ProductsTitle.setRoundTopLeft(40);
        ProductsTitle.setRoundTopRight(40);
        ProductsTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductsTitleIcon.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ProductsTitleIcon.setForeground(new java.awt.Color(255, 255, 255));
        ProductsTitleIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductsTitleIcon.setText("Products");
        ProductsTitle.add(ProductsTitleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        productsPanel_1.add(ProductsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 190, 40));

        LineSpace_1.setBackground(new java.awt.Color(8, 34, 4));
        productsPanel_1.add(LineSpace_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, -1));

        ProductsContainer.setBackground(new java.awt.Color(0, 0, 0));
        ProductsContainer.setRoundBottomLeft(80);
        ProductsContainer.setRoundBottomRight(80);
        ProductsContainer.setRoundTopLeft(80);
        ProductsContainer.setRoundTopRight(80);
        ProductsContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productContainer7.setBackground(new java.awt.Color(255, 255, 255));
        productContainer7.setRoundBottomLeft(40);
        productContainer7.setRoundBottomRight(40);
        productContainer7.setRoundTopLeft(40);
        productContainer7.setRoundTopRight(40);
        productContainer7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage7.setRoundTopLeft(20);
        ProductImage7.setRoundTopRight(20);
        ProductImage7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/children.png"))); // NOI18N
        ProductImage7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer7.add(ProductImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description7.setRoundBottomLeft(30);
        Description7.setRoundBottomRight(30);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel19.setText("MeganChildren");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("239");

        javax.swing.GroupLayout Description7Layout = new javax.swing.GroupLayout(Description7);
        Description7.setLayout(Description7Layout);
        Description7Layout.setHorizontalGroup(
            Description7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Description7Layout.setVerticalGroup(
            Description7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap())
        );

        productContainer7.add(Description7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus7MouseClicked(evt);
            }
        });
        productContainer7.add(minus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus8MouseClicked(evt);
            }
        });
        productContainer7.add(plus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum7.setForeground(new java.awt.Color(0, 0, 0));
        showNum7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer7.add(showNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 160, 190));

        productContainer9.setBackground(new java.awt.Color(255, 255, 255));
        productContainer9.setRoundBottomLeft(40);
        productContainer9.setRoundBottomRight(40);
        productContainer9.setRoundTopLeft(40);
        productContainer9.setRoundTopRight(40);
        productContainer9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage9.setRoundTopLeft(20);
        ProductImage9.setRoundTopRight(20);
        ProductImage9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sinupret.png"))); // NOI18N
        ProductImage9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer9.add(ProductImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description9.setRoundBottomLeft(30);
        Description9.setRoundBottomRight(30);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setText("Sinupret");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("80");

        javax.swing.GroupLayout Description9Layout = new javax.swing.GroupLayout(Description9);
        Description9.setLayout(Description9Layout);
        Description9Layout.setHorizontalGroup(
            Description9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Description9Layout.setVerticalGroup(
            Description9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer9.add(Description9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus9MouseClicked(evt);
            }
        });
        productContainer9.add(minus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus10MouseClicked(evt);
            }
        });
        productContainer9.add(plus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum9.setForeground(new java.awt.Color(0, 0, 0));
        showNum9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer9.add(showNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 160, 190));

        productContainer8.setBackground(new java.awt.Color(255, 255, 255));
        productContainer8.setRoundBottomLeft(40);
        productContainer8.setRoundBottomRight(40);
        productContainer8.setRoundTopLeft(40);
        productContainer8.setRoundTopRight(40);
        productContainer8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage8.setRoundTopLeft(20);
        ProductImage8.setRoundTopRight(20);
        ProductImage8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/solvazinc.png"))); // NOI18N
        ProductImage8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer8.add(ProductImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description8.setRoundBottomLeft(30);
        Description8.setRoundBottomRight(30);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setText("Solvazinc");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("18");

        javax.swing.GroupLayout Description8Layout = new javax.swing.GroupLayout(Description8);
        Description8.setLayout(Description8Layout);
        Description8Layout.setHorizontalGroup(
            Description8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Description8Layout.setVerticalGroup(
            Description8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer8.add(Description8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus8MouseClicked(evt);
            }
        });
        productContainer8.add(minus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus9MouseClicked(evt);
            }
        });
        productContainer8.add(plus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum8.setForeground(new java.awt.Color(0, 0, 0));
        showNum8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer8.add(showNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 190));

        productContainer10.setBackground(new java.awt.Color(255, 255, 255));
        productContainer10.setRoundBottomLeft(40);
        productContainer10.setRoundBottomRight(40);
        productContainer10.setRoundTopLeft(40);
        productContainer10.setRoundTopRight(40);
        productContainer10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage10.setRoundTopLeft(20);
        ProductImage10.setRoundTopRight(20);
        ProductImage10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/asma.png"))); // NOI18N
        ProductImage10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer10.add(ProductImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description10.setRoundBottomLeft(30);
        Description10.setRoundBottomRight(30);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Asmakast");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("62.9");

        javax.swing.GroupLayout Description10Layout = new javax.swing.GroupLayout(Description10);
        Description10.setLayout(Description10Layout);
        Description10Layout.setHorizontalGroup(
            Description10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Description10Layout.setVerticalGroup(
            Description10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        productContainer10.add(Description10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus10MouseClicked(evt);
            }
        });
        productContainer10.add(minus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus11MouseClicked(evt);
            }
        });
        productContainer10.add(plus11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum10.setForeground(new java.awt.Color(0, 0, 0));
        showNum10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer10.add(showNum10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 190));

        productContainer6.setBackground(new java.awt.Color(255, 255, 255));
        productContainer6.setRoundBottomLeft(40);
        productContainer6.setRoundBottomRight(40);
        productContainer6.setRoundTopLeft(40);
        productContainer6.setRoundTopRight(40);
        productContainer6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage6.setRoundTopLeft(20);
        ProductImage6.setRoundTopRight(20);
        ProductImage6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maxslim.png"))); // NOI18N
        ProductImage6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer6.add(ProductImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description6.setRoundBottomLeft(30);
        Description6.setRoundBottomRight(30);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel21.setText("MaxSlim");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("250");

        javax.swing.GroupLayout Description6Layout = new javax.swing.GroupLayout(Description6);
        Description6.setLayout(Description6Layout);
        Description6Layout.setHorizontalGroup(
            Description6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        Description6Layout.setVerticalGroup(
            Description6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        productContainer6.add(Description6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus6MouseClicked(evt);
            }
        });
        productContainer6.add(minus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus7MouseClicked(evt);
            }
        });
        productContainer6.add(plus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum6.setForeground(new java.awt.Color(0, 0, 0));
        showNum6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer6.add(showNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 160, 190));

        productContainer5.setBackground(new java.awt.Color(255, 255, 255));
        productContainer5.setRoundBottomLeft(40);
        productContainer5.setRoundBottomRight(40);
        productContainer5.setRoundTopLeft(40);
        productContainer5.setRoundTopRight(40);
        productContainer5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage5.setRoundTopLeft(20);
        ProductImage5.setRoundTopRight(20);
        ProductImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/panadol.png"))); // NOI18N
        ProductImage5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer5.add(ProductImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description5.setRoundBottomLeft(30);
        Description5.setRoundBottomRight(30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Panadol");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("31");

        javax.swing.GroupLayout Description5Layout = new javax.swing.GroupLayout(Description5);
        Description5.setLayout(Description5Layout);
        Description5Layout.setHorizontalGroup(
            Description5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Description5Layout.setVerticalGroup(
            Description5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer5.add(Description5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus5MouseClicked(evt);
            }
        });
        productContainer5.add(minus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus6MouseClicked(evt);
            }
        });
        productContainer5.add(plus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum5.setForeground(new java.awt.Color(0, 0, 0));
        showNum5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer5.add(showNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 190));

        productContainer4.setBackground(new java.awt.Color(255, 255, 255));
        productContainer4.setRoundBottomLeft(40);
        productContainer4.setRoundBottomRight(40);
        productContainer4.setRoundTopLeft(40);
        productContainer4.setRoundTopRight(40);
        productContainer4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage4.setRoundTopLeft(20);
        ProductImage4.setRoundTopRight(20);
        ProductImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/brufen.png"))); // NOI18N
        ProductImage4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer4.add(ProductImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description4.setRoundBottomLeft(30);
        Description4.setRoundBottomRight(30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Brufen");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("50.90");

        javax.swing.GroupLayout Description4Layout = new javax.swing.GroupLayout(Description4);
        Description4.setLayout(Description4Layout);
        Description4Layout.setHorizontalGroup(
            Description4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        Description4Layout.setVerticalGroup(
            Description4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        productContainer4.add(Description4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus4MouseClicked(evt);
            }
        });
        productContainer4.add(minus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus5MouseClicked(evt);
            }
        });
        productContainer4.add(plus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum4.setForeground(new java.awt.Color(0, 0, 0));
        showNum4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer4.add(showNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 160, 190));

        productContainer3.setBackground(new java.awt.Color(255, 255, 255));
        productContainer3.setRoundBottomLeft(40);
        productContainer3.setRoundBottomRight(40);
        productContainer3.setRoundTopLeft(40);
        productContainer3.setRoundTopRight(40);
        productContainer3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage3.setRoundTopLeft(20);
        ProductImage3.setRoundTopRight(20);
        ProductImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/detol.png"))); // NOI18N
        ProductImage3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer3.add(ProductImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description3.setRoundBottomLeft(30);
        Description3.setRoundBottomRight(30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Dettol");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("50");

        javax.swing.GroupLayout Description3Layout = new javax.swing.GroupLayout(Description3);
        Description3.setLayout(Description3Layout);
        Description3Layout.setHorizontalGroup(
            Description3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        Description3Layout.setVerticalGroup(
            Description3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        productContainer3.add(Description3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus3MouseClicked(evt);
            }
        });
        productContainer3.add(minus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus4MouseClicked(evt);
            }
        });
        productContainer3.add(plus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum3.setForeground(new java.awt.Color(0, 0, 0));
        showNum3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer3.add(showNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 160, 190));

        productContainer2.setBackground(new java.awt.Color(255, 255, 255));
        productContainer2.setRoundBottomLeft(40);
        productContainer2.setRoundBottomRight(40);
        productContainer2.setRoundTopLeft(40);
        productContainer2.setRoundTopRight(40);
        productContainer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage2.setRoundTopLeft(20);
        ProductImage2.setRoundTopRight(20);
        ProductImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deltactiv.png"))); // NOI18N
        ProductImage2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer2.add(ProductImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description2.setRoundBottomLeft(30);
        Description2.setRoundBottomRight(30);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Deltaclav");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("39.75");

        javax.swing.GroupLayout Description2Layout = new javax.swing.GroupLayout(Description2);
        Description2.setLayout(Description2Layout);
        Description2Layout.setHorizontalGroup(
            Description2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Description2Layout.setVerticalGroup(
            Description2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer2.add(Description2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus2MouseClicked(evt);
            }
        });
        productContainer2.add(minus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus3MouseClicked(evt);
            }
        });
        productContainer2.add(plus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum2.setForeground(new java.awt.Color(0, 0, 0));
        showNum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer2.add(showNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 160, 190));

        productContainer1.setBackground(new java.awt.Color(255, 255, 255));
        productContainer1.setRoundBottomLeft(40);
        productContainer1.setRoundBottomRight(40);
        productContainer1.setRoundTopLeft(40);
        productContainer1.setRoundTopRight(40);
        productContainer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage1.setRoundTopLeft(20);
        ProductImage1.setRoundTopRight(20);
        ProductImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lanzo.png"))); // NOI18N
        ProductImage1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer1.add(ProductImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description1.setRoundBottomLeft(30);
        Description1.setRoundBottomRight(30);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Lanzofutal");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("22.2");

        javax.swing.GroupLayout Description1Layout = new javax.swing.GroupLayout(Description1);
        Description1.setLayout(Description1Layout);
        Description1Layout.setHorizontalGroup(
            Description1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Description1Layout.setVerticalGroup(
            Description1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer1.add(Description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, -1));

        minus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus1MouseClicked(evt);
            }
        });
        productContainer1.add(minus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus2MouseClicked(evt);
            }
        });
        productContainer1.add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum1.setForeground(new java.awt.Color(0, 0, 0));
        showNum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer1.add(showNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer.add(productContainer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 160, 190));

        BigDealOffer.setBackground(new java.awt.Color(255, 255, 255));
        BigDealOffer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BigDealOffer.setRoundBottomRight(80);
        BigDealOffer.setRoundTopRight(80);
        BigDealOffer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BigDealOfferIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BigDealOfferIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-offer-100.png"))); // NOI18N
        BigDealOfferIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BigDealOfferIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BigDealOfferIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BigDealOfferIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BigDealOfferIconMouseExited(evt);
            }
        });
        BigDealOffer.add(BigDealOfferIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 1, 90, 398));

        ProductsContainer.add(BigDealOffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 400));

        AddToCartButton15.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton15.setRoundBottomLeft(40);
        AddToCartButton15.setRoundTopRight(40);
        AddToCartButton15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon15MouseExited(evt);
            }
        });
        AddToCartButton15.add(AddToCartIcon15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord15.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord15.setText("Add Cart");
        AddToCartWord15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord15MouseExited(evt);
            }
        });
        AddToCartButton15.add(AddToCartWord15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 140, 30));

        AddToCartButton13.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton13.setRoundBottomLeft(40);
        AddToCartButton13.setRoundTopRight(40);
        AddToCartButton13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon13MouseExited(evt);
            }
        });
        AddToCartButton13.add(AddToCartIcon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord13.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord13.setText("Add Cart");
        AddToCartWord13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord13MouseExited(evt);
            }
        });
        AddToCartButton13.add(AddToCartWord13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 140, 30));

        AddToCartButton16.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton16.setRoundBottomLeft(40);
        AddToCartButton16.setRoundTopRight(40);
        AddToCartButton16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon16MouseExited(evt);
            }
        });
        AddToCartButton16.add(AddToCartIcon16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord16.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord16.setText("Add Cart");
        AddToCartWord16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord16MouseExited(evt);
            }
        });
        AddToCartButton16.add(AddToCartWord16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton17.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton17.setRoundBottomLeft(40);
        AddToCartButton17.setRoundTopRight(40);
        AddToCartButton17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon17MouseExited(evt);
            }
        });
        AddToCartButton17.add(AddToCartIcon17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord17.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord17.setText("Add Cart");
        AddToCartWord17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord17MouseExited(evt);
            }
        });
        AddToCartButton17.add(AddToCartWord17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton16.add(AddToCartButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton18.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton18.setRoundBottomLeft(40);
        AddToCartButton18.setRoundTopRight(40);
        AddToCartButton18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon18MouseExited(evt);
            }
        });
        AddToCartButton18.add(AddToCartIcon18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord18.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord18.setText("Add Cart");
        AddToCartWord18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord18MouseExited(evt);
            }
        });
        AddToCartButton18.add(AddToCartWord18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton16.add(AddToCartButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton19.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton19.setRoundBottomLeft(40);
        AddToCartButton19.setRoundTopRight(40);
        AddToCartButton19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon19MouseExited(evt);
            }
        });
        AddToCartButton19.add(AddToCartIcon19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord19.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord19.setText("Add Cart");
        AddToCartWord19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord19MouseExited(evt);
            }
        });
        AddToCartButton19.add(AddToCartWord19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton16.add(AddToCartButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton20.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton20.setRoundBottomLeft(40);
        AddToCartButton20.setRoundTopRight(40);
        AddToCartButton20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon20MouseExited(evt);
            }
        });
        AddToCartButton20.add(AddToCartIcon20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord20.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord20.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord20.setText("Add Cart");
        AddToCartWord20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord20MouseExited(evt);
            }
        });
        AddToCartButton20.add(AddToCartWord20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton21.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton21.setRoundBottomLeft(40);
        AddToCartButton21.setRoundTopRight(40);
        AddToCartButton21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon21MouseExited(evt);
            }
        });
        AddToCartButton21.add(AddToCartIcon21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord21.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord21.setText("Add Cart");
        AddToCartWord21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord21MouseExited(evt);
            }
        });
        AddToCartButton21.add(AddToCartWord21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton20.add(AddToCartButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton22.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton22.setRoundBottomLeft(40);
        AddToCartButton22.setRoundTopRight(40);
        AddToCartButton22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon22MouseExited(evt);
            }
        });
        AddToCartButton22.add(AddToCartIcon22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord22.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord22.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord22.setText("Add Cart");
        AddToCartWord22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord22MouseExited(evt);
            }
        });
        AddToCartButton22.add(AddToCartWord22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton20.add(AddToCartButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton23.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton23.setRoundBottomLeft(40);
        AddToCartButton23.setRoundTopRight(40);
        AddToCartButton23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon23MouseExited(evt);
            }
        });
        AddToCartButton23.add(AddToCartIcon23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord23.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord23.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord23.setText("Add Cart");
        AddToCartWord23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord23MouseExited(evt);
            }
        });
        AddToCartButton23.add(AddToCartWord23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton20.add(AddToCartButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton16.add(AddToCartButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        ProductsContainer.add(AddToCartButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 140, 30));

        AddToCartButton14.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton14.setRoundBottomLeft(40);
        AddToCartButton14.setRoundTopRight(40);
        AddToCartButton14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon14MouseExited(evt);
            }
        });
        AddToCartButton14.add(AddToCartIcon14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord14.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord14.setText("Add Cart");
        AddToCartWord14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord14MouseExited(evt);
            }
        });
        AddToCartButton14.add(AddToCartWord14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 140, 30));

        AddToCartButton24.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton24.setRoundBottomLeft(40);
        AddToCartButton24.setRoundTopRight(40);
        AddToCartButton24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon24MouseExited(evt);
            }
        });
        AddToCartButton24.add(AddToCartIcon24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord24.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord24.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord24.setText("Add Cart");
        AddToCartWord24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord24MouseExited(evt);
            }
        });
        AddToCartButton24.add(AddToCartWord24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 140, 30));

        AddToCartButton5.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton5.setRoundBottomLeft(40);
        AddToCartButton5.setRoundTopRight(40);
        AddToCartButton5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon5.setInheritsPopupMenu(false);
        AddToCartIcon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon5MouseExited(evt);
            }
        });
        AddToCartButton5.add(AddToCartIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord5.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord5.setText("Add Cart");
        AddToCartWord5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord5MouseExited(evt);
            }
        });
        AddToCartButton5.add(AddToCartWord5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, 30));

        AddToCartButton4.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton4.setRoundBottomLeft(40);
        AddToCartButton4.setRoundTopRight(40);
        AddToCartButton4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon4MouseExited(evt);
            }
        });
        AddToCartButton4.add(AddToCartIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord4.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord4.setText("Add Cart");
        AddToCartWord4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord4MouseExited(evt);
            }
        });
        AddToCartButton4.add(AddToCartWord4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton6.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton6.setRoundBottomLeft(40);
        AddToCartButton6.setRoundTopRight(40);
        AddToCartButton6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon6MouseExited(evt);
            }
        });
        AddToCartButton6.add(AddToCartIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord6.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord6.setText("Add Cart");
        AddToCartWord6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord6MouseExited(evt);
            }
        });
        AddToCartButton6.add(AddToCartWord6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton4.add(AddToCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton7.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton7.setRoundBottomLeft(40);
        AddToCartButton7.setRoundTopRight(40);
        AddToCartButton7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon7MouseExited(evt);
            }
        });
        AddToCartButton7.add(AddToCartIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord7.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord7.setText("Add Cart");
        AddToCartWord7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord7MouseExited(evt);
            }
        });
        AddToCartButton7.add(AddToCartWord7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton4.add(AddToCartButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton8.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton8.setRoundBottomLeft(40);
        AddToCartButton8.setRoundTopRight(40);
        AddToCartButton8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon8MouseExited(evt);
            }
        });
        AddToCartButton8.add(AddToCartIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord8.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord8.setText("Add Cart");
        AddToCartWord8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord8MouseExited(evt);
            }
        });
        AddToCartButton8.add(AddToCartWord8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton4.add(AddToCartButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton9.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton9.setRoundBottomLeft(40);
        AddToCartButton9.setRoundTopRight(40);
        AddToCartButton9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon9MouseExited(evt);
            }
        });
        AddToCartButton9.add(AddToCartIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord9.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord9.setText("Add Cart");
        AddToCartWord9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord9MouseExited(evt);
            }
        });
        AddToCartButton9.add(AddToCartWord9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton10.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton10.setRoundBottomLeft(40);
        AddToCartButton10.setRoundTopRight(40);
        AddToCartButton10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon10MouseExited(evt);
            }
        });
        AddToCartButton10.add(AddToCartIcon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord10.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord10.setText("Add Cart");
        AddToCartWord10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord10MouseExited(evt);
            }
        });
        AddToCartButton10.add(AddToCartWord10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton9.add(AddToCartButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton11.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton11.setRoundBottomLeft(40);
        AddToCartButton11.setRoundTopRight(40);
        AddToCartButton11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon11MouseExited(evt);
            }
        });
        AddToCartButton11.add(AddToCartIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord11.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord11.setText("Add Cart");
        AddToCartWord11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord11MouseExited(evt);
            }
        });
        AddToCartButton11.add(AddToCartWord11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton9.add(AddToCartButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton12.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton12.setRoundBottomLeft(40);
        AddToCartButton12.setRoundTopRight(40);
        AddToCartButton12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon12MouseExited(evt);
            }
        });
        AddToCartButton12.add(AddToCartIcon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord12.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord12.setText("Add Cart");
        AddToCartWord12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord12MouseExited(evt);
            }
        });
        AddToCartButton12.add(AddToCartWord12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton9.add(AddToCartButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton4.add(AddToCartButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        ProductsContainer.add(AddToCartButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        AddToCartButton3.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton3.setRoundBottomLeft(40);
        AddToCartButton3.setRoundTopRight(40);
        AddToCartButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon3MouseExited(evt);
            }
        });
        AddToCartButton3.add(AddToCartIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord3.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord3.setText("Add Cart");
        AddToCartWord3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord3MouseExited(evt);
            }
        });
        AddToCartButton3.add(AddToCartWord3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton2.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton2.setRoundBottomLeft(40);
        AddToCartButton2.setRoundTopRight(40);
        AddToCartButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon2MouseExited(evt);
            }
        });
        AddToCartButton2.add(AddToCartIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord2.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord2.setText("Add Cart");
        AddToCartWord2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord2MouseExited(evt);
            }
        });
        AddToCartButton2.add(AddToCartWord2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton1.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton1.setRoundBottomLeft(40);
        AddToCartButton1.setRoundTopRight(40);
        AddToCartButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon1MouseExited(evt);
            }
        });
        AddToCartButton1.add(AddToCartIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord1.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord1.setText("Add Cart");
        AddToCartWord1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord1MouseExited(evt);
            }
        });
        AddToCartButton1.add(AddToCartWord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer.add(AddToCartButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        productsPanel_1.add(ProductsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 1070, 520));

        SpacePharmacyBackground_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpacePharmacyBackground_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_1MouseClicked(evt);
            }
        });
        productsPanel_1.add(SpacePharmacyBackground_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        spaceLayeredPane.add(productsPanel_1, "card3");

        aboutUsPanel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineSpace_3.setBackground(new java.awt.Color(8, 34, 4));
        aboutUsPanel_1.add(LineSpace_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, -1));

        AboutUsBackground.setBackground(new java.awt.Color(194, 185, 127));
        AboutUsBackground.setRoundBottomRight(80);
        AboutUsBackground.setRoundTopRight(80);

        aboutUs.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        aboutUs.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUs.setText("About Us");

        javax.swing.GroupLayout AboutUsBackgroundLayout = new javax.swing.GroupLayout(AboutUsBackground);
        AboutUsBackground.setLayout(AboutUsBackgroundLayout);
        AboutUsBackgroundLayout.setHorizontalGroup(
            AboutUsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackgroundLayout.createSequentialGroup()
                .addComponent(aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        AboutUsBackgroundLayout.setVerticalGroup(
            AboutUsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackgroundLayout.createSequentialGroup()
                .addComponent(aboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        aboutUsPanel_1.add(AboutUsBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 50));

        about1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about1.setForeground(new java.awt.Color(0, 0, 0));
        about1.setText(" their extraordinary journeys.");
        aboutUsPanel_1.add(about1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 100));

        about2.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about2.setForeground(new java.awt.Color(0, 0, 0));
        about2.setText("Welcome to Space Pharmacy, your trusted partner in healthcare, whether you're on Earth or in the vast expanse of space. Our ");
        aboutUsPanel_1.add(about2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1270, 100));

        about3.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about3.setForeground(new java.awt.Color(0, 0, 0));
        about3.setText(" mission is to provide top-quality pharmaceutical care and wellness solutions to astronauts, space explorers , and space station  ");
        aboutUsPanel_1.add(about3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1210, 100));

        about4.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about4.setForeground(new java.awt.Color(0, 0, 0));
        about4.setText("residents, ensuring that they have access to the medications and health products they need to maintain their well-being during");
        aboutUsPanel_1.add(about4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 100));

        SpacePharmacyBackground_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_3MouseClicked(evt);
            }
        });
        aboutUsPanel_1.add(SpacePharmacyBackground_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        spaceLayeredPane.add(aboutUsPanel_1, "card4");

        contactPanel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineSpace_4.setBackground(new java.awt.Color(8, 34, 4));
        contactPanel_1.add(LineSpace_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, -1));

        Contact.setBackground(new java.awt.Color(70, 78, 71));
        Contact.setRoundBottomRight(80);
        Contact.setRoundTopRight(80);

        ContactUs.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ContactUs.setForeground(new java.awt.Color(255, 255, 255));
        ContactUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContactUs.setText("Contact Us");

        javax.swing.GroupLayout ContactLayout = new javax.swing.GroupLayout(Contact);
        Contact.setLayout(ContactLayout);
        ContactLayout.setHorizontalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactLayout.createSequentialGroup()
                .addComponent(ContactUs, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        ContactLayout.setVerticalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactLayout.createSequentialGroup()
                .addComponent(ContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contactPanel_1.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 50));

        about6.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about6.setForeground(new java.awt.Color(0, 102, 102));
        about6.setText("For more information about our services, or to speak with one of our expert pharmacists, please contact us at:");
        contactPanel_1.add(about6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1270, 100));

        about7.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about7.setForeground(new java.awt.Color(51, 51, 255));
        about7.setText("info@spacepharmacy.space");
        about7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactPanel_1.add(about7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 100));

        about8.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about8.setForeground(new java.awt.Color(0, 0, 0));
        about8.setText("Space Pharmacy Headquarters, Space Station Alpha, Low Earth Orbit");
        contactPanel_1.add(about8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 690, 90));

        about9.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about9.setForeground(new java.awt.Color(0, 0, 0));
        about9.setText("E-mail: ");
        contactPanel_1.add(about9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 140, 90));

        about10.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about10.setForeground(new java.awt.Color(0, 0, 0));
        about10.setText("Address:");
        contactPanel_1.add(about10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 100));

        about11.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about11.setForeground(new java.awt.Color(0, 0, 0));
        about11.setText("Phone:");
        contactPanel_1.add(about11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 100));

        about12.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about12.setForeground(new java.awt.Color(0, 0, 0));
        about12.setText(" +1 (800) 555-SPACE (7722)");
        contactPanel_1.add(about12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, 90));

        SpacePharmacyBackground_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_4MouseClicked(evt);
            }
        });
        contactPanel_1.add(SpacePharmacyBackground_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        spaceLayeredPane.add(contactPanel_1, "card5");

        salePanel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineSpace_2.setBackground(new java.awt.Color(8, 34, 4));
        salePanel_1.add(LineSpace_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, -1));

        transparency.setBackground(new java.awt.Color(0,0,0,180));
        transparency.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sorry.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        sorry.setForeground(new java.awt.Color(255, 255, 255));
        sorry.setText("There are no offers at the moment!!");
        transparency.add(sorry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1190, 240));

        salePanel_1.add(transparency, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        SpacePharmacyBackground_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salesModifies.png"))); // NOI18N
        SpacePharmacyBackground_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_2MouseClicked(evt);
            }
        });
        salePanel_1.add(SpacePharmacyBackground_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        spaceLayeredPane.add(salePanel_1, "card8");

        SpacePharmacyContent.add(spaceLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        mainLayeredPane.add(SpacePharmacyContent, "card6");

        PyramidPharmacyContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_2.setBackground(new java.awt.Color(0, 0, 0));
        Menu_2.setForeground(new java.awt.Color(0, 0, 0));
        Menu_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_2MouseClicked(evt);
            }
        });
        Menu_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel_2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        menuLabel_2.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-menu-40.png"))); // NOI18N
        menuLabel_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabel_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuLabel_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuLabel_2MouseExited(evt);
            }
        });
        Menu_2.add(menuLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        PyramidPharmacyContent.add(Menu_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
        Menu_2.setOpaque(false);

        MenuPanel_2.setBackground(new java.awt.Color(242, 247, 247));
        MenuPanel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-removebg-preview.png"))); // NOI18N
        MenuPanel_2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 210, 100));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("_________________________________________");
        MenuPanel_2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, -1));

        products_2.setBackground(new java.awt.Color(0, 0, 0));
        products_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        products_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productsLabel_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        productsLabel_2.setForeground(new java.awt.Color(255, 255, 255));
        productsLabel_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsLabel_2.setText("Products");
        productsLabel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsLabel_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsLabel_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsLabel_2MouseExited(evt);
            }
        });
        products_2.add(productsLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        MenuPanel_2.add(products_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 30));
        products_2.setOpaque(false);

        aboutUs_2.setBackground(new java.awt.Color(0, 0, 0));
        aboutUs_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutUs_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutUs_label_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        aboutUs_label_2.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs_label_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUs_label_2.setText("About Us");
        aboutUs_label_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUs_label_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutUs_label_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutUs_label_2MouseExited(evt);
            }
        });
        aboutUs_2.add(aboutUs_label_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        MenuPanel_2.add(aboutUs_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 30));
        aboutUs_2.setOpaque(false);

        contact_2.setBackground(new java.awt.Color(0, 0, 0));
        contact_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        contact_label_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        contact_label_2.setForeground(new java.awt.Color(255, 255, 255));
        contact_label_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact_label_2.setText("Contact");
        contact_label_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_label_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_label_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_label_2MouseExited(evt);
            }
        });
        contact_label_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contact_label_2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout contact_2Layout = new javax.swing.GroupLayout(contact_2);
        contact_2.setLayout(contact_2Layout);
        contact_2Layout.setHorizontalGroup(
            contact_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contact_label_2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        contact_2Layout.setVerticalGroup(
            contact_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contact_label_2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuPanel_2.add(contact_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));
        contact_2.setOpaque(false);

        sale_2.setBackground(new java.awt.Color(0, 0, 0));
        sale_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        saleLabel_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        saleLabel_2.setForeground(new java.awt.Color(255, 255, 255));
        saleLabel_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleLabel_2.setText("Sales");
        saleLabel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleLabel_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleLabel_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleLabel_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout sale_2Layout = new javax.swing.GroupLayout(sale_2);
        sale_2.setLayout(sale_2Layout);
        sale_2Layout.setHorizontalGroup(
            sale_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleLabel_2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        sale_2Layout.setVerticalGroup(
            sale_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleLabel_2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuPanel_2.add(sale_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 30));
        sale_2.setOpaque(false);

        PyramidPharmacyContent.add(MenuPanel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 570));

        pyramidLayeredPane3.setLayout(new java.awt.CardLayout());

        productsPanel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinePyramid_1.setBackground(new java.awt.Color(8, 34, 4));
        LinePyramid_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        productsPanel_2.add(LinePyramid_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 10));

        ProductsTitle1.setBackground(new java.awt.Color(0, 0, 0));
        ProductsTitle1.setRoundTopLeft(40);
        ProductsTitle1.setRoundTopRight(40);
        ProductsTitle1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductsTitleIcon1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ProductsTitleIcon1.setForeground(new java.awt.Color(255, 255, 255));
        ProductsTitleIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductsTitleIcon1.setText("Products");
        ProductsTitle1.add(ProductsTitleIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        productsPanel_2.add(ProductsTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 190, 40));

        ProductsContainer1.setBackground(new java.awt.Color(0, 0, 0));
        ProductsContainer1.setRoundBottomLeft(80);
        ProductsContainer1.setRoundBottomRight(80);
        ProductsContainer1.setRoundTopLeft(80);
        ProductsContainer1.setRoundTopRight(80);
        ProductsContainer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productContainer11.setBackground(new java.awt.Color(255, 255, 255));
        productContainer11.setRoundBottomLeft(40);
        productContainer11.setRoundBottomRight(40);
        productContainer11.setRoundTopLeft(40);
        productContainer11.setRoundTopRight(40);
        productContainer11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage11.setRoundTopLeft(20);
        ProductImage11.setRoundTopRight(20);
        ProductImage11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/monomak.png"))); // NOI18N
        ProductImage11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer11.add(ProductImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description11.setRoundBottomLeft(30);
        Description11.setRoundBottomRight(30);

        pr11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr11.setText("Monomac");

        price11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price11.setText("12.84");

        javax.swing.GroupLayout Description11Layout = new javax.swing.GroupLayout(Description11);
        Description11.setLayout(Description11Layout);
        Description11Layout.setHorizontalGroup(
            Description11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pr11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Description11Layout.setVerticalGroup(
            Description11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr11)
                    .addComponent(price11))
                .addContainerGap())
        );

        productContainer11.add(Description11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus11MouseClicked(evt);
            }
        });
        productContainer11.add(minus11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus12MouseClicked(evt);
            }
        });
        productContainer11.add(plus12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum11.setForeground(new java.awt.Color(0, 0, 0));
        showNum11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer11.add(showNum11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 160, 190));

        productContainer12.setBackground(new java.awt.Color(255, 255, 255));
        productContainer12.setRoundBottomLeft(40);
        productContainer12.setRoundBottomRight(40);
        productContainer12.setRoundTopLeft(40);
        productContainer12.setRoundTopRight(40);
        productContainer12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage12.setRoundTopLeft(20);
        ProductImage12.setRoundTopRight(20);
        ProductImage12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ruta.png"))); // NOI18N
        ProductImage12.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer12.add(ProductImage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description12.setRoundBottomLeft(30);
        Description12.setRoundBottomRight(30);

        pr12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr12.setText("Rut-C");

        price12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price12.setText("30");

        javax.swing.GroupLayout Description12Layout = new javax.swing.GroupLayout(Description12);
        Description12.setLayout(Description12Layout);
        Description12Layout.setHorizontalGroup(
            Description12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description12Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(pr12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        Description12Layout.setVerticalGroup(
            Description12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr12)
                    .addComponent(price12))
                .addContainerGap())
        );

        productContainer12.add(Description12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus12MouseClicked(evt);
            }
        });
        productContainer12.add(minus12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus13MouseClicked(evt);
            }
        });
        productContainer12.add(plus13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum12.setForeground(new java.awt.Color(0, 0, 0));
        showNum12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer12.add(showNum12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 160, 190));

        productContainer13.setBackground(new java.awt.Color(255, 255, 255));
        productContainer13.setRoundBottomLeft(40);
        productContainer13.setRoundBottomRight(40);
        productContainer13.setRoundTopLeft(40);
        productContainer13.setRoundTopRight(40);
        productContainer13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage13.setRoundTopLeft(20);
        ProductImage13.setRoundTopRight(20);
        ProductImage13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/limiting zinc.png"))); // NOI18N
        ProductImage13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer13.add(ProductImage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description13.setRoundBottomLeft(30);
        Description13.setRoundBottomRight(30);

        pr13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr13.setText("Zinc");

        price13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price13.setText("350");

        javax.swing.GroupLayout Description13Layout = new javax.swing.GroupLayout(Description13);
        Description13.setLayout(Description13Layout);
        Description13Layout.setHorizontalGroup(
            Description13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description13Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(pr13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        Description13Layout.setVerticalGroup(
            Description13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr13)
                    .addComponent(price13))
                .addContainerGap())
        );

        productContainer13.add(Description13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus13MouseClicked(evt);
            }
        });
        productContainer13.add(minus13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus14MouseClicked(evt);
            }
        });
        productContainer13.add(plus14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum13.setForeground(new java.awt.Color(0, 0, 0));
        showNum13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer13.add(showNum13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 190));

        productContainer14.setBackground(new java.awt.Color(255, 255, 255));
        productContainer14.setRoundBottomLeft(40);
        productContainer14.setRoundBottomRight(40);
        productContainer14.setRoundTopLeft(40);
        productContainer14.setRoundTopRight(40);
        productContainer14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage14.setRoundTopLeft(20);
        ProductImage14.setRoundTopRight(20);
        ProductImage14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/azg.png"))); // NOI18N
        ProductImage14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer14.add(ProductImage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description14.setRoundBottomLeft(30);
        Description14.setRoundBottomRight(30);

        pr14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr14.setText("Azgobion");

        price14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price14.setText("20");

        javax.swing.GroupLayout Description14Layout = new javax.swing.GroupLayout(Description14);
        Description14.setLayout(Description14Layout);
        Description14Layout.setHorizontalGroup(
            Description14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pr14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        Description14Layout.setVerticalGroup(
            Description14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr14)
                    .addComponent(price14))
                .addContainerGap())
        );

        productContainer14.add(Description14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus14MouseClicked(evt);
            }
        });
        productContainer14.add(minus14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus15MouseClicked(evt);
            }
        });
        productContainer14.add(plus15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum14.setForeground(new java.awt.Color(0, 0, 0));
        showNum14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer14.add(showNum14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 190));

        productContainer15.setBackground(new java.awt.Color(255, 255, 255));
        productContainer15.setRoundBottomLeft(40);
        productContainer15.setRoundBottomRight(40);
        productContainer15.setRoundTopLeft(40);
        productContainer15.setRoundTopRight(40);
        productContainer15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage15.setRoundTopLeft(20);
        ProductImage15.setRoundTopRight(20);
        ProductImage15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lornicam.png"))); // NOI18N
        ProductImage15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer15.add(ProductImage15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description15.setRoundBottomLeft(30);
        Description15.setRoundBottomRight(30);

        pr15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr15.setText("Lornicam");

        price15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price15.setText("23.5");

        javax.swing.GroupLayout Description15Layout = new javax.swing.GroupLayout(Description15);
        Description15.setLayout(Description15Layout);
        Description15Layout.setHorizontalGroup(
            Description15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pr15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Description15Layout.setVerticalGroup(
            Description15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr15)
                    .addComponent(price15))
                .addContainerGap())
        );

        productContainer15.add(Description15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus15MouseClicked(evt);
            }
        });
        productContainer15.add(minus15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus16MouseClicked(evt);
            }
        });
        productContainer15.add(plus16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum15.setForeground(new java.awt.Color(0, 0, 0));
        showNum15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer15.add(showNum15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 160, 190));

        productContainer16.setBackground(new java.awt.Color(255, 255, 255));
        productContainer16.setRoundBottomLeft(40);
        productContainer16.setRoundBottomRight(40);
        productContainer16.setRoundTopLeft(40);
        productContainer16.setRoundTopRight(40);
        productContainer16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage16.setRoundTopLeft(20);
        ProductImage16.setRoundTopRight(20);
        ProductImage16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profikids.png"))); // NOI18N
        ProductImage16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer16.add(ProductImage16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description16.setRoundBottomLeft(30);
        Description16.setRoundBottomRight(30);

        pr16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr16.setText("ProfiKids");

        price16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price16.setText("299");

        javax.swing.GroupLayout Description16Layout = new javax.swing.GroupLayout(Description16);
        Description16.setLayout(Description16Layout);
        Description16Layout.setHorizontalGroup(
            Description16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pr16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        Description16Layout.setVerticalGroup(
            Description16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr16)
                    .addComponent(price16))
                .addContainerGap())
        );

        productContainer16.add(Description16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus16MouseClicked(evt);
            }
        });
        productContainer16.add(minus16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus17MouseClicked(evt);
            }
        });
        productContainer16.add(plus17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum16.setForeground(new java.awt.Color(0, 0, 0));
        showNum16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer16.add(showNum16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 190));

        productContainer17.setBackground(new java.awt.Color(255, 255, 255));
        productContainer17.setRoundBottomLeft(40);
        productContainer17.setRoundBottomRight(40);
        productContainer17.setRoundTopLeft(40);
        productContainer17.setRoundTopRight(40);
        productContainer17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage17.setRoundTopLeft(20);
        ProductImage17.setRoundTopRight(20);
        ProductImage17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ketofan.png"))); // NOI18N
        ProductImage17.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer17.add(ProductImage17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description17.setRoundBottomLeft(30);
        Description17.setRoundBottomRight(30);

        pr17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr17.setText("Ketofan");

        price17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price17.setText("15");

        javax.swing.GroupLayout Description17Layout = new javax.swing.GroupLayout(Description17);
        Description17.setLayout(Description17Layout);
        Description17Layout.setHorizontalGroup(
            Description17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pr17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Description17Layout.setVerticalGroup(
            Description17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr17)
                    .addComponent(price17))
                .addContainerGap())
        );

        productContainer17.add(Description17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus17MouseClicked(evt);
            }
        });
        productContainer17.add(minus17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus18MouseClicked(evt);
            }
        });
        productContainer17.add(plus18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum17.setForeground(new java.awt.Color(0, 0, 0));
        showNum17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer17.add(showNum17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 160, 190));

        productContainer18.setBackground(new java.awt.Color(255, 255, 255));
        productContainer18.setRoundBottomLeft(40);
        productContainer18.setRoundBottomRight(40);
        productContainer18.setRoundTopLeft(40);
        productContainer18.setRoundTopRight(40);
        productContainer18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage18.setRoundTopLeft(20);
        ProductImage18.setRoundTopRight(20);
        ProductImage18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cetafen.png"))); // NOI18N
        ProductImage18.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer18.add(ProductImage18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description18.setRoundBottomLeft(30);
        Description18.setRoundBottomRight(30);

        pr18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr18.setText("Cetafen");

        price18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price18.setText("16");

        javax.swing.GroupLayout Description18Layout = new javax.swing.GroupLayout(Description18);
        Description18.setLayout(Description18Layout);
        Description18Layout.setHorizontalGroup(
            Description18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description18Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pr18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Description18Layout.setVerticalGroup(
            Description18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr18)
                    .addComponent(price18))
                .addContainerGap())
        );

        productContainer18.add(Description18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus18MouseClicked(evt);
            }
        });
        productContainer18.add(minus18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus19MouseClicked(evt);
            }
        });
        productContainer18.add(plus19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum18.setForeground(new java.awt.Color(0, 0, 0));
        showNum18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer18.add(showNum18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 160, 190));

        productContainer19.setBackground(new java.awt.Color(255, 255, 255));
        productContainer19.setRoundBottomLeft(40);
        productContainer19.setRoundBottomRight(40);
        productContainer19.setRoundTopLeft(40);
        productContainer19.setRoundTopRight(40);
        productContainer19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage19.setRoundTopLeft(20);
        ProductImage19.setRoundTopRight(20);
        ProductImage19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ketolack.png"))); // NOI18N
        ProductImage19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer19.add(ProductImage19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description19.setRoundBottomLeft(30);
        Description19.setRoundBottomRight(30);

        pr19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr19.setText("Ketolac");

        price19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price19.setText("18");

        javax.swing.GroupLayout Description19Layout = new javax.swing.GroupLayout(Description19);
        Description19.setLayout(Description19Layout);
        Description19Layout.setHorizontalGroup(
            Description19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description19Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pr19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Description19Layout.setVerticalGroup(
            Description19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Description19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Description19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr19)
                    .addComponent(price19))
                .addContainerGap())
        );

        productContainer19.add(Description19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus19MouseClicked(evt);
            }
        });
        productContainer19.add(minus19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus20MouseClicked(evt);
            }
        });
        productContainer19.add(plus20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum19.setForeground(new java.awt.Color(0, 0, 0));
        showNum19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer19.add(showNum19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 160, 190));

        productContainer20.setBackground(new java.awt.Color(255, 255, 255));
        productContainer20.setRoundBottomLeft(40);
        productContainer20.setRoundBottomRight(40);
        productContainer20.setRoundTopLeft(40);
        productContainer20.setRoundTopRight(40);
        productContainer20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductImage20.setRoundTopLeft(20);
        ProductImage20.setRoundTopRight(20);
        ProductImage20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/surgical.png"))); // NOI18N
        ProductImage20.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        productContainer20.add(ProductImage20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 100));

        Description20.setRoundBottomLeft(30);
        Description20.setRoundBottomRight(30);

        pr20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pr20.setText("Surgical");

        price20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price20.setText("18");

        javax.swing.GroupLayout Description20Layout = new javax.swing.GroupLayout(Description20);
        Description20.setLayout(Description20Layout);
        Description20Layout.setHorizontalGroup(
            Description20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description20Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(pr20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Description20Layout.setVerticalGroup(
            Description20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Description20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Description20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr20)
                    .addComponent(price20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productContainer20.add(Description20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 148, 30));

        minus20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-30.png"))); // NOI18N
        minus20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus20MouseClicked(evt);
            }
        });
        productContainer20.add(minus20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 40));

        plus21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        plus21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus21MouseClicked(evt);
            }
        });
        productContainer20.add(plus21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 40));

        showNum20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showNum20.setForeground(new java.awt.Color(0, 0, 0));
        showNum20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productContainer20.add(showNum20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 40));

        ProductsContainer1.add(productContainer20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 160, 190));

        BigDealOffer1.setBackground(new java.awt.Color(255, 255, 255));
        BigDealOffer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BigDealOffer1.setRoundBottomRight(80);
        BigDealOffer1.setRoundTopRight(80);
        BigDealOffer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BigDealOfferIcon1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BigDealOfferIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-offer-100.png"))); // NOI18N
        BigDealOfferIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BigDealOfferIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BigDealOfferIcon1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BigDealOfferIcon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BigDealOfferIcon1MouseExited(evt);
            }
        });
        BigDealOffer1.add(BigDealOfferIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 1, 90, 398));

        ProductsContainer1.add(BigDealOffer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 400));

        AddToCartButton25.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton25.setRoundBottomLeft(40);
        AddToCartButton25.setRoundTopRight(40);
        AddToCartButton25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon25MouseExited(evt);
            }
        });
        AddToCartButton25.add(AddToCartIcon25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord25.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord25.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord25.setText("Add Cart");
        AddToCartWord25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord25MouseExited(evt);
            }
        });
        AddToCartButton25.add(AddToCartWord25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton26.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton26.setRoundBottomLeft(40);
        AddToCartButton26.setRoundTopRight(40);
        AddToCartButton26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon26MouseExited(evt);
            }
        });
        AddToCartButton26.add(AddToCartIcon26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord26.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord26.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord26.setText("Add Cart");
        AddToCartWord26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord26MouseExited(evt);
            }
        });
        AddToCartButton26.add(AddToCartWord26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton27.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton27.setRoundBottomLeft(40);
        AddToCartButton27.setRoundTopRight(40);
        AddToCartButton27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon27MouseExited(evt);
            }
        });
        AddToCartButton27.add(AddToCartIcon27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord27.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord27.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord27.setText("Add Cart");
        AddToCartWord27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord27MouseExited(evt);
            }
        });
        AddToCartButton27.add(AddToCartWord27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton28.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton28.setRoundBottomLeft(40);
        AddToCartButton28.setRoundTopRight(40);
        AddToCartButton28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon28MouseExited(evt);
            }
        });
        AddToCartButton28.add(AddToCartIcon28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord28.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord28.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord28.setText("Add Cart");
        AddToCartWord28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord28MouseExited(evt);
            }
        });
        AddToCartButton28.add(AddToCartWord28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton29.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton29.setRoundBottomLeft(40);
        AddToCartButton29.setRoundTopRight(40);
        AddToCartButton29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon29MouseExited(evt);
            }
        });
        AddToCartButton29.add(AddToCartIcon29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord29.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord29.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord29.setText("Add Cart");
        AddToCartWord29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord29MouseExited(evt);
            }
        });
        AddToCartButton29.add(AddToCartWord29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton28.add(AddToCartButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton30.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton30.setRoundBottomLeft(40);
        AddToCartButton30.setRoundTopRight(40);
        AddToCartButton30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon30MouseExited(evt);
            }
        });
        AddToCartButton30.add(AddToCartIcon30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord30.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord30.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord30.setText("Add Cart");
        AddToCartWord30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord30MouseExited(evt);
            }
        });
        AddToCartButton30.add(AddToCartWord30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton28.add(AddToCartButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton31.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton31.setRoundBottomLeft(40);
        AddToCartButton31.setRoundTopRight(40);
        AddToCartButton31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon31MouseExited(evt);
            }
        });
        AddToCartButton31.add(AddToCartIcon31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord31.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord31.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord31.setText("Add Cart");
        AddToCartWord31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord31MouseExited(evt);
            }
        });
        AddToCartButton31.add(AddToCartWord31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton28.add(AddToCartButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton32.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton32.setRoundBottomLeft(40);
        AddToCartButton32.setRoundTopRight(40);
        AddToCartButton32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon32MouseExited(evt);
            }
        });
        AddToCartButton32.add(AddToCartIcon32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord32.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord32.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord32.setText("Add Cart");
        AddToCartWord32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord32MouseExited(evt);
            }
        });
        AddToCartButton32.add(AddToCartWord32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton33.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton33.setRoundBottomLeft(40);
        AddToCartButton33.setRoundTopRight(40);
        AddToCartButton33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon33MouseExited(evt);
            }
        });
        AddToCartButton33.add(AddToCartIcon33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord33.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord33.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord33.setText("Add Cart");
        AddToCartWord33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord33MouseExited(evt);
            }
        });
        AddToCartButton33.add(AddToCartWord33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton32.add(AddToCartButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton34.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton34.setRoundBottomLeft(40);
        AddToCartButton34.setRoundTopRight(40);
        AddToCartButton34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon34MouseExited(evt);
            }
        });
        AddToCartButton34.add(AddToCartIcon34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord34.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord34.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord34.setText("Add Cart");
        AddToCartWord34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord34MouseExited(evt);
            }
        });
        AddToCartButton34.add(AddToCartWord34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton32.add(AddToCartButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton35.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton35.setRoundBottomLeft(40);
        AddToCartButton35.setRoundTopRight(40);
        AddToCartButton35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon35MouseExited(evt);
            }
        });
        AddToCartButton35.add(AddToCartIcon35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord35.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord35.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord35.setText("Add Cart");
        AddToCartWord35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord35MouseExited(evt);
            }
        });
        AddToCartButton35.add(AddToCartWord35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton32.add(AddToCartButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton28.add(AddToCartButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        ProductsContainer1.add(AddToCartButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        AddToCartButton36.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton36.setRoundBottomLeft(40);
        AddToCartButton36.setRoundTopRight(40);
        AddToCartButton36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon36.setInheritsPopupMenu(false);
        AddToCartIcon36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon36MouseExited(evt);
            }
        });
        AddToCartButton36.add(AddToCartIcon36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord36.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord36.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord36.setText("Add Cart");
        AddToCartWord36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord36MouseExited(evt);
            }
        });
        AddToCartButton36.add(AddToCartWord36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, 30));

        AddToCartButton37.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton37.setRoundBottomLeft(40);
        AddToCartButton37.setRoundTopRight(40);
        AddToCartButton37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon37MouseExited(evt);
            }
        });
        AddToCartButton37.add(AddToCartIcon37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord37.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord37.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord37.setText("Add Cart");
        AddToCartWord37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord37MouseExited(evt);
            }
        });
        AddToCartButton37.add(AddToCartWord37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 140, 30));

        AddToCartButton38.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton38.setRoundBottomLeft(40);
        AddToCartButton38.setRoundTopRight(40);
        AddToCartButton38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon38MouseExited(evt);
            }
        });
        AddToCartButton38.add(AddToCartIcon38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord38.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord38.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord38.setText("Add Cart");
        AddToCartWord38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord38MouseExited(evt);
            }
        });
        AddToCartButton38.add(AddToCartWord38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 140, 30));

        AddToCartButton39.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton39.setRoundBottomLeft(40);
        AddToCartButton39.setRoundTopRight(40);
        AddToCartButton39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon39MouseExited(evt);
            }
        });
        AddToCartButton39.add(AddToCartIcon39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord39.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord39.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord39.setText("Add Cart");
        AddToCartWord39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord39MouseExited(evt);
            }
        });
        AddToCartButton39.add(AddToCartWord39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton40.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton40.setRoundBottomLeft(40);
        AddToCartButton40.setRoundTopRight(40);
        AddToCartButton40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon40MouseExited(evt);
            }
        });
        AddToCartButton40.add(AddToCartIcon40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord40.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord40.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord40.setText("Add Cart");
        AddToCartWord40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord40MouseExited(evt);
            }
        });
        AddToCartButton40.add(AddToCartWord40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton39.add(AddToCartButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton41.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton41.setRoundBottomLeft(40);
        AddToCartButton41.setRoundTopRight(40);
        AddToCartButton41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon41MouseExited(evt);
            }
        });
        AddToCartButton41.add(AddToCartIcon41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord41.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord41.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord41.setText("Add Cart");
        AddToCartWord41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord41MouseExited(evt);
            }
        });
        AddToCartButton41.add(AddToCartWord41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton39.add(AddToCartButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton42.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton42.setRoundBottomLeft(40);
        AddToCartButton42.setRoundTopRight(40);
        AddToCartButton42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon42MouseExited(evt);
            }
        });
        AddToCartButton42.add(AddToCartIcon42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord42.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord42.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord42.setText("Add Cart");
        AddToCartWord42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord42MouseExited(evt);
            }
        });
        AddToCartButton42.add(AddToCartWord42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton39.add(AddToCartButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton43.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton43.setRoundBottomLeft(40);
        AddToCartButton43.setRoundTopRight(40);
        AddToCartButton43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon43MouseExited(evt);
            }
        });
        AddToCartButton43.add(AddToCartIcon43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord43.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord43.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord43.setText("Add Cart");
        AddToCartWord43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord43MouseExited(evt);
            }
        });
        AddToCartButton43.add(AddToCartWord43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton44.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton44.setRoundBottomLeft(40);
        AddToCartButton44.setRoundTopRight(40);
        AddToCartButton44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon44MouseExited(evt);
            }
        });
        AddToCartButton44.add(AddToCartIcon44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord44.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord44.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord44.setText("Add Cart");
        AddToCartWord44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord44MouseExited(evt);
            }
        });
        AddToCartButton44.add(AddToCartWord44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton43.add(AddToCartButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        AddToCartButton45.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton45.setRoundBottomLeft(40);
        AddToCartButton45.setRoundTopRight(40);
        AddToCartButton45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon45MouseExited(evt);
            }
        });
        AddToCartButton45.add(AddToCartIcon45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord45.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord45.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord45.setText("Add Cart");
        AddToCartWord45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord45MouseExited(evt);
            }
        });
        AddToCartButton45.add(AddToCartWord45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton43.add(AddToCartButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        AddToCartButton46.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton46.setRoundBottomLeft(40);
        AddToCartButton46.setRoundTopRight(40);
        AddToCartButton46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon46MouseExited(evt);
            }
        });
        AddToCartButton46.add(AddToCartIcon46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord46.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord46.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord46.setText("Add Cart");
        AddToCartWord46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord46MouseExited(evt);
            }
        });
        AddToCartButton46.add(AddToCartWord46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        AddToCartButton43.add(AddToCartButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

        AddToCartButton39.add(AddToCartButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        ProductsContainer1.add(AddToCartButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 140, 30));

        AddToCartButton47.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton47.setRoundBottomLeft(40);
        AddToCartButton47.setRoundTopRight(40);
        AddToCartButton47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon47MouseExited(evt);
            }
        });
        AddToCartButton47.add(AddToCartIcon47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord47.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord47.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord47.setText("Add Cart");
        AddToCartWord47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord47MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord47MouseExited(evt);
            }
        });
        AddToCartButton47.add(AddToCartWord47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 140, 30));

        AddToCartButton48.setBackground(new java.awt.Color(252, 203, 6));
        AddToCartButton48.setRoundBottomLeft(40);
        AddToCartButton48.setRoundTopRight(40);
        AddToCartButton48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartIcon48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon48MouseExited(evt);
            }
        });
        AddToCartButton48.add(AddToCartIcon48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        AddToCartWord48.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord48.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord48.setText("Add Cart");
        AddToCartWord48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord48MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord48MouseExited(evt);
            }
        });
        AddToCartButton48.add(AddToCartWord48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        ProductsContainer1.add(AddToCartButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 140, 30));

        productsPanel_2.add(ProductsContainer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 1070, 520));

        SpacePharmacyBackground_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_5MouseClicked(evt);
            }
        });
        productsPanel_2.add(SpacePharmacyBackground_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        pyramidLayeredPane3.add(productsPanel_2, "card3");

        aboutUsPanel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinePyramid_2.setBackground(new java.awt.Color(8, 34, 4));
        LinePyramid_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        aboutUsPanel_2.add(LinePyramid_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 10));

        AboutUsBackground2.setBackground(new java.awt.Color(194, 185, 127));
        AboutUsBackground2.setRoundBottomRight(80);
        AboutUsBackground2.setRoundTopRight(80);

        aboutUs2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        aboutUs2.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUs2.setText("Our Services");

        javax.swing.GroupLayout AboutUsBackground2Layout = new javax.swing.GroupLayout(AboutUsBackground2);
        AboutUsBackground2.setLayout(AboutUsBackground2Layout);
        AboutUsBackground2Layout.setHorizontalGroup(
            AboutUsBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackground2Layout.createSequentialGroup()
                .addComponent(aboutUs2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AboutUsBackground2Layout.setVerticalGroup(
            AboutUsBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackground2Layout.createSequentialGroup()
                .addComponent(aboutUs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        aboutUsPanel_2.add(AboutUsBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 50));

        AboutUsBackground1.setBackground(new java.awt.Color(194, 185, 127));
        AboutUsBackground1.setRoundBottomRight(80);
        AboutUsBackground1.setRoundTopRight(80);

        aboutUs1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        aboutUs1.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUs1.setText("About Us");

        javax.swing.GroupLayout AboutUsBackground1Layout = new javax.swing.GroupLayout(AboutUsBackground1);
        AboutUsBackground1.setLayout(AboutUsBackground1Layout);
        AboutUsBackground1Layout.setHorizontalGroup(
            AboutUsBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackground1Layout.createSequentialGroup()
                .addComponent(aboutUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        AboutUsBackground1Layout.setVerticalGroup(
            AboutUsBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsBackground1Layout.createSequentialGroup()
                .addComponent(aboutUs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        aboutUsPanel_2.add(AboutUsBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 50));

        about14.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about14.setForeground(new java.awt.Color(0, 0, 0));
        about14.setText("Medication Dispensing,  Health and Wellness Products, Consultation Services, Health Screenings,  Immunizations .");
        aboutUsPanel_2.add(about14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1270, 100));

        about15.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about15.setForeground(new java.awt.Color(0, 0, 0));
        about15.setText("experienced pharmacists, healthcare professionals, and customer service specialists who are passionate about making a positive impact");
        aboutUsPanel_2.add(about15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1310, 100));

        about16.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about16.setForeground(new java.awt.Color(0, 0, 0));
        about16.setText("on our customers' health. We understand the importance of personalized care and are here to  offer the highest standard of service.");
        aboutUsPanel_2.add(about16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 100));

        about17.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about17.setForeground(new java.awt.Color(0, 0, 0));
        about17.setText("Pyramid Pharmacy is a community-focused pharmacy dedicated to providing top-notch healthcare services. Our team consists of");
        aboutUsPanel_2.add(about17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1270, 100));

        SpacePharmacyBackground_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_6MouseClicked(evt);
            }
        });
        aboutUsPanel_2.add(SpacePharmacyBackground_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        pyramidLayeredPane3.add(aboutUsPanel_2, "card4");

        contactPanel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinePyramid_3.setBackground(new java.awt.Color(8, 34, 4));
        LinePyramid_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contactPanel_2.add(LinePyramid_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 10));

        Contact1.setBackground(new java.awt.Color(70, 78, 71));
        Contact1.setRoundBottomRight(80);
        Contact1.setRoundTopRight(80);

        ContactUs1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ContactUs1.setForeground(new java.awt.Color(255, 255, 255));
        ContactUs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContactUs1.setText("Contact Us");

        javax.swing.GroupLayout Contact1Layout = new javax.swing.GroupLayout(Contact1);
        Contact1.setLayout(Contact1Layout);
        Contact1Layout.setHorizontalGroup(
            Contact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contact1Layout.createSequentialGroup()
                .addComponent(ContactUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        Contact1Layout.setVerticalGroup(
            Contact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Contact1Layout.createSequentialGroup()
                .addComponent(ContactUs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contactPanel_2.add(Contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 50));

        about18.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about18.setForeground(new java.awt.Color(0, 102, 102));
        about18.setText("For more information about our services, or to speak with one of our expert pharmacists, please contact us at:");
        contactPanel_2.add(about18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1270, 100));

        about19.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about19.setForeground(new java.awt.Color(51, 51, 255));
        about19.setText("info@pyramidpharmacy.com");
        about19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactPanel_2.add(about19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 100));

        about20.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about20.setForeground(new java.awt.Color(0, 0, 0));
        about20.setText("Pyramid Pharmacy, 123 Wellness Avenue, Health City, USA");
        contactPanel_2.add(about20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 690, 90));

        about21.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about21.setForeground(new java.awt.Color(0, 0, 0));
        about21.setText("E-mail: ");
        contactPanel_2.add(about21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 140, 90));

        about22.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about22.setForeground(new java.awt.Color(0, 0, 0));
        about22.setText("Address:");
        contactPanel_2.add(about22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 100));

        about23.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        about23.setForeground(new java.awt.Color(0, 0, 0));
        about23.setText("Phone:");
        contactPanel_2.add(about23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 100));

        about24.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        about24.setForeground(new java.awt.Color(0, 0, 0));
        about24.setText("+1 (800) 555-1234");
        contactPanel_2.add(about24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, 90));

        SpacePharmacyBackground_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeBG.png"))); // NOI18N
        SpacePharmacyBackground_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_7MouseClicked(evt);
            }
        });
        contactPanel_2.add(SpacePharmacyBackground_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        pyramidLayeredPane3.add(contactPanel_2, "card5");

        salePanel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinePyramid_4.setBackground(new java.awt.Color(8, 34, 4));
        LinePyramid_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        salePanel_2.add(LinePyramid_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 10));

        transparency1.setBackground(new java.awt.Color(0,0,0,180));
        transparency1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sorry1.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        sorry1.setForeground(new java.awt.Color(255, 255, 255));
        sorry1.setText("There are no offers at the moment!!");
        transparency1.add(sorry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1190, 240));

        salePanel_2.add(transparency1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        SpacePharmacyBackground_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salesModifies.png"))); // NOI18N
        SpacePharmacyBackground_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_8MouseClicked(evt);
            }
        });
        salePanel_2.add(SpacePharmacyBackground_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        pyramidLayeredPane3.add(salePanel_2, "card8");

        PyramidPharmacyContent.add(pyramidLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        mainLayeredPane.add(PyramidPharmacyContent, "card3");

        SignUpContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainLayeredPane.add(SignUpContent, "card4");

        LoginContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainLayeredPane.add(LoginContent, "card5");

        CartContent.setBackground(new java.awt.Color(255, 255, 255));
        CartContent.setFont(new java.awt.Font("DejaVu Serif", 0, 36)); // NOI18N
        CartContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartButton49.setBackground(new java.awt.Color(40, 148, 220));
        AddToCartButton49.setRoundBottomLeft(40);
        AddToCartButton49.setRoundTopRight(40);
        AddToCartButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartButton49MouseClicked(evt);
            }
        });
        AddToCartButton49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCartWord49.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AddToCartWord49.setForeground(new java.awt.Color(255, 255, 255));
        AddToCartWord49.setText("  BUY!!!");
        AddToCartWord49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartWord49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartWord49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartWord49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartWord49MouseExited(evt);
            }
        });
        AddToCartButton49.add(AddToCartWord49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, 30));

        AddToCartIcon49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-shopping-cart-35.png"))); // NOI18N
        AddToCartIcon49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCartIcon49.setInheritsPopupMenu(false);
        AddToCartIcon49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartIcon49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartIcon49MouseExited(evt);
            }
        });
        AddToCartButton49.add(AddToCartIcon49, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, 30));

        CartContent.add(AddToCartButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 520, 30));

        WelcomeHome5.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        WelcomeHome5.setForeground(new java.awt.Color(0, 0, 0));
        WelcomeHome5.setText("Your Order is READY!!!!!");
        CartContent.add(WelcomeHome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 550, 70));

        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setAutoscrolls(true);

        price.setEditable(false);
        price.setColumns(10);
        price.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        price.setRows(5);
        price.setText("Total Price: ");
        jScrollPane2.setViewportView(price);

        CartContent.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 540, 60));

        buy.setEditable(false);
        buy.setColumns(10);
        buy.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buy.setForeground(new java.awt.Color(89, 40, 111));
        buy.setRows(5);
        buy.setText("You ordered: ");
        jScrollPane1.setViewportView(buy);

        CartContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 540, -1));

        HomeBackground1.setBackground(new java.awt.Color(255, 255, 255));
        HomeBackground1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        HomeBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cartback.png"))); // NOI18N
        CartContent.add(HomeBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        mainLayeredPane.add(CartContent, "card2");

        salePanel_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineSpace_5.setBackground(new java.awt.Color(8, 34, 4));
        salePanel_3.add(LineSpace_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, -1));

        transparency2.setBackground(new java.awt.Color(0,0,0,180));
        transparency2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sorry2.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        sorry2.setForeground(new java.awt.Color(255, 255, 255));
        sorry2.setText("Login to Have access !!!");
        transparency2.add(sorry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 1190, 240));

        salePanel_3.add(transparency2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        SpacePharmacyBackground_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salesModifies.png"))); // NOI18N
        SpacePharmacyBackground_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpacePharmacyBackground_9MouseClicked(evt);
            }
        });
        salePanel_3.add(SpacePharmacyBackground_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 570));

        mainLayeredPane.add(salePanel_3, "card8");

        getContentPane().add(mainLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 169, -1, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseClicked
        changePanel(HomeContent);
        SpacePharmacyIcon.setForeground(new Color(255, 255, 255));
        PyramidPharmacyIcon.setForeground(new Color(255, 255, 255));

        SignUpIcon.setForeground(new Color(255, 255, 255));

        LoginIcon.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_HomeIconMouseClicked

    private void HomeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseEntered
        HomeButton.setBackground(new Color(0, 87, 159));
    }//GEN-LAST:event_HomeIconMouseEntered

    private void HomeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseExited
        HomeButton.setBackground(new Color(1, 62, 125));
    }//GEN-LAST:event_HomeIconMouseExited

    private void SpacePharmacyIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyIconMouseClicked
        changePanel(SpacePharmacyContent);
        SpacePharmacyIcon.setForeground(new Color(0, 0, 0));
        PyramidPharmacyIcon.setForeground(new Color(255, 255, 255));

        SignUpIcon.setForeground(new Color(255, 255, 255));

        LoginIcon.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_SpacePharmacyIconMouseClicked

    private void SpacePharmacyIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyIconMouseEntered
        SpacePharmacyButton.setBackground(new Color(0, 87, 159));

    }//GEN-LAST:event_SpacePharmacyIconMouseEntered

    private void SpacePharmacyIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyIconMouseExited
        SpacePharmacyButton.setBackground(new Color(1, 62, 125));

    }//GEN-LAST:event_SpacePharmacyIconMouseExited

    private void PyramidPharmacyIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PyramidPharmacyIconMouseClicked
        changePanel(PyramidPharmacyContent);
        SpacePharmacyIcon.setForeground(new Color(255, 255, 255));
        PyramidPharmacyIcon.setForeground(new Color(0, 0, 0));

        SignUpIcon.setForeground(new Color(255, 255, 255));

        LoginIcon.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_PyramidPharmacyIconMouseClicked

    private void PyramidPharmacyIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PyramidPharmacyIconMouseEntered
        PyramidPharmacyButton.setBackground(new Color(0, 87, 159));
    }//GEN-LAST:event_PyramidPharmacyIconMouseEntered

    private void PyramidPharmacyIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PyramidPharmacyIconMouseExited
        PyramidPharmacyButton.setBackground(new Color(1, 62, 125));

    }//GEN-LAST:event_PyramidPharmacyIconMouseExited

    private void SignUpIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpIconMouseClicked
        SpacePharmacyIcon.setForeground(new Color(255, 255, 255));
        PyramidPharmacyIcon.setForeground(new Color(255, 255, 255));
        SignUpIcon.setForeground(new Color(0, 0, 0));

        LoginIcon.setForeground(new Color(255, 255, 255));
        SignUpFrame SS = new SignUpFrame();
        SS.show();
        this.dispose();

    }//GEN-LAST:event_SignUpIconMouseClicked

    private void SignUpIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpIconMouseEntered
        SignUpButton.setBackground(new Color(0, 87, 159));
    }//GEN-LAST:event_SignUpIconMouseEntered

    private void SignUpIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpIconMouseExited
        SignUpButton.setBackground(new Color(1, 62, 125));
    }//GEN-LAST:event_SignUpIconMouseExited

    private void LoginIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginIconMouseClicked
    
        
        SpacePharmacyIcon.setForeground(new Color(255, 255, 255));
        PyramidPharmacyIcon.setForeground(new Color(255, 255, 255));

        SignUpIcon.setForeground(new Color(255, 255, 255));

        if (unit.activeUserIndex == -2) {
            LoginIcon.setForeground(new Color(0, 0, 0));
            LoginFrame l1 = new LoginFrame();
            l1.show();
            this.dispose();
        }
        else {
            unit.activeUserIndex = -2;
            LoginIcon.setText("Login");
            SignUpIcon.setVisible(true);
            changePanel(salePanel_3);
            JOptionPane.showMessageDialog(this, "Successfully Logout.", "Logout", JOptionPane.INFORMATION_MESSAGE);
            unit.unRemeberMe();
            GetStartedIcon.setVisible(true);
            GetStarted.setVisible(true);
            

        }


    }//GEN-LAST:event_LoginIconMouseClicked

    private void LoginIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginIconMouseEntered
        LoginButton.setBackground(new Color(0, 87, 159));
    }//GEN-LAST:event_LoginIconMouseEntered

    private void LoginIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginIconMouseExited
        LoginButton.setBackground(new Color(1, 62, 125));
    }//GEN-LAST:event_LoginIconMouseExited

//        

    private void menuLabel_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_1MouseEntered
        Menu_1.setBackground(new Color(255, 255, 255));
        menuLabel_1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_menuLabel_1MouseEntered

    private void menuLabel_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_1MouseExited
        Menu_1.setBackground(new Color(0, 0, 0));
        menuLabel_1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuLabel_1MouseExited

    private void Menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_1MouseClicked
        MenuPanel_1.setVisible(true);
    }//GEN-LAST:event_Menu_1MouseClicked

    private void productsLabel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_1MouseClicked
        changePanel2(productsPanel_1);
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_productsLabel_1MouseClicked

    private void productsLabel_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_1MouseEntered
        products_1.setBackground(new Color(255, 255, 255));
        productsLabel_1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_productsLabel_1MouseEntered

    private void productsLabel_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_1MouseExited
        products_1.setBackground(new Color(0, 0, 0));
        productsLabel_1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_productsLabel_1MouseExited

    private void aboutUs_label_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_1MouseClicked
        changePanel2(aboutUsPanel_1);
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_aboutUs_label_1MouseClicked

    private void aboutUs_label_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_1MouseEntered
        aboutUs_1.setBackground(new Color(255, 255, 255));
        aboutUs_label_1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_aboutUs_label_1MouseEntered

    private void aboutUs_label_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_1MouseExited
        aboutUs_1.setBackground(new Color(0, 0, 0));
        aboutUs_label_1.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_aboutUs_label_1MouseExited

    private void contact_label_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_label_1KeyPressed
        changePanel2(contactPanel_1);
        MenuPanel_1.setVisible(false);
    }//GEN-LAST:event_contact_label_1KeyPressed

    private void contact_label_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_1MouseClicked
        changePanel2(contactPanel_1);
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_contact_label_1MouseClicked

    private void contact_label_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_1MouseEntered
        contact_1.setBackground(new Color(255, 255, 255));
        contact_label_1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_contact_label_1MouseEntered

    private void contact_label_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_1MouseExited
        contact_1.setBackground(new Color(0, 0, 0));
        contact_label_1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_contact_label_1MouseExited

    private void saleLabel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_1MouseClicked
        changePanel2(salePanel_1);
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_saleLabel_1MouseClicked

    private void saleLabel_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_1MouseEntered
        sale_1.setBackground(new Color(255, 255, 255));
        saleLabel_1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_saleLabel_1MouseEntered

    private void saleLabel_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_1MouseExited
        sale_1.setBackground(new Color(0, 0, 0));
        saleLabel_1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_saleLabel_1MouseExited

    private void menuLabel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_1MouseClicked
        MenuPanel_1.setVisible(true);
        Menu_1.setVisible(false);
    }//GEN-LAST:event_menuLabel_1MouseClicked

    private void menuLabel_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_2MouseClicked
        MenuPanel_2.setVisible(true);
        Menu_2.setVisible(false);
    }//GEN-LAST:event_menuLabel_2MouseClicked

    private void menuLabel_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_2MouseEntered
        Menu_2.setBackground(new Color(255, 255, 255));
        menuLabel_2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_menuLabel_2MouseEntered

    private void menuLabel_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabel_2MouseExited
        Menu_2.setBackground(new Color(0, 0, 0));
        menuLabel_2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuLabel_2MouseExited

    private void Menu_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_2MouseClicked

    }//GEN-LAST:event_Menu_2MouseClicked

    private void productsLabel_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_2MouseClicked
        changePanel3(productsPanel_2);
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_productsLabel_2MouseClicked

    private void productsLabel_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_2MouseEntered
        products_2.setBackground(new Color(255, 255, 255));
        productsLabel_2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_productsLabel_2MouseEntered

    private void productsLabel_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabel_2MouseExited
        products_2.setBackground(new Color(0, 0, 0));
        productsLabel_2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_productsLabel_2MouseExited

    private void aboutUs_label_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_2MouseClicked
        changePanel3(aboutUsPanel_2);
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_aboutUs_label_2MouseClicked

    private void aboutUs_label_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_2MouseEntered
        aboutUs_2.setBackground(new Color(255, 255, 255));
        aboutUs_label_2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_aboutUs_label_2MouseEntered

    private void aboutUs_label_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUs_label_2MouseExited
        aboutUs_2.setBackground(new Color(0, 0, 0));
        aboutUs_label_2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_aboutUs_label_2MouseExited

    private void contact_label_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_2MouseClicked
        changePanel3(contactPanel_2);
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_contact_label_2MouseClicked

    private void contact_label_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_2MouseEntered
        contact_2.setBackground(new Color(255, 255, 255));
        contact_label_2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_contact_label_2MouseEntered

    private void contact_label_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_label_2MouseExited
        contact_2.setBackground(new Color(0, 0, 0));
        contact_label_2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_contact_label_2MouseExited

    private void contact_label_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_label_2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_label_2KeyPressed

    private void saleLabel_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_2MouseClicked
        changePanel3(salePanel_2);
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_saleLabel_2MouseClicked

    private void saleLabel_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_2MouseEntered
        sale_2.setBackground(new Color(255, 255, 255));
        saleLabel_2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_saleLabel_2MouseEntered

    private void saleLabel_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabel_2MouseExited
        sale_2.setBackground(new Color(0, 0, 0));
        saleLabel_2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_saleLabel_2MouseExited

    private void SpacePharmacyBackground_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_5MouseClicked
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_5MouseClicked

    private void SpacePharmacyBackground_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_6MouseClicked
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_6MouseClicked

    private void SpacePharmacyBackground_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_7MouseClicked
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_7MouseClicked

    private void SpacePharmacyBackground_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_8MouseClicked
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_8MouseClicked

    private void SpacePharmacyBackground_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_1MouseClicked
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_1MouseClicked

    private void SpacePharmacyBackground_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_3MouseClicked
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_3MouseClicked

    private void SpacePharmacyBackground_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_4MouseClicked
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_4MouseClicked

    private void SpacePharmacyBackground_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_2MouseClicked
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_SpacePharmacyBackground_2MouseClicked

    private void CartIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartIconMouseClicked
        if(unit.activeUserIndex>=0){
            changePanel(CartContent);
        }
        else{
            changePanel(salePanel_3);
        }
        SpacePharmacyIcon.setForeground(new Color(255, 255, 255));
        PyramidPharmacyIcon.setForeground(new Color(255, 255, 255));
        SignUpIcon.setForeground(new Color(255, 255, 255));
        buy.setText("Your products are: " + unit.users.get(unit.activeUserIndex).orders.get_bought());
        price.setText("Total price: " + unit.users.get(unit.activeUserIndex).orders.get_price());
    }//GEN-LAST:event_CartIconMouseClicked

    private void CartIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartIconMouseEntered
        LoginIcon.setForeground(new Color(255, 255, 255));
        CartButton.setBackground(new Color(55, 89, 169, 80));
    }//GEN-LAST:event_CartIconMouseEntered

    private void CartIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartIconMouseExited
        CartButton.setBackground(Color.WHITE);
    }//GEN-LAST:event_CartIconMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.2) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void CloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseClicked

        unit.saveUsers();
        System.exit(0);
    }//GEN-LAST:event_CloseIconMouseClicked

    private void CloseIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseEntered
        CloseButton.setBackground(Color.red);
    }//GEN-LAST:event_CloseIconMouseEntered

    private void CloseIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseExited
        CloseButton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_CloseIconMouseExited

    private void GetStartedIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetStartedIconMouseEntered
        GetStarted.setBackground(new Color(222, 233, 253));
        GetStartedIcon.setForeground(new Color(35, 61, 151));
    }//GEN-LAST:event_GetStartedIconMouseEntered

    private void GetStartedIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetStartedIconMouseExited
        GetStarted.setBackground(new Color(1, 61, 123));
        GetStartedIcon.setForeground(Color.WHITE);
    }//GEN-LAST:event_GetStartedIconMouseExited

    private void GetStartedIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetStartedIconMouseClicked
        SignUpFrame SS = new SignUpFrame();
        SS.show();
        this.dispose();
    }//GEN-LAST:event_GetStartedIconMouseClicked

    private void plus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus2MouseClicked
         showNum1.setText((Integer.parseInt(showNum1.getText())+1)+"");
        
    }//GEN-LAST:event_plus2MouseClicked

    private void minus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus1MouseClicked
        if(Integer.parseInt(showNum1.getText())>0){
        showNum1.setText((Integer.parseInt(showNum1.getText())-1)+"");
        }
    }//GEN-LAST:event_minus1MouseClicked

    private void minus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus2MouseClicked
        if(Integer.parseInt(showNum2.getText())>0){
        showNum2.setText((Integer.parseInt(showNum2.getText())-1)+"");
        }
    }//GEN-LAST:event_minus2MouseClicked

    private void plus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus3MouseClicked
          showNum2.setText((Integer.parseInt(showNum2.getText())+1)+"");
        
    }//GEN-LAST:event_plus3MouseClicked

    private void minus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus3MouseClicked
        if(Integer.parseInt(showNum3.getText())>0){
        showNum3.setText((Integer.parseInt(showNum3.getText())-1)+"");
        }
    }//GEN-LAST:event_minus3MouseClicked

    private void plus4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus4MouseClicked
          showNum3.setText((Integer.parseInt(showNum3.getText())+1)+"");
        
    }//GEN-LAST:event_plus4MouseClicked

    private void minus4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus4MouseClicked
        if(Integer.parseInt(showNum4.getText())>0){
        showNum4.setText((Integer.parseInt(showNum4.getText())-1)+"");
        }
    }//GEN-LAST:event_minus4MouseClicked

    private void plus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus5MouseClicked
         showNum4.setText((Integer.parseInt(showNum4.getText())+1)+"");
    }//GEN-LAST:event_plus5MouseClicked

    private void minus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus5MouseClicked
       if(Integer.parseInt(showNum5.getText())>0){
        showNum5.setText((Integer.parseInt(showNum5.getText())-1)+"");
        }
    }//GEN-LAST:event_minus5MouseClicked

    private void plus6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus6MouseClicked
      
        showNum5.setText((Integer.parseInt(showNum5.getText())+1)+"");
        
    }//GEN-LAST:event_plus6MouseClicked

    private void minus6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus6MouseClicked
        if(Integer.parseInt(showNum6.getText())>0){
        showNum6.setText((Integer.parseInt(showNum6.getText())-1)+"");
        }
    }//GEN-LAST:event_minus6MouseClicked

    private void plus7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus7MouseClicked
        showNum6.setText((Integer.parseInt(showNum6.getText())+1)+"");
        
    }//GEN-LAST:event_plus7MouseClicked

    private void minus7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus7MouseClicked
        if(Integer.parseInt(showNum6.getText())>0){
        showNum6.setText((Integer.parseInt(showNum6.getText())-1)+"");
        }
    }//GEN-LAST:event_minus7MouseClicked

    private void plus8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus8MouseClicked
         showNum7.setText((Integer.parseInt(showNum7.getText())+1)+"");
    }//GEN-LAST:event_plus8MouseClicked

    private void minus8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus8MouseClicked
        if(Integer.parseInt(showNum8.getText())>0){
        showNum8.setText((Integer.parseInt(showNum8.getText())-1)+"");
        }
    }//GEN-LAST:event_minus8MouseClicked

    private void plus9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus9MouseClicked
         showNum8.setText((Integer.parseInt(showNum8.getText())+1)+"");
        
    }//GEN-LAST:event_plus9MouseClicked

    private void minus9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus9MouseClicked
        if(Integer.parseInt(showNum9.getText())>0){
        showNum9.setText((Integer.parseInt(showNum9.getText())-1)+"");
        }
    }//GEN-LAST:event_minus9MouseClicked

    private void plus10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus10MouseClicked
        showNum9.setText((Integer.parseInt(showNum9.getText())+1)+"");
        
    }//GEN-LAST:event_plus10MouseClicked

    private void minus10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus10MouseClicked
        if(Integer.parseInt(showNum10.getText())>0){
        showNum10.setText((Integer.parseInt(showNum10.getText())-1)+"");
        }
    }//GEN-LAST:event_minus10MouseClicked

    private void plus11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus11MouseClicked
        showNum10.setText((Integer.parseInt(showNum10.getText())+1)+"");
        
    }//GEN-LAST:event_plus11MouseClicked

    private void BigDealOfferIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIconMouseEntered
        BigDealOffer.setBackground(Color.BLACK);
        ImageIcon Hover = new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-offer-hover-100.png");
        BigDealOfferIcon.setIcon(Hover);
    }//GEN-LAST:event_BigDealOfferIconMouseEntered

    private void BigDealOfferIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIconMouseExited
        BigDealOffer.setBackground(Color.WHITE);
        ImageIcon Exited = new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-offer-100.png");
        BigDealOfferIcon.setIcon(Exited);
    }//GEN-LAST:event_BigDealOfferIconMouseExited

    private void BigDealOfferIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIconMouseClicked
        changePanel2(salePanel_1);
        MenuPanel_1.setVisible(false);
        Menu_1.setVisible(true);
    }//GEN-LAST:event_BigDealOfferIconMouseClicked

    private void minus11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus11MouseClicked
        if(Integer.parseInt(showNum11.getText())>0){
        showNum11.setText((Integer.parseInt(showNum11.getText())-1)+"");
        }
    }//GEN-LAST:event_minus11MouseClicked

    private void plus12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus12MouseClicked
        showNum11.setText((Integer.parseInt(showNum11.getText())+1)+"");
    }//GEN-LAST:event_plus12MouseClicked

    private void minus12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus12MouseClicked
        if(Integer.parseInt(showNum12.getText())>0){
        showNum12.setText((Integer.parseInt(showNum12.getText())-1)+"");
        }
    }//GEN-LAST:event_minus12MouseClicked

    private void plus13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus13MouseClicked
        showNum12.setText((Integer.parseInt(showNum12.getText())+1)+"");
    }//GEN-LAST:event_plus13MouseClicked

    private void minus13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus13MouseClicked
        if(Integer.parseInt(showNum13.getText())>0){
        showNum13.setText((Integer.parseInt(showNum13.getText())-1)+"");
        }
    }//GEN-LAST:event_minus13MouseClicked

    private void plus14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus14MouseClicked
       showNum13.setText((Integer.parseInt(showNum13.getText())+1)+"");
    }//GEN-LAST:event_plus14MouseClicked

    private void minus14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus14MouseClicked
        if(Integer.parseInt(showNum14.getText())>0){
        showNum14.setText((Integer.parseInt(showNum14.getText())-1)+"");
        }
    }//GEN-LAST:event_minus14MouseClicked

    private void plus15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus15MouseClicked
        showNum14.setText((Integer.parseInt(showNum14.getText())+1)+"");
    }//GEN-LAST:event_plus15MouseClicked

    private void minus15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus15MouseClicked
        if(Integer.parseInt(showNum15.getText())>0){
        showNum15.setText((Integer.parseInt(showNum15.getText())-1)+"");
        }
    }//GEN-LAST:event_minus15MouseClicked

    private void plus16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus16MouseClicked
       showNum15.setText((Integer.parseInt(showNum15.getText())+1)+"");
    }//GEN-LAST:event_plus16MouseClicked

    private void minus16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus16MouseClicked
        if(Integer.parseInt(showNum16.getText())>0){
        showNum16.setText((Integer.parseInt(showNum16.getText())-1)+"");
        }
    }//GEN-LAST:event_minus16MouseClicked

    private void plus17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus17MouseClicked
        showNum16.setText((Integer.parseInt(showNum16.getText())+1)+"");
    }//GEN-LAST:event_plus17MouseClicked

    private void minus17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus17MouseClicked
        if(Integer.parseInt(showNum17.getText())>0){
        showNum17.setText((Integer.parseInt(showNum17.getText())-1)+"");
        }
    }//GEN-LAST:event_minus17MouseClicked

    private void plus18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus18MouseClicked
        showNum17.setText((Integer.parseInt(showNum17.getText())+1)+"");
    }//GEN-LAST:event_plus18MouseClicked

    private void minus18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus18MouseClicked
       if(Integer.parseInt(showNum18.getText())>0){
        showNum18.setText((Integer.parseInt(showNum18.getText())-1)+"");
        }
    }//GEN-LAST:event_minus18MouseClicked

    private void plus19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus19MouseClicked
       showNum18.setText((Integer.parseInt(showNum18.getText())+1)+"");
    }//GEN-LAST:event_plus19MouseClicked

    private void minus19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus19MouseClicked
        if(Integer.parseInt(showNum19.getText())>0){
        showNum19.setText((Integer.parseInt(showNum19.getText())-1)+"");
        }
    }//GEN-LAST:event_minus19MouseClicked

    private void plus20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus20MouseClicked
        showNum19.setText((Integer.parseInt(showNum19.getText())+1)+"");
    }//GEN-LAST:event_plus20MouseClicked

    private void minus20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus20MouseClicked
        if(Integer.parseInt(showNum20.getText())>0){
        showNum20.setText((Integer.parseInt(showNum20.getText())-1)+"");
        }
    }//GEN-LAST:event_minus20MouseClicked

    private void plus21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus21MouseClicked
        showNum20.setText((Integer.parseInt(showNum20.getText())+1)+"");
    }//GEN-LAST:event_plus21MouseClicked

    private void BigDealOfferIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIcon1MouseClicked
       changePanel3(salePanel_2);
        MenuPanel_2.setVisible(false);
        Menu_2.setVisible(true);
    }//GEN-LAST:event_BigDealOfferIcon1MouseClicked

    private void BigDealOfferIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIcon1MouseEntered
       BigDealOffer1.setBackground(Color.BLACK);
        ImageIcon Hover = new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-offer-hover-100.png");
        BigDealOfferIcon1.setIcon(Hover);
    }//GEN-LAST:event_BigDealOfferIcon1MouseEntered

    private void BigDealOfferIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BigDealOfferIcon1MouseExited
        BigDealOffer1.setBackground(Color.WHITE);
        ImageIcon Exited = new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-offer-100.png");
        BigDealOfferIcon1.setIcon(Exited);
    }//GEN-LAST:event_BigDealOfferIcon1MouseExited

    private void AddToCartWord1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord1MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord1MouseEntered

    private void AddToCartWord1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord1MouseExited
       AddToCartButton1.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon1.setIcon(add11);
        AddToCartWord1.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord1MouseExited

    private void AddToCartIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon1MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon1MouseEntered

    private void AddToCartIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon1MouseExited
       AddToCartButton1.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon1.setIcon(add11);
        AddToCartWord1.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon1MouseExited

    private void AddToCartIcon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon2MouseEntered
        AddToCartButton2.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon2.setIcon(add1);
        AddToCartWord2.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon2MouseEntered

    private void AddToCartIcon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon2MouseExited
        AddToCartButton2.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon2.setIcon(add11);
        AddToCartWord2.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon2MouseExited

    private void AddToCartWord2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord2MouseEntered
        AddToCartButton2.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon2.setIcon(add1);
        AddToCartWord2.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord2MouseEntered

    private void AddToCartWord2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord2MouseExited
        AddToCartButton2.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon2.setIcon(add11);
        AddToCartWord2.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord2MouseExited

    private void AddToCartIcon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon3MouseEntered
        AddToCartButton3.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon3.setIcon(add1);
        AddToCartWord3.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon3MouseEntered

    private void AddToCartIcon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon3MouseExited
        AddToCartButton3.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon3.setIcon(add11);
        AddToCartWord3.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon3MouseExited

    private void AddToCartWord3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord3MouseEntered
       AddToCartButton3.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon3.setIcon(add1);
        AddToCartWord3.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord3MouseEntered

    private void AddToCartWord3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord3MouseExited
        AddToCartButton3.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon3.setIcon(add11);
        AddToCartWord3.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord3MouseExited

    private void AddToCartIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon4MouseEntered
        AddToCartButton4.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon4.setIcon(add1);
        AddToCartWord4.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon4MouseEntered

    private void AddToCartIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon4MouseExited
        AddToCartButton4.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon4.setIcon(add11);
        AddToCartWord4.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon4MouseExited

    private void AddToCartWord4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord4MouseEntered
        AddToCartButton4.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon4.setIcon(add1);
        AddToCartWord4.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord4MouseEntered

    private void AddToCartWord4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord4MouseExited
       AddToCartButton4.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon4.setIcon(add11);
        AddToCartWord4.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord4MouseExited

    private void AddToCartIcon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon5MouseEntered
        AddToCartButton5.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon5.setIcon(add1);
        AddToCartWord5.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon5MouseEntered

    private void AddToCartIcon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon5MouseExited
       AddToCartButton5.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon5.setIcon(add11);
        AddToCartWord5.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon5MouseExited

    private void AddToCartWord5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord5MouseEntered
       AddToCartButton5.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon5.setIcon(add1);
        AddToCartWord5.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord5MouseEntered

    private void AddToCartWord5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord5MouseExited
        AddToCartButton5.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon5.setIcon(add11);
        AddToCartWord5.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord5MouseExited

    private void AddToCartIcon6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon6MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon6MouseEntered

    private void AddToCartIcon6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon6MouseExited

    private void AddToCartWord6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord6MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord6MouseEntered

    private void AddToCartWord6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord6MouseExited

    private void AddToCartIcon7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon7MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon7MouseEntered

    private void AddToCartIcon7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon7MouseExited

    private void AddToCartWord7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord7MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord7MouseEntered

    private void AddToCartWord7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord7MouseExited

    private void AddToCartIcon8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon8MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon8MouseEntered

    private void AddToCartIcon8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon8MouseExited

    private void AddToCartWord8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord8MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord8MouseEntered

    private void AddToCartWord8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord8MouseExited

    private void AddToCartIcon9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon9MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon9MouseEntered

    private void AddToCartIcon9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon9MouseExited

    private void AddToCartWord9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord9MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord9MouseEntered

    private void AddToCartWord9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord9MouseExited

    private void AddToCartIcon10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon10MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon10MouseEntered

    private void AddToCartIcon10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon10MouseExited

    private void AddToCartWord10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord10MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord10MouseEntered

    private void AddToCartWord10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord10MouseExited

    private void AddToCartIcon11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon11MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon11MouseEntered

    private void AddToCartIcon11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon11MouseExited

    private void AddToCartWord11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord11MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord11MouseEntered

    private void AddToCartWord11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord11MouseExited

    private void AddToCartIcon12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon12MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon12MouseEntered

    private void AddToCartIcon12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon12MouseExited

    private void AddToCartWord12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord12MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord12MouseEntered

    private void AddToCartWord12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord12MouseExited

    private void AddToCartIcon13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon13MouseEntered
        AddToCartButton13.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon13.setIcon(add1);
        AddToCartWord13.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon13MouseEntered

    private void AddToCartIcon13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon13MouseExited
       AddToCartButton13.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon13.setIcon(add11);
        AddToCartWord13.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon13MouseExited

    private void AddToCartWord13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord13MouseEntered
        AddToCartButton13.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon13.setIcon(add1);
        AddToCartWord13.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord13MouseEntered

    private void AddToCartWord13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord13MouseExited
       AddToCartButton13.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon13.setIcon(add11);
        AddToCartWord13.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord13MouseExited

    private void AddToCartIcon14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon14MouseEntered
        AddToCartButton14.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon14.setIcon(add1);
        AddToCartWord14.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon14MouseEntered

    private void AddToCartIcon14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon14MouseExited
      AddToCartButton14.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon14.setIcon(add11);
        AddToCartWord14.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon14MouseExited

    private void AddToCartWord14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord14MouseEntered
        AddToCartButton14.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon14.setIcon(add1);
        AddToCartWord14.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord14MouseEntered

    private void AddToCartWord14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord14MouseExited
        AddToCartButton14.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon14.setIcon(add11);
        AddToCartWord14.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord14MouseExited

    private void AddToCartIcon15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon15MouseEntered
        AddToCartButton15.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon15.setIcon(add1);
        AddToCartWord15.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon15MouseEntered

    private void AddToCartIcon15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon15MouseExited
        AddToCartButton15.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon15.setIcon(add11);
        AddToCartWord15.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon15MouseExited

    private void AddToCartWord15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord15MouseEntered
        AddToCartButton15.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon15.setIcon(add1);
        AddToCartWord15.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord15MouseEntered

    private void AddToCartWord15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord15MouseExited
        AddToCartButton15.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon15.setIcon(add11);
        AddToCartWord15.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord15MouseExited

    private void AddToCartIcon16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon16MouseEntered
        AddToCartButton1.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon1.setIcon(add1);
        AddToCartWord1.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon16MouseEntered

    private void AddToCartIcon16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon16MouseExited
      AddToCartButton16.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon16.setIcon(add11);
        AddToCartWord16.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon16MouseExited

    private void AddToCartWord16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord16MouseEntered
        AddToCartButton16.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon16.setIcon(add1);
        AddToCartWord16.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord16MouseEntered

    private void AddToCartWord16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord16MouseExited
       AddToCartButton16.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon16.setIcon(add11);
        AddToCartWord16.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord16MouseExited

    private void AddToCartIcon17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon17MouseEntered
        AddToCartButton16.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon16.setIcon(add1);
        AddToCartWord16.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon17MouseEntered

    private void AddToCartIcon17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon17MouseExited

    private void AddToCartWord17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord17MouseEntered

    private void AddToCartWord17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord17MouseExited

    private void AddToCartIcon18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon18MouseEntered

    private void AddToCartIcon18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon18MouseExited

    private void AddToCartWord18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord18MouseEntered

    private void AddToCartWord18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord18MouseExited

    private void AddToCartIcon19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon19MouseEntered

    private void AddToCartIcon19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon19MouseExited

    private void AddToCartWord19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord19MouseEntered

    private void AddToCartWord19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord19MouseExited

    private void AddToCartIcon20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon20MouseEntered

    private void AddToCartIcon20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon20MouseExited

    private void AddToCartWord20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord20MouseEntered

    private void AddToCartWord20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord20MouseExited

    private void AddToCartIcon21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon21MouseEntered

    private void AddToCartIcon21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon21MouseExited

    private void AddToCartWord21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord21MouseEntered

    private void AddToCartWord21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord21MouseExited

    private void AddToCartIcon22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon22MouseEntered

    private void AddToCartIcon22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon22MouseExited

    private void AddToCartWord22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord22MouseEntered

    private void AddToCartWord22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord22MouseExited

    private void AddToCartIcon23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon23MouseEntered

    private void AddToCartIcon23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon23MouseExited

    private void AddToCartWord23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord23MouseEntered

    private void AddToCartWord23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord23MouseExited

    private void AddToCartIcon24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon24MouseEntered
        AddToCartButton24.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon24.setIcon(add1);
        AddToCartWord24.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon24MouseEntered

    private void AddToCartIcon24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon24MouseExited
       AddToCartButton24.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon24.setIcon(add11);
        AddToCartWord24.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon24MouseExited

    private void AddToCartWord24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord24MouseEntered
        AddToCartButton24.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon24.setIcon(add1);
        AddToCartWord24.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord24MouseEntered

    private void AddToCartWord24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord24MouseExited
        AddToCartButton24.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon24.setIcon(add11);
        AddToCartWord24.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord24MouseExited

    private void AddToCartIcon25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon25MouseEntered
        AddToCartButton25.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon25.setIcon(add1);
        AddToCartWord25.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon25MouseEntered

    private void AddToCartIcon25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon25MouseExited
        AddToCartButton25.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon25.setIcon(add11);
        AddToCartWord25.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon25MouseExited

    private void AddToCartWord25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord25MouseEntered
        AddToCartButton25.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon25.setIcon(add1);
        AddToCartWord25.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord25MouseEntered

    private void AddToCartWord25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord25MouseExited
        AddToCartButton25.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon25.setIcon(add11);
        AddToCartWord25.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord25MouseExited

    private void AddToCartIcon26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon26MouseEntered
        AddToCartButton26.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon26.setIcon(add1);
        AddToCartWord26.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon26MouseEntered

    private void AddToCartIcon26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon26MouseExited
        AddToCartButton26.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon26.setIcon(add11);
        AddToCartWord26.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon26MouseExited

    private void AddToCartWord26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord26MouseEntered
        AddToCartButton26.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon26.setIcon(add1);
        AddToCartWord26.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord26MouseEntered

    private void AddToCartWord26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord26MouseExited
      AddToCartButton26.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon26.setIcon(add11);
        AddToCartWord26.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord26MouseExited

    private void AddToCartIcon27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon27MouseEntered
        AddToCartButton27.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon27.setIcon(add1);
        AddToCartWord27.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon27MouseEntered

    private void AddToCartIcon27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon27MouseExited
        AddToCartButton27.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon27.setIcon(add11);
        AddToCartWord27.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon27MouseExited

    private void AddToCartWord27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord27MouseEntered
        AddToCartButton27.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon27.setIcon(add1);
        AddToCartWord27.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord27MouseEntered

    private void AddToCartWord27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord27MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord27MouseExited

    private void AddToCartIcon28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon28MouseEntered
        AddToCartButton28.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon28.setIcon(add1);
        AddToCartWord28.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon28MouseEntered

    private void AddToCartIcon28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon28MouseExited
        AddToCartButton28.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon28.setIcon(add11);
        AddToCartWord28.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon28MouseExited

    private void AddToCartWord28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord28MouseEntered
        AddToCartButton28.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon28.setIcon(add1);
        AddToCartWord28.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord28MouseEntered

    private void AddToCartWord28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord28MouseExited
        AddToCartButton28.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon28.setIcon(add11);
        AddToCartWord28.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord28MouseExited

    private void AddToCartIcon29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon29MouseEntered

    private void AddToCartIcon29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon29MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon29MouseExited

    private void AddToCartWord29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord29MouseEntered

    private void AddToCartWord29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord29MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord29MouseExited

    private void AddToCartIcon30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon30MouseEntered

    private void AddToCartIcon30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon30MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon30MouseExited

    private void AddToCartWord30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord30MouseEntered

    private void AddToCartWord30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord30MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord30MouseExited

    private void AddToCartIcon31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon31MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon31MouseEntered

    private void AddToCartIcon31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon31MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon31MouseExited

    private void AddToCartWord31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord31MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord31MouseEntered

    private void AddToCartWord31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord31MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord31MouseExited

    private void AddToCartIcon32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon32MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon32MouseEntered

    private void AddToCartIcon32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon32MouseExited

    private void AddToCartWord32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord32MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord32MouseEntered

    private void AddToCartWord32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord32MouseExited

    private void AddToCartIcon33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon33MouseEntered

    private void AddToCartIcon33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon33MouseExited

    private void AddToCartWord33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord33MouseEntered

    private void AddToCartWord33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord33MouseExited

    private void AddToCartIcon34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon34MouseEntered

    private void AddToCartIcon34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon34MouseExited

    private void AddToCartWord34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord34MouseEntered

    private void AddToCartWord34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord34MouseExited

    private void AddToCartIcon35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon35MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon35MouseEntered

    private void AddToCartIcon35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon35MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon35MouseExited

    private void AddToCartWord35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord35MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord35MouseEntered

    private void AddToCartWord35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord35MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord35MouseExited

    private void AddToCartIcon36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon36MouseEntered
       AddToCartButton36.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon36.setIcon(add1);
        AddToCartWord36.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon36MouseEntered

    private void AddToCartIcon36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon36MouseExited
        AddToCartButton36.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon36.setIcon(add11);
        AddToCartWord36.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon36MouseExited

    private void AddToCartWord36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord36MouseEntered
        AddToCartButton36.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon36.setIcon(add1);
        AddToCartWord36.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord36MouseEntered

    private void AddToCartWord36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord36MouseExited
        AddToCartButton36.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon36.setIcon(add11);
        AddToCartWord36.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord36MouseExited

    private void AddToCartIcon37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon37MouseEntered
        AddToCartButton37.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon37.setIcon(add1);
        AddToCartWord37.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon37MouseEntered

    private void AddToCartIcon37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon37MouseExited
        AddToCartButton37.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon37.setIcon(add11);
        AddToCartWord37.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon37MouseExited

    private void AddToCartWord37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord37MouseEntered
        AddToCartButton37.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon37.setIcon(add1);
        AddToCartWord37.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord37MouseEntered

    private void AddToCartWord37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord37MouseExited
        AddToCartButton37.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon37.setIcon(add11);
        AddToCartWord37.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord37MouseExited

    private void AddToCartIcon38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon38MouseEntered
        AddToCartButton38.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon38.setIcon(add1);
        AddToCartWord38.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon38MouseEntered

    private void AddToCartIcon38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon38MouseExited
        AddToCartButton38.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon38.setIcon(add11);
        AddToCartWord38.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon38MouseExited

    private void AddToCartWord38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord38MouseEntered
        AddToCartButton38.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon38.setIcon(add1);
        AddToCartWord38.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord38MouseEntered

    private void AddToCartWord38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord38MouseExited
        AddToCartButton38.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon38.setIcon(add11);
        AddToCartWord38.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord38MouseExited

    private void AddToCartIcon39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon39MouseEntered
       AddToCartButton39.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon39.setIcon(add1);
        AddToCartWord39.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon39MouseEntered

    private void AddToCartIcon39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon39MouseExited
        AddToCartButton39.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon39.setIcon(add11);
        AddToCartWord39.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon39MouseExited

    private void AddToCartWord39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord39MouseEntered
        AddToCartButton39.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon39.setIcon(add1);
        AddToCartWord39.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord39MouseEntered

    private void AddToCartWord39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord39MouseExited
        AddToCartButton39.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon39.setIcon(add11);
        AddToCartWord39.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord39MouseExited

    private void AddToCartIcon40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon40MouseEntered

    private void AddToCartIcon40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon40MouseExited

    private void AddToCartWord40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord40MouseEntered

    private void AddToCartWord40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord40MouseExited

    private void AddToCartIcon41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon41MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon41MouseEntered

    private void AddToCartIcon41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon41MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon41MouseExited

    private void AddToCartWord41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord41MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord41MouseEntered

    private void AddToCartWord41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord41MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord41MouseExited

    private void AddToCartIcon42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon42MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon42MouseEntered

    private void AddToCartIcon42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon42MouseExited

    private void AddToCartWord42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord42MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord42MouseEntered

    private void AddToCartWord42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord42MouseExited

    private void AddToCartIcon43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon43MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon43MouseEntered

    private void AddToCartIcon43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon43MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon43MouseExited

    private void AddToCartWord43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord43MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord43MouseEntered

    private void AddToCartWord43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord43MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord43MouseExited

    private void AddToCartIcon44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon44MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon44MouseEntered

    private void AddToCartIcon44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon44MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon44MouseExited

    private void AddToCartWord44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord44MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord44MouseEntered

    private void AddToCartWord44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord44MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord44MouseExited

    private void AddToCartIcon45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon45MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon45MouseEntered

    private void AddToCartIcon45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon45MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon45MouseExited

    private void AddToCartWord45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord45MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord45MouseEntered

    private void AddToCartWord45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord45MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord45MouseExited

    private void AddToCartIcon46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon46MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon46MouseEntered

    private void AddToCartIcon46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon46MouseExited

    private void AddToCartWord46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord46MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord46MouseEntered

    private void AddToCartWord46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord46MouseExited
       AddToCartButton47.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon47.setIcon(add11);
        AddToCartWord47.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord46MouseExited

    private void AddToCartIcon47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon47MouseEntered
        AddToCartButton47.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon47.setIcon(add1);
        AddToCartWord47.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon47MouseEntered

    private void AddToCartIcon47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon47MouseExited
        AddToCartButton47.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon47.setIcon(add11);
        AddToCartWord47.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon47MouseExited

    private void AddToCartWord47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord47MouseEntered
        AddToCartButton47.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon47.setIcon(add1);
        AddToCartWord47.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord47MouseEntered

    private void AddToCartWord47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord47MouseExited
        AddToCartButton47.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon47.setIcon(add11);
        AddToCartWord47.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord47MouseExited

    private void AddToCartIcon48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon48MouseEntered
        AddToCartButton48.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon48.setIcon(add1);
        AddToCartWord48.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartIcon48MouseEntered

    private void AddToCartIcon48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon48MouseExited
        AddToCartButton48.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon48.setIcon(add11);
        AddToCartWord48.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartIcon48MouseExited

    private void AddToCartWord48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord48MouseEntered
        AddToCartButton48.setBackground(new Color(177, 221, 241));
        ImageIcon add1 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-shopping-basket-add-35.png");
        AddToCartIcon48.setIcon(add1);
        AddToCartWord48.setForeground(Color.BLACK);
    }//GEN-LAST:event_AddToCartWord48MouseEntered

    private void AddToCartWord48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord48MouseExited
        AddToCartButton48.setBackground(new Color(252,203,6));
        ImageIcon add11 =new ImageIcon("C:\\Users\\Ms Store\\Desktop\\MediaSpaceProject\\MediaSpaceProject\\src\\icon\\icons8-add-shopping-cart-35.png");
        AddToCartIcon48.setIcon(add11);
        AddToCartWord48.setForeground(Color.WHITE);
    }//GEN-LAST:event_AddToCartWord48MouseExited

    private void AddToCartWord5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord5MouseClicked
       int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel3.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum5.getText())!=0)){
            Product p = new Product(jLabel3.getText(),Double.parseDouble(jLabel4.getText()),Integer.parseInt(showNum5.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum5.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum5.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
        showNum5.setText("0");
        
    }//GEN-LAST:event_AddToCartWord5MouseClicked

    private void CartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartButtonMouseClicked
       
    }//GEN-LAST:event_CartButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void SpacePharmacyBackground_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpacePharmacyBackground_9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SpacePharmacyBackground_9MouseClicked

    private void AddToCartWord4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord4MouseClicked
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel5.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum4.getText())!=0)){
            Product p = new Product(jLabel5.getText(),Double.parseDouble(jLabel6.getText()),Integer.parseInt(showNum4.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum4.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum4.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum4.setText("0");
    }//GEN-LAST:event_AddToCartWord4MouseClicked

    private void AddToCartIcon49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon49MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon49MouseEntered

    private void AddToCartIcon49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartIcon49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartIcon49MouseExited

    private void AddToCartWord49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord49MouseClicked

        for(int i =0;i<Branch.space.size();i++){
          int index = unit.users.get(unit.activeUserIndex).orders.search(Branch.space.get(i).name);
          if(!(index == -1)){
              if(Branch.space.get(i).Quantity<unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity){
                  JOptionPane.showMessageDialog(CartContent, "Sorry Quantity of "+ unit.users.get(unit.activeUserIndex).orders.arr.get(index).name + " isn't availabe now");
                  String s = JOptionPane.showInputDialog(CartContent, "Would you like to continue transaction? yes to continue");
                  s.trim();
                  if(!(s.equals("yes"))){
                      break;
                  }
              }
              else{
                  Branch.space.get(i).Quantity-=unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity;
                  
                  JOptionPane.showMessageDialog(CartContent,unit.users.get(unit.activeUserIndex).orders.arr.get(index).name+" Transaction successful!!");
              }
              
          }
        }
        for(int i =0;i<Branch.pyramid.size();i++){
        int index2 = unit.users.get(unit.activeUserIndex).orders.search(Branch.pyramid.get(i).name);
         if(!(index2 == -1)){
             if(Branch.pyramid.get(i).Quantity<unit.users.get(unit.activeUserIndex).orders.arr.get(index2).Quantity){
                  JOptionPane.showMessageDialog(CartContent, "Sorry Quantity of "+ unit.users.get(unit.activeUserIndex).orders.arr.get(index2).name + " isn't availabe now");
            String s1 = JOptionPane.showInputDialog(CartContent, "Would you like to continue transaction? yes to continue");
                 s1.trim();
                 if(!(s1.equals("yes"))){
                     break;
            }
                 }
       
         else{
                Branch.pyramid.get(i).Quantity-=unit.users.get(unit.activeUserIndex).orders.arr.get(index2).Quantity;
                JOptionPane.showMessageDialog(CartContent,unit.users.get(unit.activeUserIndex).orders.arr.get(index2).name+" Transaction successful!!");
              }
         }
        }
        
        changePanel(HomeContent);
        price.setText("Total price: 0");
         buy.setText("Your orders: ");
        try {
            Branch.save();
        } catch (IOException ex) {
            
        }
        unit.users.get(unit.activeUserIndex).orders.arr.clear();
       
    }//GEN-LAST:event_AddToCartWord49MouseClicked

    private void AddToCartWord49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord49MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord49MouseEntered

    private void AddToCartWord49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartWord49MouseExited

    private void AddToCartButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartButton49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToCartButton49MouseClicked

    private void AddToCartWord3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord3MouseClicked
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel7.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum3.getText())!=0)){
            Product p = new Product(jLabel7.getText(),Double.parseDouble(jLabel8.getText()),Integer.parseInt(showNum3.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum3.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum3.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum3.setText("0");
    }//GEN-LAST:event_AddToCartWord3MouseClicked

    private void AddToCartWord2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord2MouseClicked
       int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel9.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum2.getText())!=0)){
            Product p = new Product(jLabel9.getText(),Double.parseDouble(jLabel10.getText()),Integer.parseInt(showNum2.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum2.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum2.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum2.setText("0");
    }//GEN-LAST:event_AddToCartWord2MouseClicked

    private void AddToCartWord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord1MouseClicked
         int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel11.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum1.getText())!=0)){
            Product p = new Product(jLabel11.getText(),Double.parseDouble(jLabel12.getText()),Integer.parseInt(showNum1.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum1.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum1.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum1.setText("0");
    }//GEN-LAST:event_AddToCartWord1MouseClicked

    private void AddToCartWord24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord24MouseClicked
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel13.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum10.getText())!=0)){
            Product p = new Product(jLabel13.getText(),Double.parseDouble(jLabel14.getText()),Integer.parseInt(showNum10.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum10.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum10.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum10.setText("0");
    }//GEN-LAST:event_AddToCartWord24MouseClicked

    private void AddToCartWord16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord16MouseClicked
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel15.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum9.getText())!=0)){
            Product p = new Product(jLabel15.getText(),Double.parseDouble(jLabel16.getText()),Integer.parseInt(showNum9.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum9.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum9.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum9.setText("0");
    }//GEN-LAST:event_AddToCartWord16MouseClicked

    private void AddToCartWord15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord15MouseClicked
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel17.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum8.getText())!=0)){
            Product p = new Product(jLabel17.getText(),Double.parseDouble(jLabel18.getText()),Integer.parseInt(showNum8.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum8.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum8.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum8.setText("0");
    }//GEN-LAST:event_AddToCartWord15MouseClicked

    private void AddToCartWord14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord14MouseClicked
                int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel19.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum7.getText())!=0)){
            Product p = new Product(jLabel17.getText(),Double.parseDouble(jLabel20.getText()),Integer.parseInt(showNum7.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum7.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum7.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum7.setText("0");
    }//GEN-LAST:event_AddToCartWord14MouseClicked

    private void AddToCartWord13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord13MouseClicked
                int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(jLabel21.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum6.getText())!=0)){
            Product p = new Product(jLabel21.getText(),Double.parseDouble(jLabel22.getText()),Integer.parseInt(showNum6.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum6.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum6.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum6.setText("0");
     
    }//GEN-LAST:event_AddToCartWord13MouseClicked

    private void AddToCartWord36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord36MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr16.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum16.getText())!=0)){
            Product p = new Product(pr16.getText(),Double.parseDouble(price16.getText()),Integer.parseInt(showNum16.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum16.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum16.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum16.setText("0");
    }//GEN-LAST:event_AddToCartWord36MouseClicked

    private void AddToCartWord28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord28MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr17.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum17.getText())!=0)){
            Product p = new Product(pr17.getText(),Double.parseDouble(price17.getText()),Integer.parseInt(showNum17.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum17.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum17.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum17.setText("0");
    }//GEN-LAST:event_AddToCartWord28MouseClicked

    private void AddToCartWord27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord27MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr18.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum18.getText())!=0)){
            Product p = new Product(pr18.getText(),Double.parseDouble(price18.getText()),Integer.parseInt(showNum18.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum18.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum18.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum18.setText("0");
    }//GEN-LAST:event_AddToCartWord27MouseClicked

    private void AddToCartWord26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord26MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr19.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum19.getText())!=0)){
            Product p = new Product(pr19.getText(),Double.parseDouble(price19.getText()),Integer.parseInt(showNum19.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum19.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum19.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum19.setText("0");
    }//GEN-LAST:event_AddToCartWord26MouseClicked

    private void AddToCartWord25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord25MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr20.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum20.getText())!=0)){
            Product p = new Product(pr20.getText(),Double.parseDouble(price20.getText()),Integer.parseInt(showNum20.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum20.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum20.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum20.setText("0");
    }//GEN-LAST:event_AddToCartWord25MouseClicked

    private void AddToCartWord37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord37MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr14.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum14.getText())!=0)){
            Product p = new Product(pr14.getText(),Double.parseDouble(price14.getText()),Integer.parseInt(showNum14.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum14.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum14.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum14.setText("0");
    }//GEN-LAST:event_AddToCartWord37MouseClicked

    private void AddToCartWord39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord39MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr12.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum12.getText())!=0)){
            Product p = new Product(pr12.getText(),Double.parseDouble(price12.getText()),Integer.parseInt(showNum12.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum12.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum12.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum12.setText("0");
    }//GEN-LAST:event_AddToCartWord39MouseClicked

    private void AddToCartWord48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord48MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr13.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum13.getText())!=0)){
            Product p = new Product(pr13.getText(),Double.parseDouble(price13.getText()),Integer.parseInt(showNum13.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum13.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum13.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum13.setText("0");
    }//GEN-LAST:event_AddToCartWord48MouseClicked

    private void AddToCartWord38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord38MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr11.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum11.getText())!=0)){
            Product p = new Product(pr11.getText(),Double.parseDouble(price11.getText()),Integer.parseInt(showNum11.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum11.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum11.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum11.setText("0");
    }//GEN-LAST:event_AddToCartWord38MouseClicked

    private void AddToCartWord47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartWord47MouseClicked
        // TODO add your handling code here:
        int index = -5;
        try{
           index = unit.users.get(unit.activeUserIndex).orders.search(pr15.getText()); 
       }
       catch(Exception e){
           
       }
        
        if(index==-5){
             JOptionPane.showMessageDialog(CartContent, "Login to buy!");
        }
        else if(index == -1&&(Integer.parseInt(showNum15.getText())!=0)){
            Product p = new Product(pr15.getText(),Double.parseDouble(price15.getText()),Integer.parseInt(showNum15.getText()));
            unit.users.get(unit.activeUserIndex).orders.arr.add(p);
        }
         
        else if(Integer.parseInt(showNum15.getText())!=0){
            
            unit.users.get(unit.activeUserIndex).orders.arr.get(index).Quantity+=Integer.parseInt(showNum15.getText());
        }
       
        else {
            JOptionPane.showMessageDialog(CartContent, "No item selected");
        }
       
        showNum15.setText("0");
    }//GEN-LAST:event_AddToCartWord47MouseClicked


    
        
     
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFram().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PanelRound AboutUsBackground;
    private PanelRound AboutUsBackground1;
    private PanelRound AboutUsBackground2;
    private PanelRound AddToCartButton1;
    private PanelRound AddToCartButton10;
    private PanelRound AddToCartButton11;
    private PanelRound AddToCartButton12;
    private PanelRound AddToCartButton13;
    private PanelRound AddToCartButton14;
    private PanelRound AddToCartButton15;
    private PanelRound AddToCartButton16;
    private PanelRound AddToCartButton17;
    private PanelRound AddToCartButton18;
    private PanelRound AddToCartButton19;
    private PanelRound AddToCartButton2;
    private PanelRound AddToCartButton20;
    private PanelRound AddToCartButton21;
    private PanelRound AddToCartButton22;
    private PanelRound AddToCartButton23;
    private PanelRound AddToCartButton24;
    private PanelRound AddToCartButton25;
    private PanelRound AddToCartButton26;
    private PanelRound AddToCartButton27;
    private PanelRound AddToCartButton28;
    private PanelRound AddToCartButton29;
    private PanelRound AddToCartButton3;
    private PanelRound AddToCartButton30;
    private PanelRound AddToCartButton31;
    private PanelRound AddToCartButton32;
    private PanelRound AddToCartButton33;
    private PanelRound AddToCartButton34;
    private PanelRound AddToCartButton35;
    private PanelRound AddToCartButton36;
    private PanelRound AddToCartButton37;
    private PanelRound AddToCartButton38;
    private PanelRound AddToCartButton39;
    private PanelRound AddToCartButton4;
    private PanelRound AddToCartButton40;
    private PanelRound AddToCartButton41;
    private PanelRound AddToCartButton42;
    private PanelRound AddToCartButton43;
    private PanelRound AddToCartButton44;
    private PanelRound AddToCartButton45;
    private PanelRound AddToCartButton46;
    private PanelRound AddToCartButton47;
    private PanelRound AddToCartButton48;
    private PanelRound AddToCartButton49;
    private PanelRound AddToCartButton5;
    private PanelRound AddToCartButton6;
    private PanelRound AddToCartButton7;
    private PanelRound AddToCartButton8;
    private PanelRound AddToCartButton9;
    private javax.swing.JLabel AddToCartIcon1;
    private javax.swing.JLabel AddToCartIcon10;
    private javax.swing.JLabel AddToCartIcon11;
    private javax.swing.JLabel AddToCartIcon12;
    private javax.swing.JLabel AddToCartIcon13;
    private javax.swing.JLabel AddToCartIcon14;
    private javax.swing.JLabel AddToCartIcon15;
    private javax.swing.JLabel AddToCartIcon16;
    private javax.swing.JLabel AddToCartIcon17;
    private javax.swing.JLabel AddToCartIcon18;
    private javax.swing.JLabel AddToCartIcon19;
    private javax.swing.JLabel AddToCartIcon2;
    private javax.swing.JLabel AddToCartIcon20;
    private javax.swing.JLabel AddToCartIcon21;
    private javax.swing.JLabel AddToCartIcon22;
    private javax.swing.JLabel AddToCartIcon23;
    private javax.swing.JLabel AddToCartIcon24;
    private javax.swing.JLabel AddToCartIcon25;
    private javax.swing.JLabel AddToCartIcon26;
    private javax.swing.JLabel AddToCartIcon27;
    private javax.swing.JLabel AddToCartIcon28;
    private javax.swing.JLabel AddToCartIcon29;
    private javax.swing.JLabel AddToCartIcon3;
    private javax.swing.JLabel AddToCartIcon30;
    private javax.swing.JLabel AddToCartIcon31;
    private javax.swing.JLabel AddToCartIcon32;
    private javax.swing.JLabel AddToCartIcon33;
    private javax.swing.JLabel AddToCartIcon34;
    private javax.swing.JLabel AddToCartIcon35;
    private javax.swing.JLabel AddToCartIcon36;
    private javax.swing.JLabel AddToCartIcon37;
    private javax.swing.JLabel AddToCartIcon38;
    private javax.swing.JLabel AddToCartIcon39;
    private javax.swing.JLabel AddToCartIcon4;
    private javax.swing.JLabel AddToCartIcon40;
    private javax.swing.JLabel AddToCartIcon41;
    private javax.swing.JLabel AddToCartIcon42;
    private javax.swing.JLabel AddToCartIcon43;
    private javax.swing.JLabel AddToCartIcon44;
    private javax.swing.JLabel AddToCartIcon45;
    private javax.swing.JLabel AddToCartIcon46;
    private javax.swing.JLabel AddToCartIcon47;
    private javax.swing.JLabel AddToCartIcon48;
    private javax.swing.JLabel AddToCartIcon49;
    private javax.swing.JLabel AddToCartIcon5;
    private javax.swing.JLabel AddToCartIcon6;
    private javax.swing.JLabel AddToCartIcon7;
    private javax.swing.JLabel AddToCartIcon8;
    private javax.swing.JLabel AddToCartIcon9;
    private javax.swing.JLabel AddToCartWord1;
    private javax.swing.JLabel AddToCartWord10;
    private javax.swing.JLabel AddToCartWord11;
    private javax.swing.JLabel AddToCartWord12;
    private javax.swing.JLabel AddToCartWord13;
    private javax.swing.JLabel AddToCartWord14;
    private javax.swing.JLabel AddToCartWord15;
    private javax.swing.JLabel AddToCartWord16;
    private javax.swing.JLabel AddToCartWord17;
    private javax.swing.JLabel AddToCartWord18;
    private javax.swing.JLabel AddToCartWord19;
    private javax.swing.JLabel AddToCartWord2;
    private javax.swing.JLabel AddToCartWord20;
    private javax.swing.JLabel AddToCartWord21;
    private javax.swing.JLabel AddToCartWord22;
    private javax.swing.JLabel AddToCartWord23;
    private javax.swing.JLabel AddToCartWord24;
    private javax.swing.JLabel AddToCartWord25;
    private javax.swing.JLabel AddToCartWord26;
    private javax.swing.JLabel AddToCartWord27;
    private javax.swing.JLabel AddToCartWord28;
    private javax.swing.JLabel AddToCartWord29;
    private javax.swing.JLabel AddToCartWord3;
    private javax.swing.JLabel AddToCartWord30;
    private javax.swing.JLabel AddToCartWord31;
    private javax.swing.JLabel AddToCartWord32;
    private javax.swing.JLabel AddToCartWord33;
    private javax.swing.JLabel AddToCartWord34;
    private javax.swing.JLabel AddToCartWord35;
    private javax.swing.JLabel AddToCartWord36;
    private javax.swing.JLabel AddToCartWord37;
    private javax.swing.JLabel AddToCartWord38;
    private javax.swing.JLabel AddToCartWord39;
    private javax.swing.JLabel AddToCartWord4;
    private javax.swing.JLabel AddToCartWord40;
    private javax.swing.JLabel AddToCartWord41;
    private javax.swing.JLabel AddToCartWord42;
    private javax.swing.JLabel AddToCartWord43;
    private javax.swing.JLabel AddToCartWord44;
    private javax.swing.JLabel AddToCartWord45;
    private javax.swing.JLabel AddToCartWord46;
    private javax.swing.JLabel AddToCartWord47;
    private javax.swing.JLabel AddToCartWord48;
    private javax.swing.JLabel AddToCartWord49;
    private javax.swing.JLabel AddToCartWord5;
    private javax.swing.JLabel AddToCartWord6;
    private javax.swing.JLabel AddToCartWord7;
    private javax.swing.JLabel AddToCartWord8;
    private javax.swing.JLabel AddToCartWord9;
    private javax.swing.JPanel BarBG;
    private PanelRound BigDealOffer;
    private PanelRound BigDealOffer1;
    private javax.swing.JLabel BigDealOfferIcon;
    private javax.swing.JLabel BigDealOfferIcon1;
    private PanelRound CartButton;
    private javax.swing.JPanel CartContent;
    private javax.swing.JLabel CartIcon;
    private PanelRound CloseButton;
    private javax.swing.JLabel CloseIcon;
    private PanelRound Contact;
    private PanelRound Contact1;
    private javax.swing.JLabel ContactUs;
    private javax.swing.JLabel ContactUs1;
    private PanelRound Description1;
    private PanelRound Description10;
    private PanelRound Description11;
    private PanelRound Description12;
    private PanelRound Description13;
    private PanelRound Description14;
    private PanelRound Description15;
    private PanelRound Description16;
    private PanelRound Description17;
    private PanelRound Description18;
    private PanelRound Description19;
    private PanelRound Description2;
    private PanelRound Description20;
    private PanelRound Description3;
    private PanelRound Description4;
    private PanelRound Description5;
    private PanelRound Description6;
    private PanelRound Description7;
    private PanelRound Description8;
    private PanelRound Description9;
    private PanelRound GetStarted;
    private javax.swing.JLabel GetStartedIcon;
    private javax.swing.JLabel HomeBackground;
    private javax.swing.JLabel HomeBackground1;
    private javax.swing.JPanel HomeButton;
    private javax.swing.JPanel HomeContent;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JPanel Line;
    private javax.swing.JPanel LinePyramid_1;
    private javax.swing.JPanel LinePyramid_2;
    private javax.swing.JPanel LinePyramid_3;
    private javax.swing.JPanel LinePyramid_4;
    private javax.swing.JPanel LineSpace_1;
    private javax.swing.JPanel LineSpace_2;
    private javax.swing.JPanel LineSpace_3;
    private javax.swing.JPanel LineSpace_4;
    private javax.swing.JPanel LineSpace_5;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JPanel LoginContent;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JPanel MenuPanel_1;
    private javax.swing.JPanel MenuPanel_2;
    private javax.swing.JPanel Menu_1;
    private javax.swing.JPanel Menu_2;
    private PanelRound ProductImage1;
    private PanelRound ProductImage10;
    private PanelRound ProductImage11;
    private PanelRound ProductImage12;
    private PanelRound ProductImage13;
    private PanelRound ProductImage14;
    private PanelRound ProductImage15;
    private PanelRound ProductImage16;
    private PanelRound ProductImage17;
    private PanelRound ProductImage18;
    private PanelRound ProductImage19;
    private PanelRound ProductImage2;
    private PanelRound ProductImage20;
    private PanelRound ProductImage3;
    private PanelRound ProductImage4;
    private PanelRound ProductImage5;
    private PanelRound ProductImage6;
    private PanelRound ProductImage7;
    private PanelRound ProductImage8;
    private PanelRound ProductImage9;
    private PanelRound ProductsContainer;
    private PanelRound ProductsContainer1;
    private PanelRound ProductsTitle;
    private PanelRound ProductsTitle1;
    private javax.swing.JLabel ProductsTitleIcon;
    private javax.swing.JLabel ProductsTitleIcon1;
    private javax.swing.JPanel PyramidPharmacyButton;
    private javax.swing.JPanel PyramidPharmacyContent;
    private javax.swing.JLabel PyramidPharmacyIcon;
    private javax.swing.JPanel SignUpButton;
    private javax.swing.JPanel SignUpContent;
    private javax.swing.JLabel SignUpIcon;
    private javax.swing.JLabel SpacePharmacyBackground_1;
    private javax.swing.JLabel SpacePharmacyBackground_2;
    private javax.swing.JLabel SpacePharmacyBackground_3;
    private javax.swing.JLabel SpacePharmacyBackground_4;
    private javax.swing.JLabel SpacePharmacyBackground_5;
    private javax.swing.JLabel SpacePharmacyBackground_6;
    private javax.swing.JLabel SpacePharmacyBackground_7;
    private javax.swing.JLabel SpacePharmacyBackground_8;
    private javax.swing.JLabel SpacePharmacyBackground_9;
    private javax.swing.JPanel SpacePharmacyButton;
    private javax.swing.JPanel SpacePharmacyContent;
    private javax.swing.JLabel SpacePharmacyIcon;
    private javax.swing.JLabel WelcomeHome1;
    private javax.swing.JLabel WelcomeHome2;
    private javax.swing.JLabel WelcomeHome3;
    private javax.swing.JLabel WelcomeHome4;
    private javax.swing.JLabel WelcomeHome5;
    private javax.swing.JLabel about1;
    private javax.swing.JLabel about10;
    private javax.swing.JLabel about11;
    private javax.swing.JLabel about12;
    private javax.swing.JLabel about14;
    private javax.swing.JLabel about15;
    private javax.swing.JLabel about16;
    private javax.swing.JLabel about17;
    private javax.swing.JLabel about18;
    private javax.swing.JLabel about19;
    private javax.swing.JLabel about2;
    private javax.swing.JLabel about20;
    private javax.swing.JLabel about21;
    private javax.swing.JLabel about22;
    private javax.swing.JLabel about23;
    private javax.swing.JLabel about24;
    private javax.swing.JLabel about3;
    private javax.swing.JLabel about4;
    private javax.swing.JLabel about6;
    private javax.swing.JLabel about7;
    private javax.swing.JLabel about8;
    private javax.swing.JLabel about9;
    private javax.swing.JLabel aboutUs;
    private javax.swing.JLabel aboutUs1;
    private javax.swing.JLabel aboutUs2;
    private javax.swing.JPanel aboutUsPanel_1;
    private javax.swing.JPanel aboutUsPanel_2;
    private javax.swing.JPanel aboutUs_1;
    private javax.swing.JPanel aboutUs_2;
    private javax.swing.JLabel aboutUs_label_1;
    private javax.swing.JLabel aboutUs_label_2;
    private javax.swing.JTextArea buy;
    private javax.swing.JPanel contactPanel_1;
    private javax.swing.JPanel contactPanel_2;
    private javax.swing.JPanel contact_1;
    private javax.swing.JPanel contact_2;
    private javax.swing.JLabel contact_label_1;
    private javax.swing.JLabel contact_label_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logobg;
    private javax.swing.JLabel logobg2;
    private javax.swing.JLayeredPane mainLayeredPane;
    private javax.swing.JPanel mainTitle;
    private javax.swing.JLabel menuLabel_1;
    private javax.swing.JLabel menuLabel_2;
    private javax.swing.JLabel minus1;
    private javax.swing.JLabel minus10;
    private javax.swing.JLabel minus11;
    private javax.swing.JLabel minus12;
    private javax.swing.JLabel minus13;
    private javax.swing.JLabel minus14;
    private javax.swing.JLabel minus15;
    private javax.swing.JLabel minus16;
    private javax.swing.JLabel minus17;
    private javax.swing.JLabel minus18;
    private javax.swing.JLabel minus19;
    private javax.swing.JLabel minus2;
    private javax.swing.JLabel minus20;
    private javax.swing.JLabel minus3;
    private javax.swing.JLabel minus4;
    private javax.swing.JLabel minus5;
    private javax.swing.JLabel minus6;
    private javax.swing.JLabel minus7;
    private javax.swing.JLabel minus8;
    private javax.swing.JLabel minus9;
    private javax.swing.JLabel plus10;
    private javax.swing.JLabel plus11;
    private javax.swing.JLabel plus12;
    private javax.swing.JLabel plus13;
    private javax.swing.JLabel plus14;
    private javax.swing.JLabel plus15;
    private javax.swing.JLabel plus16;
    private javax.swing.JLabel plus17;
    private javax.swing.JLabel plus18;
    private javax.swing.JLabel plus19;
    private javax.swing.JLabel plus2;
    private javax.swing.JLabel plus20;
    private javax.swing.JLabel plus21;
    private javax.swing.JLabel plus3;
    private javax.swing.JLabel plus4;
    private javax.swing.JLabel plus5;
    private javax.swing.JLabel plus6;
    private javax.swing.JLabel plus7;
    private javax.swing.JLabel plus8;
    private javax.swing.JLabel plus9;
    private javax.swing.JLabel pr11;
    private javax.swing.JLabel pr12;
    private javax.swing.JLabel pr13;
    private javax.swing.JLabel pr14;
    private javax.swing.JLabel pr15;
    private javax.swing.JLabel pr16;
    private javax.swing.JLabel pr17;
    private javax.swing.JLabel pr18;
    private javax.swing.JLabel pr19;
    private javax.swing.JLabel pr20;
    private javax.swing.JTextArea price;
    private javax.swing.JLabel price11;
    private javax.swing.JLabel price12;
    private javax.swing.JLabel price13;
    private javax.swing.JLabel price14;
    private javax.swing.JLabel price15;
    private javax.swing.JLabel price16;
    private javax.swing.JLabel price17;
    private javax.swing.JLabel price18;
    private javax.swing.JLabel price19;
    private javax.swing.JLabel price20;
    private PanelRound productContainer1;
    private PanelRound productContainer10;
    private PanelRound productContainer11;
    private PanelRound productContainer12;
    private PanelRound productContainer13;
    private PanelRound productContainer14;
    private PanelRound productContainer15;
    private PanelRound productContainer16;
    private PanelRound productContainer17;
    private PanelRound productContainer18;
    private PanelRound productContainer19;
    private PanelRound productContainer2;
    private PanelRound productContainer20;
    private PanelRound productContainer3;
    private PanelRound productContainer4;
    private PanelRound productContainer5;
    private PanelRound productContainer6;
    private PanelRound productContainer7;
    private PanelRound productContainer8;
    private PanelRound productContainer9;
    private javax.swing.JLabel productsLabel_1;
    private javax.swing.JLabel productsLabel_2;
    private javax.swing.JPanel productsPanel_1;
    private javax.swing.JPanel productsPanel_2;
    private javax.swing.JPanel products_1;
    private javax.swing.JPanel products_2;
    private javax.swing.JLayeredPane pyramidLayeredPane3;
    private javax.swing.JLabel saleLabel_1;
    private javax.swing.JLabel saleLabel_2;
    private javax.swing.JPanel salePanel_1;
    private javax.swing.JPanel salePanel_2;
    private javax.swing.JPanel salePanel_3;
    private javax.swing.JPanel sale_1;
    private javax.swing.JPanel sale_2;
    private javax.swing.JLabel showNum1;
    private javax.swing.JLabel showNum10;
    private javax.swing.JLabel showNum11;
    private javax.swing.JLabel showNum12;
    private javax.swing.JLabel showNum13;
    private javax.swing.JLabel showNum14;
    private javax.swing.JLabel showNum15;
    private javax.swing.JLabel showNum16;
    private javax.swing.JLabel showNum17;
    private javax.swing.JLabel showNum18;
    private javax.swing.JLabel showNum19;
    private javax.swing.JLabel showNum2;
    private javax.swing.JLabel showNum20;
    private javax.swing.JLabel showNum3;
    private javax.swing.JLabel showNum4;
    private javax.swing.JLabel showNum5;
    private javax.swing.JLabel showNum6;
    private javax.swing.JLabel showNum7;
    private javax.swing.JLabel showNum8;
    private javax.swing.JLabel showNum9;
    private javax.swing.JLabel sorry;
    private javax.swing.JLabel sorry1;
    private javax.swing.JLabel sorry2;
    private javax.swing.JLayeredPane spaceLayeredPane;
    private javax.swing.JPanel transparency;
    private javax.swing.JPanel transparency1;
    private javax.swing.JPanel transparency2;
    // End of variables declaration//GEN-END:variables
}
