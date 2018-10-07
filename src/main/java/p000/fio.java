package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fio */
public final class fio {
    /* renamed from: a */
    public int f4802a;
    /* renamed from: b */
    private final Map f4803b;
    /* renamed from: c */
    private final Set f4804c;
    /* renamed from: d */
    private final Set f4805d;
    /* renamed from: e */
    private final kbg f4806e;

    public fio() {
        this.f4802a = 1;
        this.f4804c = new HashSet();
        this.f4803b = new HashMap();
        this.f4805d = new HashSet();
        this.f4806e = kau.f21835a;
    }

    public fio(fim fim) {
        this.f4802a = fim.f4795a;
        this.f4805d = new HashSet(fim.f4798d);
        this.f4804c = new HashSet();
        this.f4804c.addAll(fim.f4797c);
        this.f4803b = new HashMap();
        for (fin a : fim.f4796b) {
            mo6812a(a);
        }
        this.f4806e = fim.f4799e;
    }

    public fio(fio fio) {
        this(fio.mo6807a());
    }

    public fio(iwp iwp) {
        this.f4802a = -1;
        this.f4804c = new HashSet();
        this.f4803b = new HashMap();
        this.f4805d = new HashSet();
        this.f4806e = kbg.m4803b(iwp);
    }

    /* renamed from: a */
    public final fio mo6813a(fiw fiw) {
        this.f4804c.add(fiw);
        return this;
    }

    /* renamed from: a */
    public final fio mo6810a(fhy fhy) {
        mo6811a(fhy.mo6796x_());
        return this;
    }

    /* renamed from: a */
    public final fio mo6811a(fhz fhz) {
        this.f4805d.add(fhz);
        return this;
    }

    /* renamed from: a */
    public final fim mo6807a() {
        return new fim(this.f4802a, keu.m13732a(this.f4803b.values()), this.f4804c, this.f4805d, this.f4806e);
    }

    /* renamed from: b */
    public final fio mo6814b() {
        return new fio(mo6807a());
    }

    /* renamed from: c */
    public final fio mo6815c() {
        this.f4805d.clear();
        return this;
    }

    /* renamed from: a */
    public final fio mo6809a(Key key, Object obj) {
        this.f4803b.put(key, new fin(key, obj));
        return this;
    }

    /* renamed from: a */
    public final fio mo6812a(fin fin) {
        mo6809a(fin.f4800a, fin.f4801b);
        return this;
    }

    /* renamed from: a */
    public final fio mo6808a(int i) {
        fio fio = new fio(this);
        fio.f4802a = i;
        return fio;
    }
}
