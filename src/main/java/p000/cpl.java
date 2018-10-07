package p000;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: cpl */
public final class cpl extends ContentObserver {
    /* renamed from: a */
    public cpm f2746a;
    /* renamed from: b */
    public boolean f2747b = false;
    /* renamed from: c */
    private boolean f2748c = false;

    public cpl() {
        super(null);
    }

    public final void onChange(boolean z) {
        if (this.f2746a != null) {
            bli.m888a(cfk.f23052a, "localImagesObserver foreground listener detected change.");
        }
        if (this.f2748c) {
            this.f2747b = true;
        }
    }

    /* renamed from: a */
    public final void mo5661a(boolean z) {
        this.f2748c = z;
        if (!z) {
            this.f2747b = false;
        }
    }
}
