package p000;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zi */
final class C0611zi implements PictureCallback {
    /* renamed from: a */
    public final aaf f10087a;
    /* renamed from: b */
    private final Handler f10088b;

    private C0611zi(Handler handler, aaf aaf) {
        this.f10088b = handler;
        this.f10087a = aaf;
    }

    /* renamed from: a */
    public static C0611zi m6316a(Handler handler, aah aah, aaf aaf) {
        if (handler == null || aah == null || aaf == null) {
            return null;
        }
        return new C0611zi(handler, aaf);
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.f10088b.post(new C0612zj(this, bArr));
    }
}
