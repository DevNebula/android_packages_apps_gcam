package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hyo */
final class hyo extends hyw {
    /* renamed from: a */
    public final /* synthetic */ Intent f26692a;
    /* renamed from: b */
    public final /* synthetic */ htl f26693b = null;
    /* renamed from: c */
    public final /* synthetic */ htl f26694c = null;
    /* renamed from: d */
    public final /* synthetic */ Activity f26695d;
    /* renamed from: i */
    private final /* synthetic */ Bitmap f26696i = null;
    /* renamed from: j */
    private final /* synthetic */ List f26697j;
    /* renamed from: k */
    private final /* synthetic */ WeakReference f26698k;
    /* renamed from: l */
    private final /* synthetic */ File f26699l;

    hyo(hyn hyn, huq huq, Intent intent, Bitmap bitmap, htl htl, htl htl2, Activity activity, List list, WeakReference weakReference, File file) {
        this.f26692a = intent;
        this.f26695d = activity;
        this.f26697j = list;
        this.f26698k = weakReference;
        this.f26699l = file;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    static /* synthetic */ void m18361a(hyo hyo, GoogleHelp googleHelp, long j) {
        List list = hyo.f26697j;
        huq huq = (huq) hyo.f26698k.get();
        if (huq == null) {
            Pair create = Pair.create("gms:googlehelp:async_help_psd_failure", "null_api_client");
            Pair create2 = Pair.create("gms:feedback:async_feedback_psd_failure", "null_api_client");
            Pair create3 = Pair.create("gms:feedback:async_feedback_psbd_failure", "null_api_client");
            if (list == null) {
                list = new ArrayList(3);
            }
            list.add(create);
            list.add(create2);
            list.add(create3);
        } else {
            hyn.m12267a(huq, googleHelp, hyo.f26693b, hyo.f26694c, hyo.f26699l, j);
        }
        googleHelp.f23477a = htl.m3453a(list);
        if (hyo.f26693b != null) {
            googleHelp.f23481e = true;
        }
        if (hyo.f26694c != null) {
            googleHelp.f23482f = true;
        }
    }

    /* renamed from: a */
    protected final void mo15551a(hyy hyy) {
        Parcel obtain;
        Parcel obtain2;
        try {
            GoogleHelp googleHelp = (GoogleHelp) this.f26692a.getParcelableExtra("EXTRA_GOOGLE_HELP");
            Bitmap bitmap = this.f26696i;
            hyl hyp = new hyp(this);
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            }
            if (bitmap == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            }
            obtain.writeStrongBinder(hyp.asBinder());
            hyy.f7192a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            mo13624c(hyn.f20836a);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
