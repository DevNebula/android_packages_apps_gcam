package p000;

import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.social.licenses.LicenseActivity;

/* compiled from: PG */
/* renamed from: kal */
public final class kal implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8539a;
    /* renamed from: b */
    private final /* synthetic */ ScrollView f8540b;
    /* renamed from: c */
    private final /* synthetic */ LicenseActivity f8541c;

    public kal(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.f8541c = licenseActivity;
        this.f8539a = i;
        this.f8540b = scrollView;
    }

    public final void run() {
        TextView textView = (TextView) this.f8541c.findViewById(R.id.license_activity_textview);
        this.f8540b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.f8539a)));
    }
}
