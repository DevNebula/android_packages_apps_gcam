package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jvy */
public final class jvy implements jwa {
    /* renamed from: a */
    private final jwa f24869a;
    /* renamed from: b */
    private final FeatureTable f24870b;
    /* renamed from: c */
    private final TreeSet f24871c = new TreeSet();
    /* renamed from: d */
    private int f24872d = 0;

    public jvy(jwa jwa, FeatureTable featureTable) {
        jri.m13404b((Object) jwa);
        jri.m13404b((Object) featureTable);
        jri.m13395a(true);
        this.f24869a = jwa;
        this.f24870b = featureTable;
    }

    /* renamed from: e */
    private final synchronized void m16722e() {
        while (!this.f24871c.isEmpty() && ((Long) this.f24871c.first()).longValue() <= this.f24870b.getLatestValidTimestamp()) {
            m16723f();
        }
    }

    /* renamed from: a */
    public final synchronized Set mo13879a() {
        Set hashSet;
        hashSet = new HashSet(this.f24869a.mo13879a());
        hashSet.addAll(this.f24871c);
        return hashSet;
    }

    /* renamed from: f */
    private final synchronized void m16723f() {
        this.f24869a.mo9576b(((Long) this.f24871c.pollFirst()).longValue());
        this.f24872d++;
    }

    /* renamed from: g */
    private final synchronized void m16724g() {
        m16722e();
        while (this.f24871c.size() > 0) {
            long longValue = ((Long) this.f24871c.first()).longValue();
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append("Timed out waiting for features inserting: ");
            stringBuilder.append(longValue);
            Log.d("FeatureWaitingFrameDropper", stringBuilder.toString());
            m16723f();
        }
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        if (!this.f24871c.remove(Long.valueOf(j))) {
            this.f24869a.mo9575a(j);
            this.f24872d--;
        }
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        this.f24871c.add(Long.valueOf(j));
        m16724g();
    }

    /* renamed from: b */
    public final kbg mo13880b() {
        return this.f24869a.mo13880b();
    }

    /* renamed from: c */
    public final synchronized void mo13881c() {
        this.f24871c.clear();
        this.f24869a.mo13881c();
    }

    /* renamed from: d */
    public final synchronized long mo13882d() {
        m16724g();
        if (this.f24872d == 0 && !this.f24871c.isEmpty()) {
            String valueOf = String.valueOf(this.f24871c.first());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("No frame was inserted, inserting a new frame with timestamp: ");
            stringBuilder.append(valueOf);
            Log.e("FeatureWaitingFrameDropper", stringBuilder.toString());
            m16723f();
        }
        return this.f24869a.mo13882d();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("FeatureWaitingFrameDropper, mMaxPendingFrameCount=");
        stringBuilder.append(0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
