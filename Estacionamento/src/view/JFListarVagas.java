package view;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.VagaDAO;
import model.bean.Vaga;

public class JFListarVagas extends javax.swing.JFrame {

    
    public JFListarVagas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVaga = new javax.swing.JTable();
        jBtnEditar = new javax.swing.JButton();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 69, 19));
        jLabel1.setText("Listar Vagas");

        jTVaga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID da vaga", "Número", "RUA", "Oblíqua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTVaga);

        jBtnEditar.setBackground(new java.awt.Color(30, 144, 255));
        jBtnEditar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnEditar.setText("Editar Vaga");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        jBtnCadastrar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnCadastrar.setText("Cadastrar Vaga");

        jBtnExcluir.setBackground(new java.awt.Color(255, 140, 0));
        jBtnExcluir.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnExcluir.setText("Excluir Vaga");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrar)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        readJTable();
    }//GEN-LAST:event_formWindowOpened

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if(jTVaga.getSelectedRow() != -1){
           int opcao = JOptionPane.showConfirmDialog (null, "Deseja excluir a vaga selecionada?", "Exclusão", JOptionPane.YES_NO_OPTION);
           if (opcao == 0){
              VagaDAO dao = new VagaDAO();
              Vaga v = new Vaga();
              v.setIdVaga((int) jTVaga.getValueAt (jTVaga.getSelectedRow(), 0));
              dao.delete (v);
           }

         }else{
              JOptionPane.showMessageDialog (null, "Selecione uma vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
         } 
        readJTable();
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        if(jTVaga.getSelectedRow() !=-1){
            int vagaSelecionada = (int)jTVaga.getValueAt (jTVaga.getSelectedRow(), 0);
            JFAtualizarVaga av= new JFAtualizarVaga (vagaSelecionada);
            av.setVisible(true);
        }else{
            JOptionPane.showMessageDialog (null, "Selecione uma vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       readJTable();
    }//GEN-LAST:event_jBtnEditarActionPerformed

    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTVaga.getModel ();
        modelo.setNumRows (0);
        VagaDAO dao = new VagaDAO();
        for(Vaga v: dao.read()){
            modelo.addRow (new Object []{
            v.getIdVaga(),
            v.getNumero(),
            v.getRua(),
            v.isObliqua()

        });

    }
}
   
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListarVagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVaga;
    // End of variables declaration//GEN-END:variables
}
