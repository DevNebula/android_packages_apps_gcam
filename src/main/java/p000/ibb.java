package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbgo;
import com.google.android.gms.internal.zzbgq;

/* renamed from: ibb */
public final class ibb extends hwc implements iau {
    /* renamed from: l */
    private final boolean f26508l;
    /* renamed from: m */
    private final hvx f26509m;
    /* renamed from: n */
    private final Bundle f26510n;
    /* renamed from: o */
    private Integer f26511o;

    public ibb(Context context, Looper looper, hvx hvx, hus hus, hut hut) {
        iav iav = hvx.f7117g;
        Integer num = hvx.f7118h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hvx.f7111a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (iav != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", iav.f7249b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", iav.f7250c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", iav.f7251d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", iav.f7252e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", iav.f7253f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", iav.f7254g);
            Long l = iav.f7255h;
            Long l2 = iav.f7256i;
        }
        this(context, looper, hvx, bundle, hus, hut);
    }

    /* renamed from: a */
    protected final String mo8177a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    protected final String mo8187b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: f */
    public final boolean mo8191f() {
        return this.f26508l;
    }

    /* renamed from: i */
    public final void mo14964i() {
        mo8182a(new hvu(this));
    }

    private ibb(Context context, Looper looper, hvx hvx, Bundle bundle, hus hus, hut hut) {
        super(context, looper, 44, hvx, hus, hut);
        this.f26508l = true;
        this.f26509m = hvx;
        this.f26510n = bundle;
        this.f26511o = hvx.f7118h;
    }

    /* renamed from: A_ */
    public final void mo14961A_() {
        Parcel obtain;
        Parcel obtain2;
        try {
            iba iba = (iba) mo8200p();
            int intValue = this.f26511o.intValue();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeInt(intValue);
            iba.f7259a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo14962a(hwk hwk, boolean z) {
        Parcel obtain;
        Parcel obtain2;
        try {
            iba iba = (iba) mo8200p();
            int intValue = this.f26511o.intValue();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeStrongBinder(hwk != null ? hwk.asBinder() : null);
            obtain.writeInt(intValue);
            obtain.writeInt(z);
            iba.f7259a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo14963a(iay iay) {
        IBinder iBinder = null;
        htl.m3489b((Object) iay, (Object) "Expecting a valid ISignInCallbacks");
        Parcel obtain;
        Parcel obtain2;
        try {
            GoogleSignInAccount a;
            Account account = this.f26509m.f7111a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                hte a2 = hte.m3426a(this.f7084c);
                a = a2.mo8111a(a2.mo8113c("defaultGoogleSignInAccount"));
            } else {
                a = null;
            }
            zzad zzad = new zzad(account, this.f26511o.intValue(), a);
            iba iba = (iba) mo8200p();
            zzbgo zzbgo = new zzbgo(zzad);
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeInt(1);
            zzbgo.writeToParcel(obtain, 0);
            if (iay != null) {
                iBinder = iay.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            iba.f7259a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                iay.mo8314a(new zzbgq());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: k */
    protected final Bundle mo8195k() {
        if (!this.f7084c.getPackageName().equals(this.f26509m.f7115e)) {
            this.f26510n.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f26509m.f7115e);
        }
        return this.f26510n;
    }
}
