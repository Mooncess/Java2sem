package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoredList <E> extends Thread {
    private final List<E> list;
    private final Semaphore semaphore;

    public SemaphoredList(List<E> list, Semaphore semaphore) {
        this.list = list;
        this.semaphore = semaphore;
    }


    public void add(E element) throws InterruptedException {
        semaphore.acquire();
        try {
            list.add(element);
        } finally {
            semaphore.release();
        }
    }

    public void remove(int index) throws InterruptedException {
        semaphore.acquire();
        try {
            list.remove(index);
        } finally {
            semaphore.release();
        }
    }

    public int size() throws InterruptedException {
        semaphore.acquire();
        try {
            return list.size();
        } finally {
            semaphore.release();
        }
    }

    public E get(int index) throws InterruptedException {
        semaphore.acquire();
        try {
            return list.get(index);
        } finally {
            semaphore.release();
        }
    }


}
