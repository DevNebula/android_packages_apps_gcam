package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgy */
final class kgy {
    /* renamed from: a */
    private final Field f8650a;

    private kgy(Field field) {
        this.f8650a = field;
        field.setAccessible(true);
    }

    /* renamed from: a */
    static kgy m4912a(Class cls, String str) {
        try {
            return new kgy(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static Map m4910a() {
        return new kdb(12);
    }

    /* renamed from: a */
    static Set m4911a(int i) {
        return new kdk(i);
    }

    /* renamed from: a */
    static void m4913a(kfr kfr, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection a = kfr.mo9924a(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                a.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: a */
    static void m4915a(kft kft, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            kft.mo9939a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: a */
    final void mo9980a(Object obj, Object obj2) {
        try {
            this.f8650a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static void m4914a(kfr kfr, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(kfr.mo9930k().size());
        for (Entry entry : kfr.mo9930k().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: a */
    static void m4916a(kft kft, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(kft.mo9948g().size());
        for (kfu kfu : kft.mo9948g()) {
            objectOutputStream.writeObject(kfu.mo9954b());
            objectOutputStream.writeInt(kfu.mo9953a());
        }
    }
}
