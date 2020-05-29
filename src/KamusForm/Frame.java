/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KamusForm;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.lang.ArrayIndexOutOfBoundsException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import static javafx.scene.paint.Color.color;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author Nur Ichsan
 */
public class Frame extends javax.swing.JFrame {
    
      public static HashMap<String,Model1>map1 = new HashMap<String,Model1>();
      public static HashMap<String,Model1>entry = new HashMap<String,Model1>();
      public static HashMap<String,Model1>entry2 = new HashMap<String,Model1>();
      public static HashMap<String,Model1>map3 = new HashMap<String,Model1>();
    /**
     * Creates new form Frame
     */
    int mouseX;
    int mouseY;
    Color homedefault;
    Color jawadefault;
    Color inggrisdefault;
    Color panelclick;
    public Frame() {
        try{
            for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
        initComponents();
        this.setLocationRelativeTo(null);
        panelclick=new Color(44, 62, 80);
        homedefault=new Color(225, 137, 40);
        jawadefault=new Color(224, 142, 56);
        inggrisdefault=new Color(224, 142, 56);
        homeTab.setBackground(panelclick);
        jawaTab.setBackground(jawadefault);
        inggrisTab.setBackground(inggrisdefault);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        backgroundMenu1 = new KamusForm.BackgroundMenu();
        jawaPC = new javax.swing.JPanel();
        jawaClk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jawaTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inggrisPC = new javax.swing.JPanel();
        inggrisClk = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inggrisTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        aboutPC = new javax.swing.JPanel();
        abousClk = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        homePC = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        homeClk = new javax.swing.JLabel();
        homeTab = new javax.swing.JPanel();
        bahasaLabel = new javax.swing.JLabel();
        localeInggris = new javax.swing.JButton();
        localeIndonesia = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        backgroundMain2 = new KamusForm.BackgroundMain();
        homeText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        button3 = new java.awt.Button();
        button5 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jawaPanel = new javax.swing.JPanel();
        backgroundMain3 = new KamusForm.BackgroundMain();
        paneltabelJawa = new javax.swing.JPanel();
        defaultTabel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        halusPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        kasarPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        kataJawa = new javax.swing.JLabel();
        cmbDari = new javax.swing.JComboBox();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        inggrisPanel = new javax.swing.JPanel();
        backgroundMain4 = new KamusForm.BackgroundMain();
        paneltabelInggris = new javax.swing.JPanel();
        defaultTabel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        halusingTabel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        kasaringTabel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        searchBar2 = new javax.swing.JTextField();
        kataInggris = new javax.swing.JLabel();
        cmbDari2 = new javax.swing.JComboBox();
        button4 = new java.awt.Button();
        button6 = new java.awt.Button();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("KamusForm/Bundle"); // NOI18N
        jLabel2.setText(bundle.getString("Frame.jLabel2.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(bundle.getString("Frame.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jawaPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jawaPC.setOpaque(false);
        jawaPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jawaPCMouseClicked(evt);
            }
        });
        jawaPC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jawaClk.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jawaClk.setText(bundle.getString("Frame.jawaClk.text")); // NOI18N
        jawaPC.add(jawaClk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 56, 40));
        jawaPC.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jawaTabLayout = new javax.swing.GroupLayout(jawaTab);
        jawaTab.setLayout(jawaTabLayout);
        jawaTabLayout.setHorizontalGroup(
            jawaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jawaTabLayout.setVerticalGroup(
            jawaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jawaPC.add(jawaTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 10, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-more-60.png"))); // NOI18N
        jLabel3.setText(bundle.getString("Frame.jLabel3.text")); // NOI18N
        jawaPC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundMenu1.add(jawaPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 60));

        inggrisPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inggrisPC.setOpaque(false);
        inggrisPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inggrisPCMouseClicked(evt);
            }
        });
        inggrisPC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inggrisClk.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        inggrisClk.setText(bundle.getString("Frame.inggrisClk.text")); // NOI18N
        inggrisPC.add(inggrisClk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 63, 46));
        inggrisPC.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 51, 46));

        javax.swing.GroupLayout inggrisTabLayout = new javax.swing.GroupLayout(inggrisTab);
        inggrisTab.setLayout(inggrisTabLayout);
        inggrisTabLayout.setHorizontalGroup(
            inggrisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        inggrisTabLayout.setVerticalGroup(
            inggrisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        inggrisPC.add(inggrisTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 10, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-more-60.png"))); // NOI18N
        jLabel5.setText(bundle.getString("Frame.jLabel5.text")); // NOI18N
        inggrisPC.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundMenu1.add(inggrisPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 60));

        aboutPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutPC.setOpaque(false);
        aboutPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutPCMouseClicked(evt);
            }
        });

        abousClk.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        abousClk.setText(bundle.getString("Frame.abousClk.text")); // NOI18N

        javax.swing.GroupLayout aboutPCLayout = new javax.swing.GroupLayout(aboutPC);
        aboutPC.setLayout(aboutPCLayout);
        aboutPCLayout.setHorizontalGroup(
            aboutPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPCLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(abousClk, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutPCLayout.setVerticalGroup(
            aboutPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPCLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(aboutPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutPCLayout.createSequentialGroup()
                        .addComponent(abousClk, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        backgroundMenu1.add(aboutPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 60));

        homePC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homePC.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        homePC.setOpaque(false);
        homePC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePCMouseClicked(evt);
            }
        });
        homePC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-64.png"))); // NOI18N
        homePC.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 62));

        homeClk.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        homeClk.setText(bundle.getString("Frame.homeClk.text")); // NOI18N
        homePC.add(homeClk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        homePC.add(homeTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 10, 60));

        backgroundMenu1.add(homePC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 60));

        bahasaLabel.setText(bundle.getString("Frame.bahasaLabel.text")); // NOI18N
        backgroundMenu1.add(bahasaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        localeInggris.setText(bundle.getString("Frame.localeInggris.text")); // NOI18N
        localeInggris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        localeInggris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localeInggrisActionPerformed(evt);
            }
        });
        backgroundMenu1.add(localeInggris, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        localeIndonesia.setText(bundle.getString("Frame.localeIndonesia.text")); // NOI18N
        localeIndonesia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        localeIndonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localeIndonesiaActionPerformed(evt);
            }
        });
        backgroundMenu1.add(localeIndonesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-about-50.png"))); // NOI18N
        jLabel6.setText(bundle.getString("Frame.jLabel6.text")); // NOI18N
        backgroundMenu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        backgroundMenu1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        menuPanel.add(backgroundMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setPreferredSize(new java.awt.Dimension(625, 600));

        backgroundMain2.setPreferredSize(new java.awt.Dimension(615, 600));

        homeText.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        homeText.setForeground(java.awt.Color.white);
        homeText.setText(bundle.getString("Frame.homeText.text")); // NOI18N

        jSeparator1.setForeground(java.awt.Color.white);

        button3.setBackground(java.awt.Color.orange);
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button3.setLabel(bundle.getString("Frame.button3.label")); // NOI18N
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        button5.setActionCommand(bundle.getString("Frame.button5.actionCommand")); // NOI18N
        button5.setBackground(java.awt.Color.orange);
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button5.setLabel(bundle.getString("Frame.button5.label")); // NOI18N
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundMain2Layout = new javax.swing.GroupLayout(backgroundMain2);
        backgroundMain2.setLayout(backgroundMain2Layout);
        backgroundMain2Layout.setHorizontalGroup(
            backgroundMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundMain2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundMain2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(backgroundMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeText)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        backgroundMain2Layout.setVerticalGroup(
            backgroundMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundMain2Layout.createSequentialGroup()
                .addGroup(backgroundMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundMain2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(205, 205, 205)
                .addComponent(homeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(homePanel, "card3");

        jawaPanel.setPreferredSize(new java.awt.Dimension(625, 600));

        backgroundMain3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        defaultTabel.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "               		         Jawa", "             		          Inggris"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(211, 84, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionForeground(new java.awt.Color(211, 84, 0));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title0_1")); // NOI18N
            jTable1.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title1_1")); // NOI18N
        }

        defaultTabel.add(jScrollPane1, "card2");

        halusPanel.setLayout(new java.awt.CardLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "               		         Jawa", "             		           Inggris"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setRowHeight(25);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title0")); // NOI18N
            jTable2.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title1")); // NOI18N
        }

        halusPanel.add(jScrollPane4, "card2");

        kasarPanel.setLayout(new java.awt.CardLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "               		         Jawa", "             		           Inggris"
            }
        ));
        jTable3.setFocusable(false);
        jTable3.setRowHeight(25);
        jTable3.setShowVerticalLines(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title0")); // NOI18N
            jTable3.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable1.columnModel.title1")); // NOI18N
        }

        kasarPanel.add(jScrollPane5, "card2");

        javax.swing.GroupLayout paneltabelJawaLayout = new javax.swing.GroupLayout(paneltabelJawa);
        paneltabelJawa.setLayout(paneltabelJawaLayout);
        paneltabelJawaLayout.setHorizontalGroup(
            paneltabelJawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kasarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(defaultTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(halusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        paneltabelJawaLayout.setVerticalGroup(
            paneltabelJawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kasarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(defaultTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(halusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        backgroundMain3.add(paneltabelJawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 146, 380, 230));

        searchBar.setText(bundle.getString("Frame.searchBar.text")); // NOI18N
        searchBar.setToolTipText(bundle.getString("Frame.searchBar.toolTipText")); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });
        backgroundMain3.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, 20));

        kataJawa.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        kataJawa.setText(bundle.getString("Frame.kataJawa.text")); // NOI18N
        backgroundMain3.add(kataJawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 20));

        cmbDari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "Jawa Halus (Krama Inggil) ", "Jawa Kasar (Ngoko)" }));
        cmbDari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDariActionPerformed(evt);
            }
        });
        backgroundMain3.add(cmbDari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 170, -1));

        button1.setBackground(java.awt.Color.orange);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button1.setLabel(bundle.getString("Frame.button1.label")); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        backgroundMain3.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, -1));

        button2.setBackground(java.awt.Color.orange);
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button2.setLabel(bundle.getString("Frame.button2.label")); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        backgroundMain3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 30, -1));
        button2.getAccessibleContext().setAccessibleDescription(bundle.getString("Frame.button2.AccessibleContext.accessibleDescription")); // NOI18N

        javax.swing.GroupLayout jawaPanelLayout = new javax.swing.GroupLayout(jawaPanel);
        jawaPanel.setLayout(jawaPanelLayout);
        jawaPanelLayout.setHorizontalGroup(
            jawaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jawaPanelLayout.setVerticalGroup(
            jawaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(jawaPanel, "card4");

        inggrisPanel.setPreferredSize(new java.awt.Dimension(625, 600));

        backgroundMain4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneltabelInggris.setLayout(new java.awt.CardLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "             		           Inggris", "               		         Jawa"
            }
        ));
        jScrollPane2.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title0")); // NOI18N
            jTable4.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title1")); // NOI18N
        }

        javax.swing.GroupLayout defaultTabel2Layout = new javax.swing.GroupLayout(defaultTabel2);
        defaultTabel2.setLayout(defaultTabel2Layout);
        defaultTabel2Layout.setHorizontalGroup(
            defaultTabel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        defaultTabel2Layout.setVerticalGroup(
            defaultTabel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        paneltabelInggris.add(defaultTabel2, "card2");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "             		           Inggris", "               		         Jawa"
            }
        ));
        jTable7.setFocusable(false);
        jTable7.setRowHeight(25);
        jTable7.setShowVerticalLines(false);
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title0")); // NOI18N
            jTable7.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title1")); // NOI18N
        }

        javax.swing.GroupLayout halusingTabelLayout = new javax.swing.GroupLayout(halusingTabel);
        halusingTabel.setLayout(halusingTabelLayout);
        halusingTabelLayout.setHorizontalGroup(
            halusingTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        halusingTabelLayout.setVerticalGroup(
            halusingTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        paneltabelInggris.add(halusingTabel, "card2");

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "             		           Inggris", "               		         Jawa"
            }
        ));
        jTable8.setFocusable(false);
        jTable8.setRowHeight(25);
        jTable8.setShowVerticalLines(false);
        jTable8.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title0")); // NOI18N
            jTable8.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Frame.jTable4.columnModel.title1")); // NOI18N
        }

        javax.swing.GroupLayout kasaringTabelLayout = new javax.swing.GroupLayout(kasaringTabel);
        kasaringTabel.setLayout(kasaringTabelLayout);
        kasaringTabelLayout.setHorizontalGroup(
            kasaringTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        kasaringTabelLayout.setVerticalGroup(
            kasaringTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        paneltabelInggris.add(kasaringTabel, "card2");

        backgroundMain4.add(paneltabelInggris, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 146, 380, 230));

        searchBar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar2KeyReleased(evt);
            }
        });
        backgroundMain4.add(searchBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, 20));

        kataInggris.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        kataInggris.setText(bundle.getString("Frame.kataInggris.text")); // NOI18N
        backgroundMain4.add(kataInggris, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 40, 20));

        cmbDari2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "Jawa Halus (Krama Ingggil)", "Jawa Kasar (Ngoko)" }));
        cmbDari2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDari2ActionPerformed(evt);
            }
        });
        backgroundMain4.add(cmbDari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 170, -1));

        button4.setBackground(java.awt.Color.orange);
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button4.setLabel(bundle.getString("Frame.button4.label")); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        backgroundMain4.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, -1));

        button6.setBackground(java.awt.Color.orange);
        button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        button6.setLabel(bundle.getString("Frame.button6.label")); // NOI18N
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        backgroundMain4.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 30, -1));

        javax.swing.GroupLayout inggrisPanelLayout = new javax.swing.GroupLayout(inggrisPanel);
        inggrisPanel.setLayout(inggrisPanelLayout);
        inggrisPanelLayout.setHorizontalGroup(
            inggrisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inggrisPanelLayout.setVerticalGroup(
            inggrisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(inggrisPanel, "card5");

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, 540, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i=0.0;i<=1.0;i=i+0.1){
            String tamb=i+"";
            float f=Float.valueOf(tamb);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
                  
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void jawaPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jawaPCMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(jawaPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        homeTab.setBackground(homedefault);
        jawaTab.setBackground(panelclick);
        inggrisTab.setBackground(inggrisdefault);
    }//GEN-LAST:event_jawaPCMouseClicked

    private void inggrisPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inggrisPCMouseClicked
       mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(inggrisPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        homeTab.setBackground(homedefault);
        jawaTab.setBackground(jawadefault);
        inggrisTab.setBackground(panelclick);
    }//GEN-LAST:event_inggrisPCMouseClicked

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased

        DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
        DefaultTableModel model2=(DefaultTableModel)jTable2.getModel();
        DefaultTableModel model3=(DefaultTableModel)jTable3.getModel();
        String cari=searchBar.getText().toLowerCase();
        TableRowSorter filter=new TableRowSorter(model1);
        TableRowSorter filter2=new TableRowSorter(model2);
        TableRowSorter filter3=new TableRowSorter(model3);
        jTable1.setRowSorter(filter);
        jTable2.setRowSorter(filter2);
        jTable3.setRowSorter(filter3);
        filter.setRowFilter(RowFilter.regexFilter(cari,0));
        filter2.setRowFilter(RowFilter.regexFilter(cari,0));
        filter3.setRowFilter(RowFilter.regexFilter(cari,0));  
    }//GEN-LAST:event_searchBarKeyReleased

    private void cmbDariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDariActionPerformed
        
        switch(cmbDari.getSelectedIndex()){
            case 0:

                
              paneltabelJawa.removeAll();
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
              paneltabelJawa.add(defaultTabel);
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
                
             DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();

                
                break;
            case 1:
     
                
              paneltabelJawa.removeAll();
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
              paneltabelJawa.add(halusPanel);
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
              
              DefaultTableModel model2=(DefaultTableModel)jTable2.getModel();
              
              Statement st = null;
              ResultSet rs = null;
              Connection con = DbConnect.getConnection();
              Model1 M1;
              
              if(entry.isEmpty()){
              try{
                  
                  st = con.createStatement();
                  rs = st.executeQuery("select * from halus");
                  
                  while(rs.next()){
                      String Jawa = rs.getString("Jawa");
                      String English = rs.getString("English");
                      M1 =  new Model1(Jawa,English);
                      entry.put(Jawa, M1);

                               
                  }
                  
              }catch(Exception e){
                  e.printStackTrace();
              }
              
        
            
            
            
            Object[]obM=new Object[2];
            for(Map.Entry<String,Model1>entry:entry.entrySet()){
            Model1 Mm1 = entry.getValue();
            obM[0] = Mm1.getJawa();
            obM[1] = Mm1.getEnglish();
            model2.addRow(obM);
            }
        }else{
            break;
        }  
                

            break;

            case 2:

                
              paneltabelJawa.removeAll();
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
              paneltabelJawa.add(kasarPanel);
              paneltabelJawa.repaint();
              paneltabelJawa.revalidate();
              
              DefaultTableModel model3=(DefaultTableModel)jTable3.getModel();
              
              Statement st2 = null;
              ResultSet rs2 = null;
              Connection con2 = DbConnect.getConnection();
              Model1 M2;
              
              if(map1.isEmpty()){
              try{
                  
                  st2 = con2.createStatement();
                  rs2 = st2.executeQuery("select * from kasar");
                  
                  while(rs2.next()){
                      String Jawa = rs2.getString("Jawa");
                      String English = rs2.getString("English");
                      M2 =  new Model1(Jawa,English);
                      map1.put(Jawa, M2);
                  }
                  
              }catch(Exception e){
                  e.printStackTrace();
              }
              Object[]obM1=new Object[2];
        for(Map.Entry<String,Model1>map1entry:map1.entrySet()){
            Model1 Mm1 = map1entry.getValue();
            obM1[0] = Mm1.getJawa();
            obM1[1] = Mm1.getEnglish();
            model3.addRow(obM1);
        }
              }else{
                  break;
              }
            
            
            break;
            
        }
        
    }//GEN-LAST:event_cmbDariActionPerformed

    private void cmbDari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDari2ActionPerformed
         switch(cmbDari2.getSelectedIndex()){
            case 0:
              paneltabelInggris.removeAll();
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
              paneltabelInggris.add(defaultTabel2);
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
             DefaultTableModel model4=(DefaultTableModel)jTable4.getModel();
                break;
            case 1:
              paneltabelInggris.removeAll();
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
              paneltabelInggris.add(halusingTabel);
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
              
              DefaultTableModel model5=(DefaultTableModel)jTable7.getModel();
              
              Statement st = null;
              ResultSet rs = null;
              Connection con = DbConnect.getConnection();
              Model1 M3;
              
              if(entry2.isEmpty()){
              try{
                  
                  st = con.createStatement();
                  rs = st.executeQuery("select * from halus_eng_jawa");
                  
                  while(rs.next()){
                      String English = rs.getString("English");
                      String Jawa = rs.getString("Jawa");
                      M3 =  new Model1(English,Jawa);
                      entry2.put(English, M3);
                  }
                  
              }catch(Exception e){
                  e.printStackTrace();
              }
              Object[]obm1=new Object[2];
        for(Map.Entry<String,Model1>entry2:entry2.entrySet()){
            Model1 Mm1 = entry2.getValue();
            obm1[0] = Mm1.getJawa();
            obm1[1] = Mm1.getEnglish();
            model5.addRow(obm1);
        }
        
              }else{
                break;
                }
    
        
        
            break;

            case 2:
              paneltabelInggris.removeAll();
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
              paneltabelInggris.add(kasaringTabel);
              paneltabelInggris.repaint();
              paneltabelInggris.revalidate();
              
              DefaultTableModel model6=(DefaultTableModel)jTable8.getModel();
              
              Statement st2 = null;
              ResultSet rs2 = null;
              Connection con2 = DbConnect.getConnection();
              Model1 M4;
              
              if(map3.isEmpty()){
              try{
                  
                  st2 = con2.createStatement();
                  rs2 = st2.executeQuery("select * from kasar_eng_jawa");
                  
                  while(rs2.next()){
                      String English = rs2.getString("English");
                      String Jawa = rs2.getString("Jawa");
                      M4 =  new Model1(English,Jawa);
                      map3.put(English, M4);
                  }
                  
              }catch(Exception e){
                  e.printStackTrace();
              }
              Object[]obm3=new Object[2];
        for(Map.Entry<String,Model1>map3entry:map3.entrySet()){
            Model1 Mm1 = map3entry.getValue();
            obm3[0] = Mm1.getJawa();
            obm3[1] = Mm1.getEnglish();
            model6.addRow(obm3);
        }
              }else{
                  break;
              }
              
            
            break;
         }
            
            

    }//GEN-LAST:event_cmbDari2ActionPerformed

    private void searchBar2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar2KeyReleased
        DefaultTableModel model4=(DefaultTableModel)jTable4.getModel();
        DefaultTableModel model5=(DefaultTableModel)jTable7.getModel();
        DefaultTableModel model6=(DefaultTableModel)jTable8.getModel();
        String cari=searchBar2.getText().toLowerCase();
        TableRowSorter filter=new TableRowSorter(model4);
        TableRowSorter filter2=new TableRowSorter(model5);
        TableRowSorter filter3=new TableRowSorter(model6);
        jTable4.setRowSorter(filter);
        jTable7.setRowSorter(filter2);
        jTable8.setRowSorter(filter3);
        filter.setRowFilter(RowFilter.regexFilter(cari,0));
        filter2.setRowFilter(RowFilter.regexFilter(cari,0));
        filter3.setRowFilter(RowFilter.regexFilter(cari,0));  
    }//GEN-LAST:event_searchBar2KeyReleased

    private void localeIndonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localeIndonesiaActionPerformed
        Locale l=new Locale("en","US");
        ResourceBundle r=ResourceBundle.getBundle("KamusForm/Bundle",l);
        homeText.setText(r.getString("Frame.homeText.text"));
        homeClk.setText(r.getString("Frame.homeClk.text"));
        jawaClk.setText(r.getString("Frame.jawaClk.text"));
        inggrisClk.setText(r.getString("Frame.inggrisClk.text"));
        abousClk.setText(r.getString("Frame.abousClk.text"));
        kataJawa.setText(r.getString("Frame.kataJawa.text"));
        kataInggris.setText(r.getString("Frame.kataInggris.text"));
        JTableHeader header= jTable1.getTableHeader();
        TableColumnModel colMod = header.getColumnModel();
        TableColumn tabCol = colMod.getColumn(0);
        tabCol.setHeaderValue(r.getString("Frame.jTable1.columnModel.title0"));
        header.repaint();
        JTableHeader header2= jTable1.getTableHeader();
        TableColumnModel colMod2 = header2.getColumnModel();
        TableColumn tabCol2 = colMod2.getColumn(1);
        tabCol2.setHeaderValue(r.getString("Frame.jTable1.columnModel.title1"));
        header2.repaint();
        JTableHeader header3= jTable4.getTableHeader();
        TableColumnModel colMod3 = header3.getColumnModel();
        TableColumn tabCol3 = colMod3.getColumn(0);
        tabCol3.setHeaderValue(r.getString("Frame.jTable4.columnModel.title0"));
        header3.repaint();
        JTableHeader header4= jTable4.getTableHeader();
        TableColumnModel colMod4 = header4.getColumnModel();
        TableColumn tabCol4 = colMod4.getColumn(1);
        tabCol4.setHeaderValue(r.getString("Frame.jTable4.columnModel.title1"));
        header4.repaint();
         JTableHeader header5= jTable2.getTableHeader();
        TableColumnModel colMod5 = header5.getColumnModel();
        TableColumn tabCol5 = colMod5.getColumn(0);
        tabCol5.setHeaderValue(r.getString("Frame.jTable2.columnModel.title0"));
        header5.repaint();
        JTableHeader header6= jTable2.getTableHeader();
        TableColumnModel colMod6 = header6.getColumnModel();
        TableColumn tabCol6 = colMod6.getColumn(1);
        tabCol6.setHeaderValue(r.getString("Frame.jTable2.columnModel.title1"));
        header6.repaint();
        JTableHeader header7= jTable3.getTableHeader();
        TableColumnModel colMod7 = header7.getColumnModel();
        TableColumn tabCol7 = colMod7.getColumn(0);
        tabCol7.setHeaderValue(r.getString("Frame.jTable3.columnModel.title0"));
        header7.repaint();
        JTableHeader header8= jTable3.getTableHeader();
        TableColumnModel colMod8 = header8.getColumnModel();
        TableColumn tabCol8 = colMod8.getColumn(1);
        tabCol8.setHeaderValue(r.getString("Frame.jTable3.columnModel.title1"));
        header8.repaint();
        JTableHeader header9= jTable7.getTableHeader();
        TableColumnModel colMod9 = header9.getColumnModel();
        TableColumn tabCol9 = colMod9.getColumn(0);
        tabCol9.setHeaderValue(r.getString("Frame.jTable7.columnModel.title0"));
        header9.repaint();
        JTableHeader header10= jTable7.getTableHeader();
        TableColumnModel colMod10 = header10.getColumnModel();
        TableColumn tabCol10 = colMod10.getColumn(1);
        tabCol10.setHeaderValue(r.getString("Frame.jTable7.columnModel.title1"));
        header10.repaint();
        JTableHeader header11= jTable8.getTableHeader();
        TableColumnModel colMod11 = header11.getColumnModel();
        TableColumn tabCol11 = colMod11.getColumn(0);
        tabCol11.setHeaderValue(r.getString("Frame.jTable8.columnModel.title0"));
        header11.repaint();
        JTableHeader header12= jTable8.getTableHeader();
        TableColumnModel colMod12 = header12.getColumnModel();
        TableColumn tabCol12 = colMod12.getColumn(1);
        tabCol12.setHeaderValue(r.getString("Frame.jTable8.columnModel.title1"));
        header12.repaint();
        kataJawa.setText(r.getString("Frame.kataJawa.text"));
        kataInggris.setText(r.getString("Frame.kataInggris.text"));
    }//GEN-LAST:event_localeIndonesiaActionPerformed

    private void localeInggrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localeInggrisActionPerformed
        Locale l=new Locale("in","ID");
        ResourceBundle r=ResourceBundle.getBundle("KamusForm/Bundle",l);
        homeText.setText(r.getString("Frame.homeText.text"));
        homeClk.setText(r.getString("Frame.homeClk.text"));
        jawaClk.setText(r.getString("Frame.jawaClk.text"));
        inggrisClk.setText(r.getString("Frame.inggrisClk.text"));
        abousClk.setText(r.getString("Frame.abousClk.text"));
        JTableHeader header= jTable1.getTableHeader();
        TableColumnModel colMod = header.getColumnModel();
        TableColumn tabCol = colMod.getColumn(0);
        tabCol.setHeaderValue(r.getString("Frame.jTable1.columnModel.title0"));
        header.repaint();
        JTableHeader header2= jTable1.getTableHeader();
        TableColumnModel colMod2 = header2.getColumnModel();
        TableColumn tabCol2 = colMod2.getColumn(1);
        tabCol2.setHeaderValue(r.getString("Frame.jTable1.columnModel.title1"));
        header2.repaint();
        JTableHeader header3= jTable4.getTableHeader();
        TableColumnModel colMod3 = header3.getColumnModel();
        TableColumn tabCol3 = colMod3.getColumn(0);
        tabCol3.setHeaderValue(r.getString("Frame.jTable4.columnModel.title0"));
        header3.repaint();
        JTableHeader header4= jTable4.getTableHeader();
        TableColumnModel colMod4 = header4.getColumnModel();
        TableColumn tabCol4 = colMod4.getColumn(1);
        tabCol4.setHeaderValue(r.getString("Frame.jTable4.columnModel.title1"));
        header4.repaint();
        JTableHeader header5= jTable2.getTableHeader();
        TableColumnModel colMod5 = header5.getColumnModel();
        TableColumn tabCol5 = colMod5.getColumn(0);
        tabCol5.setHeaderValue(r.getString("Frame.jTable2.columnModel.title0"));
        header5.repaint();
        JTableHeader header6= jTable2.getTableHeader();
        TableColumnModel colMod6 = header6.getColumnModel();
        TableColumn tabCol6 = colMod6.getColumn(1);
        tabCol6.setHeaderValue(r.getString("Frame.jTable2.columnModel.title1"));
        header6.repaint();
        JTableHeader header7= jTable3.getTableHeader();
        TableColumnModel colMod7 = header7.getColumnModel();
        TableColumn tabCol7 = colMod7.getColumn(0);
        tabCol7.setHeaderValue(r.getString("Frame.jTable3.columnModel.title0"));
        header7.repaint();
        JTableHeader header8= jTable3.getTableHeader();
        TableColumnModel colMod8 = header8.getColumnModel();
        TableColumn tabCol8 = colMod8.getColumn(1);
        tabCol8.setHeaderValue(r.getString("Frame.jTable3.columnModel.title1"));
        header8.repaint();
        JTableHeader header9= jTable7.getTableHeader();
        TableColumnModel colMod9 = header9.getColumnModel();
        TableColumn tabCol9 = colMod9.getColumn(0);
        tabCol9.setHeaderValue(r.getString("Frame.jTable7.columnModel.title0"));
        header9.repaint();
        JTableHeader header10= jTable7.getTableHeader();
        TableColumnModel colMod10 = header10.getColumnModel();
        TableColumn tabCol10 = colMod10.getColumn(1);
        tabCol10.setHeaderValue(r.getString("Frame.jTable7.columnModel.title1"));
        header10.repaint();
        JTableHeader header11= jTable8.getTableHeader();
        TableColumnModel colMod11 = header11.getColumnModel();
        TableColumn tabCol11 = colMod11.getColumn(0);
        tabCol11.setHeaderValue(r.getString("Frame.jTable8.columnModel.title0"));
        header11.repaint();
        JTableHeader header12= jTable8.getTableHeader();
        TableColumnModel colMod12 = header12.getColumnModel();
        TableColumn tabCol12 = colMod12.getColumn(1);
        tabCol12.setHeaderValue(r.getString("Frame.jTable8.columnModel.title1"));
        header12.repaint();
        kataJawa.setText(r.getString("Frame.kataJawa.text"));
        kataInggris.setText(r.getString("Frame.kataInggris.text"));
    }//GEN-LAST:event_localeInggrisActionPerformed

    private void aboutPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutPCMouseClicked
        AboutUs about =new AboutUs();
        about.setVisible(true);
    }//GEN-LAST:event_aboutPCMouseClicked

    private void homePCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePCMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(homePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        homeTab.setBackground(panelclick);
        jawaTab.setBackground(jawadefault);
        inggrisTab.setBackground(inggrisdefault);
    }//GEN-LAST:event_homePCMouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_button2MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_button1MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_button4MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_button6MouseClicked

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_button5MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_button3MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-mouseX, yy-mouseY);
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-mouseX, yy-mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });}catch(ArrayIndexOutOfBoundsException e){
            
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abousClk;
    private javax.swing.JPanel aboutPC;
    private KamusForm.BackgroundMain backgroundMain2;
    private KamusForm.BackgroundMain backgroundMain3;
    private KamusForm.BackgroundMain backgroundMain4;
    private KamusForm.BackgroundMenu backgroundMenu1;
    private javax.swing.JLabel bahasaLabel;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private javax.swing.JComboBox cmbDari;
    private javax.swing.JComboBox cmbDari2;
    private javax.swing.JPanel defaultTabel;
    private javax.swing.JPanel defaultTabel2;
    private javax.swing.JPanel halusPanel;
    private javax.swing.JPanel halusingTabel;
    private javax.swing.JLabel homeClk;
    private javax.swing.JPanel homePC;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeTab;
    private javax.swing.JLabel homeText;
    private javax.swing.JLabel inggrisClk;
    private javax.swing.JPanel inggrisPC;
    private javax.swing.JPanel inggrisPanel;
    private javax.swing.JPanel inggrisTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JLabel jawaClk;
    private javax.swing.JPanel jawaPC;
    private javax.swing.JPanel jawaPanel;
    private javax.swing.JPanel jawaTab;
    private javax.swing.JPanel kasarPanel;
    private javax.swing.JPanel kasaringTabel;
    private javax.swing.JLabel kataInggris;
    private javax.swing.JLabel kataJawa;
    private javax.swing.JButton localeIndonesia;
    private javax.swing.JButton localeInggris;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel paneltabelInggris;
    private javax.swing.JPanel paneltabelJawa;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTextField searchBar2;
    // End of variables declaration//GEN-END:variables
}
