package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.zzc;
import com.google.android.gms.wearable.internal.zzcj;

/* renamed from: ihv */
final class ihv implements iht {
    /* renamed from: a */
    private IBinder f20999a;

    ihv(IBinder iBinder) {
        this.f20999a = iBinder;
    }

    /* renamed from: a */
    public final void mo8488a(iho iho, PutDataRequest putDataRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(iho.asBinder());
            if (putDataRequest != null) {
                obtain.writeInt(1);
                putDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f20999a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8489a(iho iho, zzc zzc) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(iho.asBinder());
            obtain.writeInt(1);
            zzc.writeToParcel(obtain, 0);
            this.f20999a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8490a(iho iho, zzcj zzcj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(iho.asBinder());
            obtain.writeInt(1);
            zzcj.writeToParcel(obtain, 0);
            this.f20999a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f20999a;
    }
}
