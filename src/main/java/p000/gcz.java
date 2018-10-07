package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaCallbacks;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.clientallocator.MapInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.MapYuvClientAllocator;

/* renamed from: gcz */
final /* synthetic */ class gcz implements Runnable {
    /* renamed from: a */
    private final gcy f5313a;
    /* renamed from: b */
    private final gdv f5314b;
    /* renamed from: c */
    private final kpw f5315c;
    /* renamed from: d */
    private final boolean f5316d;
    /* renamed from: e */
    private final ExifMetadata f5317e;
    /* renamed from: f */
    private final boolean f5318f;
    /* renamed from: g */
    private final boolean f5319g;
    /* renamed from: h */
    private final long f5320h;
    /* renamed from: i */
    private final InterleavedReadViewU8 f5321i;
    /* renamed from: j */
    private final GoudaRequest f5322j;
    /* renamed from: k */
    private final InterleavedReadViewU16 f5323k;

    gcz(gcy gcy, gdv gdv, kpw kpw, boolean z, ExifMetadata exifMetadata, boolean z2, boolean z3, long j, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, InterleavedReadViewU16 interleavedReadViewU16) {
        this.f5313a = gcy;
        this.f5314b = gdv;
        this.f5315c = kpw;
        this.f5316d = z;
        this.f5317e = exifMetadata;
        this.f5318f = z2;
        this.f5319g = z3;
        this.f5320h = j;
        this.f5321i = interleavedReadViewU8;
        this.f5322j = goudaRequest;
        this.f5323k = interleavedReadViewU16;
    }

    public final void run() {
        gcy gcy = this.f5313a;
        gdv gdv = this.f5314b;
        knk knk = this.f5315c;
        boolean z = this.f5316d;
        boolean z2 = this.f5318f;
        boolean z3 = this.f5319g;
        long j = this.f5320h;
        InterleavedReadViewU8 interleavedReadViewU8 = this.f5321i;
        GoudaRequest goudaRequest = this.f5322j;
        InterleavedReadViewU16 interleavedReadViewU16 = this.f5323k;
        try {
            synchronized (gcy.f19048i.f19027d) {
                if (gcy.f19048i.f19030g != null) {
                    gcy.f19040a = new gda(gdv);
                    gcy.f19041b = new gdb(knk, gdv);
                    gcy.f19042c = new gdc(gcy, gdv, z, z2, z3);
                    gcy.f19045f = new MapInterleavedU8ClientAllocator();
                    gcy.f19046g = new MapYuvClientAllocator();
                    GoudaCallbacks goudaCallbacks = new GoudaCallbacks();
                    goudaCallbacks.setProgress_callback(gcy.f19040a);
                    goudaCallbacks.setComplete_callback(gcy.f19041b);
                    goudaCallbacks.setImage_callback(gcy.f19042c);
                    goudaCallbacks.setRgb_allocator(gcy.f19045f);
                    goudaCallbacks.setYuv_allocator(gcy.f19046g);
                    if (gcy.f19048i.f19026c.mo2107a(gdp.f5329a)) {
                        gcy.f19043d = new gdd(gcy, gdv);
                        goudaCallbacks.setSecondary_image_callback(gcy.f19043d);
                    }
                    if (gcy.f19048i.f19026c.mo2107a(gdp.f5330b)) {
                        gcy.f19044e = new gde(gcy, gdv);
                        gcy.f19047h = new MapInterleavedU8ClientAllocator();
                        goudaCallbacks.setDebug_rgb_allocator(gcy.f19047h);
                        goudaCallbacks.setDebug_image_callback(gcy.f19044e);
                    }
                    gcy.f19048i.f19030g.Process(j, goudaCallbacks, interleavedReadViewU8, goudaRequest, interleavedReadViewU16);
                }
            }
        } catch (Throwable e) {
            bli.m892b(gcv.f19024a, "Error processing the input image:", e);
            knk.mo15642a(e);
        }
    }
}
