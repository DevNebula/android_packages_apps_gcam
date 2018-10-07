package p000;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqg */
public final class aqg implements Cloneable {
    /* renamed from: a */
    public static aqg f892a;
    /* renamed from: b */
    public static aqg f893b;
    /* renamed from: A */
    public boolean f894A = true;
    /* renamed from: B */
    public boolean f895B;
    /* renamed from: c */
    public int f896c;
    /* renamed from: d */
    public float f897d = 1.0f;
    /* renamed from: e */
    public afm f898e = afm.f414c;
    /* renamed from: f */
    public acg f899f = acg.NORMAL;
    /* renamed from: g */
    public Drawable f900g;
    /* renamed from: h */
    public int f901h;
    /* renamed from: i */
    public Drawable f902i;
    /* renamed from: j */
    public int f903j;
    /* renamed from: k */
    public boolean f904k = true;
    /* renamed from: l */
    public int f905l = -1;
    /* renamed from: m */
    public int f906m = -1;
    /* renamed from: n */
    public adl f907n = ard.f10678b;
    /* renamed from: o */
    public boolean f908o;
    /* renamed from: p */
    public boolean f909p = true;
    /* renamed from: q */
    public Drawable f910q;
    /* renamed from: r */
    public int f911r;
    /* renamed from: s */
    public adp f912s = new adp();
    /* renamed from: t */
    public Map f913t = new arj();
    /* renamed from: u */
    public Class f914u = Object.class;
    /* renamed from: v */
    public boolean f915v;
    /* renamed from: w */
    public Theme f916w;
    /* renamed from: x */
    public boolean f917x;
    /* renamed from: y */
    public boolean f918y;
    /* renamed from: z */
    public boolean f919z;

