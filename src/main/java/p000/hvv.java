package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvv */
public final class hvv extends hvn {
    /* renamed from: c */
    private final IBinder f24518c;
    /* renamed from: d */
    private final /* synthetic */ hvm f24519d;

    public hvv(hvm hvm, int i, IBinder iBinder, Bundle bundle) {
        this.f24519d = hvm;
        super(hvm, i, bundle);
        this.f24518c = iBinder;
    }

    /* renamed from: a */
    protected final void mo13582a(ConnectionResult connectionResult) {
        hvp hvp = this.f24519d.f7091j;
        if (hvp != null) {
            hvp.mo8202a(connectionResult);
        }
        this.f24519d.mo8181a(connectionResult);
    }

    /* renamed from: b */
    protected final boolean mo13583b() {
        try {
            String interfaceDescriptor = this.f24518c.getInterfaceDescriptor();
            if (this.f24519d.mo8187b().equals(interfaceDescriptor)) {
                IInterface a = this.f24519d.mo8176a(this.f24518c);
                if (a == null || !this.f24519d.mo8186a(2, 3, a)) {
                    return false;
                }
                hvo hvo = this.f24519d.f7090i;
                if (hvo != null) {
                    hvo.f7103a.mo8149a(null);
                }
                return true;
            }
            String valueOf = String.valueOf(this.f24519d.mo8187b());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length());
            stringBuilder.append("service descriptor mismatch: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" vs. ");
            stringBuilder.append(interfaceDescriptor);
            Log.e("GmsClient", stringBuilder.toString());
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
