package p000;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: hwf */
public abstract class hwf {
    /* renamed from: a */
    private static final Object f7138a = new Object();
    /* renamed from: b */
    private static hwf f7139b;

    /* renamed from: a */
    public static hwf m3608a(Context context) {
        synchronized (f7138a) {
            if (f7139b == null) {
                f7139b = new hwh(context.getApplicationContext());
            }
        }
        return f7139b;
    }

    /* renamed from: a */
    public final void mo8222a(String str, String str2, ServiceConnection serviceConnection) {
        mo8224b(new hwg(str, str2), serviceConnection);
    }

    /* renamed from: a */
    protected abstract boolean mo8223a(hwg hwg, ServiceConnection serviceConnection);

    /* renamed from: b */
    protected abstract void mo8224b(hwg hwg, ServiceConnection serviceConnection);
}
