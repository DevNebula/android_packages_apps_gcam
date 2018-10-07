package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fsm */
public final class fsm {
    /* renamed from: a */
    public final fss f4914a;
    /* renamed from: b */
    public final List f4915b;
    /* renamed from: c */
    public final List f4916c;

    public fsm(fss fss, List list, List list2) {
        this.f4914a = fss;
        this.f4915b = list;
        this.f4916c = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fsm) {
            fsm fsm = (fsm) obj;
            if (this.f4914a.equals(fsm.f4914a) && this.f4915b.equals(fsm.f4915b) && this.f4916c.equals(fsm.f4916c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4914a, this.f4915b, this.f4916c});
    }

    public final String toString() {
        return jqk.m13351b("ImageSaverTrace").mo9703a("ProcessingMethod", this.f4914a).mo9703a("Input Image Metadata", this.f4915b).mo9703a("Reprocessing Metadata", this.f4916c).toString();
    }
}
