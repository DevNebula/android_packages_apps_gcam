package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ies */
public class ies extends hwc {
    /* renamed from: l */
    public final ifi f26512l = new ifi(this);
    /* renamed from: m */
    private final String f26513m;

    public ies(Context context, Looper looper, hus hus, hut hut, String str, hvx hvx) {
        super(context, looper, 23, hvx, hus, hut);
        this.f26513m = str;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo8176a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ifa)) ? new ifa(iBinder) : (ifa) queryLocalInterface;
    }

    /* renamed from: a */
    protected final String mo8177a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    protected final String mo8187b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: k */
    protected final Bundle mo8195k() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f26513m);
        return bundle;
    }
}
