package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ith */
public final class ith {
    /* renamed from: c */
    public static final int[] f7822c = new int[]{0, 1, 2, 3, 4};
    /* renamed from: a */
    public final int f7823a;
    /* renamed from: b */
    public int f7824b = 0;
    /* renamed from: d */
    private final Map f7825d = new TreeMap();

    public ith(int i) {
        this.f7823a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof ith) {
            ith ith = (ith) obj;
            if (ith.f7823a == this.f7823a && ith.mo9003b() == mo9003b()) {
                for (ite ite : ith.mo9002a()) {
                    if (ite != null && !ExifInterface.m8586a(ite.f7812a) && !ite.equals((ite) this.f7825d.get(Short.valueOf(ite.f7812a)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected final ite[] mo9002a() {
        return (ite[]) this.f7825d.values().toArray(new ite[this.f7825d.size()]);
    }

    /* renamed from: a */
    public final ite mo9001a(short s) {
        return (ite) this.f7825d.get(Short.valueOf(s));
    }

    /* renamed from: b */
    protected final int mo9003b() {
        return this.f7825d.size();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7823a), Integer.valueOf(this.f7824b), this.f7825d});
    }

    /* renamed from: b */
    protected final void mo9004b(short s) {
        this.f7825d.remove(Short.valueOf(s));
    }

    /* renamed from: a */
    public final ite mo9000a(ite ite) {
        ite.f7816e = this.f7823a;
        return (ite) this.f7825d.put(Short.valueOf(ite.f7812a), ite);
    }
}
