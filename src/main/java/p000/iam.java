package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: iam */
final class iam extends iak {
    /* renamed from: a */
    private final /* synthetic */ Context f24538a;
    /* renamed from: b */
    private final /* synthetic */ Uri f24539b;
    /* renamed from: c */
    private final /* synthetic */ iaj f24540c;

    iam(Context context, Uri uri, iaj iaj) {
        this.f24538a = context;
        this.f24539b = uri;
        this.f24540c = iaj;
    }

    /* renamed from: a */
    public final void mo8309a(int i, Bundle bundle, int i2, Intent intent) {
        this.f24538a.revokeUriPermission(this.f24539b, 1);
        this.f24540c.mo8309a(i, bundle, i2, intent);
    }
}
