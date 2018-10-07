package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* renamed from: huf */
public class huf {
    /* renamed from: a */
    private static huf f7039a;
    /* renamed from: b */
    private final Context f7040b;

    private huf(Context context) {
        this.f7040b = context.getApplicationContext();
        iad.f7237a.mo8300a(this.f7040b);
    }

    /* renamed from: a */
    public static huf m3525a(Context context) {
        htl.m3488b((Object) context);
        synchronized (huf.class) {
            if (f7039a == null) {
                hwz.m3631a(context);
                f7039a = new huf(context);
            }
        }
        return f7039a;
    }

    /* renamed from: a */
    static hxa m3526a(PackageInfo packageInfo, hxa... hxaArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length == 1) {
            hxb hxb = new hxb(packageInfo.signatures[0].toByteArray());
            while (i < hxaArr.length) {
                if (hxaArr[i].equals(hxb)) {
                    return hxaArr[i];
                }
                i++;
            }
            return null;
        }
        Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        return null;
    }
}
