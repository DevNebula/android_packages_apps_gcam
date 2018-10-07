package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kaf */
public final class kaf implements AutoCloseable {
    /* renamed from: a */
    private final List f8534a = new ArrayList();

    public final void close() {
        for (kae close : this.f8534a) {
            close.mo15063a();
        }
    }

    public final String toString() {
        int size = this.f8534a.size();
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("SafeHandlePool[count=");
        stringBuilder.append(size);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final kae mo9675a(AutoCloseable autoCloseable) {
        return mo9676a(new jzy(jqk.m13349b(autoCloseable)));
    }

    /* renamed from: a */
    public final kae mo9676a(kae kae) {
        this.f8534a.add(kae);
        return kae;
    }
}
