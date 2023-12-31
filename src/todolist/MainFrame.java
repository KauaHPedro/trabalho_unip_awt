package todolist;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MainFrame extends javax.swing.JFrame {
    
     public MainFrame() {
        initComponents();
        listaTarefas.setCellRenderer(new Cores());
    }
     


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupConcluido = new javax.swing.JMenuItem();
        popupRemover = new javax.swing.JMenuItem();
        popupEditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btSobe = new javax.swing.JButton();
        btDesce = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTarefas = new javax.swing.JList<>();

        popupConcluido.setText("Concluída!");
        popupConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupConcluidoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popupConcluido);

        popupRemover.setText("Remover");
        popupRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupRemoverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popupRemover);

        popupEditar.setText("Editar");
        popupEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupEditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popupEditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Tarefas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lbTitulo.setBackground(new java.awt.Color(0, 153, 0));
        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("<html> <b> Gerenciador de Tarefas</b> </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        btAdd.setBackground(new java.awt.Color(255, 255, 204));
        btAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdd.setText("Adicionar Tarefa");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 255, 204));
        btRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemover.setText("Limpar Todas");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btSobe.setBackground(new java.awt.Color(255, 255, 204));
        btSobe.setIcon(new javax.swing.ImageIcon("C:\\Users\\kauah\\Downloads\\pra-cima.png")); // NOI18N
        btSobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSobeActionPerformed(evt);
            }
        });

        btDesce.setBackground(new java.awt.Color(255, 255, 204));
        btDesce.setIcon(new javax.swing.ImageIcon("C:\\Users\\kauah\\Downloads\\seta-para-baixo.png")); // NOI18N
        btDesce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAdd)
                    .addComponent(btSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDesce, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDesce, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btSobe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        listaTarefas.setBackground(new java.awt.Color(255, 255, 204));
        listaTarefas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaTarefas.setModel(new DefaultListModel());
        listaTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTarefasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTarefas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        String tarefa = JOptionPane.showInputDialog(this, "Digite a Tarefa:", "Adicionar Tarefa", JOptionPane.PLAIN_MESSAGE);
        if (tarefa != null && !tarefa.isEmpty()) {
            adicionarTarefaNaLista(tarefa);
        } else {
            JOptionPane.showMessageDialog(this, "Não é permitido adicionar tarefas em branco! Tente novamente!", "Ocorreu um erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btAddActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        ((DefaultListModel) listaTarefas.getModel()).clear();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void popupConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupConcluidoActionPerformed
        int index = listaTarefas.getSelectedIndex();
        if (index != -1) {
        Tarefa tarefa = (Tarefa) listaTarefas.getModel().getElementAt(index);
        tarefa.setConcluida(true);
        listaTarefas.repaint();
}
    }//GEN-LAST:event_popupConcluidoActionPerformed

    
    
    private void listaTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTarefasMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            int index = listaTarefas.locationToIndex(evt.getPoint());
            listaTarefas.setSelectedIndex(index);
            jPopupMenu1.show(listaTarefas, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listaTarefasMouseClicked

    private void popupRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupRemoverActionPerformed
        int index = listaTarefas.getSelectedIndex();
        if (index != -1) {
        ((DefaultListModel<Tarefa>) listaTarefas.getModel()).remove(index);
        }

    }//GEN-LAST:event_popupRemoverActionPerformed

    private void popupEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupEditarActionPerformed
        int index = listaTarefas.getSelectedIndex();
        if (index != -1) {
        Tarefa tarefaOriginal = (Tarefa) listaTarefas.getModel().getElementAt(index);
        String tarefaEditada = JOptionPane.showInputDialog(this, "Digite a Tarefa Corrigida:", "Editar Tarefa", JOptionPane.PLAIN_MESSAGE);
        if (tarefaEditada != null && !tarefaEditada.isEmpty()) {
            Tarefa novaTarefa = new Tarefa(tarefaEditada);
            novaTarefa.setConcluida(tarefaOriginal.isConcluida());
            ((DefaultListModel<Tarefa>) listaTarefas.getModel()).set(index, novaTarefa);
        } else {
            JOptionPane.showMessageDialog(this, "Não é permitido deixar a tarefa em branco! Tente novamente!", "Ocorreu um erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_popupEditarActionPerformed

    private void btSobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSobeActionPerformed
        subirTarefa();
    }//GEN-LAST:event_btSobeActionPerformed

    private void btDesceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesceActionPerformed
        descerTarefa();
    }//GEN-LAST:event_btDesceActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void adicionarTarefaNaLista(String tarefa) {
    ((DefaultListModel<Tarefa>) listaTarefas.getModel()).addElement(new Tarefa(tarefa));
}
    
    private void descerTarefa() {
        int indexAtual = listaTarefas.getSelectedIndex();
        DefaultListModel<Tarefa> model = (DefaultListModel<Tarefa>) listaTarefas.getModel();
        
        if (indexAtual < model.getSize() - 1) {
        Tarefa tarefa = model.getElementAt(indexAtual);
        model.remove(indexAtual);
        model.add(indexAtual + 1, tarefa);
        listaTarefas.setSelectedIndex(indexAtual + 1);
        }
    }
    
    private void subirTarefa() {
    int indexAtual = listaTarefas.getSelectedIndex();
    DefaultListModel<Tarefa> model = (DefaultListModel<Tarefa>) listaTarefas.getModel();

    if (indexAtual > 0) {
        Tarefa tarefa = model.getElementAt(indexAtual);
        model.remove(indexAtual);
        model.add(indexAtual - 1, tarefa);
        listaTarefas.setSelectedIndex(indexAtual - 1);
    }
 }
    
;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDesce;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSobe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JList<Tarefa> listaTarefas;
    private javax.swing.JMenuItem popupConcluido;
    private javax.swing.JMenuItem popupEditar;
    private javax.swing.JMenuItem popupRemover;
    // End of variables declaration//GEN-END:variables
}


