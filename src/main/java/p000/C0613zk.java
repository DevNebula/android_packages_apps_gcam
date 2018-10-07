package p000;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zk */
final class C0613zk implements PreviewCallback {
    /* renamed from: a */
    public final aag f10091a;
    /* renamed from: b */
    public final aah f10092b;
    /* renamed from: c */
    private final Handler f10093c;

    private C0613zk(Handler handler, aah aah, aag aag) {
        this.f10093c = handler;
        this.f10092b = aah;
        this.f10091a = aag;
    }

    /* renamed from: a */
    public static C0613zk m6317a(Handler handler, aah aah, aag aag) {
        if (handler == null || aah == null || aag == null) {
            return null;
        }
        return new C0613zk(handler, aah, aag);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f10093c.post(new C0614zl(this, bArr));
    }
}
