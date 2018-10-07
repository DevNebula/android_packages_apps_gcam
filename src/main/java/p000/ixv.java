package p000;

import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixv */
public final class ixv {
    /* renamed from: a */
    private final NavigableMap f7897a = khb.m4928a(ion.m4007a(new TreeMap(), this.f7898b, iqd.f21206a), null);
    /* renamed from: b */
    private final /* synthetic */ int f7898b = 9000;

    /* renamed from: a */
    public final void mo9168a(float f, long j) {
        this.f7897a.put(Long.valueOf(j), Float.valueOf(f));
    }

    /* renamed from: a */
    public final Float mo9167a(long j) {
        return (Float) this.f7897a.get(Long.valueOf(j));
    }
}
