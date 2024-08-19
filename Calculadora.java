
package Paquete;


public class Calculadora extends javax.swing.JFrame {
    
    public float primernumero;
    public float segundonumero;
    public String operador; 
    public double resultado = 0;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JLabel();
        jButton1FSeno = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        jButtonFtangente = new javax.swing.JButton();
        BorrarUnEspacio = new javax.swing.JButton();
        jButtonFcoseno = new javax.swing.JButton();
        jButtonParentesis2 = new javax.swing.JButton();
        jButtonParentesis1 = new javax.swing.JButton();
        jButtonExponente = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        jButtonPorcentaje = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        OpSuma = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        BorrarTodo = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButtonExponentex2 = new javax.swing.JButton();

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton12.setText("jButton1");

        jButton13.setText("jButton1");

        jButton14.setText("jButton1");

        jButton72.setText("1");

        jButton73.setText("3");

        jButton74.setText("2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        Pantalla.setBackground(new java.awt.Color(255, 255, 255));
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Pantalla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pantalla.setOpaque(true);

        jButton1FSeno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1FSeno.setText("sin");
        jButton1FSeno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1FSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1FSenoActionPerformed(evt);
            }
        });

        jButtonRaiz.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonRaiz.setText("√^ ");
        jButtonRaiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });

        Num7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num7.setText("7");
        Num7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        jButtonFtangente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonFtangente.setText("tan");
        jButtonFtangente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFtangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFtangenteActionPerformed(evt);
            }
        });

        BorrarUnEspacio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BorrarUnEspacio.setText("DEL");
        BorrarUnEspacio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarUnEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarUnEspacioActionPerformed(evt);
            }
        });

        jButtonFcoseno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonFcoseno.setText("cos");
        jButtonFcoseno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFcoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFcosenoActionPerformed(evt);
            }
        });

        jButtonParentesis2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonParentesis2.setText(")");
        jButtonParentesis2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonParentesis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesis2ActionPerformed(evt);
            }
        });

        jButtonParentesis1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonParentesis1.setText("(");
        jButtonParentesis1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonParentesis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesis1ActionPerformed(evt);
            }
        });

        jButtonExponente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonExponente.setText("x^y");
        jButtonExponente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonExponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExponenteActionPerformed(evt);
            }
        });

        Num8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num8.setText("8");
        Num8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        jButtonPorcentaje.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonPorcentaje.setText("%");
        jButtonPorcentaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentajeActionPerformed(evt);
            }
        });

        Num9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num9.setText("9");
        Num9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        OpSuma.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        OpSuma.setText("+");
        OpSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OpSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSumaActionPerformed(evt);
            }
        });

        jButtonMultiplicacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonMultiplicacion.setText("x");
        jButtonMultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });

        Num4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num4.setText("4");
        Num4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num6.setText("6");
        Num6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Num5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num5.setText("5");
        Num5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num1.setText("1");
        Num1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num2.setText("2");
        Num2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        jButtonResta.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonResta.setText("-");
        jButtonResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        Num3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Num3.setText("3");
        Num3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        BorrarTodo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BorrarTodo.setText("AC");
        BorrarTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });

        jButtonDivision.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonDivision.setText("/");
        jButtonDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButton77.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton77.setText("0");
        jButton77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton78.setText(".");
        jButton78.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButtonExponentex2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonExponentex2.setText("x² ");
        jButtonExponentex2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonExponentex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExponentex2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OpSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonParentesis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1FSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFcoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFtangente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExponentex2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BorrarUnEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFtangente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFcoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1FSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExponentex2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarUnEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonParentesis1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonParentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="√^ ";
this.Pantalla.setText("");        
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButton1FSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1FSenoActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="sen";

    }//GEN-LAST:event_jButton1FSenoActionPerformed

    private void jButtonFtangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFtangenteActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="tan"; 
    }//GEN-LAST:event_jButtonFtangenteActionPerformed

    private void BorrarUnEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarUnEspacioActionPerformed
