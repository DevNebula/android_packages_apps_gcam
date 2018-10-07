package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: juo */
public abstract class juo implements juk {
    /* renamed from: a */
    public abstract List mo13873a(juh juh);

    /* renamed from: a */
    public final List mo9570a(List list) {
        List b = khb.m4945b();
        for (juh a : list) {
            b.addAll(mo13873a(a));
        }
        return b;
    }

    public String toString() {
        return "Segmenter";
    }
}
