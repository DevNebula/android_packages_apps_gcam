package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: heg */
public final class heg implements hec {
    /* renamed from: a */
    private final int f19971a;
    /* renamed from: b */
    private final Object[] f19972b;

    public heg(int i, Object... objArr) {
        this.f19971a = i;
        this.f19972b = objArr;
    }

    /* renamed from: a */
    public final String mo7762a(Resources resources) {
        return resources.getString(this.f19971a, this.f19972b);
    }
}
