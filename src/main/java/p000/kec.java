package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kec */
public final class kec extends ked {
    public static final long serialVersionUID = 0;
    /* renamed from: c */
    private transient int f26769c;

    private kec() {
        this((byte) 0);
    }

    private kec(byte b) {
        super(kgy.m4910a());
        this.f26769c = 2;
        jri.m13395a(true);
        this.f26769c = 2;
    }

    /* renamed from: q */
    public static kec m18455q() {
        return new kec();
    }

    /* renamed from: a */
    final /* synthetic */ Collection mo15066a() {
        return kgy.m4911a(this.f26769c);
    }

    /* renamed from: b */
    final Set mo15587b() {
        return kgy.m4911a(this.f26769c);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f26769c = 2;
        int readInt = objectInputStream.readInt();
        mo15069a(kgy.m4910a());
        kgy.m4913a((kfr) this, objectInputStream, readInt);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kgy.m4914a((kfr) this, objectOutputStream);
    }
}
