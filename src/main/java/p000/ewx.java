package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ewx */
public final class ewx implements kwk {
    /* renamed from: a */
    private final kwk f17955a;
    /* renamed from: b */
    private final kwk f17956b;
    /* renamed from: c */
    private final kwk f17957c;

    private ewx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17955a = kwk;
        this.f17956b = kwk2;
        this.f17957c = kwk3;
    }

    /* renamed from: a */
    public static ewx m10198a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ewx(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17955a;
        kwk kwk2 = this.f17956b;
        hjf hjf = (hjf) kwk2.mo10566a();
        iqp iqp = (iqp) this.f17957c.mo10566a();
        bsn bsn = ((bmb) kwk.mo10566a()).f1335a;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", iqp.f7695a, iqp.f7696b);
        createVideoFormat.setInteger("bitrate", 12000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("color-format", 2135033992);
        createVideoFormat.setInteger("color-standard", 4);
        createVideoFormat.setInteger("color-range", 1);
        createVideoFormat.setFloat("i-frame-interval", 0.23333333f);
        createVideoFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        if (hjf.mo7905c()) {
            createVideoFormat.setInteger("profile", 8);
            createVideoFormat.setInteger("level", 32768);
        }
        return (MediaFormat) ktm.m14219a(createVideoFormat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
