package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jzy */
public final class jzy implements kae {
    /* renamed from: a */
    private final /* synthetic */ jzx f24892a;

    public jzy(jzx jzx) {
        this.f24892a = jzx;
    }

    public final void close() {
        try {
            this.f24892a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Handle threw exception: ");
            stringBuilder.append(valueOf);
            Log.e("SafeHandle", stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final Object mo9673d() {
        return this.f24892a.mo9673d();
    }

    /* renamed from: e */
    public final Object mo9674e() {
        return this.f24892a.mo9674e();
    }
}
