package view;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.MotoristaDAO;
import model.bean.Motorista; 

public class JFListarMotorista extends javax.swing.JFrame {

 
    public JFListarMotorista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jScollPane = new javax.swing.JScrollPane();
        jTMotorista = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ListarMotorista");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 69, 19));
        jLabel1.setText("Listar Motorista");

        jBtnCadastrar.setBackground(new java.awt.Color(50, 205, 50));
        jBtnCadastrar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnCadastrar.setText("Cadastrar Motorista");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnExcluir.setBackground(new java.awt.Color(255, 140, 0));
        jBtnExcluir.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnExcluir.setText("Excluir Motorista");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnEditar.setBackground(new java.awt.Color(30, 144, 255));
        jBtnEditar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnEditar.setText("Editar Motorista");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jTMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id da Motorista", "Nome Completo", "Genero", "RG", "CPF", "Celular", "Email", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMotorista.setToolTipText("");
        jScollPane.setViewportView(jTMotorista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScollPane)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jBtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jBtnEditar)
                .addGap(46, 46, 46)
                .addComponent(jBtnExcluir)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrar)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        JFCadastrarMotorista cm = new JFCadastrarMotorista();
        cm.setVisible(true);
        
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        if(jTMotorista.getSelectedRow() !=-1){
            int motoristaSelecionado = (int)jTMotorista.getValueAt (jTMotorista.getSelectedRow(), 0);
            JFAtualizarMotorista am= new JFAtualizarMotorista (motoristaSelecionado);
            am.setVisible(true);
        }else{
            JOptionPane.showMessageDialog (null, "Selecione uma motorista!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       readJTable();
       
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if(jTMotorista.getSelectedRow() != -1){
           int opcao = JOptionPane.showConfirmDialog (null, "Deseja excluir a motorista selecionada?", "Exclusão", JOptionPane.YES_NO_OPTION);
           if (opcao == 0){
              MotoristaDAO dao = new MotoristaDAO();
              Motorista m = new Motorista();
              m.setIdMotorista((int) jTMotorista.getValueAt (jTMotorista.getSelectedRow(), 0));
              dao.delete (m);
           }

         }else{
              JOptionPane.showMessageDialog (null, "Selecione uma motorista!", "Erro", JOptionPane.ERROR_MESSAGE);
         } 
        readJTable();
        dispose();
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        readJTable();
    }//GEN-LAST:event_formWindowActivated


                              
                                         

                                              

    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTMotorista.getModel ();
        modelo.setNumRows (0);
        MotoristaDAO dao = new MotoristaDAO();
        for(Motorista m: dao.read()){
            modelo.addRow (new Object []{
            m.getIdMotorista(),
            m.getNomeCompleto(),
            m.getGenero(),
            m.getRg(),
            m.getCpf(),
            m.getCelular(),
            m.getEmail(),
            m.getSenha(),
            
        });

    }
}
   
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListarMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMotorista;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
