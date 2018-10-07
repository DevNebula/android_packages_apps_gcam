package p000;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: iub */
public final class iub implements ixe {
    /* renamed from: a */
    private final Object f24680a = new Object();
    /* renamed from: b */
    private final ImageWriter f24681b;
    /* renamed from: c */
    private final int f24682c;
    /* renamed from: d */
    private final int f24683d;

    public iub(ImageWriter imageWriter) {
        this.f24681b = imageWriter;
        this.f24682c = this.f24681b.getFormat();
        this.f24683d = this.f24681b.getMaxImages();
    }

    public final void close() {
        synchronized (this.f24680a) {
            this.f24681b.close();
        }
    }

    /* renamed from: a */
    public final iwz mo13756a(long j) {
        iwz itv;
        synchronized (this.f24680a) {
            try {
                Image dequeueInputImage = this.f24681b.dequeueInputImage();
                dequeueInputImage.setTimestamp(j);
                itv = new itv(dequeueInputImage);
            } catch (Throwable e) {
                throw new isr(e);
            }
        }
        return itv;
    }

    /* renamed from: a */
    public final int mo13755a() {
        return this.f24683d;
    }

    /* renamed from: a */
    public final void mo13757a(iwz iwz) {
        synchronized (this.f24680a) {
            try {
                this.f24681b.queueInputImage((Image) ion.m4003a((iwe) iwz));
            } catch (Throwable e) {
                throw new isr(e);
            }
        }
        iwz.close();
    }

    /* renamed from: a */
    public final void mo13758a(ixg ixg, Handler handler) {
        jri.m13404b((Object) ixg);
        jri.m13404b((Object) handler);
        synchronized (this.f24680a) {
            try {
                this.f24681b.setOnImageReleasedListener(new iuc(ixg), handler);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final String toString() {
        return jqk.m13350b((Object) this).mo9703a("format", ion.m4019b(this.f24682c)).toString();
    }
}
