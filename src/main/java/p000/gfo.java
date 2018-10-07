package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: gfo */
public final class gfo implements gfn {
    /* renamed from: a */
    public final List f19144a = new ArrayList();
    /* renamed from: b */
    public final HashMap f19145b = new HashMap();

    static {
        bli.m887a("IProxyListener");
    }

    gfo() {
    }

    /* renamed from: a */
    private final List m11243a(long j) {
        List arrayList = new ArrayList();
        for (gfn gfn : this.f19144a) {
            if (this.f19145b.get(gfn) == null || ((Long) this.f19145b.get(gfn)).longValue() == j) {
                arrayList.add(gfn);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo13342a() {
        int size;
        synchronized (this.f19144a) {
            size = this.f19145b.size();
        }
        return size;
    }

    /* renamed from: b */
    public final int mo13343b() {
        int size;
        synchronized (this.f19144a) {
            size = this.f19144a.size();
        }
        return size;
    }

    /* renamed from: a */
    public final void mo7114a(ggu ggu, ggs ggs) {
        synchronized (this.f19144a) {
            List<gfn> a = m11243a(ggu.f5412b);
        }
        for (gfn a2 : a) {
            a2.mo7114a(ggu, ggs);
        }
    }

    /* renamed from: a */
    public final void mo7115a(ggu ggu, ggv ggv) {
        synchronized (this.f19144a) {
            List<gfn> a = m11243a(ggu.f5412b);
        }
        for (gfn a2 : a) {
            a2.mo7115a(ggu, ggv);
        }
    }

    /* renamed from: a */
    public final void mo7113a(ggu ggu, Uri uri) {
        synchronized (this.f19144a) {
            List<gfn> a = m11243a(ggu.f5412b);
        }
        for (gfn a2 : a) {
            a2.mo7113a(ggu, uri);
        }
    }

    /* renamed from: a */
    public final void mo7112a(ggu ggu) {
        synchronized (this.f19144a) {
            List<gfn> a = m11243a(ggu.f5412b);
        }
        for (gfn a2 : a) {
            a2.mo7112a(ggu);
        }
    }
}
