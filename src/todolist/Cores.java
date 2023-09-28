/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author kauah
 */
public class Cores extends javax.swing.DefaultListCellRenderer {
    @Override
    public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);        
            this.setBackground(java.awt.Color.GREEN);
            this.setForeground(java.awt.Color.BLACK);
        return this;
    }
}
