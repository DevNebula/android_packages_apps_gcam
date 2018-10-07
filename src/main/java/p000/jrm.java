package p000;

import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jrm */
final class jrm implements jqr {
    /* renamed from: a */
    public final String f26572a;
    /* renamed from: b */
    public final long f26573b;
    /* renamed from: c */
    public final String f26574c;
    /* renamed from: d */
    public final int f26575d;
    /* renamed from: e */
    public final int f26576e;
    /* renamed from: f */
    public final int f26577f;
    /* renamed from: g */
    public volatile long f26578g = -1;
    /* renamed from: h */
    private final jqr f26579h;
    /* renamed from: i */
    private final AtomicReference f26580i = new AtomicReference(null);
    /* renamed from: j */
    private final Set f26581j;

    public jrm(String str, String str2, jqr jqr, Set set) {
        this.f26572a = str;
        this.f26574c = str2;
        this.f26579h = jqr;
        this.f26573b = System.nanoTime();
        this.f26575d = jqr.mo15048c();
        this.f26576e = jqr.mo15047b();
        this.f26577f = jqr.mo15046a();
        this.f26581j = set;
        synchronized (this.f26581j) {
            this.f26581j.add(this);
        }
    }

    public final void close() {
        m18064a("CLOSE");
        this.f26579h.mo15063a();
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo9673d() {
        m18064a("DETACH");
        return (Bitmap) this.f26579h.mo9673d();
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo9674e() {
        return (Bitmap) this.f26579h.mo9674e();
    }

    /* renamed from: f */
    public final String mo15584f() {
        return (String) this.f26580i.get();
    }

    /* renamed from: a */
    public final int mo15046a() {
        return this.f26577f;
    }

    /* renamed from: b */
    public final int mo15047b() {
        return this.f26576e;
    }

    /* renamed from: a */
    private final void m18064a(String str) {
        if (this.f26580i.compareAndSet(null, str)) {
            this.f26578g = System.nanoTime();
        }
    }

    /* renamed from: c */
    public final int mo15048c() {
        return this.f26575d;
    }
}
