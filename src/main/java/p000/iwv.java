package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwv */
public final class iwv {
    /* renamed from: a */
    public Integer f7887a;
    /* renamed from: b */
    public List f7888b;
    /* renamed from: c */
    public Executor f7889c;
    /* renamed from: d */
    public iwi f7890d;
    /* renamed from: e */
    public iwo f7891e;

    public iwv(byte b) {
        this();
    }

    iwv(iwu iwu) {
        this();
        this.f7887a = Integer.valueOf(iwu.mo9140d());
        this.f7888b = iwu.mo9138b();
        this.f7889c = iwu.mo9137a();
        this.f7890d = iwu.mo9141e();
        this.f7891e = iwu.mo9139c();
    }

    /* renamed from: a */
    public final iwu mo9143a() {
        String str = "";
        if (this.f7887a == null) {
            str = String.valueOf(str).concat(" sessionType");
        }
        if (this.f7888b == null) {
            str = String.valueOf(str).concat(" outputSurfaces");
        }
        if (this.f7889c == null) {
            str = String.valueOf(str).concat(" executor");
        }
        if (this.f7890d == null) {
            str = String.valueOf(str).concat(" stateCallback");
        }
        if (this.f7891e == null) {
            str = String.valueOf(str).concat(" sessionParameters");
        }
        if (str.isEmpty()) {
            return new iwr(this.f7887a.intValue(), this.f7888b, this.f7889c, this.f7890d, this.f7891e);
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
