package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jul */
public abstract class jul implements juk {
    /* renamed from: a */
    public abstract Set mo13867a(juh juh);

    /* renamed from: a */
    public final List mo9570a(List list) {
        List b = khb.m4945b();
        for (juh juh : list) {
            b.add(new juh(juh.f8350a, juh.f8352c, juh.f8353d, mo13867a(juh)));
        }
        return b;
    }

    public String toString() {
        return "SegmentClassifier";
    }
}
