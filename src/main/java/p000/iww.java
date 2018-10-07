package p000;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: iww */
public class iww implements iwz {
    /* renamed from: a */
    private final iwz f24692a;

    public iww(iwz iwz) {
        this.f24692a = iwz;
    }

    public void close() {
        this.f24692a.close();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof iwz)) {
            return false;
        }
        iwz iwz = (iwz) obj;
        if (iwz.mo13741c() == mo13741c() && iwz.mo13745g() == mo13745g() && iwz.mo13742d() == mo13742d() && iwz.mo13744f() == mo13744f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final iud mo9118a() {
        return this.f24692a.mo9118a();
    }

    /* renamed from: b */
    public final Rect mo13740b() {
        return this.f24692a.mo13740b();
    }

    /* renamed from: c */
    public final int mo13741c() {
        return this.f24692a.mo13741c();
    }

    /* renamed from: d */
    public final int mo13742d() {
        return this.f24692a.mo13742d();
    }

    /* renamed from: e */
    public final List mo13743e() {
        return this.f24692a.mo13743e();
    }

    /* renamed from: f */
    public final long mo13744f() {
        return this.f24692a.mo13744f();
    }

    /* renamed from: g */
    public final int mo13745g() {
        return this.f24692a.mo13745g();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo13741c()), Integer.valueOf(mo13745g()), Integer.valueOf(mo13742d()), Long.valueOf(mo13744f())});
    }

    /* renamed from: a */
    public final void mo13739a(Rect rect) {
        this.f24692a.mo13739a(rect);
    }

    public String toString() {
        return this.f24692a.toString();
    }
}
