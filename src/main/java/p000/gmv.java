package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gmv */
public final class gmv implements glq {
    /* renamed from: c */
    private static final String f19353c = bli.m887a("Photos1UpLauncher");
    /* renamed from: a */
    public final Set f19354a = new HashSet();
    /* renamed from: b */
    public final Map f19355b = new HashMap();

    /* renamed from: a */
    public final void mo7205a(Uri uri) {
    }

    /* renamed from: a */
    public final void mo7204a(Bitmap bitmap, int i) {
    }

    /* renamed from: a */
    public final void mo7210a(Uri uri, List list) {
        if (this.f19354a.contains(uri)) {
            String str = f19353c;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("thumbnail not updated as of yet for uri ");
            stringBuilder.append(valueOf);
            bli.m894c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo7209a(Uri uri, hec hec, boolean z) {
    }

    /* renamed from: b */
    public final void mo7212b(Uri uri) {
    }

    /* renamed from: a */
    public final void mo7211a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo7206a(Uri uri, int i) {
    }

    /* renamed from: a */
    public final void mo7208a(Uri uri, hec hec) {
    }

    /* renamed from: a */
    public final void mo7207a(Uri uri, glw glw, eqi eqi) {
        String str = f19353c;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
        stringBuilder.append("adding uri to processing items ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        this.f19354a.add(uri);
        if (eqi != null) {
            this.f19355b.put(uri, eqi);
            str = f19353c;
            valueOf = String.valueOf(uri);
            long b = eqi.mo6497b();
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" maps to mediastorerecord ");
            stringBuilder2.append(b);
            bli.m896d(str, stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public final void mo7203a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo7213c(Uri uri) {
        String str = f19353c;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
        stringBuilder.append("removing uri from processing items as we have thumbnail ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        this.f19354a.remove(uri);
    }
}
