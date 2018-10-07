package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: cha */
public final class cha implements kwk {
    /* renamed from: a */
    private final kwk f12478a;
    /* renamed from: b */
    private final kwk f12479b;
    /* renamed from: c */
    private final kwk f12480c;
    /* renamed from: d */
    private final kwk f12481d;
    /* renamed from: e */
    private final kwk f12482e;
    /* renamed from: f */
    private final kwk f12483f;
    /* renamed from: g */
    private final kwk f12484g;
    /* renamed from: h */
    private final kwk f12485h;

    public cha(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        this.f12478a = kwk;
        this.f12479b = kwk2;
        this.f12480c = kwk3;
        this.f12481d = kwk4;
        this.f12482e = kwk5;
        this.f12483f = kwk6;
        this.f12484g = kwk7;
        this.f12485h = kwk8;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12478a;
        kwk kwk2 = this.f12479b;
        kwk kwk3 = this.f12480c;
        kwk kwk4 = this.f12481d;
        kwk kwk5 = this.f12482e;
        kwk kwk6 = this.f12483f;
        kwk kwk7 = this.f12484g;
        kwk kwk8 = this.f12485h;
        Context context = (Context) kwk.mo10566a();
        Handler handler = (Handler) kwk2.mo10566a();
        irh irh = (irh) kwk3.mo10566a();
        kwk4.mo10566a();
        ire ire = (ire) kwk5.mo10566a();
        cbu cbu = (cbu) kwk6.mo10566a();
        return (cgu) ktm.m14219a(new cgu(handler, aay.m28a(context, C0252go.f5933e), irh, ire, (DevicePolicyManager) cbu.m1124a(cbu.f1865a, "device_policy"), (Executor) kwk7.mo10566a(), (Semaphore) kwk8.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
