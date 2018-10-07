package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: fqt */
final class fqt implements kov {
    /* renamed from: a */
    private final /* synthetic */ fri f18659a;
    /* renamed from: b */
    private final /* synthetic */ long f18660b;
    /* renamed from: c */
    private final /* synthetic */ fqh f18661c;

    fqt(fqh fqh, fri fri, long j) {
        this.f18661c = fqh;
        this.f18659a = fri;
        this.f18660b = j;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f18659a.f5387b.close();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        foz foz = (foz) obj;
        this.f18659a.f5387b.close();
        if (foz == null) {
            mo10185a(new NullPointerException());
        } else if (foz.f4886f) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            grj a = this.f18661c.f24292c.mo7364a();
            if (a != null) {
                a.f19514a = this.f18660b;
                a.f19515b = elapsedRealtimeNanos;
            }
        }
    }
}
