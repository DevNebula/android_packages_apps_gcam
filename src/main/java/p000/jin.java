package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
/* renamed from: jin */
public final class jin implements jif {
    /* renamed from: a */
    public jzt f21530a;
    /* renamed from: b */
    public boolean f21531b = false;
    /* renamed from: c */
    public final FeatureTable f21532c;
    /* renamed from: d */
    private final VideoFrameProvider f21533d;
    /* renamed from: e */
    private final VideoFrameConsumer f21534e = new jio(this);

    public jin(VideoFrameProvider videoFrameProvider, FeatureTable featureTable) {
        jri.m13404b((Object) videoFrameProvider);
        jri.m13404b((Object) featureTable);
        this.f21533d = videoFrameProvider;
        this.f21532c = featureTable;
    }

    /* renamed from: a */
    public final int mo9453a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo9455b() {
    }

    /* renamed from: a */
    public final synchronized void mo9454a(jzt jzt) {
        if (!this.f21531b) {
            this.f21531b = true;
            this.f21530a = jzt;
            this.f21533d.addVideoFrameConsumer(this.f21534e);
            this.f21530a.mo9667a();
        }
    }

    /* renamed from: c */
    public final synchronized void mo9456c() {
        if (this.f21531b) {
            this.f21533d.removeVideoFrameConsumer(this.f21534e);
            jzt jzt = this.f21530a;
            if (jzt != null) {
                jzt.mo9669b();
            }
            this.f21531b = false;
        }
    }

    public final String toString() {
        return "TimestampFeatureExtractor";
    }
}
