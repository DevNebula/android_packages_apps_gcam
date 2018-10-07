package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.pipeline.Pipeline;

/* compiled from: PG */
/* renamed from: jsl */
public class jsl implements Pipeline {
    /* renamed from: a */
    public final FeatureTable f21707a;
    /* renamed from: b */
    public final jbj f21708b;
    /* renamed from: c */
    private final jif f21709c;
    /* renamed from: d */
    private boolean f21710d = false;

    public jsl(jif jif, FeatureTable featureTable) {
        this.f21707a = featureTable;
        jri.m13404b((Object) jif);
        this.f21709c = jif;
        this.f21708b = jbj.m13001d();
    }

    public jaq process() {
        if (this.f21709c.mo9453a() > 0) {
            this.f21709c.mo9454a(new jsm(this));
        } else {
            this.f21708b.mo13778a(this.f21707a);
        }
        return this.f21708b;
    }

    /* renamed from: a */
    final synchronized void mo13846a() {
        if (!this.f21710d) {
            this.f21709c.mo9455b();
            this.f21710d = true;
        }
    }

    public void resume() {
    }

    public synchronized void stop() {
        if (!this.f21710d && this.f21709c.mo9453a() > 0) {
            this.f21709c.mo9456c();
        }
    }

    public void suspend() {
    }

    public String toString() {
        return "FeatureExtractionPipeline";
    }
}
