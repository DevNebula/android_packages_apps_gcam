package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: bcx */
public final class bcx implements geu {
    /* renamed from: a */
    private static final String f11188a = bli.m887a("NewVideoBroadcastTask");
    /* renamed from: b */
    private Uri f11189b;

    public bcx(Uri uri) {
        this.f11189b = uri;
    }

    public final void addFinishedCallback(iqb iqb) {
    }

    public final get getSession() {
        return null;
    }

    public final void process(Context context) {
        String str = f11188a;
        String valueOf = String.valueOf(this.f11189b);
        String str2 = "android.hardware.action.NEW_VIDEO";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 23) + String.valueOf(valueOf).length());
        stringBuilder.append("Sending broadcast: ");
        stringBuilder.append(str2);
        stringBuilder.append(" -> ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        Intent intent = new Intent(str2, this.f11189b);
        intent.addFlags(1073741824);
        intent.addFlags(1);
        context.sendBroadcast(intent);
    }

    public final void removeFinishedCallback(iqb iqb) {
    }

    public final void resume() {
    }

    public final void suspend() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11189b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("NewVideoBroadcastTask{ uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
