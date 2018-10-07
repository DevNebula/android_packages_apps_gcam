package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.List;

/* compiled from: PG */
/* renamed from: ccr */
public final class ccr implements bwq, kwk {
    /* renamed from: a */
    public final boolean f12171a;
    /* renamed from: b */
    public volatile bwy f12172b;
    /* renamed from: c */
    public volatile int f12173c;
    /* renamed from: d */
    public volatile iqp f12174d;
    /* renamed from: e */
    private final bwo f12175e;
    /* renamed from: f */
    private final cde f12176f;
    /* renamed from: g */
    private final cdk f12177g;
    /* renamed from: h */
    private final ffc f12178h;
    /* renamed from: i */
    private final SizeF f12179i;
    /* renamed from: j */
    private final iqp f12180j;
    /* renamed from: k */
    private volatile bwp f12181k;
    /* renamed from: l */
    private boolean f12182l;

    public ccr(bwo bwo, cde cde, cdk cdk, ffc ffc, fyy fyy) {
        boolean z;
        Object obj = (SizeF) ffc.mo9056a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        jri.m13391a(obj, (Object) "Camera sensor size cannot be null");
        this.f12175e = bwo;
        this.f12176f = cde;
        this.f12177g = cdk;
        this.f12178h = ffc;
        this.f12179i = obj;
        if (ffc.mo9064c() == iut.BACK) {
            z = true;
        } else {
            z = false;
        }
        this.f12171a = z;
        this.f12180j = fyy.f5060b.f7861b;
        this.f12172b = null;
        this.f12182l = false;
        this.f12173c = 0;
        this.f12174d = new iqp(0, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final synchronized boolean mo12450b() {
        return this.f12182l;
    }

    /* renamed from: c */
    public final boolean mo12451c() {
        Integer num = (Integer) this.f12178h.mo9056a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        if (num == null) {
            return false;
        }
        return num.intValue() == 1;
    }

    /* renamed from: a */
    public final void mo2188a(List list) {
        for (bwr bwr : list) {
            if (this.f12171a) {
                this.f12176f.mo2262a(bwr.f1690f, bwr.f1691g, bwr.f1692h, bwr.f1689e);
            } else {
                this.f12176f.mo2262a(bwr.f1690f, -bwr.f1691g, -bwr.f1692h, bwr.f1689e);
            }
        }
    }

    /* renamed from: a */
    public static Context m8115a(ccp ccp) {
        return (Context) ktm.m14219a(ccp.f1870b, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public final synchronized void mo12449a(iqp iqp) {
        this.f12182l = true;
        this.f12174d = iqp;
        this.f12173c = 0;
        this.f12172b = new bwy(this.f12179i, iqp, this.f12180j, this.f12176f, this.f12177g);
        this.f12181k = this.f12175e.mo2187b();
    }

    /* renamed from: d */
    public final synchronized void mo12452d() {
        this.f12182l = false;
        if (this.f12181k != null) {
            this.f12181k.close();
        }
        this.f12172b = null;
    }

    /* renamed from: a */
    public final synchronized void mo12448a(long j) {
        bwp bwp = this.f12181k;
        if (this.f12182l && bwp != null && j > this.f12176f.mo2261a()) {
            bwp.mo12435a(this.f12176f.mo2261a() + 1, j, this);
        }
    }
}
