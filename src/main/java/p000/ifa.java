package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.zzq;

/* renamed from: ifa */
public final class ifa implements IInterface {
    /* renamed from: a */
    private IBinder f7346a;

    ifa(IBinder iBinder) {
        this.f7346a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f7346a;
    }

    /* renamed from: a */
    public final void mo8417a(zzq zzq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (zzq != null) {
                obtain.writeInt(1);
                zzq.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7346a.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final Location mo8416a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(str);
            this.f7346a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
