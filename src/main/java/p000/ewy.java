package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ewy */
public final class ewy implements kwk {
    /* renamed from: a */
    public static final ewy f17958a = new ewy();

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/microvideo-meta-stream");
        mediaFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        return (MediaFormat) ktm.m14219a(mediaFormat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
