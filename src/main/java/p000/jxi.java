package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* compiled from: PG */
/* renamed from: jxi */
public abstract class jxi {
    /* renamed from: a */
    public final String f8434a;

    private jxi(String str) {
        this.f8434a = str;
    }

    /* renamed from: a */
    public abstract Object mo9593a(DataInputStream dataInputStream);

    /* renamed from: a */
    public abstract void mo9594a(Object obj, DataOutputStream dataOutputStream);

    /* synthetic */ jxi(String str, byte b) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxi)) {
            return false;
        }
        return this.f8434a.equals(((jxi) obj).f8434a);
    }

    public int hashCode() {
        return this.f8434a.hashCode();
    }

    public String toString() {
        return this.f8434a;
    }
}
