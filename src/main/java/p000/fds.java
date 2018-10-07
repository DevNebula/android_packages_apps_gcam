package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fds */
public final class fds implements fel {
    /* renamed from: a */
    public final fem mo6765a(fip fip, fim fim) {
        return new fdt();
    }

    /* renamed from: a */
    public static fis m10418a(fis... fisArr) {
        kbg kbg = kau.f21835a;
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Set hashSet3 = new HashSet();
        kbg kbg2 = kbg;
        for (fis fis : fisArr) {
            if (fis.f4810a.mo9709b()) {
                kbg2 = fis.f4810a;
            }
            hashSet.addAll(fis.f4811b);
            hashSet2.addAll(fis.f4812c);
            hashSet3.addAll(fis.f4813d);
        }
        return new fis(kbg2, hashSet, hashSet2, hashSet3);
    }

    /* renamed from: a */
    public static fjl m10421a(fjk fjk, int i) {
        fjl a = fjk.mo6830a();
        try {
            a.mo14893a(i).get();
            return a;
        } catch (InterruptedException e) {
            a.close();
            throw e;
        } catch (Throwable e2) {
            a.close();
            throw new isr(e2);
        }
    }

    /* renamed from: a */
    public static ilp m10423a(Key key, ilp ilp) {
        return ilq.m3875a(ilq.m3875a(ilp, new fiu(key)), fit.f18325a);
    }

    /* renamed from: a */
    public static fiw m10419a(iqt iqt) {
        return new fiy(iqt, iqt);
    }

    /* renamed from: b */
    public static fiw m10426b(iqt iqt) {
        return new fja(iqt, iqt);
    }

    /* renamed from: a */
    public static fis m10416a(Collection collection) {
        return new fis(kau.f21835a, Collections.emptySet(), keu.m13732a(collection), Collections.emptySet());
    }

    /* renamed from: b */
    public static fiw m10427b(Collection collection) {
        return new fix(collection);
    }

    /* renamed from: a */
    public static fiw m10420a(fiw... fiwArr) {
        return new fix(fiwArr);
    }

    /* renamed from: a */
    public static fis m10413a(Key key, Object obj) {
        return fds.m10415a(new fin(key, obj));
    }

    /* renamed from: a */
    public static fis m10415a(fin fin) {
        return new fis(kau.f21835a, Collections.emptySet(), Collections.emptySet(), keu.m13727a((Object) fin));
    }

    /* renamed from: a */
    public static fis m10417a(List list) {
        return new fis(kau.f21835a, Collections.emptySet(), Collections.emptySet(), keu.m13732a((Collection) list));
    }

    /* renamed from: c */
    public static fiw m10428c(iqt iqt) {
        return new fiz(iqt, iqt);
    }

    /* renamed from: a */
    public static fis m10414a(fhy fhy) {
        return new fis(kau.f21835a, keu.m13727a((Object) fhy), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    public static fis m10412a(int i) {
        return new fis(kbg.m4804c(Integer.valueOf(i)), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    public static iwz m10424a(fjj fjj, int... iArr) {
        iwz f = fjj.mo13252f();
        iwz iwz = null;
        int i = -1;
        while (f != null) {
            iwz iwz2;
            if (khx.m5002a(iArr, f.mo13741c())) {
                int g = f.mo13745g() * f.mo13742d();
                if (g <= i) {
                    iwz2 = iwz;
                } else if (iwz != null) {
                    iwz.close();
                    i = g;
                    iwz2 = f;
                } else {
                    i = g;
                    iwz2 = f;
                }
            } else {
                f.close();
                iwz2 = iwz;
            }
            f = fjj.mo13252f();
            iwz = iwz2;
        }
        fjj.close();
        return iwz;
    }

    /* renamed from: a */
    public static fis m10411a() {
        return new fis(kau.f21835a, Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: b */
    public static fiw m10425b() {
        return new fiw(0);
    }

    /* renamed from: c */
    public final void mo6766c() {
    }

    /* renamed from: a */
    public static fko m10422a(fmg fmg, int i) {
        while (i >= 2) {
            fko fmi;
            fjl a = fmg.f4851a.mo6830a();
            if (a.mo14894b(i)) {
                fmi = new fmi(a);
            } else {
                a.close();
                fmi = null;
            }
            if (fmi != null) {
                return fmi;
            }
            i--;
        }
        return null;
    }
}
