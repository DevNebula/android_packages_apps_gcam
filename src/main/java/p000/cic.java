package p000;

import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;

/* compiled from: PG */
/* renamed from: cic */
final class cic implements iqo {
    /* renamed from: a */
    private final /* synthetic */ chz f12566a;

    cic(chz chz) {
        this.f12566a = chz;
    }

    public final void close() {
        SurfaceTextureStreamer surfaceTextureStreamer = this.f12566a.f12548b;
        if (surfaceTextureStreamer != null) {
            surfaceTextureStreamer.close();
        }
    }
}
