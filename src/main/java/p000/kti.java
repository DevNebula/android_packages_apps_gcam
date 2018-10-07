package p000;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kti */
final class kti implements ktr {
    /* renamed from: a */
    private final kte f22002a;
    /* renamed from: b */
    private final kug f22003b;
    /* renamed from: c */
    private final boolean f22004c;
    /* renamed from: d */
    private final krp f22005d;

    private kti(kug kug, krp krp, kte kte) {
        this.f22003b = kug;
        this.f22004c = kte instanceof ksb;
        this.f22005d = krp;
        this.f22002a = kte;
    }

    /* renamed from: a */
    public final boolean mo10364a(Object obj, Object obj2) {
        if (!((kry) obj).f26607e.equals(((kry) obj2).f26607e)) {
            return false;
        }
        if (this.f22004c) {
            return ((ksb) obj).f26750g.equals(((ksb) obj2).f26750g);
        }
        return true;
    }

    /* renamed from: a */
    public final int mo10360a(Object obj) {
        int b;
        int i = 0;
        kuh kuh = ((kry) obj).f26607e;
        int i2 = kuh.f8944e;
        if (i2 == -1) {
            i2 = 0;
            int i3 = 0;
            while (i3 < kuh.f8941b) {
                b = krh.m14077b(kuh.f8942c[i3] >>> 3, (kqx) kuh.f8943d[i3]) + i2;
                i3++;
                i2 = b;
            }
            kuh.f8944e = i2;
        }
        if (!this.f22004c) {
            return i2;
        }
        krr krr = ((ksb) obj).f26750g;
        int i4 = 0;
        while (i < krr.f8818a.mo10374c()) {
            i4 += krr.m5175a(krr.f8818a.mo10371a(i));
            i++;
        }
        Iterator it = krr.f8818a.mo10378d().iterator();
        while (true) {
            b = i4;
            if (!it.hasNext()) {
                return i2 + b;
            }
            i4 = krr.m5175a((Entry) it.next()) + b;
        }
    }

    /* renamed from: b */
    public final int mo10365b(Object obj) {
        int hashCode = ((kry) obj).f26607e.hashCode();
        if (this.f22004c) {
            return (hashCode * 53) + ((ksb) obj).f26750g.hashCode();
        }
        return hashCode;
    }

    /* renamed from: c */
    public final boolean mo10367c(Object obj) {
        return ((ksb) obj).f26750g.mo10270b();
    }

    /* renamed from: d */
    public final void mo10368d(Object obj) {
        kug.m5363b(obj);
        krp.m5172b(obj);
    }

    /* renamed from: a */
    public final void mo10362a(Object obj, ktq ktq, krn krn) {
        kug kug = this.f22003b;
        Object a = kug.m5358a(obj);
        krr a2 = krp.m5169a(obj);
        while (ktq.mo10316a() != LfuScheduler.MAX_PRIORITY) {
            try {
                boolean z;
                int b = ktq.mo10322b();
                Object obj2;
                if (b == 11) {
                    kqx kqx = null;
                    int i = 0;
                    obj2 = null;
                    while (ktq.mo10316a() != LfuScheduler.MAX_PRIORITY) {
                        int b2 = ktq.mo10322b();
                        if (b2 == 16) {
                            i = ktq.mo10357r();
                            obj2 = krp.m5168a(krn, this.f22002a, i);
                        } else if (b2 == 26) {
                            if (obj2 != null) {
                                krp.m5170a(ktq, obj2, krn, a2);
                            } else {
                                kqx = ktq.mo10329d();
                            }
                        } else if (!ktq.mo10359t()) {
                            break;
                        }
                    }
                    if (ktq.mo10322b() != 12) {
                        throw ksh.m5203a();
                    } else if (kqx == null) {
                        z = true;
                        continue;
                    } else if (obj2 == null) {
                        ((kuh) a).mo10413a((i << 3) | 2, (Object) kqx);
                        z = true;
                        continue;
                    } else {
                        krl krl = (krl) obj2;
                        Object g = krl.f8807c.mo14188g().mo14192g();
                        ByteBuffer wrap = ByteBuffer.wrap(kqx.mo10229c());
                        if (wrap.hasArray()) {
                            ktq kqt = new kqt(wrap);
                            kto.f8910a.mo10315a(g).mo10362a(g, kqt, krn);
                            a2.mo10269b(krl.f8808d, g);
                            if (kqt.mo10316a() != LfuScheduler.MAX_PRIORITY) {
                                throw ksh.m5203a();
                            }
                            z = true;
                            continue;
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    }
                } else if ((b & 7) == 2) {
                    obj2 = krp.m5168a(krn, this.f22002a, b >>> 3);
                    if (obj2 != null) {
                        krp.m5170a(ktq, obj2, krn, a2);
                        z = true;
                        continue;
                    } else {
                        z = kug.mo10411a(a, ktq);
                        continue;
                    }
                } else {
                    z = ktq.mo10359t();
                    continue;
                }
                if (!z) {
                    return;
                }
            } finally {
                kug.m5362a(obj, (kuh) a);
            }
        }
        kug.m5362a(obj, (kuh) a);
    }

    /* renamed from: b */
    public final void mo10366b(Object obj, Object obj2) {
        ktt.m5305a(this.f22003b, obj, obj2);
        if (this.f22004c) {
            ktt.m5304a(this.f22005d, obj, obj2);
        }
    }

    /* renamed from: a */
    public final Object mo10361a() {
        return this.f22002a.mo14188g().mo14192g();
    }

    /* renamed from: a */
    static kti m14208a(kug kug, krp krp, kte kte) {
        return new kti(kug, krp, kte);
    }

    /* renamed from: a */
    public final void mo10363a(Object obj, kvb kvb) {
        Iterator c = ((ksb) obj).f26750g.mo10271c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            krs krs = (krs) entry.getKey();
            if (krs.f8823c.f8982d != gcb.f5299k) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof ksl) {
                kvb.mo10456a(krs.f8822b, ((ksk) ((ksl) entry).f8897a.getValue()).mo10288b());
            } else {
                kvb.mo10456a(krs.f8822b, entry.getValue());
            }
        }
        kuh kuh = ((kry) obj).f26607e;
        int i;
        if (C0252go.f5911cd == C0252go.f5912ce) {
            for (i = kuh.f8941b - 1; i >= 0; i--) {
                kvb.mo10456a(kuh.f8942c[i] >>> 3, kuh.f8943d[i]);
            }
            return;
        }
        for (i = 0; i < kuh.f8941b; i++) {
            kvb.mo10456a(kuh.f8942c[i] >>> 3, kuh.f8943d[i]);
        }
    }
}
