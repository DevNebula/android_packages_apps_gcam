package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: iqr */
public final class iqr {
    /* renamed from: a */
    private final iqs f7699a;
    /* renamed from: b */
    private final ArrayList f7700b;
    /* renamed from: c */
    private int f7701c;
    /* renamed from: d */
    private int f7702d;

    public iqr(iqs iqs, int i) {
        this.f7699a = iqs;
        this.f7700b = new ArrayList(i);
        this.f7701c = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7700b.add(iqs.mo8825a());
        }
        this.f7702d = i;
    }

    /* renamed from: a */
    public final Object mo8823a() {
        int i = this.f7701c;
        if (i <= 0) {
            return this.f7699a.mo8825a();
        }
        int i2 = i - 1;
        Object obj = this.f7700b.get(i2);
        this.f7700b.remove(i2);
        this.f7701c--;
        return obj;
    }

    /* renamed from: a */
    public final void mo8824a(Object obj) {
        int i = this.f7701c;
        int i2 = this.f7702d;
        if (i == i2) {
            this.f7700b.ensureCapacity(i2 + i2);
            i = this.f7702d;
            this.f7702d = i + i;
        }
        this.f7700b.add(obj);
        this.f7701c++;
    }
}
