package p000;

import android.net.Uri;
import java.util.Date;

/* compiled from: PG */
/* renamed from: erw */
public abstract class erw {
    /* renamed from: l */
    private static final Date f4390l = new Date(0);
    /* renamed from: m */
    private static final iqp f4391m = new iqp(0, 0);
    /* renamed from: a */
    public final Uri f4392a;
    /* renamed from: b */
    public long f4393b = -1;
    /* renamed from: c */
    public String f4394c = "";
    /* renamed from: d */
    public String f4395d = "";
    /* renamed from: e */
    public Date f4396e = f4390l;
    /* renamed from: f */
    public Date f4397f = f4390l;
    /* renamed from: g */
    public String f4398g = "";
    /* renamed from: h */
    public boolean f4399h = false;
    /* renamed from: i */
    public iqp f4400i = f4391m;
    /* renamed from: j */
    public erx f4401j = erx.f4403a;
    /* renamed from: k */
    public boolean f4402k = false;

    /* renamed from: c */
    public abstract erw mo6562c();

    public erw(Uri uri) {
        this.f4392a = uri;
    }

    /* renamed from: b */
    public eru mo6560b() {
        return new eru(this.f4393b, this.f4394c, this.f4395d, this.f4396e, this.f4397f, this.f4398g, this.f4392a, this.f4399h, kbg.m4804c(this.f4400i), 0, 0, this.f4401j, this.f4402k);
    }

    /* renamed from: a */
    public final erw mo6558a(long j) {
        this.f4393b = j;
        return mo6562c();
    }

    /* renamed from: a */
    public final erw mo6559a(Date date) {
        this.f4396e = date;
        return mo6562c();
    }

    /* renamed from: d */
    public final erw mo6563d() {
        this.f4399h = true;
        return mo6562c();
    }

    /* renamed from: b */
    public final erw mo6561b(Date date) {
        this.f4397f = date;
        return mo6562c();
    }
}
