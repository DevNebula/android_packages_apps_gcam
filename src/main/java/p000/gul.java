package p000;

import android.view.View.OnSystemUiVisibilityChangeListener;

/* compiled from: PG */
/* renamed from: gul */
final class gul implements OnSystemUiVisibilityChangeListener {
    /* renamed from: a */
    private final /* synthetic */ guj f6070a;

    gul(guj guj) {
        this.f6070a = guj;
    }

    public final void onSystemUiVisibilityChange(int i) {
        String str = guj.f19622a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("onSystemUiVisibilityChange() ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
        int systemUiVisibility = this.f6070a.f19623b.getDecorView().getSystemUiVisibility();
        guj guj = this.f6070a;
        if ((systemUiVisibility ^ guj.f19625d) != 0 && !guj.f19624c) {
            guj.mo13468a();
        }
    }
}
