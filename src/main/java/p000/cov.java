package p000;

import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cov */
public final class cov extends eru {
    /* renamed from: a */
    private static final String f13060a = bli.m887a("BurstItemData");
    /* renamed from: n */
    private final List f13061n;
    /* renamed from: o */
    private boolean f13062o;
    /* renamed from: p */
    private final List f13063p;
    /* renamed from: q */
    private boolean f13064q;

    private cov(long j, String str, String str2, Date date, Date date2, String str3, kbg kbg, boolean z, iqp iqp, long j2, int i, erx erx, List list) {
        Uri uri;
        boolean z2;
        if (z) {
            uri = (Uri) kbg.mo9706a();
        } else {
            jri.m13395a(list.isEmpty() ^ 1);
            uri = ((cot) list.get(0)).f13151c.f13139e.f4384h;
        }
        super(j, str, str2, date, date2, str3, uri, z, kbg.m4804c(iqp), j2, i, erx, false);
        this.f13062o = false;
        this.f13063p = new ArrayList();
        this.f13064q = false;
        if (z == kbg.mo9709b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13395a(z2);
        this.f13061n = list;
    }

    /* renamed from: a */
    public static cov m8616a(List list) {
        jri.m13396a(list.isEmpty() ^ 1, (Object) "Cannot create BurstItem from empty burst");
        eru g = ((err) list.get(0)).mo6541g();
        long j = 0;
        for (err g2 : list) {
            j += g2.mo6541g().f4386j;
        }
        return new cov(cov.m8622c(list), g.f4379c, "", g.f4381e, g.f4382f, new File(g.f4383g).getParent(), kau.f21835a, false, g.mo6556g(), j, g.f4387k, g.f4388l, list);
    }

    /* renamed from: a */
    public static cov m8615a(Uri uri, gsp gsp, kbg kbg) {
        if (!gsp.mo7409a(uri)) {
            return null;
        }
        Point e = gsp.mo7414e(uri);
        if (e == null) {
            return null;
        }
        long longValue;
        Date date = new Date(gsp.mo7415f(uri));
        if (kbg.mo9709b()) {
            longValue = ((Long) kbg.mo9706a()).longValue();
        } else {
            longValue = -1;
        }
        return new cov(longValue, "", "", date, date, "", kbg.m4804c(uri), true, iqp.m4102a(e), 0, 0, erx.f4403a, Collections.emptyList());
    }

    /* renamed from: h */
    private final synchronized void m8627h() {
        if (!this.f13064q) {
            this.f13063p.clear();
            for (cot cot : mo12885c()) {
                boolean booleanValue;
                if (cot.f23657a.mo9709b()) {
                    booleanValue = ((Boolean) cot.f23657a.mo9706a()).booleanValue();
                } else {
                    String str = cot.f13151c.f13139e.f4383g;
                    if (str != null) {
                        booleanValue = jxr.m4737a().mo9612d(new File(str));
                        cot.f23657a = kbg.m4804c(Boolean.valueOf(booleanValue));
                    } else {
                        booleanValue = false;
                    }
                }
                if (!booleanValue) {
                    this.f13063p.add(cot);
                }
            }
            this.f13064q = true;
        }
    }

    /* renamed from: i */
    private final synchronized void m8628i() {
        if (!this.f13062o) {
            m8629j();
            if (!cov.m8625d(this.f13061n)) {
                Collections.sort(this.f13061n);
            }
            this.f13062o = true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo6554a(Set set) {
        boolean z;
        for (cot cot : this.f13061n) {
            if (set.contains(cot.f13151c.f13139e.f4384h)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: c */
    private static long m8622c(List list) {
        Iterator it = list.iterator();
        long j = -1;
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                return j2;
            }
            j = Math.max(j2, ((err) it.next()).mo6541g().f4378b);
        }
    }

    /* renamed from: a */
    public final synchronized ken mo6553a() {
        Collection arrayList;
        arrayList = new ArrayList();
        for (cot cot : this.f13061n) {
            arrayList.add(Long.valueOf(cot.f13151c.f13139e.f4378b));
        }
        return ken.m13713a(arrayList);
    }

    /* renamed from: b */
    public final synchronized List mo12884b() {
        m8628i();
        m8627h();
        return Collections.unmodifiableList(this.f13063p);
    }

    /* renamed from: b */
    public static cot m8620b(List list) {
        for (cot cot : list) {
            try {
                if (cot.f23658b == null) {
                    String str = cot.f13151c.f13139e.f4383g;
                    if (str == null) {
                        cot.f23658b = Boolean.valueOf(false);
                    } else {
                        cot.f23658b = Boolean.valueOf(jxr.m4737a().mo9611c(new File(str)));
                    }
                }
                if (cot.f23658b.booleanValue()) {
                    return cot;
                }
            } catch (jya e) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List mo12885c() {
        List unmodifiableList;
        m8628i();
        synchronized (this) {
            unmodifiableList = Collections.unmodifiableList(this.f13061n);
        }
        return unmodifiableList;
    }

    /* renamed from: d */
    public final synchronized int mo12886d() {
        return this.f13061n.size();
    }

    /* renamed from: e */
    public final synchronized err mo12887e() {
        err b;
        List c = mo12885c();
        jri.m13404b((Object) c);
        b = cov.m8620b(c);
        if (b == null) {
            if (c.isEmpty()) {
                b = null;
            } else {
                b = (err) c.get(0);
                String str = f13060a;
                String valueOf = String.valueOf(b.mo6541g().f4384h);
                String str2 = b.mo6541g().f4383g;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(str2).length());
                stringBuilder.append("Using first item as cover:");
                stringBuilder.append(valueOf);
                stringBuilder.append(" ");
                stringBuilder.append(str2);
                bli.m888a(str, stringBuilder.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public static boolean m8618a(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith("feature_table.bin")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m8621b(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith(".burst_in_progress.lock")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m8623c(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith(".medresframes")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m8624d(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith("metadatastore.bin")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m8619a(String str) {
        if (str == null) {
            return false;
        }
        return jxr.m4737a().mo9610b(new File(str));
    }

    /* renamed from: e */
    public static boolean m8626e(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        return cov.m8619a(file.getName());
    }

    /* renamed from: a */
    public static boolean m8617a(err err) {
        return cov.m8626e(new File(err.mo6541g().f4383g));
    }

    /* renamed from: f */
    public final kbg mo12888f() {
        List a;
        ArrayList c;
        synchronized (this) {
            a = khb.m4923a(this.f13061n.size());
            c = khb.m4955c(this.f13061n);
        }
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cot b = ((cot) c.get(i)).mo6536c();
            if (b != null) {
                a.add(b);
                i = i2;
            } else {
                i = i2;
            }
        }
        if (a.isEmpty()) {
            return kau.f21835a;
        }
        jri.m13395a(a.isEmpty() ^ 1);
        return kbg.m4804c(new cov(cov.m8622c(a), this.f4379c, this.f4380d, this.f4381e, this.f4382f, this.f4383g, kau.f21835a, false, mo6556g(), this.f4386j, this.f4387k, this.f4388l, a));
    }

    /* renamed from: a */
    public final synchronized boolean mo12883a(cot cot) {
        this.f13064q = false;
        return this.f13061n.remove(cot);
    }

    /* renamed from: j */
    private final synchronized void m8629j() {
        jxy a = jxr.m4737a();
        Iterator it = this.f13061n.iterator();
        while (it.hasNext()) {
            cot cot = (cot) it.next();
            if (!a.mo9610b(new File(cot.f13151c.f13139e.f4383g))) {
                String str = f13060a;
                String valueOf = String.valueOf(cot.f13151c.f13139e.f4383g);
                String str2 = "removing non-burst file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m898e(str, valueOf);
                it.remove();
            }
        }
    }

    /* renamed from: d */
    private static boolean m8625d(List list) {
        cot cot;
        boolean z = true;
        int i = -1;
        for (cot cot2 : list) {
            try {
                boolean z2;
                int d_ = cot2.mo14823d_();
                if (d_ <= i) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (d_ > i) {
                    z = z2;
                    i = d_;
                } else {
                    z = z2;
                }
            } catch (jya e) {
                return false;
            }
        }
        if (z) {
            return true;
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(i + 1, null));
        for (cot cot22 : list) {
            try {
                arrayList.set(cot22.mo14823d_(), cot22);
            } catch (jya e2) {
                return false;
            }
        }
        ListIterator listIterator = list.listIterator();
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            cot22 = (cot) listIterator2.next();
            if (cot22 != null) {
                listIterator.next();
                listIterator.set(cot22);
            }
        }
        return true;
    }
}
