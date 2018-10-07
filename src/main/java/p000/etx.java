package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: etx */
public final class etx implements euf, euz {
    /* renamed from: a */
    public static final String f17801a = bli.m887a("CcMVEnc");
    /* renamed from: b */
    public final eua f17802b;
    /* renamed from: c */
    public final Object f17803c = new Object();
    /* renamed from: d */
    private long f17804d = -1;
    /* renamed from: e */
    private jgo f17805e = null;
    /* renamed from: f */
    private final Executor f17806f;
    /* renamed from: g */
    private final Set f17807g = new HashSet();

    public etx(eua eua, Executor executor) {
        this.f17802b = eua;
        this.f17806f = executor;
    }

    /* renamed from: a */
    public final void mo6601a(long j) {
        synchronized (this.f17803c) {
            long j2 = Long.MAX_VALUE;
            for (eug eug : this.f17807g) {
                long j3;
                if (eug.f17816b.mo14038a()) {
                    j3 = j2;
                } else if (eug.f17818d) {
                    j3 = j2;
                } else {
                    j3 = Math.min(j2, ((Long) eug.f17816b.f21895a.mo9812a()).longValue());
                }
                j2 = j3;
            }
            this.f17804d = Math.min(j2, Math.max(j, this.f17804d));
            mo13188b();
            jgo jgo = this.f17805e;
            if (jgo != null) {
                jgo.mo13794a(this.f17804d);
            }
        }
    }

    /* renamed from: b */
    public final euy mo6609b(long j) {
        euy euy;
        synchronized (this.f17803c) {
            for (eug eug : this.f17807g) {
                if (!eug.f17818d) {
                    kge kge = eug.f17816b;
                    Comparable valueOf = Long.valueOf(j);
                    String str;
                    StringBuilder stringBuilder;
                    if (!kge.mo9713a(valueOf)) {
                        if (eug.f17816b.mo14038a() && kge.m13750a((Long) eug.f17816b.f21896b.mo9812a(), Long.valueOf(((Long) eug.f17816b.f21896b.mo9812a()).longValue() + 66666)).mo9713a(valueOf)) {
                            euy = euy.ENCODE;
                            break;
                        } else if (((Long) eug.f17816b.f21895a.mo9812a()).longValue() >= j) {
                            str = f17801a;
                            stringBuilder = new StringBuilder(31);
                            stringBuilder.append("dropping <");
                            stringBuilder.append(j);
                            stringBuilder.append(">");
                            bli.m888a(str, stringBuilder.toString());
                            euy = euy.DROP_BUT_CONTINUE;
                            break;
                        }
                    } else {
                        str = f17801a;
                        stringBuilder = new StringBuilder(31);
                        stringBuilder.append("encoding <");
                        stringBuilder.append(j);
                        stringBuilder.append(">");
                        bli.m888a(str, stringBuilder.toString());
                        euy = euy.ENCODE;
                        break;
                    }
                }
            }
            euy = euy.ENCODE_AND_PAUSE;
        }
        return euy;
    }

    /* renamed from: a */
    public final void mo6600a() {
        synchronized (this.f17803c) {
            if (this.f17802b == null) {
                return;
            }
            for (eug eug : this.f17807g) {
                if (!eug.f17816b.mo14038a()) {
                    eug.mo6684a(((Long) eug.f17816b.f21895a.mo9812a()).longValue() + 3000000);
                }
            }
            kni.m18470a(this.f17802b.mo6595d(), Throwable.class, new ezq(f17801a), kpq.f8776a);
        }
    }

    /* renamed from: a */
    public final eug mo6599a(kbn kbn, long j, long j2) {
        eug eug;
        synchronized (this.f17803c) {
            if (j < this.f17804d) {
                String str = f17801a;
                long j3 = this.f17804d;
                StringBuilder stringBuilder = new StringBuilder(94);
                stringBuilder.append("Starting session at ");
                stringBuilder.append(j);
                stringBuilder.append(" which is before the last promise ");
                stringBuilder.append(j3);
                bli.m891b(str, stringBuilder.toString());
                j = this.f17804d;
            }
            eug = new eug(this, kbn, kge.m13749a(Long.valueOf(j)), j2);
            this.f17807g.add(eug);
            mo13188b();
            this.f17802b.mo6594c();
        }
        return eug;
    }

    /* renamed from: b */
    final void mo13188b() {
        synchronized (this.f17803c) {
            jgx jgp;
            long j = Long.MIN_VALUE;
            for (eug eug : this.f17807g) {
                long j2;
                if (!eug.f17816b.mo14038a()) {
                    j2 = j;
                } else if (((Long) eug.f17816b.f21896b.mo9812a()).longValue() >= this.f17804d) {
                    j2 = j;
                } else {
                    j2 = Math.max(j, ((Long) eug.f17816b.f21896b.mo9812a()).longValue());
                }
                j = j2;
            }
            if (!this.f17807g.isEmpty() && this.f17805e == null) {
                jgp = new jgp(this.f17806f);
                this.f17805e = jgp;
                eua eua = this.f17802b;
                jgd a = eua.f4467e.mo6598a(new etw(jgp));
                eua.f4470h = a;
                for (eux eux : eua.f4466d) {
                    eux.mo6605a(a, this, new eva(eua, eux));
                }
                eua.f4464b.mo6603b(true);
                a.mo9401b();
                eua.mo6594c();
            }
            for (eug eug2 : this.f17807g) {
                jgo jgo = this.f17805e;
                if (jgo == null) {
                    throw new IllegalStateException("Non-empty set of sessions while muxer null");
                } else if (!(eug2.f17817c || !eug2.f17816b.mo14038a() || eug2.f17818d)) {
                    String str = f17801a;
                    String valueOf = String.valueOf(eug2.f17816b.f21895a.mo9812a());
                    String valueOf2 = String.valueOf(eug2.f17816b.f21896b.mo9812a());
                    long longValue = ((Long) eug2.f17816b.f21896b.mo9812a()).longValue() - ((Long) eug2.f17816b.f21895a.mo9812a()).longValue();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length());
                    stringBuilder.append("CUT: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(" DURATION: ");
                    stringBuilder.append(longValue);
                    stringBuilder.append("US");
                    bli.m888a(str, stringBuilder.toString());
                    jgp = (jgx) eug2.f17815a.mo9715b();
                    jgo.mo13795a(jgp, ((Long) eug2.f17816b.f21895a.mo9812a()).longValue(), ((Long) eug2.f17816b.f21896b.mo9812a()).longValue());
                    eug2.f17817c = true;
                    eug2.f17819e.mo15644b(jgp.mo9416b());
                }
            }
        }
    }
}
