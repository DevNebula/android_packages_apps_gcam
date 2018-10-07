package p000;

import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jio */
final class jio implements VideoFrameConsumer {
    /* renamed from: a */
    private long f21535a = -1;
    /* renamed from: b */
    private final /* synthetic */ jin f21536b;

    jio(jin jin) {
        this.f21536b = jin;
    }

    public final void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        if (this.f21535a == -1) {
            this.f21535a = j;
        }
        this.f21536b.f21532c.setFeatureValue(j, new Feature(jza.TIMESTAMP, ((float) (j - this.f21535a)) / 1000000.0f));
        videoFrameProvider.skipVideoFrame();
    }

    public final void onVideoStreamError(Exception exception) {
        jzt jzt = this.f21536b.f21530a;
        if (jzt != null) {
            jzt.mo9668a(exception);
        }
    }

    public final void onVideoStreamStarted() {
        this.f21535a = -1;
    }

    public final void onVideoStreamStopped() {
        synchronized (this.f21536b) {
            jin jin = this.f21536b;
            if (jin.f21531b) {
                jzt jzt = jin.f21530a;
                if (jzt != null) {
                    jzt.mo9669b();
                }
                this.f21536b.f21531b = false;
            }
        }
    }
}
