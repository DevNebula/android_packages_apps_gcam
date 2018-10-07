package p000;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ifn */
public final class ifn extends Binder implements ifm {
    /* renamed from: a */
    private final ieg f20988a;

    public ifn() {
        attachInterface(this, "com.google.android.gms.location.ILocationListener");
    }

    public ifn(ieg ieg) {
        this();
        this.f20988a = ieg;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                mo13646a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.ILocationListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13646a(Location location) {
        this.f20988a.mo8404a(new ife());
    }

    /* renamed from: a */
    public final synchronized void mo13645a() {
        this.f20988a.f7336a = null;
    }
}
