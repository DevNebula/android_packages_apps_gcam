package p000;

import android.media.MediaFormat;

/* renamed from: jgf */
final /* synthetic */ class jgf implements kaw {
    /* renamed from: a */
    private final MediaFormat f21467a;

    jgf(MediaFormat mediaFormat) {
        this.f21467a = mediaFormat;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        MediaFormat mediaFormat = this.f21467a;
        MediaFormat mediaFormat2 = (MediaFormat) obj;
        if (mediaFormat2 != null) {
            jcc.m4462a("oo.muxer.drop_initial_non_keyframes", mediaFormat, mediaFormat2);
            jcc.m4462a("oo.muxer.force_sequential", mediaFormat, mediaFormat2);
        }
        return mediaFormat2;
    }
}