String textoActual = this.Pantalla.getText();
if (textoActual.length()>0){
    textoActual=textoActual.substring(0, textoActual.length()-1);
    this.Pantalla.setText(textoActual);
}
    }//GEN-LAST:event_BorrarUnEspacioActionPerformed

    private void jButtonFcosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFcosenoActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="cos";     }//GEN-LAST:event_jButtonFcosenoActionPerformed

    private void jButtonParentesis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParentesis2ActionPerformed
              this.Pantalla.setText(this.Pantalla.getText()+")");             // TODO add your handling code here:

    }//GEN-LAST:event_jButtonParentesis2ActionPerformed

    private void jButtonParentesis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParentesis1ActionPerformed
      this.Pantalla.setText(this.Pantalla.getText()+"(");             // TODO add your handling code here:

    }//GEN-LAST:event_jButtonParentesis1ActionPerformed

    private void jButtonExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExponenteActionPerformed
     this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="x^y";
this.Pantalla.setText("");
    }//GEN-LAST:event_jButtonExponenteActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"7");             // TODO add your handling code here:
    }//GEN-LAST:event_Num7ActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="-";
this.Pantalla.setText(""); 
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"0");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"8");             
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"1");      
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"2");            
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"3");             
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"4");           
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"5");            
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"6");           
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
this.Pantalla.setText(this.Pantalla.getText()+"9");             
    }//GEN-LAST:event_Num9ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
    if(!(this.Pantalla.getText().contains("."))){
        this.Pantalla.setText(this.Pantalla.getText()+".");
    }
    }//GEN-LAST:event_jButton78ActionPerformed

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
this.Pantalla.setText(" ");        
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void OpSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSumaActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="+";
this.Pantalla.setText("");
    }//GEN-LAST:event_OpSumaActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
this.segundonumero=Float.parseFloat(this.Pantalla.getText());
switch(this.operador){
    case "+":
        
   resultado=this.primernumero+this.segundonumero;
   break;
       case "-":
   resultado=this.primernumero-this.segundonumero;
   break;
       case "X":
   resultado=this.primernumero*this.segundonumero;
   break;
       case "/":
           if (segundonumero != 0){
               resultado=this.primernumero/this.segundonumero;
           } else{
               this.Pantalla.setText("Error div!0");
               return;
           }
   break;
       case "x²":
           resultado=(float)Math.pow(primernumero, 2);
           break;
       case "x^y":
           resultado=(float)Math.pow(primernumero,segundonumero);
           break;
       case "√^ ":
           resultado = (float)Math.pow(primernumero,1/segundonumero);
           break;
       case "sen":
           resultado= (float)Math.sin(Math.toRadians(primernumero));
           break;
        case "cos":
           resultado= (float)Math.cos(Math.toRadians(primernumero));
           break;       
        case "tan":
           resultado= (float)Math.tan(Math.toRadians(primernumero));
           break;
        case "%":
            resultado=this.primernumero/100;
}
if(resultado == (int) resultado){
    this.Pantalla.setText(String.valueOf((int)resultado));
}else{
    this.Pantalla.setText(String.valueOf(resultado));
}
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
     this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="/";
this.Pantalla.setText("");
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="X";
this.Pantalla.setText("");
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonExponentex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExponentex2ActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="x²";
    }//GEN-LAST:event_jButtonExponentex2ActionPerformed

    private void jButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentajeActionPerformed
this.primernumero=Float.parseFloat(this.Pantalla.getText());
this.operador="%";
    }//GEN-LAST:event_jButtonPorcentajeActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JButton BorrarUnEspacio;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton OpSuma;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton1FSeno;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonExponente;
    private javax.swing.JButton jButtonExponentex2;
    private javax.swing.JButton jButtonFcoseno;
    private javax.swing.JButton jButtonFtangente;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonParentesis1;
    private javax.swing.JButton jButtonParentesis2;
    private javax.swing.JButton jButtonPorcentaje;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
