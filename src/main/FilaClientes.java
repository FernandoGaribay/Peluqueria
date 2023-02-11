package main;
import java.util.LinkedList;
import java.util.Queue;

public class FilaClientes {

    private Queue<Cliente> queue;

    public FilaClientes() {
        queue = new LinkedList<>();
    }

    public void add(Cliente e) {
        queue.add(e);
    }

    public Cliente remove(Cliente e) {
         Cliente client = queue.remove();
         return client;
    }

    public Queue<Cliente> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Cliente> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("filaClientes{");
        sb.append("queue=").append(queue);
        sb.append('}');
        return sb.toString();
    }

}
