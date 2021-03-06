/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.classMovimientosInventario;
import static herramientas.globales.llenarComboGlobal;

/**
 *
 * @author julio
 */
public class frmMovimientos extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmMovimientos
     */
    public frmMovimientos() {
        initComponents();
        String strQuery;
        
        this.tab.setEnabledAt(1, false);
        
        //LLENA LOS TIPOS DE FLUJO
        strQuery="SELECT idTipoFlujo,Descripcion from TiposFlujos where EntradaSalida='" + this.cboTipo.getSelectedItem().toString() +"'";
        llenarComboGlobal(this.cbotTipoFlujo1,strQuery);
        
        //LLENA LOS ALMACENES
        strQuery="SELECT idBodega,Descripcion from Bodegas";
        llenarComboGlobal(this.cboBodega,strQuery);
        
        blnTraeUltimoFolio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        panGenerales = new javax.swing.JPanel();
        panLlave = new javax.swing.JPanel();
        lblEntradaSalida = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        lblTipoFlujo = new javax.swing.JLabel();
        cboBodega = new javax.swing.JComboBox();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblBodega = new javax.swing.JLabel();
        cbotTipoFlujo1 = new javax.swing.JComboBox();
        lblClienteProveedor = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        lblNomCliente = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        dteFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblDia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        salir1 = new javax.swing.JButton();
        panProductos = new javax.swing.JPanel();
        tabPaises = new javax.swing.JScrollPane();
        JTabTipoFlujo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblProducto = new javax.swing.JLabel();
        txtIdTipoFlujo = new javax.swing.JTextField();
        lblCant = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblImporteTotal = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblEntradaSalida.setText("Entrada/Salida");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entrada", "Salida" }));
        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        lblTipoFlujo.setText("Tipo Flujo:");

        cboBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBodegaActionPerformed(evt);
            }
        });

        lblFolio.setText("Folio:");

        lblBodega.setText("Bodega:");

        cbotTipoFlujo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotTipoFlujo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLlaveLayout = new javax.swing.GroupLayout(panLlave);
        panLlave.setLayout(panLlaveLayout);
        panLlaveLayout.setHorizontalGroup(
            panLlaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLlaveLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblEntradaSalida)
                .addGap(18, 18, 18)
                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTipoFlujo)
                .addGap(18, 18, 18)
                .addComponent(cbotTipoFlujo1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblBodega)
                .addGap(18, 18, 18)
                .addComponent(cboBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFolio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panLlaveLayout.setVerticalGroup(
            panLlaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLlaveLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panLlaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLlaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBodega))
                    .addGroup(panLlaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEntradaSalida)
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTipoFlujo)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbotTipoFlujo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFolio)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblClienteProveedor.setText("Cliente/Proveedor:");

        lblNomCliente.setText("nombre");

        lblFactura.setText("Factura:");

        lblObservacion.setText("Observacion:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setActionCommand("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        dteFechaNacimiento.setToolTipText("");
        dteFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        lblDia.setText("Fecha:");

        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGeneralesLayout = new javax.swing.GroupLayout(panGenerales);
        panGenerales.setLayout(panGeneralesLayout);
        panGeneralesLayout.setHorizontalGroup(
            panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralesLayout.createSequentialGroup()
                .addComponent(panLlave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panGeneralesLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dteFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralesLayout.createSequentialGroup()
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panGeneralesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panGeneralesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblObservacion)
                            .addComponent(lblFactura)
                            .addComponent(lblClienteProveedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panGeneralesLayout.createSequentialGroup()
                                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panGeneralesLayout.createSequentialGroup()
                                        .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(38, 38, 38))
        );
        panGeneralesLayout.setVerticalGroup(
            panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralesLayout.createSequentialGroup()
                .addComponent(panLlave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDia)
                    .addComponent(dteFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClienteProveedor)
                    .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomCliente))
                .addGap(18, 18, 18)
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFactura)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab.addTab("DATOS GENERALES", panGenerales);

        JTabTipoFlujo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabTipoFlujo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTabTipoFlujo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTabTipoFlujoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTabTipoFlujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabTipoFlujoMouseClicked(evt);
            }
        });
        tabPaises.setViewportView(JTabTipoFlujo);

        lblDescripcion.setText("Descripcion:");

        lblProducto.setText("Producto:");

        lblCant.setText("Cantidad:");

        lblPrecio.setText("Precio:");

        lblImporteTotal.setText("Importe Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCant)
                            .addComponent(lblProducto)
                            .addComponent(lblDescripcion)
                            .addComponent(lblPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtIdTipoFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad)
                            .addComponent(txtPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImporteTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(txtIdTipoFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImporteTotal))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panProductosLayout = new javax.swing.GroupLayout(panProductos);
        panProductos.setLayout(panProductosLayout);
        panProductosLayout.setHorizontalGroup(
            panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panProductosLayout.setVerticalGroup(
            panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tab.addTab("PRODUCTOS", panProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBodegaActionPerformed

    private void JTabTipoFlujoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTabTipoFlujoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTabTipoFlujoAncestorAdded

    private void JTabTipoFlujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabTipoFlujoMouseClicked
       
    }//GEN-LAST:event_JTabTipoFlujoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

    private void cboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoItemStateChanged
        if (evt.getSource()==cboTipo) {
            String strQuery;
            strQuery="SELECT idTipoFlujo,Descripcion from TiposFlujos where EntradaSalida='" + this.cboTipo.getSelectedItem().toString() +"'";
            
            llenarComboGlobal(this.cbotTipoFlujo1,strQuery);
            
        }
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_salir1ActionPerformed

    private void cbotTipoFlujo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotTipoFlujo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotTipoFlujo1ActionPerformed

  
   public void blnTraeUltimoFolio(){
       String strTipoMovimiento;
       String strTipoFlujo;
       String strBodega;
       
       strTipoMovimiento=this.cboTipo.getSelectedItem().toString();
       strTipoFlujo=this.cbotTipoFlujo1.getSelectedItem().toString().substring(0, 4).toString();
       strBodega=this.cboBodega.getSelectedItem().toString().substring(0, 4).toString();
       
       classMovimientosInventario Movimientos = new classMovimientosInventario();
       
       this.txtFolio.setText( String.valueOf(Movimientos.lngUltimoFolio(strTipoMovimiento, strTipoFlujo, strBodega)));
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabTipoFlujo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cboBodega;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JComboBox cbotTipoFlujo1;
    private com.toedter.calendar.JDateChooser dteFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBodega;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblClienteProveedor;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEntradaSalida;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblImporteTotal;
    private javax.swing.JLabel lblNomCliente;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTipoFlujo;
    private javax.swing.JPanel panGenerales;
    private javax.swing.JPanel panLlave;
    private javax.swing.JPanel panProductos;
    private javax.swing.JButton salir1;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JScrollPane tabPaises;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFolio;
    javax.swing.JTextField txtIdTipoFlujo;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables
}
