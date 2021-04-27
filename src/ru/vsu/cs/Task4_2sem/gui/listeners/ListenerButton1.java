package ru.vsu.cs.Task4_2sem.gui.listeners;

import ru.vsu.cs.Task4_2sem.logic.BubbleSort;
import ru.vsu.cs.Task4_2sem.logic.ShakerSort;
import ru.vsu.cs.Task4_2sem.logic.Sort;
import ru.vsu.cs.Task4_2sem.util.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ListenerButton1 implements ActionListener {

    JTable table1;
    JRadioButton radioButton1;
    JRadioButton radioButton2;

    public ListenerButton1(JTable table1, JRadioButton radioButton1, JRadioButton radioButton2) {
        this.table1 = table1;
        this.radioButton1 = radioButton1;
        this.radioButton2 = radioButton2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sort bubble, shaker;
        int[] array = null;
        if (radioButton1.isSelected()) {
            bubble = new BubbleSort(0, 0);
            try {
                array = JTableUtils.readIntArrayFromJTable(table1);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            bubble.sort(array);
        } else if (radioButton2.isSelected()) {
            shaker = new ShakerSort(0, 0);
            try {
                array = JTableUtils.readIntArrayFromJTable(table1);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            shaker.sort(array);
        }
        JTableUtils.writeArrayToJTable(table1, array);
    }
}
