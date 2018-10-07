package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: hyu */
final class hyu extends hyw {
    /* renamed from: a */
    private final /* synthetic */ FeedbackOptions f26706a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f26707b;
    /* renamed from: c */
    private final /* synthetic */ long f26708c;
    /* renamed from: d */
    private final /* synthetic */ GoogleHelp f26709d;

    hyu(huq huq, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f26706a = feedbackOptions;
        this.f26707b = bundle;
        this.f26708c = j;
        this.f26709d = googleHelp;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final void mo15551a(hyy hyy) {
        Parcel obtain;
        try {
            FeedbackOptions feedbackOptions = this.f26706a;
            Bundle bundle = this.f26707b;
            long j = this.f26708c;
            GoogleHelp googleHelp = this.f26709d;
            hyl hyv = new hyv(this);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (feedbackOptions == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                feedbackOptions.writeToParcel(obtain, 0);
            }
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
            obtain.writeStrongBinder(hyv.asBinder());
            hyy.f7192a.transact(10, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            mo13624c(hyn.f20836a);
        } catch (Throwable th) {
            obtain.recycle();
        }
    }
}
