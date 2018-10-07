package p000;

import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: gev */
public final class gev {
    /* renamed from: a */
    public final iqz f5355a;
    /* renamed from: b */
    public final Object f5356b;
    /* renamed from: c */
    public final LinkedList f5357c = new LinkedList();
    /* renamed from: d */
    public int f5358d;
    /* renamed from: e */
    public boolean f5359e;
    /* renamed from: f */
    public boolean f5360f = false;
    /* renamed from: g */
    private final Runnable f5361g;

    public gev(ira ira, Runnable runnable) {
        this.f5361g = runnable;
        this.f5355a = ira.mo8854a("ProcessingSvcMgr");
        this.f5356b = new Object();
        this.f5358d = C0252go.f5813aL;
    }

    /* renamed from: a */
    public final void mo7085a(geu geu) {
        synchronized (this.f5356b) {
            if (this.f5357c.contains(geu)) {
                throw new IllegalArgumentException("Task already enqueued");
            }
            this.f5357c.add(geu);
            iqz iqz = this.f5355a;
            String valueOf = String.valueOf(geu);
            int size = this.f5357c.size();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Task added [");
            stringBuilder.append(valueOf);
            stringBuilder.append("]. Queue size now: ");
            stringBuilder.append(size);
            iqz.mo8832b(stringBuilder.toString());
            if (!this.f5360f) {
                mo7084a();
            }
        }
    }

    /* renamed from: a */
    public final void mo7084a() {
        synchronized (this.f5356b) {
            if (this.f5358d == C0252go.f5813aL) {
                this.f5355a.mo8836d("Starting service (was DESTROYED)");
                this.f5361g.run();
                this.f5358d = C0252go.f5811aJ;
            } else if (this.f5358d == C0252go.f5812aK) {
                this.f5355a.mo8836d("Scheduling service restart, is shutting down");
                this.f5359e = true;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo7086b() {
        boolean z = true;
        synchronized (this.f5356b) {
            if (this.f5358d != C0252go.f5811aJ && this.f5357c.isEmpty()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final geu mo7087c() {
        synchronized (this.f5356b) {
            if (this.f5357c.isEmpty() || this.f5360f) {
                iqz iqz = this.f5355a;
                boolean z = this.f5360f;
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("Popping null. On hold? ");
                stringBuilder.append(z);
                iqz.mo8832b(stringBuilder.toString());
                this.f5358d = C0252go.f5812aK;
                return null;
            }
            geu geu = (geu) this.f5357c.remove();
            iqz iqz2 = this.f5355a;
            int size = this.f5357c.size();
            String valueOf = String.valueOf(geu);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
            stringBuilder2.append("Popping a session. Remaining: ");
            stringBuilder2.append(size);
            stringBuilder2.append(" , task ");
            stringBuilder2.append(valueOf);
            iqz2.mo8832b(stringBuilder2.toString());
            return geu;
        }
    }

    /* renamed from: d */
    public final boolean mo7088d() {
        synchronized (this.f5356b) {
            if (mo7086b()) {
                this.f5355a.mo8832b("Not able to suspend processing.");
                return false;
            }
            this.f5355a.mo8832b("Suspend processing");
            this.f5360f = true;
            return true;
        }
    }
}
