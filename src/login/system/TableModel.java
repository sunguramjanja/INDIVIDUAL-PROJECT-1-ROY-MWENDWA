/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ROY
 */
public class TableModel extends AbstractTableModel {

    private List<Object[]> data;

    private int columnCount = 5;
    
    private String[] columnNames = new String[]{"Firstname", "Secondname", "Telephone", "DOB", "Gender"};

    @Override
    public int getRowCount() {
        if (null == data) {
            return 0;
        } else {
            return data.size();
        }
    }

    @Override
    public int getColumnCount() {

        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (null == data) {
            return null;
        }

        return data.get(rowIndex)[columnIndex];
    }
    
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void setData(List<Object[]> data) {
        this.data = data;
        fireTableDataChanged();
    }

}
