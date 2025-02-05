
package vista;


public class InterPendiente extends javax.swing.JInternalFrame {

   
    public InterPendiente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPendientes = new javax.swing.JTable();
        jbtnConfirmar = new javax.swing.JToggleButton();
        jbtnEliminar = new javax.swing.JToggleButton();
        jbtnCancelar = new javax.swing.JToggleButton();

        jtblPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblPendientes);

        jbtnConfirmar.setBackground(new java.awt.Color(0, 153, 204));
        jbtnConfirmar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jbtnConfirmar.setText("Confirmar");

        jbtnEliminar.setBackground(new java.awt.Color(0, 153, 204));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");

        jbtnCancelar.setBackground(new java.awt.Color(0, 153, 204));
        jbtnCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JToggleButton jbtnCancelar;
    public javax.swing.JToggleButton jbtnConfirmar;
    public javax.swing.JToggleButton jbtnEliminar;
    public javax.swing.JTable jtblPendientes;
    // End of variables declaration//GEN-END:variables
}
