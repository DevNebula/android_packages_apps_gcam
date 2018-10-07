package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: eww */
public final class eww implements kwk {
    /* renamed from: a */
    public static final eww f17954a = new eww();

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 2);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 128000);
        createAudioFormat.setInteger("max-input-size", ewz.f4528a);
        createAudioFormat.setInteger("oo.muxer.force_sequential", 1);
        return (MediaFormat) ktm.m14219a(createAudioFormat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
