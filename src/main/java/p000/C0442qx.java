package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: qx */
public class C0442qx extends ImageView {
    /* renamed from: a */
    private final C0431ql f9598a;
    /* renamed from: b */
    private final C0441qw f9599b;

    public C0442qx(Context context) {
        this(context, null);
    }

    public C0442qx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0442qx(Context context, AttributeSet attributeSet, int i) {
        super(C0538vh.m6106a(context), attributeSet, i);
        this.f9598a = new C0431ql(this);
        this.f9598a.mo10909a(attributeSet, i);
        this.f9599b = new C0441qw(this);
        this.f9599b.mo10949a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9598a;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0441qw c0441qw = this.f9599b;
        if (c0441qw != null) {
            c0441qw.mo10947a();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f9599b.mo10950b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9598a;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9598a;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0441qw c0441qw = this.f9599b;
        if (c0441qw != null) {
            c0441qw.mo10947a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0441qw c0441qw = this.f9599b;
        if (c0441qw != null) {
            c0441qw.mo10947a();
        }
    }

    public void setImageResource(int i) {
        C0441qw c0441qw = this.f9599b;
        if (c0441qw != null) {
            c0441qw.mo10948a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0441qw c0441qw = this.f9599b;
        if (c0441qw != null) {
            c0441qw.mo10947a();
        }
    }
}
