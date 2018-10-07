package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fto */
public final class fto {
    /* renamed from: a */
    private final String f4940a;
    /* renamed from: b */
    private final List f4941b = new ArrayList();

    public fto(String str) {
        this.f4940a = str;
    }

    /* renamed from: a */
    public final ftn mo6903a() {
        return new ftn(this.f4940a, this.f4941b);
    }

    /* renamed from: a */
    public final fto mo6904a(String str, boolean z) {
        if (!z) {
            this.f4941b.add(str);
        }
        return this;
    }
}
