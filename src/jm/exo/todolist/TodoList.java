package jm.exo.todolist;

/**
 * Created by jmijeon on 28/01/2016.
 */
public class TodoList {
    public static void main(String[] args)
    {
        Task t = new Task("Test",false);

        //System.out.println("Tâche "+t.getLabel()+"=>"+t.isState());
        System.out.println(t);
    }
}
