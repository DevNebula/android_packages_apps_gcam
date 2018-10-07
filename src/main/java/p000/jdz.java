package p000;

import android.annotation.TargetApi;
import java.util.HashMap;
import java.util.Map;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jdz */
public final class jdz {
    /* renamed from: a */
    public final int f8095a;
    /* renamed from: b */
    public final jfk f8096b;
    /* renamed from: c */
    public final jep f8097c;
    /* renamed from: d */
    public final jeq f8098d;
    /* renamed from: e */
    public final Map f8099e = new HashMap();
    /* renamed from: f */
    public final Map f8100f = new HashMap();
    /* renamed from: g */
    public final Map f8101g = new HashMap();
    /* renamed from: h */
    public boolean f8102h = true;

    jdz(int i, jfk jfk, jep jep, jeq jeq) {
        boolean z;
        if (jfk.f24735a.f26560a == jeq.f26560a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (jep == null) {
            jri.m13395a(true);
            this.f8095a = i;
            this.f8096b = jfk;
            this.f8097c = jep;
            this.f8098d = jeq;
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void mo9343a(jdk jdk) {
        boolean z;
        if (jdk.f26560a == this.f8098d.f26560a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jdk.mo15564a(new jec(this)).mo9282a(izw.f21401a);
    }

    /* renamed from: a */
    public static jef m4482a(jfk jfk) {
        boolean z;
        if (jfk.f24738d >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        return new jef(jfk);
    }

    /* renamed from: a */
    public final jdz mo9341a(String str, int i) {
        boolean z;
        if (i < this.f8096b.f24736b.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f8100f.put(str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public final jdz mo9342a(String str, float[] fArr) {
        this.f8099e.put(str, new jeb(str, fArr));
        return this;
    }

    /* renamed from: a */
    public final jdz mo9340a(String str, float f, float f2) {
        this.f8099e.put(str, new jed(str, f, f2));
        return this;
    }
}
