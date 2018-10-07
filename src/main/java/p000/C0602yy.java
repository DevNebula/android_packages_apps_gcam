package p000;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yy */
final class C0602yy implements AutoFocusCallback {
    /* renamed from: a */
    public final /* synthetic */ C0623zw f10060a;
    /* renamed from: b */
    public final /* synthetic */ C0800yu f10061b;
    /* renamed from: c */
    private final /* synthetic */ Handler f10062c;

    C0602yy(C0800yu c0800yu, Handler handler, C0623zw c0623zw) {
        this.f10061b = c0800yu;
        this.f10062c = handler;
        this.f10060a = c0623zw;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.f10061b.f22452a.f22445e.mo77a() == 16) {
            this.f10061b.f22452a.f22445e.mo78a(2);
        } else {
            abx.m91e(C0796yo.f22440a, "onAutoFocus callback returning when not focusing");
        }
        this.f10062c.post(new C0603yz(this, z));
    }
}
