package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: hpz */
public final class hpz extends asc implements hpy {
    hpz(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    /* renamed from: a */
    public final void mo8026a(byte[] bArr) {
        Parcel a = mo1768a();
        a.writeByteArray(bArr);
        mo1770a(1, a);
    }

    /* renamed from: a */
    public final void mo8027a(byte[] bArr, hqc hqc) {
        Parcel a = mo1768a();
        a.writeByteArray(bArr);
        ase.m701a(a, (Parcelable) hqc);
        mo1770a(2, a);
    }
}
