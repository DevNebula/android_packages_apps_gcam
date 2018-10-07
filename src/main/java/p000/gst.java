package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gst */
public final class gst {
    /* renamed from: a */
    public static final String f6038a = bli.m887a("SingleKeyCache");
    /* renamed from: b */
    public final String f6039b;
    /* renamed from: c */
    public final gsr f6040c;
    /* renamed from: d */
    public final gly f6041d;
    /* renamed from: e */
    public Object f6042e;
    /* renamed from: f */
    public final Object f6043f = new Object();
    /* renamed from: g */
    private final kpk f6044g;
    /* renamed from: h */
    private final Executor f6045h;

    public gst(kpk kpk, String str, Executor executor, gsr gsr, gly gly) {
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) str);
        this.f6044g = kpk;
        this.f6039b = str;
        this.f6045h = executor;
        this.f6040c = gsr;
        this.f6041d = gly;
    }

    /* renamed from: a */
    public final kpk mo7421a() {
        synchronized (this.f6043f) {
            Object obj = this.f6042e;
            if (obj != null) {
                kpk a = kow.m13873a(obj);
                return a;
            }
            return kny.m18476a(this.f6044g, new gsu(this), this.f6045h);
        }
    }

    /* renamed from: b */
    public final void mo7423b() {
        synchronized (this.f6043f) {
            this.f6042e = null;
        }
        kny.m18475a(this.f6044g, new gsv(this), this.f6045h);
    }

    /* renamed from: a */
    public final kpk mo7422a(Object obj) {
        String str = f6038a;
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("pending update: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        return kny.m18476a(this.f6044g, new gsw(this, obj), this.f6045h);
    }
}
