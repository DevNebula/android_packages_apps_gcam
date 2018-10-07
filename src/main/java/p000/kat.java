package p000;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: kat */
public final class kat extends asd implements kas {
    /* renamed from: a */
    private final /* synthetic */ bog f21834a;

    public kat() {
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
    }

    public kat(bog bog) {
        this.f21834a = bog;
        this();
    }

    /* renamed from: a */
    protected final boolean mo1772a(int i, Parcel parcel) {
        boi boi;
        switch (i) {
            case 1:
                parcel.readFloat();
                parcel.readInt();
                synchronized (this.f21834a.f1386b) {
                    boi = this.f21834a.f1390f;
                    if (boi != null) {
                        boi.mo2070b();
                    }
                }
            case 2:
                synchronized (this.f21834a.f1386b) {
                    boi = this.f21834a.f1390f;
                    if (boi != null) {
                        boi.mo2069a();
                    }
                }
            default:
                return false;
        }
        return true;
    }
}
