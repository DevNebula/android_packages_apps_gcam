package p000;

import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gdw */
public final class gdw implements fow {
    /* renamed from: a */
    public static final String f19097a = bli.m887a("PostProcImgSvr");
    /* renamed from: b */
    private final Executor f19098b;
    /* renamed from: c */
    private final InterleavedReadViewU8 f19099c;
    /* renamed from: d */
    private final GoudaRequest f19100d;

    public gdw(Executor executor, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest) {
        this.f19098b = (Executor) jri.m13404b((Object) executor);
        this.f19099c = (InterleavedReadViewU8) jri.m13404b((Object) interleavedReadViewU8);
        this.f19100d = (GoudaRequest) jri.m13404b((Object) goudaRequest);
    }

    /* renamed from: a */
    public final kpk mo6864a() {
        kpk d = kpw.m18486d();
        this.f19098b.execute(new gdx(this.f19099c, d, this.f19100d.getOutput_width(), this.f19100d.getOutput_height(), this.f19100d.getPost_resample_sharpening()));
        return d;
    }

    /* renamed from: b */
    public final kpk mo6865b() {
        return kow.m13874a(new isr("Image couldn't be upsampled."));
    }
}
