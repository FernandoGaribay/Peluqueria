package main;
import java.util.LinkedList;
import java.util.Queue;

public class FilaPanelCliente {

    private Queue<PanelCliente> queue;

    public FilaPanelCliente() {
        queue = new LinkedList<>();
    }

    public Queue<PanelCliente> getQueue() {
        return queue;
    }

    public void setQueue(Queue<PanelCliente> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("filaPanelCliente{");
        sb.append("queue=").append(queue);
        sb.append('}');
        return sb.toString();
    }

}
