
import Posologia.PosologiaDAO;
import javax.swing.JOptionPane;
import Posologia.Posologia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class TelaCadastro extends javax.swing.JFrame {

   
    public TelaCadastro() {
        initComponents();
          listarPosologia();
    }

   
      public void mostrarTabela (){
    
   
     List<Posologia> lista = Posologia.getListPosologia();
     
        DefaultTableModel tab = (DefaultTableModel) tabelaPosologia.getModel();
    tab.setNumRows(0);
    
    for (Posologia d :lista){ //  adiciono o nome d para a lista e pego os atributos que esta lista usa
         tab.addRow(new Object[]{
             d.getMedico(),
             d.getTratamento(),
             d.getMedicamento(),
             d.getDosagem(),
             d.getData(),
             d.getHora(),
       
         } );
     }
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaCadastro = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        txtTratamento = new javax.swing.JTextField();
        txtMedicamento = new javax.swing.JTextField();
        txtDosagem = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPosologia = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaCadastro.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Posologia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Médico:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tratamento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Medicamento:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Dosagem:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Data:");

        btnSalvar.setBackground(new java.awt.Color(153, 255, 204));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tabelaPosologia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Médico", "Tratamento", "Medicamento", "Dosagem", "Data", "Hora"
            }
        ));
        jScrollPane2.setViewportView(tabelaPosologia);

        jLabel7.setText("Hora:");

        javax.swing.GroupLayout TelaCadastroLayout = new javax.swing.GroupLayout(TelaCadastro.getContentPane());
        TelaCadastro.getContentPane().setLayout(TelaCadastroLayout);
        TelaCadastroLayout.setHorizontalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMedico)
                            .addComponent(txtTratamento)
                            .addComponent(txtMedicamento)
                            .addComponent(txtDosagem)
                            .addComponent(txtData)
                            .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(btnSalvar))
                    .addGroup(TelaCadastroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        TelaCadastroLayout.setVerticalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastro)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaCadastro)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      

          Posologia po = new Posologia();
          PosologiaDAO dao = new PosologiaDAO();
            boolean status;
            int resposta;
             
            po.setMedico(txtMedico.getText());
            po.setTratamento(txtTratamento.getText());
            po.setMedicamento(txtMedicamento.getText());
            po.setDosagem(txtDosagem.getText());
            po.setData(txtData.getText());
            po.setHora(txtHora.getText());
      
            dao = new PosologiaDAO();
            
            status = dao.conectar();
            if(status == false){
                JOptionPane.showMessageDialog(null,"Erro de conexão");
            }else{
           
                resposta = dao.salvar(po);
                if(resposta == 1){
                    JOptionPane.showMessageDialog(null,"Dados incluidos com sucesso");
                    //limpar os campos
                    txtMedico.setText("");
                    txtTratamento.setText("");
                    txtMedicamento.setText("");
                    txtDosagem.setText("");
                    txtData.setText("");
                    txtHora.setText("");                   
                    //posicionar o cursor para um próximo
                    txtMedico.requestFocus();
                }else if (resposta ==1062){
                    JOptionPane.showMessageDialog(null,"Posologia cadastrada!");   
                }else{
                    JOptionPane.showMessageDialog(null,"Erro ao tentar inserir dados");
                }
                dao.desconectar();
    }
// TODO add your handling code here:
    
        
        
      
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame TelaCadastro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaPosologia;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDosagem;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables


 private void listarPosologia() {

        try {

            PosologiaDAO objfundao = new PosologiaDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaPosologia.getModel();
            model.setNumRows(0);

            ArrayList<Posologia> lista = objfundao.PesquisarPosologia();

            for (int num = 0; num < lista.size(); num++) {// aqui eu crio uma lista que me retorna a quantidade de valores que estiver na lista size

                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getMedico(),
                    lista.get(num).getTratamento(),
                    lista.get(num).getMedicamento(),
                     lista.get(num).getDosagem(),
                    lista.get(num).getData(),
                    lista.get(num).getHora()
                 
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarPosologia" + erro);
        }
    }



}


