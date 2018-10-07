package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kpz */
public final class kpz extends knt {
    /* renamed from: e */
    public kpk f26778e;
    /* renamed from: f */
    public Future f26779f;

    public kpz(kpk kpk) {
        this.f26778e = (kpk) jri.m13404b((Object) kpk);
    }

    /* renamed from: a */
    protected final void mo15639a() {
        mo15640a(this.f26778e);
        Future future = this.f26779f;
        if (future != null) {
            future.cancel(false);
        }
        this.f26778e = null;
        this.f26779f = null;
    }

    /* renamed from: b */
    protected final String mo15643b() {
        kpk kpk = this.f26778e;
        if (kpk == null) {
            return null;
        }
        String valueOf = String.valueOf(kpk);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("inputFuture=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
