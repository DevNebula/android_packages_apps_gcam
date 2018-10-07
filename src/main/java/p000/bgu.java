package p000;

import android.annotation.TargetApi;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgu */
public final class bgu implements bgt {
    /* renamed from: a */
    private final inp f11341a;

    public bgu(inp inp) {
        this.f11341a = inp;
    }

    /* renamed from: a */
    public final Range mo1944a() {
        return Range.create(Integer.valueOf(30), Integer.valueOf(this.f11341a.mo8643a().f7508f));
    }

    /* renamed from: b */
    public final Range mo1945b() {
        Comparable valueOf = Integer.valueOf(this.f11341a.mo8643a().f7508f);
        return Range.create(valueOf, valueOf);
    }
}
