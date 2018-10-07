package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jgp */
public class jgp implements jgo {
    /* renamed from: a */
    public final Object f24742a = new Object();
    /* renamed from: b */
    public final Executor f24743b;
    /* renamed from: c */
    private final kpw f24744c = kpw.m18486d();
    /* renamed from: d */
    private final Set f24745d = new HashSet();
    /* renamed from: e */
    private final List f24746e = new ArrayList();
    /* renamed from: f */
    private long f24747f = 0;
    /* renamed from: g */
    private final kpw f24748g = kpw.m18486d();

    public jgp(Executor executor) {
        this.f24743b = executor;
    }

    /* renamed from: a */
    public final void mo13795a(jgx jgx, long j, long j2) {
        long j3 = this.f24747f;
        if (j < j3) {
            StringBuilder stringBuilder = new StringBuilder(94);
            stringBuilder.append("Promised minimum cut timestamp ");
            stringBuilder.append(j3);
            stringBuilder.append(" later than requested: ");
            stringBuilder.append(j);
            throw new RuntimeException(stringBuilder.toString());
        } else if (this.f24744c.isDone()) {
            synchronized (this.f24742a) {
                this.f24745d.add(new jhl(jgx, j, j2));
                ArrayList arrayList = new ArrayList();
                for (jgu jgu : this.f24746e) {
                    jhl jhl = new jhl(jgx.mo9414a(jgu.f21472a), j, j2);
                    jgu.f21474c.add(jhl);
                    arrayList.add(new jgr(this, jgu, jhl));
                }
                jgx.mo9415a();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
            }
        } else {
            throw new IllegalStateException("CookieCutterMuxer should be started before adding cuts");
        }
    }

    /* renamed from: a */
    public final jhf mo9414a(jhe jhe) {
        jhf jgu;
        synchronized (this.f24742a) {
            jgu = new jgu(this, jhe);
            this.f24746e.add(jgu);
        }
        return jgu;
    }

    /* renamed from: c */
    final /* synthetic */ kpk mo15042c() {
        Iterable arrayList = new ArrayList();
        synchronized (this.f24742a) {
            for (jhl jhl : this.f24745d) {
                arrayList.add(((jgx) jhl.f8201a).mo9416b());
            }
        }
        return kny.m18475a(kow.m13872a(arrayList), jgt.f21471a, kpq.f8776a);
    }

    /* renamed from: a */
    public final void mo13794a(long j) {
        synchronized (this.f24742a) {
            if (this.f24744c.isDone()) {
                this.f24747f = Math.max(this.f24747f, j);
                for (jgu jgu : this.f24746e) {
                    Iterator it = jgu.f21473b.iterator();
                    while (it.hasNext() && ((jgy) it.next()).f8185b.presentationTimeUs < j) {
                        it.remove();
                    }
                }
            } else {
                throw new IllegalStateException("Please call this method only after start().");
            }
        }
    }

    /* renamed from: a */
    public final void mo9415a() {
        synchronized (this.f24742a) {
            Iterable arrayList = new ArrayList();
            for (jgu jgu : this.f24746e) {
                arrayList.add(jgu.f21475d);
            }
            this.f24748g.mo15644b(kow.m13872a(arrayList));
        }
        this.f24744c.mo15641a(null);
    }

    /* renamed from: a */
    final void mo15041a(jhl jhl, jgy jgy) {
        this.f24743b.execute(new jgs(jhl, jgy));
    }

    /* renamed from: b */
    public final kpk mo9416b() {
        return kny.m18476a(this.f24748g, new jgq(this), this.f24743b);
    }
}