    /* renamed from: a */
    public final aqg mo1693a() {
        if (!this.f915v || this.f917x) {
            this.f917x = true;
            this.f915v = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b */
    public final aqg clone() {
        try {
            aqg aqg = (aqg) super.clone();
            aqg.f912s = new adp();
            aqg.f912s.mo11617a(this.f912s);
            aqg.f913t = new arj();
            aqg.f913t.putAll(this.f913t);
            aqg.f915v = false;
            aqg.f917x = false;
            return aqg;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static aqg m617a(Class cls) {
        aqg aqg = new aqg();
        while (true) {
            aqg aqg2 = aqg;
            if (aqg2.f917x) {
                aqg = aqg2.clone();
            } else {
                aqg2.f914u = (Class) aqe.m610a((Object) cls, "Argument must not be null");
                aqg2.f896c |= 4096;
                return aqg2.mo1712g();
            }
        }
    }

    /* renamed from: a */
    public final aqg mo1698a(afm afm) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f898e = (afm) aqe.m610a((Object) afm, "Argument must not be null");
        this.f896c |= 4;
        return this.mo1712g();
    }

    /* renamed from: b */
    public static aqg m620b(afm afm) {
        return new aqg().mo1698a(afm);
    }

    /* renamed from: c */
    public final aqg mo1706c() {
        return mo1696a(aoi.f841b, Boolean.valueOf(true));
    }

    /* renamed from: d */
    public final aqg mo1708d() {
        while (this.f917x) {
            this = this.clone();
        }
        this.f913t.clear();
        this.f896c &= -2049;
        this.f908o = false;
        this.f896c &= -131073;
        this.f909p = false;
        this.f896c |= 65536;
        this.f894A = true;
        return this.mo1712g();
    }

    /* renamed from: a */
    private final aqg m616a(amf amf) {
        return mo1696a(amf.f527f, (amf) aqe.m610a((Object) amf, "Argument must not be null"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqg)) {
            return false;
        }
        aqg aqg = (aqg) obj;
        if (Float.compare(aqg.f897d, this.f897d) == 0 && this.f901h == aqg.f901h && arq.m683b(this.f900g, aqg.f900g) && this.f903j == aqg.f903j && arq.m683b(this.f902i, aqg.f902i) && this.f911r == aqg.f911r && arq.m683b(this.f910q, aqg.f910q) && this.f904k == aqg.f904k && this.f905l == aqg.f905l && this.f906m == aqg.f906m && this.f908o == aqg.f908o && this.f909p == aqg.f909p && this.f918y == aqg.f918y && this.f919z == aqg.f919z && this.f898e.equals(aqg.f898e) && this.f899f == aqg.f899f && this.f912s.equals(aqg.f912s) && this.f913t.equals(aqg.f913t) && this.f914u.equals(aqg.f914u) && arq.m683b(this.f907n, aqg.f907n) && arq.m683b(this.f916w, aqg.f916w)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final aqg mo1709e() {
        return mo1700a(amf.f522a, new amt(), true);
    }

    public final int hashCode() {
        return arq.m673a(this.f916w, arq.m673a(this.f907n, arq.m673a(this.f914u, arq.m673a(this.f913t, arq.m673a(this.f912s, arq.m673a(this.f899f, arq.m673a(this.f898e, arq.m674a(this.f919z, arq.m674a(this.f918y, arq.m674a(this.f909p, arq.m674a(this.f908o, arq.m670a(this.f906m, arq.m670a(this.f905l, arq.m674a(this.f904k, arq.m673a(this.f910q, arq.m670a(this.f911r, arq.m673a(this.f902i, arq.m670a(this.f903j, arq.m673a(this.f900g, arq.m670a(this.f901h, arq.m669a(this.f897d)))))))))))))))))))));
    }

    /* renamed from: a */
    public final boolean mo1702a(int i) {
        return aqg.m619a(this.f896c, i);
    }

    /* renamed from: a */
    public static boolean m619a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: f */
    public final aqg mo1711f() {
        return mo1700a(amf.f524c, new alz(), false);
    }

    /* renamed from: a */
    public final aqg mo1699a(amf amf, ads ads) {
        while (this.f917x) {
            this = this.clone();
        }
        this.m616a(amf);
        return this.mo1697a(ads, false);
    }

    /* renamed from: b */
    public final aqg mo1705b(int i, int i2) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f906m = i;
        this.f905l = i2;
        this.f896c |= 512;
        return this.mo1712g();
    }

    /* renamed from: b */
    public final aqg mo1704b(int i) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f903j = i;
        this.f896c |= 128;
        return this.mo1712g();
    }

    /* renamed from: a */
    public final aqg mo1701a(Drawable drawable) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f902i = drawable;
        this.f896c |= 64;
        return this.mo1712g();
    }

    /* renamed from: a */
    public final aqg mo1694a(acg acg) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f899f = (acg) aqe.m610a((Object) acg, "Argument must not be null");
        this.f896c |= 8;
        return this.mo1712g();
    }

    /* renamed from: a */
    public final aqg mo1700a(amf amf, ads ads, boolean z) {
        aqg a;
        if (z) {
            while (this.f917x) {
                this = this.clone();
            }
            this.m616a(amf);
            a = this.mo1697a(ads, true);
        } else {
            a = mo1699a(amf, ads);
        }
        a.f894A = true;
        return a;
    }

    /* renamed from: g */
    public final aqg mo1712g() {
        if (!this.f915v) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    /* renamed from: a */
    public final aqg mo1696a(adm adm, Object obj) {
        while (this.f917x) {
            this = this.clone();
        }
        aqe.m610a((Object) adm, "Argument must not be null");
        aqe.m610a(obj, "Argument must not be null");
        this.f912s.mo11615a(adm, obj);
        return this.mo1712g();
    }

    /* renamed from: a */
    public final aqg mo1695a(adl adl) {
        while (this.f917x) {
            this = this.clone();
        }
        this.f907n = (adl) aqe.m610a((Object) adl, "Argument must not be null");
        this.f896c |= 1024;
        return this.mo1712g();
    }

    /* renamed from: h */
    public final aqg mo1713h() {
        while (this.f917x) {
            this = this.clone();
        }
        this.f904k = false;
        this.f896c |= 256;
        return this.mo1712g();
    }

    /* renamed from: a */
    public final aqg mo1697a(ads ads, boolean z) {
        while (this.f917x) {
            this = this.clone();
        }
        ads amr = new amr(ads, z);
        this.m618a(Bitmap.class, ads, z);
        this.m618a(Drawable.class, amr, z);
        this.m618a(BitmapDrawable.class, amr, z);
        this.m618a(any.class, new aoc(ads), z);
        return this.mo1712g();
    }

    /* renamed from: a */
    private final aqg m618a(Class cls, ads ads, boolean z) {
        while (this.f917x) {
            this = this.clone();
        }
        aqe.m610a((Object) cls, "Argument must not be null");
        aqe.m610a((Object) ads, "Argument must not be null");
        this.f913t.put(cls, ads);
        this.f896c |= DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
        this.f909p = true;
        this.f896c |= 65536;
        this.f894A = false;
        if (z) {
            this.f896c |= 131072;
            this.f908o = true;
        }
        return this.mo1712g();
    }
}
