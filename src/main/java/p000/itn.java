package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: itn */
public final class itn implements iwl {
    /* renamed from: a */
    private final CameraDevice f24666a;

    public itn(CameraDevice cameraDevice) {
        this.f24666a = cameraDevice;
    }

    public final void close() {
        this.f24666a.close();
    }

    /* renamed from: a */
    public final iwn mo13718a(int i) {
        Throwable e;
        try {
            return new iwn(this.f24666a.createCaptureRequest(i));
        } catch (IllegalStateException e2) {
            e = e2;
            throw new isr(e);
        } catch (CameraAccessException e3) {
            e = e3;
            throw new isr(e);
        } catch (SecurityException e4) {
            e = e4;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo13721a(iwu iwu) {
        Throwable e;
        try {
            List kfh;
            int d = iwu.mo9140d();
            List b = iwu.mo9138b();
            kaw kaw = ito.f21273a;
            if (b instanceof RandomAccess) {
                kfh = new kfh(b, kaw);
            } else {
                kfh = new kfj(b, kaw);
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(d, kfh, iwu.mo9137a(), itt.m4267a(iwu.mo9141e()));
            if (iwu.mo9139c() != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest) ion.m4003a(iwu.mo9139c()));
            }
            this.f24666a.createCaptureSession(sessionConfiguration);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo13722a(List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f24666a.createCaptureSession(list, itt.m4267a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final void mo13725b(List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f24666a.createCaptureSessionByOutputConfigurations(ion.m4021b(list), itt.m4267a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo13723a(List list, iwk iwk, Handler handler) {
        Throwable e;
        try {
            this.f24666a.createConstrainedHighSpeedCaptureSession(list, new itu(iwk), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final iwn mo13719a(iwp iwp) {
        Throwable e;
        try {
            return new iwn(this.f24666a.createReprocessCaptureRequest((TotalCaptureResult) ion.m4003a((iwe) iwp)));
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo13720a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f24666a.createReprocessableCaptureSession(inputConfiguration, list, itt.m4267a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final void mo13724b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f24666a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, ion.m4021b(list), itt.m4267a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }
}
