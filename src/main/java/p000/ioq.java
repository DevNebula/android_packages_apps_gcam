package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ioq */
public final class ioq implements Comparable {
    /* renamed from: a */
    public final boolean f7605a;
    /* renamed from: b */
    public boolean f7606b = false;
    /* renamed from: c */
    public boolean f7607c = true;
    /* renamed from: d */
    public MediaFormat f7608d = null;
    /* renamed from: e */
    private int f7609e = -1;

    public ioq(boolean z) {
        this.f7605a = z;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return mo8688a() - ((ioq) obj).mo8688a();
    }

    /* renamed from: a */
    public final int mo8688a() {
        if (this.f7606b) {
            return this.f7609e;
        }
        throw new IllegalStateException("Track is not yet added");
    }

    /* renamed from: a */
    public final void mo8689a(int i) {
        if (this.f7605a) {
            this.f7609e = i;
            this.f7606b = true;
            return;
        }
        throw new IllegalStateException("This track is not required.");
    }
}
