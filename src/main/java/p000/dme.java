package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: dme */
public final class dme extends doc {
    /* renamed from: c */
    private static final String f23989c = bli.m887a("VidStateCompleted");
    /* renamed from: d */
    private boolean f23990d;
    /* renamed from: e */
    private Uri f23991e;

    public dme(doc doc, boolean z, Uri uri) {
        super((bug) doc);
        this.f23990d = z;
        this.f23991e = uri;
    }

    /* renamed from: e */
    public final doc mo2150b() {
        if (this.f23990d) {
            Intent intent = new Intent();
            String str = f23989c;
            String valueOf = String.valueOf(this.f23991e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("Current video URI: ");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
            intent.setData(this.f23991e);
            intent.addFlags(1);
            ((doa) mo2152d()).f14232K.mo12467a(intent);
        } else {
            ((doa) mo2152d()).f14232K.mo12465a();
        }
        return null;
    }
}
