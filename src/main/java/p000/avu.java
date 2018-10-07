package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: avu */
public final class avu implements asg {
    /* renamed from: a */
    private final ilp f10902a;

    public avu(ilp ilp) {
        this.f10902a = ilp;
    }

    /* renamed from: a */
    public final fio mo1775a(fio fio) {
        fio b = fio.mo6814b();
        b.mo6809a(hsz.f6975c, hsz.f6978f);
        b.mo6809a(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        b.mo6809a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        return b;
    }

    /* renamed from: b */
    public final fio mo1776b(fio fio) {
        fio b = fio.mo6814b();
        avu.m7137d(b);
        b.mo6809a(hsz.f6975c, hsz.f6976d);
        return b;
    }

    /* renamed from: c */
    public final fio mo1777c(fio fio) {
        fio b = fio.mo6814b();
        avu.m7137d(b);
        b.mo6809a(hsz.f6975c, hsz.f6977e);
        b.mo6809a(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) this.f10902a.mo13673b());
        return b;
    }

    /* renamed from: d */
    private static void m7137d(fio fio) {
        fio.mo6809a(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        fio.mo6809a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        fio.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        fio.mo6809a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(fcg.f4696a.f5453d));
        fio.mo6809a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
    }
}
