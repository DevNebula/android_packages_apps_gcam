package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csc */
final class csc implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2842a;

    csc(crw crw) {
        this.f2842a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2842a.f2819c;
        if (crx != null) {
            cre a = crx.mo5714a();
            if (a != cre.f2792c) {
                Intent intent;
                err e = a.mo5692e();
                crx.f2836a.f23069Q.mo8895a(cfk.m15209c(a), 3, cfk.m15202b(a));
                Parcelable parcelable = e.mo6541g().f4384h;
                CharSequence string = crx.f2836a.f23170e.getResources().getString(R.string.share_to);
                if (e.mo6545k().f4343b.f4350g && !e.mo6541g().f4384h.equals(Uri.EMPTY)) {
                    intent = new Intent("android.intent.action.SEND");
                    intent.setType(ixx.PHOTOSPHERE.f7911i);
                    intent.putExtra("android.intent.extra.STREAM", parcelable);
                } else if (e.mo6540f().mo6549b()) {
                    String str = e.mo6541g().f4380d;
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    if (str.startsWith("video/")) {
                        intent2.setType("video/*");
                    } else if (str.startsWith("image/")) {
                        intent2.setType("image/*");
                    } else {
                        String str2 = cfk.f23052a;
                        str = String.valueOf(str);
                        String str3 = "unsupported mimeType ";
                        if (str.length() == 0) {
                            str = new String(str3);
                        } else {
                            str = str3.concat(str);
                        }
                        bli.m898e(str2, str);
                    }
                    intent2.putExtra("android.intent.extra.STREAM", parcelable);
                    intent2.addFlags(1);
                    intent = Intent.createChooser(intent2, string);
                } else {
                    intent = null;
                }
                if (intent != null) {
                    try {
                        crx.f2836a.mo12476b(intent);
                        crx.f2836a.f23191z.mo5712e(false);
                        return;
                    } catch (ActivityNotFoundException e2) {
                        return;
                    }
                }
                return;
            }
            bli.m898e(cfk.f23052a, "Cannot share INVALID node.");
        }
    }
}
