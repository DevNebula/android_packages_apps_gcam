package p000;

import android.hardware.camera2.CameraAccessException;

/* compiled from: PG */
/* renamed from: bjp */
final class bjp implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ kpw f1235a;
    /* renamed from: b */
    public final /* synthetic */ bjo f1236b;
    /* renamed from: c */
    private final /* synthetic */ bhj f1237c;

    bjp(bjo bjo, bhj bhj, kpw kpw) {
        this.f1236b = bjo;
        this.f1237c = bhj;
        this.f1235a = kpw;
    }

    public final void run() {
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        try {
            this.f1237c.mo12378a();
        } catch (CameraAccessException e2) {
            e = e2;
            str = bjo.f11472a;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("Failed when call CameraCaptureSession#abortCaptures: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            this.f1236b.f11473b.execute(new bjq(this));
        } catch (iwf e3) {
            e = e3;
            str = bjo.f11472a;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("Failed when call CameraCaptureSession#abortCaptures: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            this.f1236b.f11473b.execute(new bjq(this));
        }
        this.f1236b.f11473b.execute(new bjq(this));
    }
}
