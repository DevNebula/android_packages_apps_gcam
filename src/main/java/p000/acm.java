package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* renamed from: acm */
public final class acm implements apb {
    /* renamed from: f */
    private static final aqg f10112f;
    /* renamed from: a */
    public final acc f10113a;
    /* renamed from: b */
    public final apa f10114b;
    /* renamed from: c */
    public final C0043api f10115c;
    /* renamed from: d */
    public final apl f10116d;
    /* renamed from: e */
    public aqg f10117e;
    /* renamed from: g */
    private final Context f10118g;
    /* renamed from: h */
    private final aph f10119h;
    /* renamed from: i */
    private final Runnable f10120i;
    /* renamed from: j */
    private final Handler f10121j;
    /* renamed from: k */
    private final aou f10122k;

    static {
        aqg a = aqg.m617a(Bitmap.class);
        a.f915v = true;
        f10112f = a;
        aqg.m617a(any.class).f915v = true;
        aqg.m620b(afm.f413b).mo1694a(acg.LOW).mo1713h();
    }

    public acm(acc acc, apa apa, aph aph, Context context) {
        this(acc, apa, aph, new C0043api(), context);
    }

    private acm(acc acc, apa apa, aph aph, C0043api c0043api, Context context) {
        aou apc;
        this.f10116d = new apl();
        this.f10120i = new acn(this);
        this.f10121j = new Handler(Looper.getMainLooper());
        this.f10113a = acc;
        this.f10114b = apa;
        this.f10119h = aph;
        this.f10115c = c0043api;
        this.f10118g = context;
        Context applicationContext = context.getApplicationContext();
        aov aov = new aov(c0043api);
        int checkSelfPermission = C0242ge.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            String str;
            if (checkSelfPermission == 0) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (checkSelfPermission != 0) {
            apc = new apc();
        } else {
            apc = new aox(applicationContext, aov);
        }
        this.f10122k = apc;
        if ((arq.m680b() ^ 1) != 0) {
            this.f10121j.post(this.f10120i);
        } else {
            apa.mo1643a(this);
        }
        apa.mo1643a(this.f10122k);
        this.f10117e = acc.f189c.f212e.clone().mo1693a();
        synchronized (acc.f194h) {
            if (acc.f194h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            acc.f194h.add(this);
        }
    }

    /* renamed from: a */
    public final acj mo11609a(Class cls) {
        return new acj(this.f10113a, this, cls, this.f10118g);
    }

    /* renamed from: a */
    public final acj mo11608a() {
        return mo11609a(Bitmap.class).mo124a(f10112f);
    }

    /* renamed from: a */
    public final void mo11610a(View view) {
        mo11611a(new acp(view));
    }

    /* renamed from: a */
    public final void mo11611a(aqs aqs) {
        if (aqs != null) {
            if (!arq.m680b()) {
                this.f10121j.post(new aco(this, aqs));
            } else if (!mo11612b(aqs) && !this.f10113a.mo107a(aqs) && aqs.mo12303a() != null) {
                aqb a = aqs.mo12303a();
                aqs.mo12305a(null);
                a.mo1678c();
            }
        }
    }

    /* renamed from: b */
    public final void mo1645b() {
        this.f10116d.mo1645b();
        for (aqs a : arq.m676a(this.f10116d.f10638a)) {
            mo11611a(a);
        }
        this.f10116d.f10638a.clear();
        C0043api c0043api = this.f10115c;
        for (aqb a2 : arq.m676a(c0043api.f859a)) {
            c0043api.mo1658a(a2, false);
        }
        c0043api.f860b.clear();
        this.f10114b.mo1644b(this);
        this.f10114b.mo1644b(this.f10122k);
        this.f10121j.removeCallbacks(this.f10120i);
        acc acc = this.f10113a;
        synchronized (acc.f194h) {
            if (acc.f194h.contains(this)) {
                acc.f194h.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: c */
    public final void mo1646c() {
        mo11613e();
        this.f10116d.mo1646c();
    }

    /* renamed from: d */
    public final void mo1647d() {
        arq.m678a();
        C0043api c0043api = this.f10115c;
        c0043api.f861c = true;
        for (aqb aqb : arq.m676a(c0043api.f859a)) {
            if (aqb.mo1682g()) {
                aqb.mo1683h();
                c0043api.f860b.add(aqb);
            }
        }
        this.f10116d.mo1647d();
    }

    /* renamed from: e */
    public final void mo11613e() {
        arq.m678a();
        C0043api c0043api = this.f10115c;
        c0043api.f861c = false;
        for (aqb aqb : arq.m676a(c0043api.f859a)) {
            if (!(aqb.mo1680e() || aqb.mo1679d() || aqb.mo1682g())) {
                aqb.mo1677b();
            }
        }
        c0043api.f860b.clear();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f10115c);
        String valueOf2 = String.valueOf(this.f10119h);
        int length = String.valueOf(obj).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 21) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
        stringBuilder.append(obj);
        stringBuilder.append("{tracker=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    final boolean mo11612b(aqs aqs) {
        aqb a = aqs.mo12303a();
        if (a == null) {
            return true;
        }
        if (!this.f10115c.mo1658a(a, true)) {
            return false;
        }
        this.f10116d.f10638a.remove(aqs);
        aqs.mo12305a(null);
        return true;
    }
}
