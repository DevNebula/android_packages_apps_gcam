package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fjo */
public final class fjo implements fjs {
    /* renamed from: a */
    private final List f18333a;

    public fjo(fjs... fjsArr) {
        this.f18333a = Arrays.asList(fjsArr);
    }

    /* renamed from: a */
    public final boolean mo6836a(iwp iwp) {
        boolean z = false;
        for (fjs a : this.f18333a) {
            if (a.mo6836a(iwp)) {
                z = true;
            } else if (z) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
