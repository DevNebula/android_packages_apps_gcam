package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: grh */
public final class grh implements grg {
    /* renamed from: a */
    private static final String f19495a = bli.m887a("CaptureSessionSCI");
    /* renamed from: b */
    private long f19496b = 0;
    /* renamed from: c */
    private final irs f19497c;
    /* renamed from: d */
    private Boolean f19498d = Boolean.FALSE;
    /* renamed from: e */
    private ExifInterface f19499e;
    /* renamed from: f */
    private List f19500f;
    /* renamed from: g */
    private epl f19501g;
    /* renamed from: h */
    private grj f19502h = null;
    /* renamed from: i */
    private epu f19503i;
    /* renamed from: j */
    private Long f19504j;
    /* renamed from: k */
    private Long f19505k;
    /* renamed from: l */
    private Integer f19506l;
    /* renamed from: m */
    private klg f19507m;
    /* renamed from: n */
    private kkc f19508n;
    /* renamed from: o */
    private kln f19509o;
    /* renamed from: p */
    private Long f19510p;
    /* renamed from: q */
    private epr f19511q;

    public grh(irs irs) {
        this.f19497c = irs;
    }

    /* renamed from: a */
    public final void mo7368a(epr epr) {
        this.f19511q = epr;
    }

    /* renamed from: a */
    public final void mo7372a(kkc kkc) {
        this.f19508n = kkc;
    }

    /* renamed from: a */
    public final void mo7365a(long j) {
        this.f19504j = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo7369a(epu epu, Long l, Integer num) {
        this.f19503i = epu;
        this.f19505k = l;
        this.f19506l = num;
    }

    /* renamed from: a */
    public final void mo7373a(klg klg) {
        this.f19507m = klg;
    }

    /* renamed from: a */
    public final void mo7371a(iwp iwp) {
        Face[] faceArr = (Face[]) iwp.mo13730a(CaptureResult.STATISTICS_FACES);
        if (faceArr == null) {
            this.f19500f = null;
        } else {
            this.f19500f = new ArrayList(r2);
            for (Face a : faceArr) {
                this.f19500f.add(gic.m2614a(a));
            }
        }
        iwp.mo13730a(CaptureResult.LENS_FOCUS_DISTANCE);
    }

    /* renamed from: b */
    public final void mo7377b(long j) {
        this.f19510p = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo7374a(kln kln) {
        this.f19509o = kln;
    }

    /* renamed from: a */
    public final void mo7366a(ExifInterface exifInterface) {
        this.f19499e = exifInterface;
    }

    /* renamed from: a */
    public final grj mo7364a() {
        return this.f19502h;
    }

    /* renamed from: b */
    public final void mo7376b() {
        this.f19496b = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo7378c() {
        m11609a(0);
    }

    /* renamed from: a */
    private final void m11609a(int i) {
        kla a;
        Object obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19496b;
        epl epl = this.f19501g;
        if (epl != null) {
            a = epl.mo6443a();
        } else {
            a = null;
        }
        kln kln = this.f19509o;
        if (kln != null) {
            kln.f25267a = (int) elapsedRealtime;
        }
        epr epr = this.f19511q;
        if (epr == null) {
            obj = null;
        } else if (this.f19496b != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            int i2;
            boolean z;
            irs irs = this.f19497c;
            if (epr == null) {
                bli.m891b(f19495a, "inferMode called while atTimeRequestData not present yet");
                i2 = 0;
            } else if (kln != null) {
                i2 = 21;
            } else if (this.f19503i == null) {
                i2 = epr.mo6460j();
            } else {
                i2 = 7;
            }
            epr = this.f19511q;
            ExifInterface exifInterface = this.f19499e;
            if (epr == null) {
                z = true;
            } else if (epr.mo6458h().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                z = true;
            } else if (this.f19498d.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            z = Boolean.valueOf(z).booleanValue();
            Long l = this.f19505k;
            if (l != null) {
                elapsedRealtime = l.longValue();
            }
            irs.mo8884a(i2, epr, exifInterface, z, Float.valueOf(((float) elapsedRealtime) / 1000.0f), this.f19500f, a, i, this.f19503i, this.f19504j, this.f19506l, this.f19507m, this.f19508n, this.f19509o, this.f19510p);
        }
    }

    /* renamed from: d */
    public final void mo7379d() {
        m11609a(1);
    }

    /* renamed from: a */
    public final void mo7375a(boolean z) {
        this.f19498d = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo7367a(epl epl) {
        this.f19501g = epl;
    }

    /* renamed from: a */
    public final void mo7370a(grj grj) {
        this.f19502h = grj;
    }
}
