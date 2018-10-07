package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: hys */
final class hys extends hyw {
    /* renamed from: a */
    private final /* synthetic */ Bundle f26703a;
    /* renamed from: b */
    private final /* synthetic */ long f26704b;
    /* renamed from: c */
    private final /* synthetic */ GoogleHelp f26705c;

    hys(huq huq, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f26703a = bundle;
        this.f26704b = j;
        this.f26705c = googleHelp;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final void mo15551a(hyy hyy) {
        Parcel obtain;
        try {
            Bundle bundle = this.f26703a;
            long j = this.f26704b;
            GoogleHelp googleHelp = this.f26705c;
            hyl hyt = new hyt(this);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (bundle == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            }
            obtain.writeLong(j);
            if (googleHelp == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            }
            obtain.writeStrongBinder(hyt.asBinder());
            hyy.f7192a.transact(9, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            mo13624c(hyn.f20836a);
        } catch (Throwable th) {
            obtain.recycle();
        }
    }
}
