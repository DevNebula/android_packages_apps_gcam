package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: hva */
public class hva {
    /* renamed from: a */
    public final huh f7066a;
    /* renamed from: b */
    public final icd f7067b;
    /* renamed from: c */
    public final Looper f7068c;
    /* renamed from: d */
    public final int f7069d;
    /* renamed from: e */
    public final huq f7070e;
    /* renamed from: f */
    private final Context f7071f;
    /* renamed from: g */
    private final hui f7072g;
    /* renamed from: h */
    private final Account f7073h;
    /* renamed from: i */
    private final idv f7074i;

    private hva(Context context, huh huh, hvb hvb) {
        htl.m3489b((Object) context, (Object) "Null context is not permitted.");
        htl.m3489b((Object) huh, (Object) "Api must not be null.");
        htl.m3489b((Object) hvb, (Object) "Settings must not be null; use Settings.createDefault() instead.");
        this.f7071f = context.getApplicationContext();
        this.f7066a = huh;
        this.f7072g = null;
        this.f7068c = hvb.f7077c;
        this.f7067b = new icd(this.f7066a, null);
        this.f7070e = new iea(this);
        this.f7074i = idv.m3742a(this.f7071f);
        this.f7069d = this.f7074i.f7316e.getAndIncrement();
        hzv hzv = hvb.f7075a;
        this.f7073h = hvb.f7076b;
        Handler handler = this.f7074i.f7319h;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* renamed from: a */
    public hzs mo8159a(Context context, Handler handler) {
        return new hzs(context, handler);
    }

    @Deprecated
    public hva(Context context, huh huh, hzv hzv) {
        hvc hvc = new hvc();
        htl.m3489b((Object) hzv, (Object) "StatusExceptionMapper must not be null.");
        hvc.f7078a = hzv;
        this(context, huh, hvc.mo8161a());
    }

    /* renamed from: a */
    public huo mo8158a(Looper looper, ief ief) {
        hur hur = new hur(this.f7071f);
        hur.f7047a = this.f7073h;
        return this.f7066a.mo8130a().mo13572a(this.f7071f, looper, hur.mo8147b(), null, ief, ief);
    }

    /* renamed from: a */
    public final ich mo8160a(int i, ich ich) {
        ich.mo13626d();
        idv idv = this.f7074i;
        ibz icb = new icb(ich);
        Handler handler = idv.f7319h;
        handler.sendMessage(handler.obtainMessage(4, new hzp(icb, idv.f7317f.get(), this)));
        return ich;
    }
}
