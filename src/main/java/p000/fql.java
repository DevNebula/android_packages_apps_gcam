package p000;

import android.os.SystemClock;

/* renamed from: fql */
final /* synthetic */ class fql implements koj {
    /* renamed from: a */
    private final fqh f18650a;

    fql(fqh fqh) {
        this.f18650a = fqh;
    }

    /* renamed from: a */
    public final kpk mo10183a(Object obj) {
        fqh fqh = this.f18650a;
        fri fri = (fri) obj;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        kpk a = fqh.f24294e.f18638d.mo6872a(fri);
        kow.m13878a(a, new fqt(fqh, fri, elapsedRealtimeNanos), kpq.f8776a);
        return a;
    }
}
