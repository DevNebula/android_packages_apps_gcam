package p000;

import android.util.Log;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jwe */
public final class jwe implements jwa {
    /* renamed from: a */
    private final jwa f24880a;
    /* renamed from: b */
    private final TreeSet f24881b = new TreeSet();
    /* renamed from: c */
    private long f24882c = -1;

    public jwe(jwa jwa) {
        jri.m13404b((Object) jwa);
        this.f24880a = jwa;
    }

    /* renamed from: a */
    public final Set mo13879a() {
        return this.f24880a.mo13879a();
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        if (!this.f24881b.remove(Long.valueOf(j))) {
            this.f24880a.mo9575a(j);
        }
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        long j2 = this.f24882c;
        StringBuilder stringBuilder;
        if (j < j2) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Encountered out of order frame with timestamp:");
            stringBuilder.append(j);
            Log.w("InOrderTimestampFrameDropper", stringBuilder.toString());
            this.f24881b.add(Long.valueOf(j));
        } else if (j == j2) {
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("Encountered duplicate frame with timestamp:");
            stringBuilder.append(j);
            Log.w("InOrderTimestampFrameDropper", stringBuilder.toString());
            this.f24881b.add(Long.valueOf(j));
        } else {
            this.f24882c = j;
            this.f24880a.mo9576b(j);
        }
    }

    /* renamed from: b */
    public final kbg mo13880b() {
        return this.f24880a.mo13880b();
    }

    /* renamed from: c */
    public final synchronized void mo13881c() {
        this.f24882c = -1;
        this.f24881b.clear();
        this.f24880a.mo13881c();
    }

    /* renamed from: d */
    public final synchronized long mo13882d() {
        long d;
        if (this.f24881b.isEmpty()) {
            d = this.f24880a.mo13882d();
        } else {
            d = ((Long) this.f24881b.first()).longValue();
        }
        return d;
    }
}
