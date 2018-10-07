package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jgd */
public final class jgd {
    /* renamed from: a */
    public final List f8162a;
    /* renamed from: b */
    public final jgx f8163b;
    /* renamed from: c */
    private boolean f8164c;
    /* renamed from: d */
    private boolean f8165d;
    /* renamed from: e */
    private kbg f8166e;
    /* renamed from: f */
    private kbg f8167f;
    /* renamed from: g */
    private volatile kbg f8168g;
    /* renamed from: h */
    private final Object f8169h;
    /* renamed from: i */
    private final kpw f8170i = kpw.m18486d();
    /* renamed from: j */
    private final kpw f8171j = kpw.m18486d();
    /* renamed from: k */
    private final kpw f8172k = kpw.m18486d();

    public jgd(jgx jgx) {
        this.f8163b = jgx;
        this.f8162a = Collections.synchronizedList(new ArrayList());
        this.f8164c = false;
        this.f8165d = false;
        this.f8166e = kau.f21835a;
        this.f8167f = kau.f21835a;
        this.f8168g = kau.f21835a;
        this.f8169h = new Object();
    }

    /* renamed from: a */
    public final /* synthetic */ jgc mo9399a(MediaFormat mediaFormat) {
        Object d = kpw.m18486d();
        return (jfy) new jfy(mediaFormat, this.f8163b.mo9414a(new jhe(mediaFormat, d))).mo9404a(new jge(this, mediaFormat, d));
    }

    /* renamed from: a */
    public final synchronized kpk mo9400a() {
        kpk d;
        if (this.f8165d) {
            if (!this.f8164c) {
                for (jgg a : this.f8162a) {
                    a.mo9402a();
                }
            }
            this.f8164c = true;
            d = kpw.m18486d();
            kow.m13878a(this.f8163b.mo9416b(), new jfv(d), kpq.f8776a);
        } else {
            d = kow.m13873a(Boolean.valueOf(true));
        }
        return d;
    }

    /* renamed from: b */
    public final synchronized void mo9401b() {
        if (this.f8165d) {
            throw new IllegalStateException("MediaEncoder already started.");
        }
        synchronized (this.f8169h) {
            this.f8170i.mo15641a((Float) this.f8166e.mo9710c());
            this.f8171j.mo15641a((Float) this.f8167f.mo9710c());
        }
        this.f8172k.mo15641a((Integer) this.f8168g.mo9710c());
        this.f8163b.mo9415a();
        for (jgg b : this.f8162a) {
            b.mo9403b();
        }
        this.f8165d = true;
    }
}
