package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: hte */
public final class hte {
    /* renamed from: a */
    private static final Lock f7002a = new ReentrantLock();
    /* renamed from: b */
    private static hte f7003b;
    /* renamed from: c */
    private final Lock f7004c = new ReentrantLock();
    /* renamed from: d */
    private final SharedPreferences f7005d;

    private hte(Context context) {
        this.f7005d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static hte m3426a(Context context) {
        htl.m3488b((Object) context);
        f7002a.lock();
        try {
            if (f7003b == null) {
                f7003b = new hte(context.getApplicationContext());
            }
            hte hte = f7003b;
            return hte;
        } finally {
            f7002a.unlock();
        }
    }

    /* renamed from: a */
    private static String m3427a(String str, String str2) {
        String valueOf = String.valueOf(":");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo8111a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (TextUtils.isEmpty(str)) {
            return googleSignInAccount;
        }
        String c = mo8113c(hte.m3427a("googleSignInAccount", str));
        if (c == null) {
            return googleSignInAccount;
        }
        try {
            return GoogleSignInAccount.m15356a(c);
        } catch (JSONException e) {
            return googleSignInAccount;
        }
    }

    /* renamed from: b */
    public final GoogleSignInOptions mo8112b(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (TextUtils.isEmpty(str)) {
            return googleSignInOptions;
        }
        String c = mo8113c(hte.m3427a("googleSignInOptions", str));
        if (c == null) {
            return googleSignInOptions;
        }
        try {
            return GoogleSignInOptions.m15358a(c);
        } catch (JSONException e) {
            return googleSignInOptions;
        }
    }

    /* renamed from: c */
    public final String mo8113c(String str) {
        this.f7004c.lock();
        try {
            String string = this.f7005d.getString(str, null);
            return string;
        } finally {
            this.f7004c.unlock();
        }
    }
}
