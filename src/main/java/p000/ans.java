package p000;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: ans */
public final class ans implements adq {
    /* renamed from: a */
    private final Context f10605a;

    public ans(Context context) {
        this.f10605a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final agn mo179a(Uri uri) {
        Context context;
        int b = m6916b(uri);
        String authority = uri.getAuthority();
        if (authority.equals(this.f10605a.getPackageName())) {
            context = this.f10605a;
        } else {
            context = m6915a(uri, authority);
        }
        return anr.m14926a(anp.m540a(this.f10605a, context, b, null));
    }

    /* renamed from: a */
    private final Context m6915a(Uri uri, String str) {
        try {
            return this.f10605a.createPackageContext(str, 0);
        } catch (Throwable e) {
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
            stringBuilder.append("Failed to obtain context or unrecognized Uri format for: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    private final int m6916b(Uri uri) {
        String str;
        Integer valueOf;
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str2 = (String) pathSegments.get(0);
            str = (String) pathSegments.get(1);
            valueOf = Integer.valueOf(this.f10605a.getResources().getIdentifier(str, str2, uri.getAuthority()));
        } else if (pathSegments.size() != 1) {
            valueOf = null;
        } else {
            try {
                valueOf = Integer.valueOf((String) pathSegments.get(0));
            } catch (NumberFormatException e) {
                valueOf = null;
            }
        }
        StringBuilder stringBuilder;
        if (valueOf == null) {
            str = String.valueOf(uri);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
            stringBuilder.append("Unrecognized Uri format: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (valueOf.intValue() != 0) {
            return valueOf.intValue();
        } else {
            str = String.valueOf(uri);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
            stringBuilder.append("Failed to obtain resource id for: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
