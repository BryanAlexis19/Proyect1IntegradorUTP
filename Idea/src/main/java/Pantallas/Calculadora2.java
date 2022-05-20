

package Pantallas;
import Entidades.FormulaGeneral;
import Entidades.Desplazamiento;
import Entidades.VelocidadMedia;
import Entidades.AceleracionMedia;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculadora2 extends javax.swing.JFrame {
    
    int Tipo = 0;
    int tema;
    static double n1;
    static double n2;
    static double n3;
    static int e1;
    static int e2;
    static int e3;
    static int varT;
    static double respConTiempo;
    static double respConTiempo2;
    static double desplazF;
    static double velMediaF;
    static double acelMediaF;

       
    static ArrayList<FormulaGeneral> listaFormula1 = new ArrayList<>();
    FormulaGeneral control;
    Desplazamiento despla;
    VelocidadMedia velMed;
    AceleracionMedia acmed;
    String formuInicial;
    static String formulaDerivada;
    static String formulaIntegral;

    
    public Calculadora2() {       
        initComponents();
        Calculadora2.this.setBackground(new Color(0,0,0));
        
        txtE1.setVisible(false);
        txtX1.setVisible(false);
        txtResP.setEditable(false);
        txtResV.setEditable(false);
        txtResA.setEditable(false);
        txtX2.setEditable(false);
        txtX3.setEditable(false);
        txtResultadoP.setEditable(false);
        txtResultadoV.setEditable(false);
        txtResultadoA.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RBDesplazamiento = new javax.swing.JRadioButton();
        RBVelocidad = new javax.swing.JRadioButton();
        RBAceleracion = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtE2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtE3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BTNCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResP = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtResultadoP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDespF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResV = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txtResultadoV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtVelMediaF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResA = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        txtResultadoA = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAcelMediaF = new javax.swing.JTextField();
        BTSalir = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Tipo Formula:");

        buttonGroup1.add(RBDesplazamiento);
        RBDesplazamiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        RBDesplazamiento.setText("Desplazamiento");
        RBDesplazamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBDesplazamientoActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBVelocidad);
        RBVelocidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        RBVelocidad.setText("Velocidad");
        RBVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBVelocidadActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBAceleracion);
        RBAceleracion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora de Desplazamiento, velocidad y aceleracion");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Ingresar Formula:");

        txtN1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtN1.setForeground(new java.awt.Color(51, 51, 255));
        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtE1.setText("0");
        txtE1.setEnabled(false);

        txtX1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtX1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setText("+");

        txtN2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtN2.setForeground(new java.awt.Color(51, 51, 255));
        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtX2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtX2.setForeground(new java.awt.Color(51, 51, 255));
        txtX2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtX2.setText("X");
        txtX2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtE2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setText("+");

        txtN3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtN3.setForeground(new java.awt.Color(51, 51, 255));
        txtN3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtX3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtX3.setForeground(new java.awt.Color(51, 51, 255));
        txtX3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtX3.setText("X");
        txtX3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtE3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Ingresar Tiempo:");

        txtTiempo.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 102, 51));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        jLabel10.setText("Seg.");

        BTNCalcular.setBackground(new java.awt.Color(204, 255, 255));
        BTNCalcular.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        BTNCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/send25.png"))); // NOI18N
        BTNCalcular.setText("CALCULAR");
        BTNCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCalcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Posición");

        txtResP.setColumns(20);
        txtResP.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtResP.setRows(5);
        txtResP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtResP);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Posición / Tiempo");

        txtResultadoP.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtResultadoP.setText("Resultado");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Desplazamiento");

        txtDespF.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtDespF.setText("Resultado");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Velocidad");

        txtResV.setColumns(20);
        txtResV.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtResV.setRows(5);
        txtResV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtResV);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Velocidad / Tiempo");

        txtResultadoV.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtResultadoV.setText("Resultado");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("Velocidad Media");

        txtVelMediaF.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtVelMediaF.setText("Resultado");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Aceleracion");

        txtResA.setColumns(20);
        txtResA.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtResA.setRows(5);
        txtResA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtResA);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Aceleración / Tiempo");

        txtResultadoA.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtResultadoA.setText("Resultado");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Aceleración Media");

        txtAcelMediaF.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtAcelMediaF.setText("Resultado");

        BTSalir.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        BTSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/close25.png"))); // NOI18N
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        btnClearAll.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eraser25.png"))); // NOI18N
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel17.setText("m/s");

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel18.setText("m/s");

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel19.setText("m/s^2");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel20.setText("m/s^2");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel21.setText("mts");

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel22.setText("mts");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Claro");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Oscuro");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jToggleButton1.setText("T");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(BTNCalcular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtResultadoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtAcelMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel16)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtResultadoV, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(txtVelMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtResultadoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDespF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtE2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtE1)
                                    .addComponent(txtE2)
                                    .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BTSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(txtVelMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(txtResultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(txtAcelMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDespF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtResultadoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21))))
                            .addComponent(txtResultadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BTSalirActionPerformed

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
            if (bd()==0){ clearResult1();} else { operarTiempo2(); txtResultadoP.setText(fmto(respConTiempo));
                calcPromedios(); txtDespF.setText(fmto(desplazF)); txtVelMediaF.setText(fmto(velMediaF));}
            txtResP.setText("---------Formula Principal----------\n" + formuInicial);
            control.ProcedimientoP(Tipo,txtResP);
            Derivar1(n1, n2, n3, e1, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoV.setText(fmto(respConTiempo));
                calcPromedios2(); txtAcelMediaF.setText(fmto(acelMediaF));}
            txtResV.setText("---------Formula Derivada 1 vez----------\n" + formulaDerivada);
            control.ProcedimientoV(Tipo,txtResV);
            setNewVars();
            Derivar1(n1, n2, n3, e1, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoA.setText(fmto(respConTiempo)); }
            txtResA.setText("---------Formula Derivada por 2da vez----------\n" + formulaDerivada);
            control.ProcedimientoA(Tipo,txtResA);
            break;

            case 2:
            getVarsIntegral();
            initFormulaIntegral();
            if (bd()==0){ clearResult1();} else { operarTiempo2(); txtResultadoV.setText(fmto(respConTiempo));
            calcPromedios2(); txtAcelMediaF.setText(fmto(acelMediaF));}
            txtResV.setText("---------Formula Principal----------\n" + formuInicial);
            control.ProcedimientoV(Tipo,txtResV);
            Integrar1(n2, n3, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoP.setText(fmto(respConTiempo));
                calcPromedios(); txtDespF.setText(fmto(desplazF)); txtVelMediaF.setText(fmto(velMediaF));}
            
            txtResP.setText("---------Formula Integral 1 vez----------\n" + formulaIntegral+" + "+"C");
            control.ProcedimientoP(Tipo,txtResP);
            setNewVarsIntegral();
            Derivar2(n2, n3, e2, e3);
            setNewVarsIntegral();
            Derivar2(n2, n3, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoA.setText(fmto(respConTiempo));
            }
            txtResA.setText("---------Formula Derivada por 1 vez----------\n" + formulaDerivada);
            control.ProcedimientoA(Tipo,txtResA);
            break;

            case 3:
            getVarsIntegral();
            initFormulaIntegral();
            if (bd()==0){ clearResult1();} else { operarTiempo2(); txtResultadoA.setText(fmto(respConTiempo)); }
            txtResA.setText("---------Formula Principal----------\n" + formuInicial);
            control.ProcedimientoA(Tipo,txtResA);
            Integrar1(n2, n3, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoV.setText(fmto(respConTiempo));
                calcPromedios2(); txtAcelMediaF.setText(fmto(acelMediaF)); }
            txtResV.setText("---------Formula Integrada 1era vez----------\n" + formulaIntegral+" + "+"C");
            control.ProcedimientoV(Tipo,txtResV);
            setNewVarsIntegral();
            Integrar1(n2, n3, e2, e3);
            if (bd()==0){clearResult1();} else { operarTiempo2(); txtResultadoP.setText(fmto(respConTiempo));
                calcPromedios(); txtVelMediaF.setText(fmto(velMediaF)); txtDespF.setText(fmto(desplazF)); }
            txtResP.setText("---------Formula integrada 2da vez----------\n" + formulaIntegral+" + "+"C");
            control.ProcedimientoP(Tipo,txtResP);
            break;
            default:
            break;
        }
        buttonGroup1.clearSelection();

    }//GEN-LAST:event_BTNCalcularActionPerformed

    private void RBAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAceleracionActionPerformed
        Tipo=3;
        txtN1.setVisible(false);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_RBAceleracionActionPerformed

    private void RBVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBVelocidadActionPerformed
        Tipo=2;
        txtN1.setVisible(false);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_RBVelocidadActionPerformed

    private void RBDesplazamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBDesplazamientoActionPerformed
        Tipo=1;
        txtN1.setVisible(true);
        jLabel4.setVisible(true);
    }//GEN-LAST:event_RBDesplazamientoActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        txtN1.setText(null);
        txtN2.setText(null);
        txtN3.setText(null);
        txtE2.setText(null);
        txtE3.setText(null);
        txtResP.setText(null);
        txtResV.setText(null);
        txtResA.setText(null);
        txtTiempo.setText(null);      
        txtResultadoP.setText(null);
        txtResultadoV.setText(null);
        txtResultadoA.setText(null);
        txtDespF.setText(null);
        txtVelMediaF.setText(null);
        txtAcelMediaF.setText(null); 
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tema=1;
        jPanel3.setBackground(new Color(253,245,230));
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tema=2;
        jPanel3.setBackground(new Color(47,79,79));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jRadioButton3ActionPerformed
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
    
    public void clearResult1() {
        txtResultadoP.setText(null);
        txtResultadoV.setText(null);
        txtResultadoA.setText(null);
        txtDespF.setText(null);
        txtVelMediaF.setText(null);
        txtAcelMediaF.setText(null); 
    }
    
    
    public void  calcPromedios(){
        if(Tipo==1){
           despla = new Desplazamiento(n1,respConTiempo);
           desplazF = despla.calcDesp();           
           velMed = new VelocidadMedia(respConTiempo, n1, varT);
           velMediaF = velMed.calcVelMedia();
        }else if (Tipo==2 || Tipo==3) {
           despla = new Desplazamiento(0,respConTiempo);
           desplazF = despla.calcDesp();           
           velMed = new VelocidadMedia(respConTiempo, 0, varT);
           velMediaF = velMed.calcVelMedia();
            
        }
     
    }
    
    public void calcPromedios2(){
        if(Tipo==1){
           acmed = new AceleracionMedia(respConTiempo, varT);
           acelMediaF = acmed.calcAcelMedia();
        }else if (Tipo==2 || Tipo==3) {
           acmed = new AceleracionMedia(respConTiempo, varT);
           acelMediaF = acmed.calcAcelMedia();
        }
    }
    
        public String fmto(double param){
        DecimalFormat format1 = new DecimalFormat("0.00");
        DecimalFormat format2 = new DecimalFormat("#.00");
        String rpta;
        
        if(param - Math.floor(param)==0){
            rpta = format2.format(param);
        }else{
            if(param<1){
                rpta = format1.format(param);
            }else{
                rpta = format2.format(param);
            }
        }
        return rpta;
    }

        
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
    private javax.swing.JButton btnClearAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtAcelMediaF;
    private javax.swing.JTextField txtDespF;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtE3;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    private javax.swing.JTextArea txtResA;
    private javax.swing.JTextArea txtResP;
    private javax.swing.JTextArea txtResV;
    private javax.swing.JTextField txtResultadoA;
    private javax.swing.JTextField txtResultadoP;
    private javax.swing.JTextField txtResultadoV;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtVelMediaF;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    // End of variables declaration//GEN-END:variables
}
