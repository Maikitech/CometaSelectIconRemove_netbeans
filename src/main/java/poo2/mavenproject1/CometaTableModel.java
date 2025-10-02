/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.mavenproject1;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CometaTableModel extends AbstractTableModel {

    private final String[] colunas = {"Ano", "Cometa", "Foi Registrado"};
    private final List<Cometa> cometas = new ArrayList<>();

    public void adicionarCometa(Cometa c) {
        cometas.add(c);
        fireTableRowsInserted(cometas.size() - 1, cometas.size() - 1);
    }

    public void removerCometa(int linha) {
        cometas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    public Cometa getCometa(int linha) {
        return cometas.get(linha);
    }

    public int getRowCount() {
        return cometas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int column) {
        return colunas[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) return Integer.class;
        if (columnIndex == 2) return Boolean.class;
        return String.class;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cometa c = cometas.get(rowIndex);
        switch (columnIndex) {
            case 0: return c.getAno();
            case 1: return c.getNome();
            case 2: return c.isFoiRegistrado();
            default: return null;
        }
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cometa c = cometas.get(rowIndex);
        switch (columnIndex) {
            case 0: c.setAno((Integer) aValue); break;
            case 1: c.setNome((String) aValue); break;
            case 2: c.setFoiRegistrado((Boolean) aValue); break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; // Pode editar todas as células se quiser
    }
}

