package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ikb */
public class ikb implements iji, iqo {
    /* renamed from: a */
    private final ikb f21018a;
    /* renamed from: b */
    private final ikv f21019b;
    /* renamed from: c */
    private final Object f21020c;
    /* renamed from: d */
    private final Set f21021d;
    /* renamed from: e */
    private boolean f21022e;

    public ikb() {
        this(ikw.f7437a);
    }

    private ikb(ikb ikb, ikv ikv) {
        this.f21019b = ikv;
        this.f21020c = new Object();
        this.f21021d = new HashSet();
        this.f21018a = ikb;
        this.f21022e = false;
    }

    public ikb(ikv ikv) {
        this.f21019b = ikv;
        this.f21020c = new Object();
        this.f21021d = new HashSet();
        this.f21018a = null;
        this.f21022e = false;
    }

    /* renamed from: a */
    public final iqo mo8557a(iqo iqo) {
        Object obj;
        jri.m13404b((Object) iqo);
        synchronized (this.f21020c) {
            if (this.f21022e) {
                obj = 1;
            } else {
                this.f21021d.add(iqo);
                obj = null;
            }
        }
        if (obj != null) {
            this.f21019b.mo8595a(iqo);
        }
        return iqo;
    }

    public void close() {
        Iterable arrayList = new ArrayList();
        synchronized (this.f21020c) {
            if (this.f21022e) {
                return;
            }
            this.f21022e = true;
            ikb ikb = this.f21018a;
            if (ikb != null) {
                synchronized (ikb.f21020c) {
                    ikb.f21021d.remove(this);
                }
            }
            arrayList.addAll(this.f21021d);
            this.f21021d.clear();
            this.f21019b.mo8596a(arrayList, "Lifetime#close");
        }
    }

    /* renamed from: b */
    public final ikb mo8558b() {
        return (ikb) mo8557a(new ikb(this, this.f21019b));
    }

    /* renamed from: a */
    public boolean mo13666a() {
        boolean z;
        synchronized (this.f21020c) {
            z = this.f21022e;
        }
        return z;
    }
}
