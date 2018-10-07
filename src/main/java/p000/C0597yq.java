package p000;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusMoveCallback;
import android.os.Handler;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: yq */
final class C0597yq implements AutoFocusMoveCallback {
    /* renamed from: a */
    public final C0624zx f10046a;
    /* renamed from: b */
    public final aah f10047b;
    /* renamed from: c */
    private final Handler f10048c;

    C0597yq(Handler handler, aah aah, C0624zx c0624zx) {
        this.f10048c = handler;
        this.f10047b = aah;
        this.f10046a = c0624zx;
    }

    public final void onAutoFocusMoving(boolean z, Camera camera) {
        this.f10048c.post(new C0598yr(this, z));
    }
}
