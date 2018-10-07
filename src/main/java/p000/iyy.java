package p000;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: iyy */
public class iyy implements iyz, iza {
    /* renamed from: a */
    public izb f21391a;
    /* renamed from: b */
    public izb f21392b;
    /* renamed from: c */
    public izb f21393c;
    /* renamed from: d */
    public izb f21394d = izb.m4419a(iyt.f7934a);
    /* renamed from: e */
    public izb f21395e;
    /* renamed from: f */
    public int f21396f = -1;
    /* renamed from: g */
    public long f21397g = -1;

    /* renamed from: a */
    public iyy mo13765a(File file) {
        this.f21392b = izb.m4419a(new iyw(file));
        kow.m13878a(this.f21392b.f7946a, new iys(), kpq.f8776a);
        this.f21393c = izb.m4419a(new iyx(file));
        return this;
    }

    /* renamed from: a */
    public Callable mo13766a() {
        jri.m13404b(this.f21391a);
        jri.m13404b(this.f21392b);
        jri.m13404b(this.f21393c);
        jri.m13404b(this.f21394d);
        jri.m13404b(this.f21395e);
        return new iyr(this.f21391a, this.f21392b, this.f21393c, this.f21394d, this.f21395e, this.f21396f, this.f21397g);
    }

    /* renamed from: a */
    public iyy mo9209a(OutputStream outputStream) {
        this.f21395e = izb.m4419a(new iyv(outputStream));
        return this;
    }

    /* renamed from: b */
    public iyz mo9189b() {
        this.f21396f = 1;
        return this;
    }

    /* renamed from: a */
    public iyz mo9187a(long j) {
        this.f21397g = j;
        return this;
    }

    /* renamed from: a */
    public iza mo9188a(InputStream inputStream) {
        this.f21391a = izb.m4419a(new iyu(inputStream));
        return this;
    }
}
