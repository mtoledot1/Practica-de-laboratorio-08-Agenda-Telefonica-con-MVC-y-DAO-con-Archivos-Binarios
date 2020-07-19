/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author tano
 */
public class VentanaGestionTelefono extends javax.swing.JInternalFrame {
    
    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;
    
    private ResourceBundle mensajes;

    public VentanaGestionTelefono(ControladorTelefono controladorTelefono, ControladorUsuario controladorUsuario, Locale localizacion, ResourceBundle mensajes) {
	initComponents();
	this.controladorUsuario = controladorUsuario;
	this.controladorTelefono = controladorTelefono;
	txtCodigo.setText((controladorTelefono.ultimoCodigo()+1) + "");
	cbxTipo.addItem("Casa");
	cbxTipo.addItem("Trabajo");
	cbxTipo.addItem("Móvil");
	cbxTipo.addItem("Fax Casa");
	cbxTipo.addItem("Fax Trabajo");
	cbxTipo.addItem("Localizador");
	cbxOperadora.addItem("CNT");
	cbxOperadora.addItem("Claro");
	cbxOperadora.addItem("Movistar");
	cbxOperadora.addItem("Tuenti");
	cbxOperadora.addItem("Etapa");
	controladorTelefono.verTelefonos((DefaultTableModel) tablaTelefonos.getModel());
	cambiarIdioma(localizacion, mensajes);
    }
    
    public void cambiarIdioma(Locale localizacion, ResourceBundle mensajes){
	this.mensajes = mensajes;
	btnCancelar.setText(mensajes.getString("btnCancelar"));
	lblCodigo.setText(mensajes.getString("lblCodigo"));
	lblNumero.setText(mensajes.getString("lblNumero"));
	lblOperadora.setText(mensajes.getString("lblOperadora"));
	lblTipo.setText(mensajes.getString("lblTipo"));
	btnActualizar.setText(mensajes.getString("btnActualizar"));
	btnAgregar.setText(mensajes.getString("btnAgregar"));
	btnBorrar.setText(mensajes.getString("btnBorrar"));
	btnBuscar.setText(mensajes.getString("btnBuscar"));
	cbxTipo.removeAllItems();
	cbxTipo.addItem(mensajes.getString("Tipo0"));
	cbxTipo.addItem(mensajes.getString("Tipo1"));
	cbxTipo.addItem(mensajes.getString("Tipo2"));
	cbxTipo.addItem(mensajes.getString("Tipo3"));
	cbxTipo.addItem(mensajes.getString("Tipo4"));
	cbxTipo.addItem(mensajes.getString("Tipo5"));
	cbxTipo.addItem(mensajes.getString("Tipo6"));
	
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblOperadora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTelefonos = new javax.swing.JTable() {
            public boolean editCellAt(int row, int column, java.util.EventObject e){
                return false;
            }
        };
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxOperadora = new javax.swing.JComboBox<>();
        fTxtNumero = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblCodigo.setText("Código");

        lblTipo.setText("Tipo");

        lblNumero.setText("Número");

        lblOperadora.setText("Operadora");

        tablaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Número", "Operadora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaTelefonos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTelefonosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTelefonos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Atualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione un tipo de teléfono--" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        cbxOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una operadora--" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblTipo)
                                    .addComponent(lblNumero)
                                    .addComponent(lblOperadora))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigo)
                                    .addComponent(cbxOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fTxtNumero))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(fTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperadora)
                    .addComponent(cbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
	fTxtNumero.setValue("");
	if(cbxTipo.getItemCount() != 0){
	    try {
		String str = (String)cbxTipo.getSelectedItem();
		if(str.equalsIgnoreCase(mensajes.getString("Tipo1"))){
		    fTxtNumero.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##-###-####")));
		}else if(str.equalsIgnoreCase(mensajes.getString("Tipo3"))){
		    fTxtNumero.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(+593)-#-###-####")));
		}else{
		    fTxtNumero.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###-#####")));
		}
	    } catch (ParseException ex) {
		Logger.getLogger(VentanaGestionTelefono.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
	String numero = fTxtNumero.getText();
	String tipo = (String)cbxTipo.getSelectedItem();
	String operadora = (String)cbxOperadora.getSelectedItem();
	String cedula = controladorUsuario.getSesion().getCedula();
	controladorTelefono.registrar(codigo, numero, tipo, operadora, cedula);
	txtCodigo.setText((controladorTelefono.ultimoCodigo()+1) + "");
	controladorTelefono.verTelefonos((DefaultTableModel) tablaTelefonos.getModel());
	limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
	controladorTelefono.eliminar(codigo);
	txtCodigo.setText(this.controladorTelefono.cantidadTelefonos() + "");
	controladorTelefono.verTelefonos((DefaultTableModel) tablaTelefonos.getModel());
	limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
	String numero = fTxtNumero.getText();
	String tipo = (String)cbxTipo.getSelectedItem();
	String operadora = (String)cbxOperadora.getSelectedItem();
	String cedula = controladorUsuario.getSesion().getCedula();
	controladorTelefono.registrar(codigo, numero, tipo, operadora, cedula);
	txtCodigo.setText(this.controladorTelefono.cantidadTelefonos() + "");
	controladorTelefono.verTelefonos((DefaultTableModel) tablaTelefonos.getModel());
	limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTelefonosMouseClicked
        int fila = tablaTelefonos.getSelectedRow();
	txtCodigo.setText(tablaTelefonos.getValueAt(fila, 0)+"");
	cbxTipo.setSelectedItem(tablaTelefonos.getValueAt(fila, 1));
	fTxtNumero.setText((String)tablaTelefonos.getValueAt(fila, 2));
	cbxOperadora.setSelectedItem(tablaTelefonos.getValueAt(fila, 3));
	btnAgregar.setEnabled(false);
	btnActualizar.setEnabled(true);
	btnBorrar.setEnabled(true);
	btnCancelar.setEnabled(true);
    }//GEN-LAST:event_tablaTelefonosMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        limpiar();
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        btnActualizar.setEnabled(false);
	btnBorrar.setEnabled(false);
	btnCancelar.setEnabled(false);
	controladorTelefono.verTelefonos((DefaultTableModel) tablaTelefonos.getModel());
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
	txtCodigo.setText((controladorTelefono.ultimoCodigo()+1) + "");
	btnActualizar.setEnabled(false);
	btnBorrar.setEnabled(false);
	btnCancelar.setEnabled(false);
	btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiar(){
	cbxTipo.setSelectedIndex(0);
	fTxtNumero.setValue("");
	cbxOperadora.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxOperadora;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JFormattedTextField fTxtNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOperadora;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tablaTelefonos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
