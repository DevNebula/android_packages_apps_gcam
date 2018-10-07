package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: hef */
public final class hef implements hec {
    /* renamed from: a */
    private final int f19968a;
    /* renamed from: b */
    private final int f19969b;
    /* renamed from: c */
    private final Object[] f19970c;

    public hef(int i, int i2, Object... objArr) {
        this.f19968a = i;
        this.f19969b = i2;
        this.f19970c = objArr;
    }

    /* renamed from: a */
    public final String mo7762a(Resources resources) {
        return resources.getQuantityString(this.f19968a, this.f19969b, this.f19970c);
    }
}
