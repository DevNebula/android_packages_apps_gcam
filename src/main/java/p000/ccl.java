package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ccl */
public final class ccl implements kwk {
    /* renamed from: a */
    private final cdi f12151a;
    /* renamed from: b */
    private final int f12152b;
    /* renamed from: c */
    private final byte[] f12153c = new byte[this.f12152b];
    /* renamed from: d */
    private final iqr f12154d = new iqr(new bxo(), this.f12152b / 104);
    /* renamed from: e */
    private long f12155e;
    /* renamed from: f */
    private long f12156f;
    /* renamed from: g */
    private int f12157g;
    /* renamed from: h */
    private long f12158h;
    /* renamed from: i */
    private long f12159i;
    /* renamed from: j */
    private int f12160j;

    public ccl(cdi cdi) {
        this.f12151a = cdi;
        this.f12152b = (((cdi.f1875a.getWidth() * cdi.f1875a.getHeight()) * cdi.f1875a.getLayers()) / 104) * 104;
    }

    /* renamed from: b */
    private final synchronized void m8099b() {
        synchronized (this) {
            this.f12151a.mo2265a(this.f12153c, 0, 0, this.f12152b);
            this.f12155e = 0;
            this.f12156f = 0;
            this.f12157g = 0;
            this.f12158h = 0;
            this.f12159i = 0;
            this.f12160j = 0;
            for (int i = 0; i < this.f12152b; i += 104) {
                long c = cci.m8092c(this.f12153c, i);
                if (c > this.f12156f) {
                    this.f12156f = c;
                    this.f12157g = i;
                }
                if (c != 0) {
                    long j = this.f12159i;
                    if (j == 0 || c < j) {
                        this.f12159i = c;
                        this.f12160j = i;
                    }
                }
            }
            if (this.f12156f > 0) {
                this.f12155e = cci.m8093d(this.f12153c, this.f12157g);
            }
            if (this.f12159i > 0) {
                this.f12158h = cci.m8093d(this.f12153c, this.f12160j);
            }
        }
    }

    /* renamed from: c */
    private final synchronized void m8100c() {
        if (this.f12156f == 0 || this.f12159i == 0) {
            m8099b();
        } else {
            m8098a(this.f12157g);
            long c = cci.m8092c(this.f12153c, this.f12157g);
            long j = this.f12156f;
            if (c != j) {
                m8099b();
            } else {
                int i = (this.f12157g + 104) % this.f12152b;
                c = j + 1;
                while (true) {
                    m8098a(i);
                    j = cci.m8092c(this.f12153c, i);
                    if (j != c) {
                        break;
                    }
                    this.f12157g = i;
                    this.f12156f = c;
                    this.f12155e = cci.m8093d(this.f12153c, i);
                    i = (i + 104) % this.f12152b;
                    c++;
                }
                if (j != 0 && j > this.f12159i) {
                    this.f12160j = i;
                    this.f12159i = j;
                    this.f12158h = cci.m8093d(this.f12153c, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final synchronized void mo12445a(long j, long j2, List list) {
        list.clear();
        m8100c();
        if (j <= this.f12155e) {
            long j3 = this.f12158h;
            if (j2 >= j3) {
                long j4 = this.f12159i;
                int i = this.f12160j;
                while (true) {
                    if (j3 >= j && j3 <= j2) {
                        bwr bwr = (bwr) this.f12154d.mo8823a();
                        byte[] bArr = this.f12153c;
                        bwr.f1685a = cci.m8091b(bArr, i);
                        bwr.f1686b = cci.m8091b(bArr, i + 4);
                        bwr.f1687c = cci.m8091b(bArr, i + 8);
                        bwr.f1688d = cci.m8092c(bArr, i);
                        bwr.f1689e = cci.m8093d(bArr, i);
                        bwr.f1690f = cci.m8090a(bArr, i + 24);
                        bwr.f1691g = cci.m8090a(bArr, i + 28);
                        bwr.f1692h = cci.m8090a(bArr, i + 32);
                        list.add(bwr);
                    }
                    int i2 = i + 104;
                    if (i2 >= this.f12152b) {
                        i2 = 0;
                    }
                    j3 = cci.m8092c(this.f12153c, i2);
                    if (j3 == 0 || j3 < j4) {
                        break;
                    }
                    j4 = cci.m8093d(this.f12153c, i2);
                    if (j4 > j2) {
                        break;
                    }
                    i = i2;
                    long j5 = j3;
                    j3 = j4;
                    j4 = j5;
                }
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m8098a(int i) {
        this.f12151a.mo2265a(this.f12153c, i, i, 104);
    }

    /* renamed from: a */
    public final synchronized void mo12446a(List list) {
        for (bwr a : list) {
            this.f12154d.mo8824a(a);
        }
        list.clear();
    }
}
