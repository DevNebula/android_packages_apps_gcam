package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: eiu */
public final class eiu {
    /* renamed from: a */
    public View f3849a;
    /* renamed from: b */
    public Button f3850b;
    /* renamed from: c */
    public chc f3851c;
    /* renamed from: d */
    public final boolean f3852d;
    /* renamed from: e */
    private OnClickListener f3853e = new eiv(this);

    static {
        bli.m887a("A11yController");
    }

    public eiu(View view, bkw bkw) {
        ikd.m12501a();
        this.f3849a = view;
        this.f3850b = (Button) view.findViewById(R.id.accessibility_burst_button);
        this.f3850b.setOnClickListener(this.f3853e);
        this.f3852d = bkw.mo2005h();
        if (!this.f3852d) {
            this.f3850b.setVisibility(8);
        }
    }
}
