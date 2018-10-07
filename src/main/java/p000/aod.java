package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p001v4.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aod */
final class aod {
    /* renamed from: a */
    public final ada f826a;
    /* renamed from: b */
    public final List f827b;
    /* renamed from: c */
    public final acm f828c;
    /* renamed from: d */
    public boolean f829d;
    /* renamed from: e */
    public aoe f830e;
    /* renamed from: f */
    public boolean f831f;
    /* renamed from: g */
    public aoe f832g;
    /* renamed from: h */
    public Bitmap f833h;
    /* renamed from: i */
    public aoe f834i;
    /* renamed from: j */
    private final Handler f835j;
    /* renamed from: k */
    private final agw f836k;
    /* renamed from: l */
    private boolean f837l;
    /* renamed from: m */
    private acj f838m;

    aod(acc acc, ada ada, int i, int i2, ads ads, Bitmap bitmap) {
        agw agw = acc.f187a;
        acm b = acc.m100b(acc.f189c.getBaseContext());
        acj a = acc.m100b(acc.f189c.getBaseContext()).mo11608a();
        aqg b2 = aqg.m620b(afm.f412a);
        while (b2.f917x) {
            b2 = b2.clone();
        }
        b2.f895B = true;
        b2.f896c |= SharedElementCallback.MAX_IMAGE_SIZE;
        acj a2 = a.mo124a(b2.mo1712g().mo1713h().mo1705b(i, i2));
        this(agw, b, ada, a2, ads, bitmap);
    }

    private aod(agw agw, acm acm, ada ada, acj acj, ads ads, Bitmap bitmap) {
        this.f827b = new ArrayList();
        this.f828c = acm;
        Handler handler = new Handler(Looper.getMainLooper(), new aog(this));
        this.f836k = agw;
        this.f835j = handler;
        this.f838m = acj;
        this.f826a = ada;
        mo1629a(ads, bitmap);
    }

    /* renamed from: a */
    final Bitmap mo1628a() {
        aoe aoe = this.f830e;
        return aoe == null ? this.f833h : aoe.f26615b;
    }

    /* renamed from: b */
    final int mo1631b() {
        return this.f826a.mo160f();
    }

    /* renamed from: c */
    final void mo1632c() {
        if (this.f829d && !this.f837l) {
            aoe aoe = this.f834i;
            if (aoe != null) {
                this.f834i = null;
                mo1630a(aoe);
                return;
            }
            this.f837l = true;
            int g = this.f826a.mo161g();
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f826a.mo154a();
            this.f832g = new aoe(this.f835j, this.f826a.mo158d(), uptimeMillis + ((long) g));
            this.f838m.mo124a(new aqg().mo1695a(new arf(Double.valueOf(Math.random())))).mo125a(this.f826a).mo127a(this.f832g, null);
        }
    }

    /* renamed from: a */
    final void mo1630a(aoe aoe) {
        this.f837l = false;
        if (this.f831f) {
            this.f835j.obtainMessage(2, aoe).sendToTarget();
        } else if (this.f829d) {
            if (aoe.f26615b != null) {
                mo1633d();
                aoe aoe2 = this.f830e;
                this.f830e = aoe;
                for (int size = this.f827b.size() - 1; size >= 0; size--) {
                    ((aof) this.f827b.get(size)).mo1634c();
                }
                if (aoe2 != null) {
                    this.f835j.obtainMessage(2, aoe2).sendToTarget();
                }
            }
            mo1632c();
        } else {
            this.f834i = aoe;
        }
    }

    /* renamed from: d */
    final void mo1633d() {
        Bitmap bitmap = this.f833h;
        if (bitmap != null) {
            this.f836k.mo284a(bitmap);
            this.f833h = null;
        }
    }

    /* renamed from: a */
    final void mo1629a(ads ads, Bitmap bitmap) {
        aqe.m610a((Object) ads, "Argument must not be null");
        this.f833h = (Bitmap) aqe.m610a((Object) bitmap, "Argument must not be null");
        this.f838m = this.f838m.mo124a(new aqg().mo1697a(ads, true));
    }
}
