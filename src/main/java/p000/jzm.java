package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jzm */
public final class jzm implements BlockingQueue {
    /* renamed from: a */
    private final BlockingDeque f8514a = new LinkedBlockingDeque();

    public final boolean add(Object obj) {
        this.f8514a.addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        for (Object add : collection) {
            add(add);
        }
        return true;
    }

    public final void clear() {
        this.f8514a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f8514a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f8514a.containsAll(collection);
    }

    public final int drainTo(Collection collection) {
        return this.f8514a.drainTo(collection);
    }

    public final int drainTo(Collection collection, int i) {
        return this.f8514a.drainTo(collection, i);
    }

    public final Object element() {
        if (!this.f8514a.isEmpty()) {
            return this.f8514a.pollLast();
        }
        throw new NoSuchElementException("Calling element on empty queue!");
    }

    public final boolean isEmpty() {
        return this.f8514a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f8514a.descendingIterator();
    }

    public final boolean offer(Object obj) {
        return this.f8514a.offerLast(obj);
    }

    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        return this.f8514a.offerLast(obj, j, timeUnit);
    }

    public final Object peek() {
        return this.f8514a.peekLast();
    }

    public final Object poll() {
        return this.f8514a.pollLast();
    }

    public final Object poll(long j, TimeUnit timeUnit) {
        return this.f8514a.pollLast(j, timeUnit);
    }

    public final void put(Object obj) {
        this.f8514a.putLast(obj);
    }

    public final int remainingCapacity() {
        return this.f8514a.remainingCapacity();
    }

    public final Object remove() {
        return this.f8514a.removeLast();
    }

    public final boolean remove(Object obj) {
        return this.f8514a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return this.f8514a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.f8514a.retainAll(collection);
    }

    public final int size() {
        return this.f8514a.size();
    }

    public final Object take() {
        return this.f8514a.takeLast();
    }

    public final Object[] toArray() {
        return this.f8514a.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f8514a.toArray(objArr);
    }
}
