package p000;

import android.net.Uri;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* renamed from: crb */
public final class crb {
    /* renamed from: a */
    public static int f2784a = -1;
    /* renamed from: g */
    private static final String f2785g = bli.m887a("FSItemDBblyLnkdList");
    /* renamed from: b */
    public crd f2786b;
    /* renamed from: c */
    public final HashMap f2787c = new HashMap();
    /* renamed from: d */
    public final cqy f2788d = new cqy();
    /* renamed from: e */
    public final Lock f2789e = this.f2791h.readLock();
    /* renamed from: f */
    public final Lock f2790f = this.f2791h.writeLock();
    /* renamed from: h */
    private final ReentrantReadWriteLock f2791h = new ReentrantReadWriteLock();

    /* renamed from: a */
    private final crc m1471a(cra cra, err err) {
        jri.m13404b((Object) err);
        Object crc = new crc(this, err);
        crc.f13176a = this.f2788d.mo5672a(cra, crc);
        this.f2787c.put(err.mo6541g().f4384h, crc);
        return crc;
    }

    /* renamed from: a */
    public final cre mo5683a(err err) {
        boolean z = false;
        jri.m13404b((Object) err);
        this.f2790f.lock();
        try {
            cre a;
            if (this.f2788d.f2781c != 0) {
                Comparator cqh = new cqh(new Date());
                cra a2 = this.f2788d.mo5671a(0);
                Object obj = ((crc) a2.mo5680h()).f13177b;
                cqy cqy = this.f2788d;
                if (cqy.f2781c == 0) {
                    throw new NoSuchElementException("Cannot get last from empty list.");
                }
                cra cra = cqy.f2780b;
                if (cqh.compare(err, ((crc) cra.mo5680h()).f13177b) > 0) {
                    a = m1471a(cra, err);
                    return a;
                }
                cra cra2 = a2;
                while (cra2.mo5673a() && cqh.compare(err, obj) > 0) {
                    cra e = cra2.mo5677e();
                    cra2 = e;
                    err obj2 = ((crc) e.mo5680h()).f13177b;
                }
                if (cqh.compare(err, obj2) > 0) {
                    a = m1471a(cra2, err);
                } else {
                    jri.m13404b((Object) err);
                    obj2 = new crc(this, err);
                    cqy cqy2 = this.f2788d;
                    if (cra2 == null) {
                        cra2 = cqy2.mo5672a(cqy2.f2780b, obj2);
                    } else if (cra2 == cqy2.f2779a) {
                        cra2 = cqy2.mo5672a(null, obj2);
                    } else {
                        if (cra2.mo5676d() == cqy2) {
                            z = true;
                        }
                        jri.m13396a(z, (Object) "Node is not part of this list.");
                        cra2 = cqy2.mo5672a(((cqz) cra2).f13172b, obj2);
                    }
                    obj2.f13176a = cra2;
                    this.f2787c.put(err.mo6541g().f4384h, obj2);
                    a = obj2;
                }
            } else {
                jri.m13404b((Object) err);
                Object a3 = new crc(this, err);
                cqy cqy3 = this.f2788d;
                a3.f13176a = cqy3.mo5672a(cqy3.f2780b, a3);
                this.f2787c.put(err.mo6541g().f4384h, a3);
            }
            this.f2790f.unlock();
            return a3;
        } finally {
            this.f2790f.unlock();
        }
    }

    /* renamed from: a */
    public final cre mo5681a(int i) {
        cre cre;
        this.f2789e.lock();
        if (i >= 0) {
            cqy cqy = this.f2788d;
            if (i < cqy.f2781c) {
                cre = (cre) cqy.mo5671a(i).mo5680h();
                this.f2789e.unlock();
                crd crd = this.f2786b;
                if (!(crd == null || cre == null)) {
                    crd.mo5685a(cre);
                }
                return cre;
            }
        }
        try {
            String str = f2785g;
            int i2 = this.f2788d.f2781c;
            StringBuilder stringBuilder = new StringBuilder(86);
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for list of size: ");
            stringBuilder.append(i2);
            stringBuilder.append(". Returning INVALID node.");
            bli.m896d(str, stringBuilder.toString());
            cre = cre.f2792c;
            return cre;
        } finally {
            this.f2789e.unlock();
        }
    }

    /* renamed from: a */
    public final cre mo5682a(Uri uri) {
        this.f2789e.lock();
        try {
            cre cre;
            if (this.f2787c.containsKey(uri)) {
                cre = (cre) this.f2787c.get(uri);
                crd crd = this.f2786b;
                if (!(crd == null || cre == null)) {
                    crd.mo5685a(cre);
                }
                return cre;
            }
            String str = f2785g;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("URI: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" not found. Returning INVALID node.");
            bli.m896d(str, stringBuilder.toString());
            cre = cre.f2792c;
            this.f2789e.unlock();
            return cre;
        } finally {
            this.f2789e.unlock();
        }
    }

    /* renamed from: b */
    public final int mo5684b(Uri uri) {
        int i = 0;
        this.f2789e.lock();
        try {
            if (this.f2787c.containsKey(uri)) {
                cra a = this.f2788d.mo5671a(0);
                while (true) {
                    cra cra = a;
                    if (((crc) cra.mo5680h()).f13177b.mo6541g().f4384h.equals(uri)) {
                        this.f2789e.unlock();
                        return i;
                    }
                    a = cra.mo5677e();
                    i++;
                }
            } else {
                int i2 = f2784a;
                return i2;
            }
        } finally {
            this.f2789e.unlock();
        }
    }
}
