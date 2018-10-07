package p000;

import android.view.Surface;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: bhc */
public final class bhc implements iqo {
    /* renamed from: a */
    public final bhj f11364a;
    /* renamed from: b */
    public final bhs f11365b;
    /* renamed from: c */
    public final Surface f11366c;
    /* renamed from: d */
    public final bic f11367d;
    /* renamed from: e */
    public final Object f11368e = new Object();
    /* renamed from: f */
    public boolean f11369f = false;
    /* renamed from: g */
    private final Surface f11370g;
    /* renamed from: h */
    private final bhe f11371h;

    public bhc(bhj bhj, bhs bhs, Surface surface, Surface surface2, bhe bhe, bic bic) {
        this.f11364a = bhj;
        this.f11365b = bhs;
        this.f11370g = surface;
        this.f11366c = surface2;
        this.f11371h = bhe;
        this.f11367d = bic;
    }

    public final void close() {
        synchronized (this.f11368e) {
            this.f11369f = true;
        }
    }

    /* renamed from: a */
    public final aub mo12376a(asw asw) {
        aub a;
        synchronized (this.f11368e) {
            if (this.f11369f) {
                throw new IllegalStateException();
            }
            asw asw2 = asw;
            a = this.f11371h.mo1949a(this.f11364a, this.f11365b, true, asw2, Arrays.asList(new Surface[]{this.f11370g, this.f11366c}), new bhd(this));
        }
        return a;
    }
}
