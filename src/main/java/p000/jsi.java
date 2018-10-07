package p000;

import android.graphics.RectF;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Config;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterpacks.storage.FrameConsumerFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jsi */
public class jsi implements jsh {
    /* renamed from: a */
    public final jrj f24790a;
    /* renamed from: b */
    public final jbj f24791b = jbj.m13001d();
    /* renamed from: c */
    private final FilterGraph f24792c;
    /* renamed from: d */
    private final VideoFrameProvider f24793d;
    /* renamed from: e */
    private final AtomicBoolean f24794e = new AtomicBoolean(false);
    /* renamed from: f */
    private final jaq f24795f;
    /* renamed from: g */
    private final Listener f24796g = new jsj(this);
    /* renamed from: h */
    private boolean f24797h;

    public jsi(MffContext mffContext, VideoFrameProvider videoFrameProvider, jla jla, jrj jrj, GraphFactory graphFactory, String str) {
        jri.m13404b((Object) mffContext);
        jri.m13404b((Object) videoFrameProvider);
        jri.m13404b((Object) jla);
        jri.m13404b((Object) jrj);
        this.f24790a = jrj;
        this.f24793d = videoFrameProvider;
        this.f24797h = false;
        this.f24792c = graphFactory.create(mffContext);
        this.f24792c.getVariable("videoProvider").setValue(this.f24793d);
        ((FrameConsumerFilter) this.f24792c.getFilter("frameConsumer")).setFrameConsumer(jla);
        GraphRunner graphRunner = new GraphRunner(mffContext, new Config(), this.f24796g);
        graphRunner.setThreadName(str);
        this.f24792c.attachToRunner(graphRunner);
        this.f24795f = this.f24791b.mo9275a(jlk.f8281a, new jsk());
    }

    public jaq process() {
        if (this.f24794e.compareAndSet(false, true)) {
            this.f24792c.run();
        }
        return this.f24795f;
    }

    public void resume() {
    }

    /* renamed from: a */
    public final void mo15053a(RectF rectF) {
        this.f24792c.getVariable("cropRect").setValue(Quad.fromRect(rectF));
    }

    public synchronized void stop() {
        if (this.f24794e.compareAndSet(false, true)) {
            this.f24791b.mo13778a(this.f24790a);
        } else if (!this.f24797h) {
            ((VideoProviderSource) this.f24792c.getFilter("camera")).forceClose();
        }
    }

    public void suspend() {
    }

    /* renamed from: a */
    final synchronized void mo15052a() {
        if (!this.f24797h) {
            this.f24792c.getRunner().stop();
            this.f24792c.getRunner().tearDown();
            this.f24797h = true;
        }
    }

    public String toString() {
        return "BurstAcquisitionPipeline";
    }
}
