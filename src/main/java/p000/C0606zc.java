package p000;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zc */
final class C0606zc implements PictureCallback {
    /* renamed from: a */
    public final /* synthetic */ aaf f10070a;
    /* renamed from: b */
    private final /* synthetic */ Handler f10071b;
    /* renamed from: c */
    private final /* synthetic */ C0800yu f10072c;

    C0606zc(C0800yu c0800yu, Handler handler, aaf aaf) {
        this.f10072c = c0800yu;
        this.f10071b = handler;
        this.f10070a = aaf;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        if (this.f10072c.f22452a.f22445e.mo77a() == 8) {
            this.f10072c.f22452a.f22445e.mo78a(2);
        } else {
            abx.m91e(C0796yo.f22440a, "picture callback returning when not capturing");
        }
        this.f10071b.post(new C0607zd(this, bArr));
    }
}
