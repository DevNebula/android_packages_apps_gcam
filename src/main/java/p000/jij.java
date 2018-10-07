package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;

/* compiled from: PG */
/* renamed from: jij */
public final class jij implements Listener, jif {
    /* renamed from: a */
    private jzt f21526a;
    /* renamed from: b */
    private final jid f21527b;
    /* renamed from: c */
    private jik f21528c = jik.STOPPED;

    public jij(jid jid, FeatureTable featureTable) {
        boolean z;
        jri.m13404b((Object) jid);
        jri.m13404b((Object) featureTable);
        this.f21527b = jid;
        jid.f8213a.getRunner().setListener(this);
        if (jid.f8214b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "FeatureExtractionGraph should have at least one output.");
        for (jii featureTable2 : jid.f8214b) {
            featureTable2.setFeatureTable(featureTable);
        }
    }

    /* renamed from: a */
    private static void m13109a(jik jik, jik jik2) {
        if (jik != jik2) {
            String name = jik2.name();
            String name2 = jik.name();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 37) + String.valueOf(name2).length());
            stringBuilder.append("Expected extractor to be in ");
            stringBuilder.append(name);
            stringBuilder.append(" actual: ");
            stringBuilder.append(name2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int mo9453a() {
        return this.f21527b.f8214b.size();
    }

    public final void onGraphRunnerError(Exception exception, boolean z) {
        jzt jzt = this.f21526a;
        if (jzt != null) {
            jzt.mo9668a(exception);
        }
    }

    public final void onGraphRunnerStopped(GraphRunner graphRunner) {
        jzt jzt = this.f21526a;
        if (jzt != null) {
            jzt.mo9669b();
        }
    }

    /* renamed from: b */
    public final void mo9455b() {
        jid jid = this.f21527b;
        jid.f8213a.getRunner().stop();
        jid.f8213a.getRunner().tearDown();
    }

    /* renamed from: a */
    public final synchronized void mo9454a(jzt jzt) {
        jri.m13404b((Object) jzt);
        jij.m13109a(this.f21528c, jik.STOPPED);
        this.f21528c = jik.RUNNING;
        this.f21527b.f8213a.run();
        this.f21526a = jzt;
        this.f21526a.mo9667a();
    }

    /* renamed from: c */
    public final synchronized void mo9456c() {
        jij.m13109a(this.f21528c, jik.RUNNING);
        ((VideoProviderSource) this.f21527b.f8213a.getFilter("camera")).forceClose();
        this.f21528c = jik.STOPPED;
    }

    public final String toString() {
        return "FilterFwFeatureExtractor";
    }
}
