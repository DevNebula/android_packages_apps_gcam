package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* compiled from: PG */
/* renamed from: nk */
public class C0384nk extends Drawable implements Callback {
    /* renamed from: d */
    public Drawable f9433d;

    public C0384nk(Drawable drawable) {
        Drawable drawable2 = this.f9433d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9433d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f9433d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f9433d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f9433d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9433d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9433d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f9433d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9433d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9433d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9433d.getPadding(rect);
    }

    public int[] getState() {
        return this.f9433d.getState();
    }

    public Region getTransparentRegion() {
        return this.f9433d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f9433d.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f9433d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f9433d.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f9433d.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f9433d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f9433d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f9433d.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f9433d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9433d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f9433d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9433d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f9433d.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0261ha.m3021a(this.f9433d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f9433d.setState(iArr);
    }

    public void setTint(int i) {
        this.f9433d.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9433d.setTintList(colorStateList);
    }

    public void setTintMode(Mode mode) {
        this.f9433d.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f9433d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
