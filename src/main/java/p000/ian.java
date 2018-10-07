package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: ian */
final class ian extends iak {
    /* renamed from: a */
    private final ici f24541a;

    public ian(ici ici) {
        this.f24541a = ici;
    }

    /* renamed from: a */
    public final void mo8309a(int i, Bundle bundle, int i2, Intent intent) {
        this.f24541a.mo8364a(new ift(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
    }
}
