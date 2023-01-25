package stack;
import list.LinkedList;
import list.ListInterface;


public class ch6_2<E> implements StackInterface<E> {

    private ListInterface<E> list;

    public ch6_2() {
        list = new LinkedList<E>();
    }

    @Override
    public void push(E newItem) {
        list.append(newItem);
    }

    @Override
    public E pop() {
        E x = list.get(list.len() - 1);
        list.remove(list.len() -1);
        return x;
    }

    @Override
    public E top() {
        return list.get(list.len() - 1);
    }

    @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else return false;

    }

    @Override
    public void popAll() {
        list.clear();
    }


}
