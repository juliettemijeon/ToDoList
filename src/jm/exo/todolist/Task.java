package jm.exo.todolist;

/**
 * Created by jmijeon on 28/01/2016.
 */
public class Task {

    private String label;
    private boolean state = false;

    public boolean isState() {
        return state;
    }

    public String getLabel()
    {
        return this.label;
    }

    public void setLabel(String newLabel)
    {
        this.label = newLabel;
    }

    public Task(){}

    public Task(String lbl, boolean st)
    {
        this.label = lbl;
        this.state =st;
    }


    public String toString() {
        return("");
    }

    public void done()
    {

    }

    public boolean isDone()
    {
        boolean isDone = false;
        return isDone;
    }
}
