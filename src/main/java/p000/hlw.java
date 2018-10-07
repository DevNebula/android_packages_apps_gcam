package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: hlw */
class hlw extends gqj {
    /* renamed from: a */
    public final /* synthetic */ hls f24487a;

    hlw(hls hls) {
        this.f24487a = hls;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        hls hls = this.f24487a;
        Uri uri = hls.f24480h;
        if (uri != null) {
            hls.f24478f.setVideoURI(uri);
        }
        this.f24487a.f24478f.setOnCompletionListener(new hlx(this));
        this.f24487a.f24478f.setOnPreparedListener(new hly(this));
    }

    /* renamed from: V */
    public void mo13416V() {
        hls hls = this.f24487a;
        hls.f24477e.mo7946a(hls.f24478f.getDuration());
        hls = this.f24487a;
        hls.f24478f.seekTo(hls.f24481i);
        hls = this.f24487a;
        hls.f24477e.mo7947b(hls.f24481i);
    }

    /* renamed from: X */
    public void mo13418X() {
        hls hls = this.f24487a;
        hls.f24477e.mo7946a(hls.f24478f.getDuration());
        hls = this.f24487a;
        hls.f24478f.seekTo(hls.f24481i);
        hls = this.f24487a;
        hls.f24477e.mo7947b(hls.f24481i);
    }
}
