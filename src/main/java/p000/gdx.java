package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.imageproc.Resample;

/* compiled from: PG */
/* renamed from: gdx */
final class gdx implements Runnable {
    /* renamed from: a */
    private final InterleavedReadViewU8 f5340a;
    /* renamed from: b */
    private final kpw f5341b;
    /* renamed from: c */
    private final int f5342c;
    /* renamed from: d */
    private final int f5343d;
    /* renamed from: e */
    private final float f5344e;

    public gdx(InterleavedReadViewU8 interleavedReadViewU8, kpw kpw, int i, int i2, float f) {
        this.f5340a = interleavedReadViewU8;
        this.f5341b = kpw;
        this.f5342c = i;
        this.f5343d = i2;
        this.f5344e = f;
    }

    public final void run() {
        Object interleavedImageU8 = new InterleavedImageU8(this.f5342c, this.f5343d, this.f5340a.num_channels());
        if (Resample.resampleLanczos(this.f5340a, this.f5344e, interleavedImageU8)) {
            bli.m888a(gdw.f19097a, "Gouda image upsampled successfully.");
            this.f5341b.mo15641a(interleavedImageU8);
            return;
        }
        bli.m891b(gdw.f19097a, "Error upsampling gouda image");
        this.f5341b.mo15642a(new RuntimeException("Image couldn't be upsampled."));
    }
}
