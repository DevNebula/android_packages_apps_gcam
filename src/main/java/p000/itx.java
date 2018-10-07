package p000;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import com.google.android.camera.experimental2016.ExperimentalImageReaderExtensions;

/* compiled from: PG */
/* renamed from: itx */
final class itx implements ixb {
    /* renamed from: a */
    private final Object f24677a = new Object();
    /* renamed from: b */
    private final ImageReader f24678b;
    /* renamed from: c */
    private final boolean f24679c;

    itx(ImageReader imageReader, boolean z) {
        this.f24678b = imageReader;
        this.f24679c = z;
    }

    /* renamed from: a */
    public final iwz mo13746a() {
        synchronized (this.f24677a) {
            Image acquireLatestImage = this.f24678b.acquireLatestImage();
            if (acquireLatestImage == null) {
                return null;
            }
            iwz itv = new itv(acquireLatestImage);
            return itv;
        }
    }

    /* renamed from: b */
    public final iwz mo13748b() {
        synchronized (this.f24677a) {
            Image acquireNextImage = this.f24678b.acquireNextImage();
            if (acquireNextImage == null) {
                return null;
            }
            iwz itv = new itv(acquireNextImage);
            return itv;
        }
    }

    public final void close() {
        synchronized (this.f24677a) {
            this.f24678b.close();
        }
    }

    /* renamed from: c */
    public final void mo13749c() {
        synchronized (this.f24677a) {
            if (this.f24679c) {
                this.f24678b.discardFreeBuffers();
            } else {
                ImageReader imageReader = this.f24678b;
                if (hsx.m3413a(hsx.f6964a, 1)) {
                    ExperimentalImageReaderExtensions.discardFreeBuffers(imageReader);
                } else if (hsx.m3413a(hsx.f6964a, 2)) {
                    com.google.android.camera.experimental2017.ExperimentalImageReaderExtensions.discardFreeBuffers(imageReader);
                } else {
                    throw new RuntimeException("Implementation isn't available");
                }
            }
        }
    }

    /* renamed from: d */
    public final int mo13750d() {
        int height;
        synchronized (this.f24677a) {
            height = this.f24678b.getHeight();
        }
        return height;
    }

    /* renamed from: e */
    public final int mo13751e() {
        int imageFormat;
        synchronized (this.f24677a) {
            imageFormat = this.f24678b.getImageFormat();
        }
        return imageFormat;
    }

    /* renamed from: f */
    public final int mo13752f() {
        int maxImages;
        synchronized (this.f24677a) {
            maxImages = this.f24678b.getMaxImages();
        }
        return maxImages;
    }

    /* renamed from: g */
    public final Surface mo13753g() {
        Surface surface;
        synchronized (this.f24677a) {
            surface = this.f24678b.getSurface();
        }
        return surface;
    }

    /* renamed from: h */
    public final int mo13754h() {
        int width;
        synchronized (this.f24677a) {
            width = this.f24678b.getWidth();
        }
        return width;
    }

    /* renamed from: a */
    public final void mo13747a(ixd ixd, Handler handler) {
        synchronized (this.f24677a) {
            this.f24678b.setOnImageAvailableListener(new ity(ixd), handler);
        }
    }

    public final String toString() {
        kbd b;
        synchronized (this.f24677a) {
            b = jqk.m13350b(this.f24678b);
        }
        return b.mo9701a("width", mo13754h()).mo9701a("height", mo13750d()).mo9703a("format", ion.m4019b(mo13751e())).mo9701a("max images", mo13752f()).toString();
    }
}
