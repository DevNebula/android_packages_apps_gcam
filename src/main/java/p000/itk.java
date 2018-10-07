package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: itk */
public final class itk implements iwg {
    /* renamed from: a */
    private final CameraCaptureSession f24665a;

    itk(CameraCaptureSession cameraCaptureSession) {
        this.f24665a = cameraCaptureSession;
    }

    /* renamed from: a */
    public final void mo13712a() {
        Throwable e;
        try {
            this.f24665a.abortCaptures();
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final int mo13711a(List list, iwh iwh, Handler handler) {
        Throwable e;
        try {
            return this.f24665a.captureBurst(ion.m4021b(list), new itl(iwh), handler);
        } catch (IllegalStateException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        throw new iwf(e);
    }

    public final void close() {
        this.f24665a.close();
    }

    /* renamed from: a */
    public final void mo13713a(List list) {
        hsx.m3410a(this.f24665a, ion.m4021b(list));
    }

    /* renamed from: b */
    public final iwl mo13715b() {
        CameraDevice device = this.f24665a.getDevice();
        itt itt = new itt();
        return new itn(device);
    }

    /* renamed from: c */
    public final Surface mo13716c() {
        return this.f24665a.getInputSurface();
    }

    /* renamed from: b */
    public final int mo13714b(List list, iwh iwh, Handler handler) {
        Throwable e;
        try {
            return this.f24665a.setRepeatingBurst(ion.m4021b(list), new itl(iwh), handler);
        } catch (IllegalStateException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        throw new iwf(e);
    }

    /* renamed from: d */
    public final void mo13717d() {
        Throwable e;
        try {
            this.f24665a.stopRepeating();
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }
}
