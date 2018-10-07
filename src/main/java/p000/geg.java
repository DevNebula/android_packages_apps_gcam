package p000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: geg */
public final class geg implements gey {
    /* renamed from: f */
    private static final String f19102f = bli.m887a("LcLbTaskManager");
    /* renamed from: a */
    public final ilb f19103a = new ilb(Long.valueOf(0));
    /* renamed from: b */
    public final long f19104b;
    /* renamed from: c */
    public final ilp f19105c;
    /* renamed from: d */
    public final Object f19106d;
    /* renamed from: e */
    public boolean f19107e;
    /* renamed from: g */
    private final gev f19108g;
    /* renamed from: h */
    private final iqb f19109h;
    /* renamed from: i */
    private final LinkedList f19110i;
    /* renamed from: j */
    private List f19111j;

    public geg(era era, eqy eqy, gev gev) {
        this.f19108g = gev;
        this.f19110i = new LinkedList();
        this.f19106d = new Object();
        this.f19107e = false;
        this.f19111j = new ArrayList();
        this.f19104b = Math.min(300000000, eqy.f4332a);
        era.mo6521a(new geh(this));
        this.f19105c = era.mo6519a(eqv.LIGHTCYCLE_REFOCUS);
        this.f19105c.mo13672a(new gei(this), khx.m5000a());
        this.f19109h = new gej(this);
    }

    /* renamed from: a */
    public final void mo7092a(gek gek) {
        synchronized (this.f19106d) {
            this.f19111j.add(gek);
        }
    }

    /* renamed from: a */
    public final void mo7093a(geu geu) {
        synchronized (this.f19106d) {
            if (((Boolean) this.f19105c.mo13673b()).booleanValue()) {
                m11207b(geu);
            } else {
                String str = f19102f;
                String valueOf = String.valueOf(geu);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Memory low, delaying processing [");
                stringBuilder.append(valueOf);
                stringBuilder.append("]");
                bli.m894c(str, stringBuilder.toString());
                this.f19110i.add(geu);
                m11208d();
            }
        }
    }

    /* renamed from: a */
    public final void mo7094a(gex gex) {
        synchronized (this.f19106d) {
            if (((Boolean) this.f19105c.mo13673b()).booleanValue()) {
                m11207b(gex);
            } else {
                String str = f19102f;
                String valueOf = String.valueOf(gex);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Memory low, delaying processing [");
                stringBuilder.append(valueOf);
                stringBuilder.append("]");
                bli.m894c(str, stringBuilder.toString());
                gex.releaseRgbz();
                this.f19110i.add(gex);
                m11208d();
            }
        }
    }

    /* renamed from: a */
    public final long mo7091a() {
        return this.f19104b;
    }

    /* renamed from: b */
    public final int mo7095b() {
        int size;
        synchronized (this.f19106d) {
            size = this.f19110i.size();
        }
        return size;
    }

    /* renamed from: c */
    final void mo13334c() {
        synchronized (this.f19106d) {
            if (!this.f19110i.isEmpty()) {
                m11207b((geu) this.f19110i.removeFirst());
                m11208d();
            }
        }
    }

    /* renamed from: b */
    private final void m11207b(geu geu) {
        synchronized (this.f19106d) {
            String str = f19102f;
            String valueOf = String.valueOf(geu);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Memory OK, processing task [");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            bli.m894c(str, stringBuilder.toString());
            this.f19107e = true;
            ilb ilb = this.f19103a;
            ilb.mo8826a(Long.valueOf(((Long) ilb.mo13673b()).longValue() + this.f19104b));
            geu.addFinishedCallback(this.f19109h);
            this.f19108g.mo7085a(geu);
        }
    }

    /* renamed from: d */
    private final void m11208d() {
        synchronized (this.f19106d) {
            int size = this.f19110i.size();
            String str = f19102f;
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Number of tasks in queue ");
            stringBuilder.append(size);
            bli.m888a(str, stringBuilder.toString());
            List<gek> list = this.f19111j;
            if (list != null) {
                for (gek q : list) {
                    q.mo7068q();
                }
            }
        }
    }
}
