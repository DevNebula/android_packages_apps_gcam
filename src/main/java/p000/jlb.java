package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jlb */
public class jlb implements jla, jwc {
    /* renamed from: a */
    private final Set f21613a = new HashSet();
    /* renamed from: b */
    private long f21614b = -1;
    /* renamed from: c */
    private final jlc f21615c = new jlc();
    /* renamed from: d */
    private final jvx f21616d;
    /* renamed from: e */
    private final jqt f21617e;

    public jlb(jvx jvx, jqt jqt) {
        ArrayList arrayList = new ArrayList();
        jri.m13404b((Object) jvx);
        jri.m13404b((Object) jqt);
        this.f21616d = jvx;
        this.f21617e = jqt;
        this.f21616d.mo15057a((jwc) this);
    }

    /* renamed from: b */
    private final synchronized void m13174b() {
        for (Long longValue : this.f21615c.mo13818d()) {
            long longValue2 = longValue.longValue();
            if (longValue2 > this.f21614b) {
                break;
            } else if (!this.f21616d.mo13879a().contains(Long.valueOf(longValue2))) {
                this.f21615c.mo13813a(longValue2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9507a() {
        this.f21616d.mo15058b((jwc) this);
        m13174b();
        this.f21615c.mo13815a(this.f21616d.mo13879a(), this.f21613a, this.f21617e);
        this.f21617e.mo9531a();
        this.f21615c.mo13817c();
    }

    /* renamed from: a */
    private final synchronized void m13173a(FrameImage2D frameImage2D) {
        m13174b();
        long timestamp = frameImage2D.getTimestamp();
        if (timestamp > this.f21614b || this.f21613a.contains(Long.valueOf(timestamp))) {
            this.f21615c.mo9508a(frameImage2D);
        }
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        if (j > this.f21614b) {
            StringBuilder stringBuilder = new StringBuilder(84);
            stringBuilder.append("onFrameDropped: Timestamp: ");
            stringBuilder.append(j);
            stringBuilder.append(" is newer than newest inserted frame.");
            Log.v("FrameDropListeningFrameBuffer", stringBuilder.toString());
        } else {
            this.f21613a.remove(Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        if (j <= this.f21614b) {
            StringBuilder stringBuilder = new StringBuilder(85);
            stringBuilder.append("onFrameInserted: Timestamp: ");
            stringBuilder.append(j);
            stringBuilder.append(" is older than newest inserted frame.");
            Log.v("FrameDropListeningFrameBuffer", stringBuilder.toString());
        } else {
            this.f21613a.add(Long.valueOf(j));
            this.f21614b = j;
        }
    }
}
