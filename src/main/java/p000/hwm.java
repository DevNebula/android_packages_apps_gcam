package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hwm */
final class hwm implements hwk {
    /* renamed from: a */
    private IBinder f20826a;

    hwm(IBinder iBinder) {
        this.f20826a = iBinder;
    }

    /* renamed from: a */
    public final Account mo8235a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
            this.f20826a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Account account = obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return account;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f20826a;
    }
}
