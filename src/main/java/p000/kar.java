package p000;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: kar */
public final class kar extends asc implements kaq {
    public kar(IBinder iBinder) {
        super(iBinder, "com.google.android.systemui.elmyra.IElmyraService");
    }

    /* renamed from: a */
    public final void mo9688a(IBinder iBinder, IBinder iBinder2) {
        Parcel a = mo1768a();
        a.writeStrongBinder(iBinder);
        a.writeStrongBinder(iBinder2);
        mo1770a(1, a);
    }
}
