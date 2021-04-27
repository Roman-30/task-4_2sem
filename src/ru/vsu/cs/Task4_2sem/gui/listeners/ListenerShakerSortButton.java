package ru.vsu.cs.Task4_2sem.gui.listeners;

import ru.vsu.cs.Task4_2sem.logic.ShakerSort;
import ru.vsu.cs.Task4_2sem.logic.Sort;
import ru.vsu.cs.Task4_2sem.util.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ListenerShakerSortButton implements ActionListener {
    JTable table1;

    public ListenerShakerSortButton(JTable table1) {
        this.table1 = table1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sort shakerSort = new ShakerSort(0, 0);
        int[] array = null;
        try {
            array = JTableUtils.readIntArrayFromJTable(table1);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        shakerSort.sort(array);

        JTableUtils.writeArrayToJTable(table1, array);
    }
}
