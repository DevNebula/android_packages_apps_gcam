package p000;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.GoudaSwigWrapper;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcv */
public final class gcv implements gds {
    /* renamed from: a */
    public static final String f19024a = bli.m887a("GoudaCtrlr");
    /* renamed from: b */
    public final Executor f19025b;
    /* renamed from: c */
    public final bsn f19026c;
    /* renamed from: d */
    public final Object f19027d = new Object();
    /* renamed from: e */
    public final kbg f19028e;
    /* renamed from: f */
    public boolean f19029f = false;
    /* renamed from: g */
    public final GoudaSwigWrapper f19030g;
    /* renamed from: h */
    public gdt f19031h;
    /* renamed from: i */
    private final fov f19032i;
    /* renamed from: j */
    private final goy f19033j;
    /* renamed from: k */
    private final boolean f19034k;
    /* renamed from: l */
    private final gdg f19035l;
    /* renamed from: m */
    private final boolean f19036m;
    /* renamed from: n */
    private gdu f19037n;

    public gcv(GoudaSwigWrapper goudaSwigWrapper, fov fov, Executor executor, goy goy, boolean z, bsn bsn, Context context, kbg kbg) {
        synchronized (this.f19027d) {
            this.f19030g = goudaSwigWrapper;
        }
        this.f19032i = fov;
        this.f19025b = executor;
        this.f19033j = goy;
        this.f19034k = z;
        this.f19026c = bsn;
        this.f19036m = bsn.mo2107a(gdp.f5333e);
        this.f19028e = kbg;
        this.f19035l = new gdg(context, new gcx(this, goy));
    }

    /* renamed from: a */
    public final boolean mo7055a(boolean z) {
        hdz hdz = this.f19035l;
        if (!hdz.f6451h) {
            return false;
        }
        if (z) {
            hdz.mo7755a();
        } else {
            hdz.mo7758c();
        }
        gdt gdt = this.f19031h;
        if (gdt != null) {
            gdt.f5334a.mo8826a(Boolean.valueOf(false));
            gdt.f5335b.mo13331d();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7052a() {
        synchronized (this.f19027d) {
            if (this.f19029f) {
                bli.m898e(f19024a, "init() called on an already initialized PortraitController.");
                return;
            }
            this.f19025b.execute(new gcw(this));
        }
    }

    /* renamed from: b */
    public final void mo7056b() {
        this.f19035l.mo7757b();
    }

    /* renamed from: a */
    public final kpk mo7051a(long j, InterleavedReadViewU8 interleavedReadViewU8, InterleavedReadViewU16 interleavedReadViewU16, GoudaRequest goudaRequest, boolean z, boolean z2, boolean z3, ExifMetadata exifMetadata, gdv gdv) {
        synchronized (this.f19027d) {
            if (this.f19030g == null || !this.f19029f) {
                kpk a = kow.m13874a(new isr("Controller hasn't been initialized"));
                return a;
            }
            String str = f19024a;
            String valueOf = String.valueOf(this.f19032i.f18539a.mo13673b());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
            stringBuilder.append("Submitting task ");
            stringBuilder.append(j);
            stringBuilder.append(", already in queue: ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            goudaRequest.setEmbed_gdepth_metadata(this.f19036m);
            return this.f19032i.mo13265a(new gcy(this, j, gdv, z2, exifMetadata, z, z3, interleavedReadViewU8, goudaRequest, interleavedReadViewU16));
        }
    }

    /* renamed from: a */
    public final void mo7053a(gdt gdt) {
        this.f19031h = gdt;
    }

    /* renamed from: a */
    public final void mo7054a(gdu gdu) {
        this.f19037n = gdu;
    }

    /* renamed from: c */
    public final void mo7057c() {
        if (!this.f19034k && this.f19033j.mo7306a("gouda_tutorial_dismiss") <= 0) {
            gdu gdu = this.f19037n;
            if (gdu != null) {
                gdu.f5336a.f23897c.mo12481l().mo13116a(this.f19035l, LayoutInflater.from(gdu.f5336a.f23907m));
                gdt gdt = this.f19031h;
                if (gdt != null) {
                    synchronized (gdt.f5335b.f19088e) {
                        gdt.f5335b.mo13329b();
                        gdt.f5335b.f19090g = false;
                        gdt.f5334a.mo8826a(Boolean.valueOf(true));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static kbg m11175a(String str) {
        if (kbi.m4811a(str)) {
            return kau.f21835a;
        }
        try {
            return kbg.m4804c(C0557we.m6181a(str));
        } catch (C0554wb e) {
            bli.m891b(f19024a, "String was not a serialized XMPMeta.");
            return kau.f21835a;
        }
    }
}
