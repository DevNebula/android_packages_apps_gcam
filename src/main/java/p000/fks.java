package p000;

import android.annotation.TargetApi;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fks */
final class fks implements fhz, iqo {
    /* renamed from: a */
    public final Set f18374a;
    /* renamed from: b */
    public final fiw f18375b;
    /* renamed from: c */
    public final Collection f18376c;
    /* renamed from: d */
    private final fkz f18377d;
    /* renamed from: e */
    private final fyt f18378e;
    /* renamed from: f */
    private final AtomicBoolean f18379f = new AtomicBoolean(false);

    fks(fkz fkz, Set set, fiw fiw, Collection collection, fyt fyt) {
        jri.m13395a(collection.isEmpty() ^ 1);
        jri.m13395a(set.isEmpty() ^ 1);
        this.f18377d = fkz;
        this.f18374a = set;
        this.f18375b = fiw;
        this.f18376c = collection;
        this.f18378e = fyt;
    }

    public final void close() {
        this.f18379f.set(true);
    }

    /* renamed from: a */
    public final fia mo6797a() {
        return fib.f4794a.mo6797a();
    }

    /* renamed from: b */
    public final fia mo6798b() {
        if (!this.f18377d.mo6844a()) {
            return fib.f4794a.mo6798b();
        }
        fyr fyr;
        if (this.f18379f.get()) {
            fyr = null;
        } else {
            fyr = this.f18378e.mo6950d();
        }
        if (fyr != null) {
            return new fkt(this, fyr);
        }
        return fib.f4794a.mo6798b();
    }
}
