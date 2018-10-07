package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: hm */
final class C0687hm implements C0280hx {
    /* renamed from: a */
    private final /* synthetic */ C0722mz f20190a;
    /* renamed from: b */
    private final /* synthetic */ Handler f20191b;

    C0687hm(C0722mz c0722mz, Handler handler) {
        this.f20190a = c0722mz;
        this.f20191b = handler;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8252a(Object obj) {
        C0274hr c0274hr = (C0274hr) obj;
        if (c0274hr == null) {
            this.f20190a.mo14242a(1, this.f20191b);
            return;
        }
        int i = c0274hr.f6831b;
        if (i == 0) {
            this.f20190a.mo14244a(c0274hr.f6830a, this.f20191b);
        } else {
            this.f20190a.mo14242a(i, this.f20191b);
        }
    }
}
