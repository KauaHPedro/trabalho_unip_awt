package todolist;

import java.awt.Color;
import java.awt.Component;

public class Cores extends javax.swing.DefaultListCellRenderer {
    @Override
    public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            Tarefa tarefa = (Tarefa) value;
            if (tarefa.isConcluida()) {
                c.setBackground(Color.GREEN);
            }
        return c;
    }
    
    
}
