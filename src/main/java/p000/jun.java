package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: jun */
public abstract class jun implements juk {
    /* renamed from: a */
    public abstract boolean mo13871a(juh juh);

    /* renamed from: a */
    public final List mo9570a(List list) {
        List b = khb.m4945b();
        for (juh juh : list) {
            if (mo13871a(juh)) {
                b.add(juh);
            }
        }
        return b;
    }

    public String toString() {
        return "SegmentSelector";
    }
}
