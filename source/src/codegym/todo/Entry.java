package codegym.todo;

public class Entry {
    static int count;
    int priority;
    String notes;

    public Entry(){}

    public Entry(int priority, String notes){
        this.priority = priority;
        this.notes = notes;
    }
}