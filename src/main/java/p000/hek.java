package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: hek */
public final class hek {
    /* renamed from: a */
    public final Object f6457a = new Object();
    /* renamed from: b */
    public hen f6458b;
    /* renamed from: c */
    private final iqz f6459c;
    /* renamed from: d */
    private final ira f6460d;
    /* renamed from: e */
    private final hmy f6461e;
    /* renamed from: f */
    private final FrameLayout f6462f;
    /* renamed from: g */
    private final gci f6463g;
    /* renamed from: h */
    private final Instrumentation f6464h;
    /* renamed from: i */
    private final MainActivityLayout f6465i;
    /* renamed from: j */
    private final ird f6466j;
    /* renamed from: k */
    private hei f6467k;

    hek(ira ira, hmy hmy, gci gci, Instrumentation instrumentation, MainActivityLayout mainActivityLayout, het het, ird ird) {
        this.f6460d = ira;
        this.f6461e = hmy;
        this.f6462f = het.f6490d;
        this.f6463g = gci;
        this.f6464h = instrumentation;
        this.f6465i = mainActivityLayout;
        this.f6466j = ird;
        this.f6459c = ira.mo8854a("Viewfinder");
        this.f6459c.mo8837e("Viewfinder constructed.");
    }

    /* renamed from: a */
    public final void mo7770a() {
        this.f6459c.mo8837e("Stopping current viewfinder");
        hei hei = this.f6467k;
        if (hei != null) {
            hei.close();
            this.f6467k = null;
        }
        MainActivityLayout mainActivityLayout = this.f6465i;
        FrameLayout frameLayout = mainActivityLayout.f12893c;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            mainActivityLayout.f12893c = null;
            mainActivityLayout.requestLayout();
            mainActivityLayout.invalidate();
        }
    }

    /* renamed from: a */
    public final Bitmap mo7768a(int i, boolean z, boolean z2) {
        Bitmap createBitmap;
        synchronized (this.f6457a) {
            int width;
            int height;
            this.f6466j.mo8856a("getScreenshot");
            SurfaceView surfaceView = this.f6467k.f19976c;
            if (z2 || i % MediaDecoder.ROTATE_180 == 0) {
                width = surfaceView.getWidth();
            } else {
                width = surfaceView.getHeight();
            }
            if (z2 || i % MediaDecoder.ROTATE_180 == 0) {
                height = surfaceView.getHeight();
            } else {
                height = surfaceView.getWidth();
            }
            createBitmap = Bitmap.createBitmap(width / 4, height / 4, Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, hel.f6468a, new Handler(Looper.getMainLooper()));
            this.f6466j.mo8858b("getScreenshot#flipAndRotate");
            Matrix matrix = new Matrix();
            matrix.postRotate((float) (-i));
            if (z) {
                matrix.postScale(-1.0f, 1.0f);
            }
            createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            this.f6466j.mo8857b();
        }
        return createBitmap;
    }

    /* renamed from: a */
    public final kpk mo7769a(heo heo) {
        kpk kpk;
        iqz iqz = this.f6459c;
        String valueOf = String.valueOf(heo);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
        stringBuilder.append("swapAndStartSurfaceViewViewfinder with configuration: ");
        stringBuilder.append(valueOf);
        iqz.mo8837e(stringBuilder.toString());
        this.f6466j.mo8856a("swapAndStartSurfaceViewViewfinder");
        synchronized (this.f6457a) {
            mo7770a();
            this.f6459c.mo8837e("Starting the new viewfinder");
            this.f6467k = new hei(this.f6460d, this.f6461e, this.f6462f, this.f6465i, this.f6463g, this.f6464h, heo, new hem(this));
            MainActivityLayout mainActivityLayout = this.f6465i;
            mainActivityLayout.f12893c = this.f6462f;
            mainActivityLayout.f12894d.f19824a = null;
            mainActivityLayout.requestLayout();
            mainActivityLayout.invalidate();
            hei hei = this.f6467k;
            ikd.m12501a();
            kpk = hei.f19981h;
        }
        MainActivityLayout mainActivityLayout2 = this.f6465i;
        iqp iqp = heo.f6471a;
        mainActivityLayout2.mo12648a(iqp.f7695a, iqp.f7696b, false);
        this.f6466j.mo8857b();
        return kpk;
    }
}
