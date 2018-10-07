package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: hvh */
public final class hvh extends hwl {
    /* renamed from: a */
    public static Account m16260a(hwk hwk) {
        Account account = null;
        if (hwk != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = hwk.mo8235a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Account mo8235a() {
        throw new NoSuchMethodError();
    }
}
