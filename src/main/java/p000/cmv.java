package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmv */
final class cmv implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2366a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2367b;

    cmv(cmp cmp, Uri uri) {
        this.f2367b = cmp;
        this.f2366a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2367b.f2345a;
        Parcelable parcelable = this.f2366a;
        Intent a = cls.m8445a("android.intent.action.SEND");
        a.putExtra("android.intent.extra.STREAM", parcelable);
        try {
            cmy.f2372a.startActivity(a);
        } catch (ActivityNotFoundException e) {
            cls cls = cmy.f2372a;
            cls.startActivity(Intent.createChooser(a, cls.getResources().getString(R.string.share_to)));
        }
    }
}
