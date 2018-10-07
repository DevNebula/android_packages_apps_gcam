package p000;

import android.annotation.TargetApi;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgv */
public final class bgv implements bgt {
    /* renamed from: a */
    private final Range f11342a;
    /* renamed from: b */
    private final kbg f11343b;
    /* renamed from: c */
    private final boolean f11344c;

    public bgv(Range range, kbg kbg, boolean z) {
        this.f11342a = range;
        this.f11343b = kbg;
        this.f11344c = z;
    }

    /* renamed from: a */
    public final Range mo1944a() {
        if (this.f11344c && this.f11343b.mo9709b()) {
            return (Range) this.f11343b.mo9706a();
        }
        return this.f11342a;
    }

    /* renamed from: b */
    public final Range mo1945b() {
        if (this.f11344c && this.f11343b.mo9709b()) {
            return (Range) this.f11343b.mo9706a();
        }
        return this.f11342a;
    }
}
