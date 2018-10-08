package codegym.test;

import codegym.todo.Entry;
import codegym.todo.ToDoList;

public class TestToDo {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Entry ansang = new Entry(530,"Breakfast");
        todo.addEntry(ansang);
        todo.showTodoList();
        System.out.println();
    }
}