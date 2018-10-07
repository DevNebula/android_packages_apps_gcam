package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gzi */
public final class gzi implements gzk {
    /* renamed from: a */
    public final List f19835a = new ArrayList();
    /* renamed from: b */
    public final gzk f19836b;
    /* renamed from: c */
    public boolean f19837c = false;
    /* renamed from: d */
    public boolean f19838d = false;
    /* renamed from: e */
    public long f19839e = 0;
    /* renamed from: f */
    public long f19840f = 0;

    public gzi(gzk gzk, hkc hkc) {
        this.f19836b = gzk;
    }

    /* renamed from: a */
    public final long mo13504a() {
        if (this.f19838d) {
            return this.f19840f;
        }
        if (this.f19837c) {
            return this.f19839e;
        }
        return SystemClock.uptimeMillis();
    }

    public final void invalidate() {
        if (!(this.f19838d || this.f19837c)) {
            this.f19836b.invalidate();
            this.f19839e = SystemClock.uptimeMillis();
        }
        this.f19837c = true;
    }
}
