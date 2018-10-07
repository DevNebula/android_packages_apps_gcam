package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;

/* compiled from: PG */
/* renamed from: aur */
public final class aur implements asg {
    /* renamed from: a */
    public final fio mo1775a(fio fio) {
        fio b = fio.mo6814b();
        b.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        Key key = CaptureRequest.CONTROL_MODE;
        Integer valueOf = Integer.valueOf(1);
        b.mo6809a(key, valueOf);
        b.mo6809a(CaptureRequest.CONTROL_AF_MODE, valueOf);
        return b;
    }

    /* renamed from: b */
    public final fio mo1776b(fio fio) {
        fio b = fio.mo6814b();
        aur.m7096d(b);
        b.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        return b;
    }

    /* renamed from: c */
    public final fio mo1777c(fio fio) {
        fio b = fio.mo6814b();
        aur.m7096d(b);
        b.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        return b;
    }

    /* renamed from: d */
    private static void m7096d(fio fio) {
        Key key = CaptureRequest.CONTROL_MODE;
        Integer valueOf = Integer.valueOf(1);
        fio.mo6809a(key, valueOf);
        fio.mo6809a(CaptureRequest.CONTROL_AF_MODE, valueOf);
        fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(fcg.f4696a.f5453d));
        fio.mo6809a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
    }
}
