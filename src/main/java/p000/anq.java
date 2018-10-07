package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: anq */
public abstract class anq implements agi, agn {
    /* renamed from: a */
    public final Drawable f10604a;

    public anq(Drawable drawable) {
        this.f10604a = (Drawable) aqe.m610a((Object) drawable, "Argument must not be null");
    }

    /* renamed from: f */
    public final Drawable mo262b() {
        ConstantState constantState = this.f10604a.getConstantState();
        if (constantState == null) {
            return this.f10604a;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    public void mo257a() {
        Drawable drawable = this.f10604a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof any) {
            ((any) drawable).mo12285b().prepareToDraw();
        }
    }
}
