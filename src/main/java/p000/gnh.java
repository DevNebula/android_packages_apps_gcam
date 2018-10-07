package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gnh */
public final class gnh {
    /* renamed from: a */
    public final List f5736a = new ArrayList();
    /* renamed from: b */
    public final ikd f5737b;
    /* renamed from: c */
    public final gln f5738c;

    public gnh(ikd ikd, gln gln, gmv gmv) {
        this.f5737b = ikd;
        this.f5738c = gln;
        this.f5736a.add(gmv);
    }

    /* renamed from: a */
    public final void mo7250a(glq glq) {
        synchronized (this.f5736a) {
            this.f5736a.add(glq);
        }
    }

    /* renamed from: a */
    public final void mo7243a(Bitmap bitmap, int i) {
        this.f5737b.execute(new gns(this, bitmap, i));
    }

    /* renamed from: a */
    public final void mo7242a(Bitmap bitmap) {
        this.f5737b.execute(new gnj(this, bitmap));
    }

    /* renamed from: a */
    public final void mo7244a(Uri uri) {
        this.f5737b.execute(new gnr(this, uri));
    }

    /* renamed from: b */
    public final void mo7251b(Uri uri) {
        this.f5737b.execute(new gnn(this, uri));
    }

    /* renamed from: a */
    public final void mo7249a(Uri uri, List list) {
        this.f5737b.execute(new gnl(this, uri, list));
    }

    /* renamed from: a */
    public final void mo7248a(Uri uri, hec hec, boolean z) {
        this.f5737b.execute(new gnm(this, uri, hec, z));
    }

    /* renamed from: c */
    public final void mo7253c(Uri uri) {
        this.f5737b.execute(new gno(this, uri));
    }

    /* renamed from: a */
    public final void mo7245a(Uri uri, int i) {
        this.f5737b.execute(new gnp(this, uri, i));
    }

    /* renamed from: a */
    public final void mo7247a(Uri uri, hec hec) {
        this.f5737b.execute(new gnq(this, uri, hec));
    }

    /* renamed from: a */
    public final void mo7246a(Uri uri, glw glw, eqi eqi) {
        this.f5737b.execute(new gni(this, uri, glw, eqi));
    }

    /* renamed from: b */
    public final void mo7252b(glq glq) {
        synchronized (this.f5736a) {
            this.f5736a.remove(glq);
        }
    }
}
