package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: gpy */
final class gpy extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ kpw f5986a;
    /* renamed from: b */
    private final /* synthetic */ int f5987b;
    /* renamed from: c */
    private final /* synthetic */ float f5988c = 0.6f;
    /* renamed from: d */
    private final /* synthetic */ gpv f5989d;

    gpy(gpv gpv, kpw kpw, int i) {
        this.f5989d = gpv;
        this.f5986a = kpw;
        this.f5987b = i;
    }

    public final void run() {
        this.f5986a.mo15641a(Integer.valueOf(this.f5989d.mo13394a(this.f5987b, this.f5988c, -1)));
    }
}
