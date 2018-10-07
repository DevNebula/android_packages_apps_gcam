package p000;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ajl */
public class ajl implements adl {
    /* renamed from: b */
    public final ajm f10340b;
    /* renamed from: c */
    public final URL f10341c;
    /* renamed from: d */
    public final String f10342d;
    /* renamed from: e */
    public String f10343e;
    /* renamed from: f */
    public URL f10344f;
    /* renamed from: g */
    private volatile byte[] f10345g;
    /* renamed from: h */
    private int f10346h;

    public ajl(String str) {
        this(str, ajm.f497a);
    }

    private ajl(String str, ajm ajm) {
        this.f10341c = null;
        this.f10342d = aqe.m611a(str);
        this.f10340b = (ajm) aqe.m610a((Object) ajm, "Argument must not be null");
    }

    public ajl(URL url) {
        this(url, ajm.f497a);
    }

    private ajl(URL url, ajm ajm) {
        this.f10341c = (URL) aqe.m610a((Object) url, "Argument must not be null");
        this.f10342d = null;
        this.f10340b = (ajm) aqe.m610a((Object) ajm, "Argument must not be null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ajl)) {
            return false;
        }
        ajl ajl = (ajl) obj;
        if (m6598a().equals(ajl.m6598a()) && this.f10340b.equals(ajl.f10340b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m6598a() {
        String str = this.f10342d;
        return str == null ? ((URL) aqe.m610a(this.f10341c, "Argument must not be null")).toString() : str;
    }

    public int hashCode() {
        if (this.f10346h == 0) {
            this.f10346h = m6598a().hashCode();
            this.f10346h = (this.f10346h * 31) + this.f10340b.hashCode();
        }
        return this.f10346h;
    }

    public String toString() {
        return m6598a();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        if (this.f10345g == null) {
            this.f10345g = m6598a().getBytes(f334a);
        }
        messageDigest.update(this.f10345g);
    }
}
