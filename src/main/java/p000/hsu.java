package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.ProgressCallback;
import com.google.android.apps.refocus.processing.Renderer;
import com.google.android.apps.refocus.processing.Renderer.Priority;

/* compiled from: PG */
/* renamed from: hsu */
public final class hsu implements Runnable {
    /* renamed from: a */
    public final hsw f6956a;
    /* renamed from: b */
    private final Context f6957b;
    /* renamed from: c */
    private final DepthOfFieldOptions f6958c;
    /* renamed from: d */
    private final ProgressCallback f6959d;
    /* renamed from: e */
    private final Bitmap f6960e;
    /* renamed from: f */
    private final Handler f6961f;

    public hsu(Context context, DepthOfFieldOptions depthOfFieldOptions, hsw hsw, ProgressCallback progressCallback, Bitmap bitmap) {
        this.f6957b = context;
        this.f6958c = depthOfFieldOptions;
        this.f6961f = new Handler(context.getMainLooper());
        this.f6956a = hsw;
        this.f6959d = progressCallback;
        this.f6960e = bitmap;
    }

    public final void run() {
        this.f6961f.post(new hsv(this, new Renderer(this.f6957b, Priority.NORMAL).render(this.f6958c, this.f6959d, this.f6960e)));
    }
}
