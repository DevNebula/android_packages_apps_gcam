package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kck */
abstract class kck extends kcp implements Serializable {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo15074a();
        kgy.m4915a((kft) this, objectInputStream, readInt);
    }

    /* renamed from: a */
    abstract void mo15074a();

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kgy.m4916a((kft) this, objectOutputStream);
    }
}
