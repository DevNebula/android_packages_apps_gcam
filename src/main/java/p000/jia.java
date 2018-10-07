package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jia */
public final class jia implements VideoFrameConsumer, VideoFrameProvider {
    /* renamed from: a */
    public final Set f21515a = khb.m4965f();
    /* renamed from: b */
    public final Map f21516b = khb.m4959d();
    /* renamed from: c */
    public final Map f21517c = khb.m4959d();
    /* renamed from: d */
    public final Map f21518d = khb.m4959d();
    /* renamed from: e */
    public volatile long f21519e = -1;
    /* renamed from: f */
    private final VideoFrameProvider f21520f;
    /* renamed from: g */
    private boolean f21521g = false;

    public jia(VideoFrameProvider videoFrameProvider) {
        this.f21520f = videoFrameProvider;
    }

    public final void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this) {
            if (!this.f21521g) {
                this.f21520f.addVideoFrameConsumer(this);
                this.f21521g = true;
            }
        }
        this.f21520f.addVideoFrameConsumer(videoFrameConsumer);
    }

    public final void close() {
        this.f21520f.close();
    }

    public final boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        boolean grabVideoFrame = this.f21520f.grabVideoFrame(frameImage2D, frameValue, scaler);
        synchronized (this) {
            List list = (List) this.f21516b.get(Thread.currentThread());
            if (list == null) {
                list = khb.m4945b();
                this.f21516b.put(Thread.currentThread(), list);
            }
            list.add(Long.valueOf(frameImage2D.getTimestamp()));
            this.f21518d.put(Thread.currentThread(), Integer.valueOf(Math.max(frameImage2D.getWidth(), frameImage2D.getHeight())));
        }
        return grabVideoFrame;
    }

    public final void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        synchronized (this) {
            this.f21515a.add(Long.valueOf(j));
        }
        videoFrameProvider.skipVideoFrame();
    }

    public final void onVideoStreamError(Exception exception) {
        Log.e("LoggingVideoStreamProvider", "Video stream error!", exception);
    }

    public final void onVideoStreamStarted() {
        this.f21519e = System.nanoTime();
    }

    public final void onVideoStreamStopped() {
    }

    public final void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.f21520f.removeVideoFrameConsumer(videoFrameConsumer);
    }

    public final void skipVideoFrame() {
        synchronized (this) {
            int intValue;
            Integer num = (Integer) this.f21517c.get(Thread.currentThread());
            Map map = this.f21517c;
            Thread currentThread = Thread.currentThread();
            if (num != null) {
                intValue = num.intValue() + 1;
            } else {
                intValue = 1;
            }
            map.put(currentThread, Integer.valueOf(intValue));
        }
        this.f21520f.skipVideoFrame();
    }

    public final String toString() {
        return this.f21520f.toString();
    }
}
