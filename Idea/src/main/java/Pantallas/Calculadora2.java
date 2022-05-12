
package Pantallas;
import Entidades.FormulaGeneral;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Calculadora2 extends javax.swing.JFrame {
    
    int Tipo = 0;
    
    static double n1;
    static double n2;
    static double n3;
    static int e1;
    static int e2;
    static int e3;
    static int varT;
    static double respConTiempo;

       
    static ArrayList<FormulaGeneral> listaFormula1 = new ArrayList<>();
    FormulaGeneral control;
    String formuInicial;
    static String formulaDerivada;
    static String formulaIntegral;

    
    public Calculadora2() {       
        initComponents();
        txtE1.setVisible(false);
        txtX1.setVisible(false);
        txtResD.setEditable(false);
        txtResV.setEditable(false);
        txtResA.setEditable(false);
        txtX2.setEditable(false);
        txtX3.setEditable(false);
        txtResultadoD.setEditable(false);
        txtResultadoV.setEditable(false);
        txtResultadoA.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RBDesplazamiento = new javax.swing.JRadioButton();
        RBVelocidad = new javax.swing.JRadioButton();
        RBAceleracion = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtE2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtE3 = new javax.swing.JTextField();
        BTNCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BTSalir = new javax.swing.JButton();
        txtTiempo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResD = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResV = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResA = new javax.swing.JTextArea();
        txtResultadoD = new javax.swing.JTextField();
        txtResultadoA = new javax.swing.JTextField();
        txtResultadoV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Calculadora de Desplazamiento, velocidad y aceleracion");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Formula:");

        buttonGroup1.add(RBDesplazamiento);
        RBDesplazamiento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        RBDesplazamiento.setText("Desplazamiento");
        RBDesplazamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBDesplazamientoActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBVelocidad);
        RBVelocidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        RBVelocidad.setText("Velocidad");
        RBVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBVelocidadActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAceleracion);
        RBAceleracion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        RBAceleracion.setText("Aceleracion");
        RBAceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAceleracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RBDesplazamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBVelocidad)
                .addGap(18, 18, 18)
                .addComponent(RBAceleracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RBDesplazamiento)
                    .addComponent(RBVelocidad)
                    .addComponent(RBAceleracion))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setText("Ingresar Formula:");

        txtN1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtX1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtX1.setEnabled(false);

        txtE1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtE1.setText("0");
        txtE1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setText("+");

        txtN2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtX2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtX2.setText("X");

        txtE2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setText("+");

        txtN3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtX3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtX3.setText("X");

        txtE3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        BTNCalcular.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        BTNCalcular.setText("CALCULAR");
        BTNCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("Ingresar Tiempo:");

        BTSalir.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        BTSalir.setText("SALIR");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        txtTiempo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel7.setText("Desplazamiento");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel8.setText("Velocidad");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel9.setText("Aceleracion");

        txtResD.setColumns(20);
        txtResD.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResD.setRows(5);
        jScrollPane1.setViewportView(txtResD);

        txtResV.setColumns(20);
        txtResV.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResV.setRows(5);
        jScrollPane2.setViewportView(txtResV);

        txtResA.setColumns(20);
        txtResA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResA.setRows(5);
        jScrollPane3.setViewportView(txtResA);

        txtResultadoD.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResultadoD.setText("Resultado");

        txtResultadoA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResultadoA.setText("Resultado");

        txtResultadoV.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtResultadoV.setText("Resultado");

        jLabel10.setText("S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(251, 251, 251)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtResultadoV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(116, 116, 116)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtResultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNCalcular))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(337, 337, 337)
                                .addComponent(BTSalir))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtResultadoD, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 954, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSalir)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtE1)
                            .addComponent(txtE2)
                            .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNCalcular)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculadora", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1393, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Graficas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void msg(String texto){
        JOptionPane.showMessageDialog(this, texto);
    }
    public void getVars() {
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
        n3 = Integer.parseInt(txtN3.getText());
        e1 = Integer.parseInt(txtE1.getText());
        e2 = Integer.parseInt(txtE2.getText());
        e3 = Integer.parseInt(txtE3.getText());
    }
    
    public static void setNewVars() {
        for (FormulaGeneral fg: listaFormula1) {
            n1 = fg.getN1();
            n2 = fg.getN2();
            n3 = fg.getN3();
            e1 = fg.getExpo1();
            e2 = fg.getExpo2();
            e3 = fg.getExpo3();
        }
    }
    
    public void getVarsIntegral() {       
        n2 = Integer.parseInt(txtN2.getText());
        n3 = Integer.parseInt(txtN3.getText());   
        e2 = Integer.parseInt(txtE2.getText());
        e3 = Integer.parseInt(txtE3.getText());
    }
    
    public static void setNewVarsIntegral() {
        for (FormulaGeneral fg: listaFormula1) {           
            n2 = fg.getN2();
            n3 = fg.getN3();           
            e2 = fg.getExpo2();
            e3 = fg.getExpo3();
        }
    }
    
    public void getTiempo(){ 
        try {
            varT = Integer.parseInt(txtTiempo.getText());
        } catch (Exception e) {
            varT = 0;
        }   
    }
    
    public void initFormula() {
        getVars(); 
        control = new FormulaGeneral(n1, n2, n3, e1, e2, e3);
        formuInicial = control.ImprimirFormula();
    }

    public void initFormulaIntegral() {
        getVarsIntegral();
        control = new FormulaGeneral(n2, n3, e2, e3);
        formuInicial = control.ImprimirFormula1();
    }

    public static void Derivar1(double nu1, double nu2, double nu3, int ex1, int ex2, int ex3) {

        listaFormula1.add(new FormulaGeneral(nu1, nu2, nu3, ex1, ex2, ex3));
        for (FormulaGeneral fg : listaFormula1) {
            fg.Derivar();
            formulaDerivada = fg.ImprimirFormula();
        }
        setNewVars();
        listaFormula1.clear();


    }
    public static void Derivar2(double nu2, double nu3,int ex2, int ex3) {

        listaFormula1.add(new FormulaGeneral(nu2, nu3, ex2, ex3));
        for (FormulaGeneral fg : listaFormula1) {
            fg.Derivar2();
            formulaDerivada = fg.ImprimirFormula1();
        }
        setNewVarsIntegral();
        listaFormula1.clear();

    }
    public static void Integrar1(double nu2, double nu3,int ex2, int ex3) {

        listaFormula1.add(new FormulaGeneral(nu2, nu3, ex2, ex3));
        for (FormulaGeneral fg : listaFormula1) {
            fg.Integral();
            formulaIntegral = fg.ImprimirFormula1();
        }
        setNewVarsIntegral();
        listaFormula1.clear();

    }
    
    public void operarTiempo2(){
        getTiempo();
        if(Tipo==1){
            control = new FormulaGeneral(n1, n2, n3, 0, e2, e3, varT);
        } else if(Tipo==2 || Tipo==3){
            control = new FormulaGeneral(0, n2, n3, 0, e2, e3, varT);
        }        
        respConTiempo = control.OperarT();
    }
    
    public void clearResult() {
        txtResultadoD.setText(null);
        txtResultadoV.setText(null);
        txtResultadoA.setText(null);    
    }
    
    
    
    private void BTNCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCalcularActionPerformed
        if(NN1()==0 || EE1()==0 || NN2()==0 || EE2()==0){
            msg("Faltan datos");return;
        }
 
        switch (Tipo) {
                case 1:
                    if(NN()==0){
                    msg("Faltan datos");return;
                    }
                getVars();
                initFormula();
                if (bd()==0){ clearResult();} else { operarTiempo2(); txtResultadoD.setText("" + respConTiempo); }                
                txtResD.setText("---------Formula Principal----------\n" + formuInicial);                
                Derivar1(n1, n2, n3, e1, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoV.setText("" + respConTiempo);}                
                txtResV.setText("---------Formula Derivada 1 vez----------\n" + formulaDerivada);                 
                setNewVars();
                Derivar1(n1, n2, n3, e1, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoA.setText("" + respConTiempo); }               
                txtResA.setText("---------Formula Derivada por 2da vez----------\n" + formulaDerivada);                
                break;

            case 2:
                getVarsIntegral();
                initFormulaIntegral();
                if (bd()==0){ clearResult();} else { operarTiempo2(); txtResultadoV.setText("" + respConTiempo); }
                txtResV.setText("---------Formula Principal----------\n" + formuInicial);
                Integrar1(n2, n3, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoD.setText("" + respConTiempo); }
                txtResD.setText("---------Formula Integral 1 vez----------\n" + formulaIntegral+" + "+"C");                 
                setNewVarsIntegral();
                Derivar2(n2, n3, e2, e3);
                setNewVarsIntegral();
                Derivar2(n2, n3, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoA.setText("" + respConTiempo); } 
                txtResA.setText("---------Formula Derivada por 1 vez----------\n" + formulaDerivada);    
                break;
                
            case 3:              
                getVarsIntegral();
                initFormulaIntegral();
                if (bd()==0){ clearResult();} else { operarTiempo2(); txtResultadoA.setText("" + respConTiempo); }
                txtResA.setText("---------Formula Principal----------\n" + formuInicial);                               
                Integrar1(n2, n3, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoV.setText("" + respConTiempo); }
                txtResV.setText("---------Formula Integrada 1era vez----------\n" + formulaIntegral+" + "+"C");                 
                setNewVarsIntegral();
                Integrar1(n2, n3, e2, e3);
                if (bd()==0){clearResult();} else { operarTiempo2(); txtResultadoD.setText("" + respConTiempo); } 
                txtResD.setText("---------Formula integrada 2da vez----------\n" + formulaIntegral+" + "+"C");    
                break;    
            default:
                break;
        }
        buttonGroup1.clearSelection();
    
    }//GEN-LAST:event_BTNCalcularActionPerformed

    private void RBDesplazamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBDesplazamientoActionPerformed
        Tipo=1;
        txtN1.setVisible(true);
        jLabel4.setVisible(true);
    }//GEN-LAST:event_RBDesplazamientoActionPerformed

    private void RBVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBVelocidadActionPerformed
        Tipo=2;
        txtN1.setVisible(false);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_RBVelocidadActionPerformed

    private void RBAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAceleracionActionPerformed
        Tipo=3;
        txtN1.setVisible(false);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_RBAceleracionActionPerformed

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
       dispose();
    }//GEN-LAST:event_BTSalirActionPerformed
    
    int NN1(){
        try{
            return Integer.parseInt(txtN2.getText());
        }catch(Exception ex){
            return 0;
        }
    }
    
    int EE1(){
        try{
            return Integer.parseInt(txtE2.getText());
        }catch(Exception ex){
            return 0;
        }
    }
    
    int NN2(){
        try{
            return Integer.parseInt(txtN3.getText());
        }catch(Exception ex){
            return 0;
        }
    }
    
    int EE2(){
        try{
            return Integer.parseInt(txtE3.getText());
        }catch(Exception ex){
            return 0;
        }
    }
    
    int bd() {
        try {
            return Integer.parseInt(txtTiempo.getText());
        } catch (Exception e) {
            return 0;
        }
    }
    
    int NN(){
        try {
            return Integer.parseInt(txtN1.getText());
        } catch (Exception e) {
            return 0;
        }
    }
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
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCalcular;
    private javax.swing.JButton BTSalir;
    private javax.swing.JRadioButton RBAceleracion;
    private javax.swing.JRadioButton RBDesplazamiento;
    private javax.swing.JRadioButton RBVelocidad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtE3;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    private javax.swing.JTextArea txtResA;
    private javax.swing.JTextArea txtResD;
    private javax.swing.JTextArea txtResV;
    private javax.swing.JTextField txtResultadoA;
    private javax.swing.JTextField txtResultadoD;
    private javax.swing.JTextField txtResultadoV;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    // End of variables declaration//GEN-END:variables
}
