package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: eyv */
public final class eyv implements exf, eyt {
    /* renamed from: c */
    private static final long f18031c = Math.round(1.6666666666666666E7d);
    /* renamed from: a */
    public final exd f18032a;
    /* renamed from: b */
    public final eyx f18033b = new eyx();
    /* renamed from: d */
    private final AtomicBoolean f18034d;
    /* renamed from: e */
    private final long f18035e;
    /* renamed from: f */
    private final AtomicBoolean f18036f;
    /* renamed from: g */
    private final List f18037g;
    /* renamed from: h */
    private final Executor f18038h;
    /* renamed from: i */
    private final bmb f18039i;
    /* renamed from: j */
    private final List f18040j;
    /* renamed from: k */
    private volatile gid f18041k;
    /* renamed from: l */
    private volatile eyu f18042l;
    /* renamed from: m */
    private volatile long f18043m;
    /* renamed from: n */
    private volatile long f18044n;
    /* renamed from: o */
    private volatile ezj f18045o;

    public eyv(exd exd, long j, List list, ezj ezj, Executor executor, bmb bmb) {
        this.f18032a = exd;
        this.f18035e = j;
        this.f18037g = list;
        this.f18045o = ezj;
        this.f18038h = executor;
        this.f18034d = new AtomicBoolean(false);
        this.f18036f = new AtomicBoolean(true);
        this.f18044n = Long.MAX_VALUE;
        this.f18039i = bmb;
        this.f18040j = new ArrayList();
    }

    /* renamed from: b */
    private final synchronized void m10266b(gid gid) {
        this.f18040j.add(Float.valueOf(gid.f19193j));
    }

    /* renamed from: a */
    private final void m10264a(eyu eyu, long j) {
        boolean z = false;
        if (this.f18034d.compareAndSet(false, true) && eyu != null) {
            long min = Math.min(TimeUnit.MICROSECONDS.convert(this.f18044n, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f18035e, TimeUnit.NANOSECONDS) + 1500000);
            if (this.f18039i != null && this.f18045o.equals(ezj.TRIMMING_MODE_AUTO)) {
                z = m10268b();
            }
            if (min - j >= 1000000 && !z) {
                eyu.mo6684a(min);
            } else if (this.f18045o.equals(ezj.TRIMMING_MODE_AUTO)) {
                if (z) {
                    m10265a("static scene");
                } else {
                    m10265a("too short");
                }
                eyu.mo6683a();
            } else if (this.f18045o.equals(ezj.TRIMMING_MODE_NEVER_DROP)) {
                eyu.mo6684a(j + 1000000);
            } else {
                String valueOf = String.valueOf(this.f18045o);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("Unknown trimming mode:");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private final int m10263a(List list) {
        int i;
        int size = list.size() - 1;
        while (true) {
            i = size;
            if (i <= 1 || ((gid) list.get(i)).f19184a <= this.f18035e + f18031c) {
                this.f18041k = (gid) list.get(i);
            } else {
                size = i - 1;
            }
        }
        this.f18041k = (gid) list.get(i);
        return i;
    }

    /* renamed from: a */
    public final long mo6681a() {
        List b = this.f18032a.mo6666b();
        if (b.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.f18035e, TimeUnit.NANOSECONDS) - 1500000;
        }
        Object obj;
        int a = m10263a(b);
        long j = this.f18041k.f19184a;
        int i = a - 1;
        while (i >= 0) {
            gid gid = (gid) b.get(i);
            long j2 = gid.f19184a;
            gid gid2 = this.f18041k;
            if (gid2 == null) {
                obj = null;
            } else if (gid != null) {
                m10266b(gid);
                long j3 = gid.f19184a;
                long j4 = this.f18035e;
                if (j3 > j4) {
                    obj = null;
                } else if (j3 < j4 - 1500000000) {
                    m10269c("max length");
                    obj = 1;
                } else {
                    for (ezi ezi : this.f18037g) {
                        if (ezi.mo6687a(gid, gid2)) {
                            m10269c(ezi.mo6686a());
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null && i <= a - 7) {
                obj = 1;
                break;
            }
            i--;
            j = j2;
        }
        obj = null;
        if (obj == null) {
            m10269c("max length");
        }
        this.f18043m = Math.max(TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f18035e, TimeUnit.NANOSECONDS) - 1500000);
        return this.f18043m;
    }

    /* renamed from: b */
    private final synchronized boolean m10268b() {
        boolean z;
        float f = 0.0f;
        for (Float f2 : this.f18040j) {
            if (f2.floatValue() > f) {
                f = f2.floatValue();
            }
        }
        int i = 0;
        int i2 = 0;
        for (Float f22 : this.f18040j) {
            float floatValue;
            int i3;
            if (f22.floatValue() > 0.1f) {
                floatValue = f22.floatValue() / f;
            } else {
                floatValue = f22.floatValue();
            }
            if (floatValue > 0.3f) {
                int i4 = i;
                i = i2 + 1;
                i3 = i4;
            } else {
                i3 = i + 1;
                i = i2;
            }
            i2 = i;
            i = i3;
        }
        if (i2 == 0) {
            z = true;
        } else if (((float) i2) / ((float) (i + i2)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private final void m10265a(String str) {
        this.f18033b.f4600c = str;
    }

    /* renamed from: b */
    private final void m10267b(String str) {
        this.f18033b.f4599b = str;
    }

    /* renamed from: c */
    private final void m10269c(String str) {
        this.f18033b.f4598a = str;
    }

    /* renamed from: a */
    public final synchronized void mo6668a(gid gid) {
        eyu eyu = this.f18042l;
        long j = this.f18043m;
        if (this.f18036f.compareAndSet(true, false)) {
            List b = this.f18032a.mo6666b();
            if (!b.isEmpty()) {
                this.f18044n = this.f18035e;
                int a = m10263a(b) + 1;
                while (true) {
                    int i = a;
                    if (i >= b.size()) {
                        break;
                    }
                    gid gid2 = (gid) b.get(i);
                    if (m10270c(gid2)) {
                        m10264a(eyu, j);
                    }
                    this.f18044n = gid2.f19184a;
                    a = i + 1;
                }
            }
        } else if (m10270c(gid)) {
            m10264a(eyu, j);
        }
        this.f18044n = gid.f19184a;
    }

    /* renamed from: c */
    private final boolean m10270c(gid gid) {
        gid gid2 = this.f18041k;
        if (gid2 == null || gid == null) {
            return false;
        }
        m10266b(gid);
        long j = gid.f19184a;
        long j2 = this.f18035e;
        if (j < j2) {
            return false;
        }
        if (j > j2 + 1500000000) {
            m10267b("max length");
            return true;
        }
        for (ezi ezi : this.f18037g) {
            if (ezi.mo6687a(gid, gid2)) {
                m10267b(ezi.mo6686a());
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo6682a(eyu eyu) {
        this.f18042l = new eyw(this, eyu);
        this.f18032a.mo6664a(this, this.f18038h);
    }
}
