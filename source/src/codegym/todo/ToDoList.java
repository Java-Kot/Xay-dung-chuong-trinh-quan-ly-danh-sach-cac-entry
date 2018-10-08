package codegym.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    Entry[] list = new Entry[3];
    int length;
    int arrsize = list.length;

    public void showTodoList() {
        for (int i = 0; i < arrsize; i++) {
            System.out.println(list[i].notes + "; " + list[i].priority);
        }
    }
    public void addEntry(Entry entry){
        list[Entry.count] = entry;
        Entry.count++;
    }
//
//    public void sortList() {
//
//    }
//
    public void removeEntry(int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        arrsize--;
        showTodoList();
    }
}
