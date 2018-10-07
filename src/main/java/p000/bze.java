package p000;

import android.util.DisplayMetrics;
import com.google.googlex.gcam.BaseFrameCallback;
import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.PdImageCallback;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.ProgressCallback;
import com.google.googlex.gcam.ShotStatusCallback;
import com.google.googlex.gcam.clientallocator.UniqueBitmapClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueYuvClientAllocator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bze */
public final class bze {
    /* renamed from: a */
    public static final String f1762a = bli.m887a("HdrPShotParams");
    /* renamed from: b */
    public final fwa f1763b;
    /* renamed from: c */
    public final List f1764c;
    /* renamed from: d */
    public final List f1765d;
    /* renamed from: e */
    public final ProgressCallback f1766e;
    /* renamed from: f */
    public final ShotStatusCallback f1767f;
    /* renamed from: g */
    public final BaseFrameCallback f1768g;
    /* renamed from: h */
    public final PostviewCallback f1769h;
    /* renamed from: i */
    public final PdImageCallback f1770i;
    /* renamed from: j */
    public final EncodedBlobCallback f1771j;
    /* renamed from: k */
    public final FinalImageCallback f1772k;
    /* renamed from: l */
    public final EncodedBlobCallback f1773l;
    /* renamed from: m */
    public final UniqueBitmapClientAllocator f1774m;
    /* renamed from: n */
    public final UniqueInterleavedU8ClientAllocator f1775n = new UniqueInterleavedU8ClientAllocator();
    /* renamed from: o */
    public final UniqueYuvClientAllocator f1776o = new UniqueYuvClientAllocator();
    /* renamed from: p */
    public final UniqueInterleavedU16ClientAllocator f1777p = new UniqueInterleavedU16ClientAllocator();
    /* renamed from: q */
    public final bzx f1778q;
    /* renamed from: r */
    public iqo f1779r;
    /* renamed from: s */
    private int f1780s = C0252go.f5954z;
    /* renamed from: t */
    private final AtomicReference f1781t = new AtomicReference(kau.f21835a);
    /* renamed from: u */
    private final Object f1782u = new Object();

    public bze(bzx bzx, DisplayMetrics displayMetrics, fwa fwa, int i, grk grk, bku bku, bmh bmh) {
        this.f1778q = bzx;
        this.f1763b = fwa;
        this.f1764c = new ArrayList();
        this.f1765d = new ArrayList();
        this.f1766e = new bzf(bzx);
        this.f1767f = new bzg(this, i, bku, bmh, grk, bzx, fwa);
        this.f1768g = new bzh(this, bzx);
        this.f1774m = new UniqueBitmapClientAllocator(displayMetrics);
        this.f1769h = new bzi(this, bzx);
        this.f1770i = new bzj(this, bzx);
        this.f1771j = new bzk(this, bzx);
        this.f1772k = new bzl(this, bzx);
        this.f1773l = new bzm(this, bzx);
    }

    /* renamed from: a */
    final void mo2230a(ExifMetadata exifMetadata) {
        synchronized (this.f1782u) {
            if (this.f1778q.mo2236c().mo9709b() && !((kbg) this.f1781t.getAndSet(kbg.m4804c(exifMetadata))).mo9709b()) {
                ((cab) this.f1778q.mo2236c().mo9706a()).f1811a.mo15641a((Object) exifMetadata);
            }
        }
    }

    /* renamed from: a */
    public final void mo2229a() {
        if (this.f1778q.mo2238e().mo9709b()) {
            cae cae = (cae) this.f1778q.mo2238e().mo9706a();
            blr blr = new blr(String.format(null, "MergePD failed (notified by command)", new Object[0]));
            cae.mo2245a();
        }
    }
}
