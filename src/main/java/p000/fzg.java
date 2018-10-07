package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.android.GoogleCamera.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: fzg */
public final class fzg extends him {
    /* renamed from: a */
    public final List f18922a = khb.m4945b();
    /* renamed from: b */
    public final List f18923b = khb.m4945b();
    /* renamed from: c */
    private final List f18924c = khb.m4945b();
    /* renamed from: d */
    private final List f18925d = khb.m4945b();
    /* renamed from: e */
    private boolean f18926e = true;
    /* renamed from: f */
    private boolean f18927f = true;
    /* renamed from: g */
    private boolean f18928g = true;
    /* renamed from: h */
    private kbg f18929h = kau.f21835a;

    public fzg(Context context) {
        super(context, null, 0, R.style.options_bar_rightside_option);
    }

    /* renamed from: a */
    private final void m11112a() {
        boolean z;
        if (!this.f18928g) {
            z = false;
        } else if (!this.f18927f) {
            z = false;
        } else if (this.f18926e) {
            z = true;
        } else {
            z = false;
        }
        for (fzr a : this.f18923b) {
            a.mo6974a(z);
        }
    }

    protected final void dispatchVisibilityChanged(View view, int i) {
        super.dispatchVisibilityChanged(view, i);
        m11113a(i);
    }

    /* renamed from: a */
    private final void m11113a(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f18928g = z;
        for (fzv a : this.f18924c) {
            a.mo6978a();
        }
        m11112a();
    }

    public final void dispatchWindowVisibilityChanged(int i) {
        super.dispatchWindowVisibilityChanged(i);
        m11113a(i);
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (emn a : this.f18922a) {
            a.mo6334a(configuration);
        }
    }

    /* renamed from: a */
    public final void mo13314a(boolean z) {
        ikd.m12501a();
        this.f18926e = z;
        m11112a();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f18929h.mo9709b() || ((Boolean) this.f18929h.mo9706a()).booleanValue() != z) {
            this.f18929h = kbg.m4804c(Boolean.valueOf(z));
            this.f18927f = z;
            for (fzu a : this.f18925d) {
                a.mo6977a();
            }
            m11112a();
        }
    }
}
