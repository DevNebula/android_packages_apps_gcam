package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;
import java.util.List;

/* renamed from: ihs */
final class ihs implements ihq {
    /* renamed from: a */
    private IBinder f20998a;

    ihs(IBinder iBinder) {
        this.f20998a = iBinder;
    }

    /* renamed from: a */
    public final void mo8479a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataHolder == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8480a(zzbz zzbz) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzbz == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzbz.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8481a(zzcc zzcc) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzcc == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzcc.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8482a(zzh zzh) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzh == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzh.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8483a(zzk zzk) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzk == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzk.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8484a(zzo zzo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzo.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8485a(zzs zzs) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzs == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzs.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo8486a(List list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            obtain.writeTypedList(list);
            this.f20998a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f20998a;
    }

    /* renamed from: b */
    public final void mo8487b(zzcc zzcc) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzcc == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzcc.writeToParcel(obtain, 0);
            }
            this.f20998a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
