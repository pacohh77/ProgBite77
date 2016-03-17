/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.classArticulos;
import clases.control_cliente;
import herramientas.Reportes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julioc
 */
public class frmArticulos extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmArticulos1
     */
    long lngNumPaginas;
    public frmArticulos() {
        initComponents();
        this.limpiar();
        this.defineTablaArticulos("", 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaises = new javax.swing.JScrollPane();
        JTabArticulos = new javax.swing.JTable();
        panCapturaArticulos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        idProducto = new javax.swing.JLabel();
        txtIdArticulo = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        costos = new javax.swing.JPanel();
        txtPrecioCosto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        lblPrecioCosto = new javax.swing.JLabel();
        Impuestos = new javax.swing.JPanel();
        txtIVA = new javax.swing.JTextField();
        txtIEPS = new javax.swing.JTextField();
        lblIEPS = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlblNumReg = new javax.swing.JLabel();
        txtNumReg = new javax.swing.JTextField();
        jlblNumReg2 = new javax.swing.JLabel();
        txtPagina = new javax.swing.JTextField();
        jlblTotalPaginas = new javax.swing.JLabel();
        cmdAtras = new javax.swing.JButton();
        cmdSiguiente = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        cmdBuscar = new javax.swing.JButton();
        PanBotones2 = new javax.swing.JPanel();
        btnRegArticulo = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimirReporte = new javax.swing.JButton();
        salirclijButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTabArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTabArticulos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTabArticulos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTabArticulosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTabArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabArticulosMouseClicked(evt);
            }
        });
        tabPaises.setViewportView(JTabArticulos);

        lblDescripcion.setText("Descripcion:");

        idProducto.setText("ID Producto:");

        lblTipo.setText("Tipo:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto", "Servicio" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipo)
                    .addComponent(idProducto)
                    .addComponent(lblDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescripcion)
                    .addComponent(cboTipo, 0, 174, Short.MAX_VALUE)
                    .addComponent(txtIdArticulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProducto)
                    .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        panCapturaArticulos.addTab("Datos Basicos", jPanel1);

        lblPrecioVenta.setText("Precio Venta:");

        lblPrecioCosto.setText("Precio Costo:");

        javax.swing.GroupLayout costosLayout = new javax.swing.GroupLayout(costos);
        costos.setLayout(costosLayout);
        costosLayout.setHorizontalGroup(
            costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(costosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecioVenta)
                    .addComponent(lblPrecioCosto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtPrecioVenta))
                .addGap(60, 60, 60))
        );
        costosLayout.setVerticalGroup(
            costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(costosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioCosto)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioVenta)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        panCapturaArticulos.addTab("Costos", costos);

        lblIEPS.setText("IEPS:");

        lblIVA.setText("IVA:");

        javax.swing.GroupLayout ImpuestosLayout = new javax.swing.GroupLayout(Impuestos);
        Impuestos.setLayout(ImpuestosLayout);
        ImpuestosLayout.setHorizontalGroup(
            ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImpuestosLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIEPS)
                    .addComponent(lblIVA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIEPS, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtIVA))
                .addContainerGap())
        );
        ImpuestosLayout.setVerticalGroup(
            ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImpuestosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIEPS)
                    .addComponent(txtIEPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        panCapturaArticulos.addTab("Impuesto", Impuestos);

        jlblNumReg.setText("Registros");

        txtNumReg.setText("5");

        jlblNumReg2.setText("Pagina ");

        txtPagina.setText("1");

        jlblTotalPaginas.setText("Pagina ");

        cmdAtras.setText("<<");
        cmdAtras.setActionCommand("");
        cmdAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAtrasActionPerformed(evt);
            }
        });

        cmdSiguiente.setText(">>");
        cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSiguienteActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        lblBuscar.setText("Buscar");

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblNumReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblNumReg2)
                        .addGap(2, 2, 2)
                        .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblTotalPaginas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdSiguiente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNumReg)
                    .addComponent(txtNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNumReg2)
                    .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotalPaginas)
                    .addComponent(cmdAtras)
                    .addComponent(cmdSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscar)
                    .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        btnRegArticulo.setText("Registrar");
        btnRegArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegArticuloActionPerformed(evt);
            }
        });

        btnNuevo.setLabel("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnImprimirReporte.setText("Imprimir ");
        btnImprimirReporte.setActionCommand("");
        btnImprimirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirReporteActionPerformed(evt);
            }
        });

        salirclijButton.setText("Salir");
        salirclijButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanBotones2Layout = new javax.swing.GroupLayout(PanBotones2);
        PanBotones2.setLayout(PanBotones2Layout);
        PanBotones2Layout.setHorizontalGroup(
            PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanBotones2Layout.createSequentialGroup()
                .addGroup(PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanBotones2Layout.createSequentialGroup()
                        .addGroup(PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimirReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanBotones2Layout.createSequentialGroup()
                        .addComponent(salirclijButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanBotones2Layout.setVerticalGroup(
            PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanBotones2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegArticulo)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnImprimirReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salirclijButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(PanBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panCapturaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCapturaArticulos)
                    .addComponent(tabPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(PanBotones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void defineTablaArticulos(String strBusqueda,long DesdeHoja){
        
        long lngRegistros=1;
        long lngDesdeRegistro;
        
        //DEFINIMOS LA TABLA MODELO
        DefaultTableModel tablaArticulos = new DefaultTableModel();
        
        //LE AGREGAMOS EL TITULO DE LAS COLUMNAS DE LA TABLA EN UN ARREGLO
        String strTitulos[]={"ID ARTTICULO","DESCRIPCION","TIPO"};
        
        //LE ASIGNAMOS LAS COLUMNAS AL MODELO CON LA CADENA DE ARRIBA
        tablaArticulos.setColumnIdentifiers(strTitulos);
        
        //LE ASIGNAMOS EL MODELO DE ARRIBA AL JTABLE 
        this.JTabArticulos.setModel(tablaArticulos);
        
                    //AHORA A LEER LOS DATOS
        
        //ASIGNAMOS CUANTOS REGISTROS POR HOJA TRAEREMOS
        lngRegistros=(Long.valueOf(this.txtNumReg.getText()));
        
        //ASIGNAMOS DESDE QUE REGISTRO TRAERA LA CONSULTA SQL
        lngDesdeRegistro=(DesdeHoja*lngRegistros)-lngRegistros;
        
        //INSTANCEAMOS LA CLASE CLIENTE
        classArticulos classArticulo= new classArticulos();
        
        //LEEMOS LA CLASE CLIENTE MANDANDOLE LOS PARAMETROS
        classArticulo.leerArticulos(lngDesdeRegistro, (Long.valueOf(this.txtNumReg.getText())),tablaArticulos,strBusqueda);
        
        //LE PONEMOS EL RESULTADO DE LA CONSULA AL JTABLE
        this.JTabArticulos.setModel(tablaArticulos);
        
        //ASIGNAMOS LOS VALORES A LA PAGINACION
        lngRegistros = classArticulo.leerCuantos("");
        lngNumPaginas= (lngRegistros/ (Long.valueOf( this.txtNumReg.getText())))+1;
        this.jlblTotalPaginas.setText(" De " + ( lngNumPaginas));
        
    }
    private void JTabArticulosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTabArticulosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTabArticulosAncestorAdded

    private void JTabArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabArticulosMouseClicked
        int fila;
        String[] datosGrupo =new String[1];
        fila = this.JTabArticulos.rowAtPoint(evt.getPoint());
        classArticulos articulos = new classArticulos();
        long lngArticulo;

        if (fila > -1){
            this.txtIdArticulo.setText(String.valueOf(this.JTabArticulos.getValueAt(fila, 0)));

            //            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            //            Date Fecha = new Date();
            //            this.dteFechaNacimiento.setDate(Fecha);

            articulos.leerArticulo(this.txtIdArticulo.getText());

            this.txtIdArticulo.setText(String.valueOf(articulos.lngIdArticulo));
            this.txtDescripcion.setText(articulos.strDescripcion);
            this.txtIEPS.setText(String.valueOf(articulos.dblIEPS));
            this.txtIVA.setText(String.valueOf(articulos.dblIVA));
            this.txtPrecioCosto.setText(String.valueOf(articulos.dblPrecioCosto));
            this.txtPrecioVenta.setText(String.valueOf(articulos.dblPrecioVenta));

            this.btnEliminar.setVisible(true);
            this.btnNuevo.setVisible(true);

            if(articulos.lngIdArticulo>0){
                this.btnRegArticulo.setLabel("Actualizar");
            }
        }
    
    }//GEN-LAST:event_JTabArticulosMouseClicked

    private void cmdAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAtrasActionPerformed
        long lngValor=0;
        if(1<Long.valueOf( this.txtPagina.getText())){
            lngValor=Long.valueOf( this.txtPagina.getText())-1;
            this.txtPagina.setText(String.valueOf(lngValor));
            defineTablaArticulos("",lngValor);
        }
    }//GEN-LAST:event_cmdAtrasActionPerformed

    private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed
        long lngValor=0;
        if(lngNumPaginas>Long.valueOf( this.txtPagina.getText())){
            lngValor=Long.valueOf( this.txtPagina.getText())+1;
            this.txtPagina.setText(String.valueOf(lngValor));
            defineTablaArticulos("",lngValor);
        }
    }//GEN-LAST:event_cmdSiguienteActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnRegArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegArticuloActionPerformed

        if (this.btnRegArticulo.getLabel()=="Registrar"){
            classArticulos Articulos = new classArticulos();
            String strRespuesta="";

           
            Articulos.strDescripcion=this.txtDescripcion.getText();
            Articulos.strTipo=this.cboTipo.getSelectedItem().toString();
            Articulos.dblIEPS=Double.valueOf(this.txtIEPS.getText());
            Articulos.dblIVA=Double.valueOf(this.txtIVA.getText());
            Articulos.dblPrecioCosto=Double.valueOf(this.txtPrecioCosto.getText());
            Articulos.dblPrecioVenta=Double.valueOf(this.txtPrecioVenta.getText());
          

            try {
                Articulos.ingresarArticulo();
                defineTablaArticulos("",1);
                limpiar();
                JOptionPane.showInternalMessageDialog(rootPane,"Registrado Correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(frmArticulos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showInternalMessageDialog(rootPane,"ERROR" + ex.toString());
            }

        }

        else{
            classArticulos Articulos =new classArticulos();
            
            Articulos.lngIdArticulo=Long.valueOf(this.txtIdArticulo.getText());
            Articulos.strDescripcion=this.txtDescripcion.getText();
            Articulos.strTipo=this.cboTipo.getSelectedItem().toString();
            Articulos.dblIEPS=Double.valueOf(this.txtIEPS.getText());
            Articulos.dblIVA=Double.valueOf(this.txtIVA.getText());
            Articulos.dblPrecioCosto=Double.valueOf(this.txtPrecioCosto.getText());
            Articulos.dblPrecioVenta=Double.valueOf(this.txtPrecioVenta.getText());
          

            try {
                if (Articulos.actualizarArticulo()==true){
                    this.defineTablaArticulos(this.txtBuscar.getText(), Long.valueOf( this.txtPagina.getText()));
                    JOptionPane.showInternalMessageDialog(rootPane,"Actualizado Correctamente");
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmGruposUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnRegArticuloActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        classArticulos Articulos = new classArticulos();
        Articulos.lngIdArticulo=Long.valueOf(this.txtIdArticulo.getText());
        
        try {
            Articulos.eliminarArticulo();
            defineTablaArticulos("",1);
            this.limpiar();
            JOptionPane.showInternalMessageDialog(rootPane,"Eliminado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(frmGruposUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirReporteActionPerformed
        int intDesde,intCuantos;
        Long lngDesdeRegistro,lngRegistros,DesdeHoja;
        String strBusqueda,strConsulta;

        lngDesdeRegistro=Long.valueOf(this.txtNumReg.getText());
        lngRegistros=Long.valueOf(this.txtNumReg.getText());
        DesdeHoja=Long.valueOf(this.txtPagina.getText());

        lngDesdeRegistro=(DesdeHoja*lngRegistros)-lngRegistros;
        strConsulta="call PA_LeeArticulos ("+lngDesdeRegistro.toString()+","+this.txtNumReg.getText()+",'"+this.txtBuscar.getText()+"')";
        System.out.println(strConsulta);
        Reportes.lanzarReporte(strConsulta, "repArticulos");
    }//GEN-LAST:event_btnImprimirReporteActionPerformed

    private void salirclijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirclijButtonActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        defineTablaArticulos(this.txtBuscar.getText(),Long.valueOf(this.txtPagina.getText()));
    }//GEN-LAST:event_cmdBuscarActionPerformed

    public void limpiar()
    {
        
        this.btnRegArticulo.setLabel("Registrar");
        txtDescripcion.setText("");
        txtIdArticulo.enable(false);
        txtIdArticulo.setText("");
        this.txtIEPS.setText("");
        this.txtIVA.setText("");
        this.txtPrecioCosto.setText("");
        this.txtPrecioVenta.setText("");
        this.btnEliminar.setVisible(false);
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Impuestos;
    private javax.swing.JTable JTabArticulos;
    private javax.swing.JPanel PanBotones2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimirReporte;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegArticulo;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JButton cmdAtras;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdSiguiente;
    private javax.swing.JPanel costos;
    private javax.swing.JLabel idProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlblNumReg;
    private javax.swing.JLabel jlblNumReg2;
    private javax.swing.JLabel jlblTotalPaginas;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIEPS;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblPrecioCosto;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTabbedPane panCapturaArticulos;
    private javax.swing.JButton salirclijButton;
    private javax.swing.JScrollPane tabPaises;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIEPS;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtIdArticulo;
    private javax.swing.JTextField txtNumReg;
    private javax.swing.JTextField txtPagina;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
