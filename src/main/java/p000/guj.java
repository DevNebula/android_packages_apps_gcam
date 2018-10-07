package p000;

import android.annotation.TargetApi;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: guj */
public final class guj implements emy, eof, eoh, eol, gui {
    /* renamed from: a */
    public static final String f19622a = bli.m887a("SysUiFlag");
    /* renamed from: b */
    public final Window f19623b;
    /* renamed from: c */
    public boolean f19624c = false;
    /* renamed from: d */
    public int f19625d = 1797;
    /* renamed from: e */
    public OnSystemUiVisibilityChangeListener f19626e = new gul(this);

    public guj(ikd ikd, Window window) {
        this.f19623b = window;
        ikd.execute(new guk(this, window));
    }

    /* renamed from: a */
    public final void mo7458a(int i) {
        String str = f19622a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Applying sys ui flag: ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
        this.f19625d = i;
        this.f19623b.getDecorView().setSystemUiVisibility(i);
    }

    /* renamed from: g */
    public final void mo6368g() {
        this.f19624c = true;
    }

    /* renamed from: h */
    public final void mo6370h() {
        this.f19624c = false;
        mo13468a();
    }

    /* renamed from: a */
    public final void mo6345a(boolean z) {
        String str = f19622a;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("onWindowFocusChanged() ");
        stringBuilder.append(z);
        bli.m888a(str, stringBuilder.toString());
        if (!this.f19624c && z) {
            mo13468a();
        }
    }

    /* renamed from: a */
    public final void mo13468a() {
        if (this.f19625d != -1 && !this.f19624c) {
            String str = f19622a;
            int i = this.f19625d;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Reapplying sys ui flag: ");
            stringBuilder.append(i);
            bli.m888a(str, stringBuilder.toString());
            this.f19623b.getDecorView().setSystemUiVisibility(this.f19625d);
        }
    }
}
