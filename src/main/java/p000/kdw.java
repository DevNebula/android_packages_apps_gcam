package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kdw */
public abstract class kdw extends kdv implements List {
    /* renamed from: c */
    public abstract List mo13974b();

    public void add(int i, Object obj) {
        mo13974b().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return mo13974b().addAll(i, collection);
    }

    public boolean equals(Object obj) {
        return obj == this || mo13974b().equals(obj);
    }

    public Object get(int i) {
        return mo13974b().get(i);
    }

    public int hashCode() {
        return mo13974b().hashCode();
    }

    public int indexOf(Object obj) {
        return mo13974b().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return mo13974b().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return mo13974b().listIterator();
    }

    public ListIterator listIterator(int i) {
        return mo13974b().listIterator(i);
    }

    public Object remove(int i) {
        return mo13974b().remove(i);
    }

    public Object set(int i, Object obj) {
        return mo13974b().set(i, obj);
    }

    public List subList(int i, int i2) {
        return mo13974b().subList(i, i2);
    }
}
