package codegym.test;

import codegym.todo.Entry;
import codegym.todo.ToDoList;

public class TestToDo {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Entry ansang = new Entry(530,"Breakfast");
        Entry taptheduc = new Entry(500,"Tap the duc");
        Entry dihoc = new Entry(600,"Go to school");
        todo.addEntry(ansang);
        todo.addEntry(taptheduc);
        todo.addEntry(dihoc);
        todo.showTodoList();
        todo.sortEntryByPriority();
        todo.removeEntry(1);
//        System.out.println();
    }
}
