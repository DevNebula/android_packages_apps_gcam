package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: mv */
public class C0720mv extends Dialog implements C0369me {
    /* renamed from: a */
    private C0370mf f22090a;

    public C0720mv(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        mo14231a().mo10671a(null);
        mo14231a().mo10675a();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo14231a().mo10673a(view, layoutParams);
    }

    public View findViewById(int i) {
        return mo14231a().mo10670a(i);
    }

    /* renamed from: a */
    public final C0370mf mo14231a() {
        if (this.f22090a == null) {
            this.f22090a = new C0713mg(getContext(), getWindow(), this);
        }
        return this.f22090a;
    }

    public void invalidateOptionsMenu() {
        mo14231a().mo10683e();
    }

    protected void onCreate(Bundle bundle) {
        mo14231a().mo10682d();
        super.onCreate(bundle);
        mo14231a().mo10671a(bundle);
    }

    protected void onStop() {
        super.onStop();
        mo14231a().mo10689k();
    }

    /* renamed from: b */
    public final void mo10667b() {
    }

    /* renamed from: c */
    public final void mo10668c() {
    }

    /* renamed from: d */
    public final C0387nn mo10669d() {
        return null;
    }

    public void setContentView(int i) {
        mo14231a().mo10681c(i);
    }

    public void setContentView(View view) {
        mo14231a().mo10672a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo14231a().mo10678b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo14231a().mo10674a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo14231a().mo10674a(charSequence);
    }
}
