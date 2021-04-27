package ru.vsu.cs.Task4_2sem.gui.listeners;

import ru.vsu.cs.Task4_2sem.util.MyArrayUtil;
import ru.vsu.cs.Task4_2sem.util.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerRandomButton1 implements ActionListener {
    JTable table1;

    public ListenerRandomButton1(JTable table1) {
        this.table1 = table1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] array = MyArrayUtil.setRandomArray(500, 10);
        JTableUtils.writeArrayToJTable(table1, array);
    }
}
