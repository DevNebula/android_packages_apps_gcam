package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: gld */
final /* synthetic */ class gld implements Runnable {
    /* renamed from: a */
    private final gkt f5597a;
    /* renamed from: b */
    private final Uri f5598b;
    /* renamed from: c */
    private final List f5599c;

    gld(gkt gkt, Uri uri, List list) {
        this.f5597a = gkt;
        this.f5598b = uri;
        this.f5599c = list;
    }

    public final void run() {
        gkt gkt = this.f5597a;
        gkt.f24401r.mo7249a(this.f5598b, this.f5599c);
        gkt.f24409z = null;
    }
}
