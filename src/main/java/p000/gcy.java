package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaCompleteCallback;
import com.google.googlex.gcam.GoudaImageCallback;
import com.google.googlex.gcam.GoudaProgressCallback;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.clientallocator.MapInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.MapYuvClientAllocator;

/* compiled from: PG */
/* renamed from: gcy */
final class gcy implements fow {
    /* renamed from: a */
    public GoudaProgressCallback f19040a;
    /* renamed from: b */
    public GoudaCompleteCallback f19041b;
    /* renamed from: c */
    public GoudaImageCallback f19042c;
    /* renamed from: d */
    public GoudaImageCallback f19043d;
    /* renamed from: e */
    public GoudaImageCallback f19044e;
    /* renamed from: f */
    public MapInterleavedU8ClientAllocator f19045f;
    /* renamed from: g */
    public MapYuvClientAllocator f19046g;
    /* renamed from: h */
    public MapInterleavedU8ClientAllocator f19047h;
    /* renamed from: i */
    public final /* synthetic */ gcv f19048i;
    /* renamed from: j */
    private final /* synthetic */ long f19049j;
    /* renamed from: k */
    private final /* synthetic */ gdv f19050k;
    /* renamed from: l */
    private final /* synthetic */ boolean f19051l;
    /* renamed from: m */
    private final /* synthetic */ ExifMetadata f19052m;
    /* renamed from: n */
    private final /* synthetic */ boolean f19053n;
    /* renamed from: o */
    private final /* synthetic */ boolean f19054o;
    /* renamed from: p */
    private final /* synthetic */ InterleavedReadViewU8 f19055p;
    /* renamed from: q */
    private final /* synthetic */ GoudaRequest f19056q;
    /* renamed from: r */
    private final /* synthetic */ InterleavedReadViewU16 f19057r;

    gcy(gcv gcv, long j, gdv gdv, boolean z, ExifMetadata exifMetadata, boolean z2, boolean z3, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, InterleavedReadViewU16 interleavedReadViewU16) {
        this.f19048i = gcv;
        this.f19049j = j;
        this.f19050k = gdv;
        this.f19051l = z;
        this.f19052m = exifMetadata;
        this.f19053n = z2;
        this.f19054o = z3;
        this.f19055p = interleavedReadViewU8;
        this.f19056q = goudaRequest;
        this.f19057r = interleavedReadViewU16;
    }

    /* renamed from: a */
    public final kpk mo6864a() {
        kpk d = kpw.m18486d();
        String str = gcv.f19024a;
        long j = this.f19049j;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Processing shot ");
        stringBuilder.append(j);
        bli.m888a(str, stringBuilder.toString());
        this.f19048i.f19025b.execute(new gcz(this, this.f19050k, d, this.f19051l, this.f19052m, this.f19053n, this.f19054o, this.f19049j, this.f19055p, this.f19056q, this.f19057r));
        return d;
    }

    /* renamed from: b */
    public final kpk mo6865b() {
        return kow.m13873a(Boolean.valueOf(false));
    }
}
