package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kcv */
public final class kcv extends kcw {
    public static final long serialVersionUID = 0;
    /* renamed from: c */
    private transient int f26768c;

    public kcv() {
        this((byte) 0);
    }

    private kcv(byte b) {
        super(kgy.m4910a());
        khb.m4919a(3, "expectedValuesPerKey");
        this.f26768c = 3;
    }

    /* renamed from: b */
    final List mo15066a() {
        return new ArrayList(this.f26768c);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f26768c = 3;
        int readInt = objectInputStream.readInt();
        mo15069a(new kdb());
        kgy.m4913a((kfr) this, objectInputStream, readInt);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kgy.m4914a((kfr) this, objectOutputStream);
    }
}
