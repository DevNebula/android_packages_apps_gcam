package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ayt */
public final class ayt extends fiw {
    /* renamed from: a */
    private final kwk f11054a;
    /* renamed from: b */
    private final ayb f11055b;
    /* renamed from: c */
    private final fff f11056c;
    /* renamed from: d */
    private long f11057d = 0;

    public ayt(ayb ayb, fff fff, kwk kwk) {
        this.f11056c = fff;
        this.f11055b = ayb;
        this.f11054a = kwk;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        if (this.f11055b.mo1846d()) {
            Object obj;
            long b = iwp.mo13731b();
            long j = this.f11057d;
            int c = this.f11055b.mo1845c();
            if (c == 0) {
                obj = null;
            } else if (b > j + ((long) c)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                obj = (Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_MODE);
                if (obj != null) {
                    int intValue = ((Integer) jri.m13404b(obj)).intValue();
                    c = ((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_STATE))).intValue();
                    if (intValue == 0) {
                        c = 1;
                    } else if (c == 2) {
                        c = 1;
                    } else if (c == 4) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    this.f11057d = iwp.mo13731b();
                    this.f11056c.mo6772a((ffe) this.f11054a.mo10566a());
                }
            }
        }
    }
}
