package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: hde */
final class hde extends ViewGroup implements AutoCloseable {
    /* renamed from: A */
    private final int f6376A;
    /* renamed from: B */
    private final int f6377B;
    /* renamed from: C */
    private final int f6378C;
    /* renamed from: D */
    private final int f6379D;
    /* renamed from: E */
    private float f6380E = 1.0f;
    /* renamed from: a */
    public final int[] f6381a = new int[2];
    /* renamed from: b */
    public final Paint f6382b = new Paint();
    /* renamed from: c */
    public final int f6383c;
    /* renamed from: d */
    public final List f6384d = Collections.synchronizedList(new ArrayList());
    /* renamed from: e */
    public PopupWindow f6385e;
    /* renamed from: f */
    public boolean f6386f;
    /* renamed from: g */
    public View f6387g;
    /* renamed from: h */
    public int f6388h;
    /* renamed from: i */
    public View f6389i;
    /* renamed from: j */
    public Rect f6390j;
    /* renamed from: k */
    public int f6391k;
    /* renamed from: l */
    public int f6392l;
    /* renamed from: m */
    public boolean f6393m = false;
    /* renamed from: n */
    public final Object f6394n = new Object();
    /* renamed from: o */
    public gbv f6395o;
    /* renamed from: p */
    public TranslateAnimation f6396p;
    /* renamed from: q */
    public boolean f6397q;
    /* renamed from: r */
    public gbw f6398r;
    /* renamed from: s */
    public List f6399s;
    /* renamed from: t */
    private final Path f6400t = new Path();
    /* renamed from: u */
    private final RectF f6401u = new RectF();
    /* renamed from: v */
    private final int f6402v;
    /* renamed from: w */
    private final int f6403w;
    /* renamed from: x */
    private final int f6404x;
    /* renamed from: y */
    private final int f6405y;
    /* renamed from: z */
    private final int f6406z;

    hde(Context context) {
        super(context);
        this.f6403w = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_horizontal_container_padding);
        this.f6402v = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_container_padding);
        this.f6383c = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_movement);
        this.f6404x = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_padding);
        this.f6405y = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_margin);
        this.f6406z = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_offset);
        this.f6379D = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_radius);
        this.f6376A = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_length);
        this.f6377B = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_base_width);
        this.f6378C = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_container_corner_radius);
        int color = C0242ge.getColor(context, R.color.tooltip_background_color);
        int color2 = C0242ge.getColor(context, R.color.tooltip_container_shadow);
        this.f6382b.setStyle(Style.FILL);
        this.f6382b.setColor(color);
        this.f6382b.setAntiAlias(true);
        float f = (float) this.f6406z;
        this.f6382b.setShadowLayer((float) this.f6379D, f, f, color2);
        this.f6386f = true;
        this.f6397q = false;
    }

    public final void close() {
        mo7731a();
        setOnClickListener(null);
        removeAllViews();
        this.f6398r = null;
        this.f6395o = null;
        this.f6384d.clear();
        PopupWindow popupWindow = this.f6385e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f6385e = null;
        this.f6387g = null;
        this.f6389i = null;
        setVisibility(8);
    }

    /* renamed from: a */
    private final void m3132a(Canvas canvas) {
        getLocationOnScreen(this.f6381a);
        canvas.save();
        canvas.translate((float) (this.f6405y - this.f6381a[0]), 0.0f);
        canvas.drawPath(this.f6400t, this.f6382b);
        canvas.restore();
    }

    /* renamed from: b */
    private final Point m3133b() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* renamed from: a */
    public final void mo7731a() {
        PopupWindow popupWindow = this.f6385e;
        if (popupWindow != null) {
            clearAnimation();
            popupWindow.dismiss();
        }
    }

    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f6388h == 2) {
            canvas.translate(0.0f, (float) this.f6376A);
            m3132a(canvas);
        }
        float f = (float) this.f6378C;
        canvas.drawRoundRect(this.f6401u, f, f, this.f6382b);
        if (this.f6388h == 1) {
            m3132a(canvas);
        }
        canvas.restore();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        View view = this.f6387g;
        if (view != null) {
            i5 = this.f6403w;
            i6 = this.f6402v;
            int i9 = this.f6388h;
            if (i9 == 2) {
                i7 = this.f6376A;
            } else {
                i7 = 0;
            }
            i8 = i6 + i7;
            int i10 = (i3 - i) - i5;
            i6 = (i4 - i2) - i6;
            if (i9 == 1) {
                i7 = this.f6376A;
            } else {
                i7 = 0;
            }
            view.layout(i5, i8, i10, i6 - i7);
        }
        Point b = m3133b();
        int i11 = b.x;
        i5 = b.y;
        i7 = this.f6405y;
        i6 = i11 - (i7 + i7);
        Rect rect = this.f6390j;
        i7 = rect.top - i7;
        if (this.f6388h == 2) {
            i7 = ((i5 - rect.top) - rect.height()) - this.f6405y;
        }
        measure(MeasureSpec.makeMeasureSpec(i6, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i7, kvl.UNSET_ENUM_VALUE));
        Rect rect2 = this.f6390j;
        hdk hdk = new hdk(rect2.left, rect2.top, i11);
        PopupWindow popupWindow = this.f6385e;
        if (popupWindow != null) {
            Object obj;
            i11 = this.f6388h;
            if (i11 == 1) {
                i5 = ((-getMeasuredHeight()) - this.f6392l) - this.f6404x;
            } else if (i11 == 2) {
                i5 = (this.f6390j.height() + this.f6392l) + this.f6404x;
            } else {
                i5 = 0;
            }
            i6 = getMeasuredWidth();
            if (C0315jm.m4635j(this) != 1) {
                obj = null;
            } else {
                obj = 1;
            }
            switch (this.f6391k) {
                case 1:
                    if (obj == null) {
                        i11 = hdk.f6414a;
                        break;
                    } else {
                        i11 = (hdk.f6414a + this.f6390j.width()) - i6;
                        break;
                    }
                case 2:
                    i11 = hdk.f6414a - ((getMeasuredWidth() - this.f6390j.width()) / 2);
                    break;
                case 3:
                    if (obj == null) {
                        i11 = (hdk.f6414a + this.f6390j.width()) - i6;
                        break;
                    } else {
                        i11 = hdk.f6414a;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
            i8 = this.f6405y;
            popupWindow.update(Math.min((hdk.f6416c - i8) - i6, Math.max(i8, i11)), i5 + hdk.f6415b, i6, getMeasuredHeight(), true);
        }
        switch (this.f6391k) {
            case 1:
                i7 = this.f6377B;
                i11 = this.f6405y;
                i7 = (i7 / 2) + (i11 + i11);
                break;
            case 2:
                i7 = this.f6390j.width() / 2;
                break;
            case 3:
                i7 = this.f6390j.width();
                i11 = this.f6377B;
                i5 = this.f6405y;
                i7 = (i7 - (i11 / 2)) - (i5 + i5);
                break;
            default:
                i7 = 0;
                break;
        }
        if (C0315jm.m4635j(this) == 1) {
            i7 = this.f6390j.width() - i7;
        }
        i7 += this.f6390j.left;
        this.f6400t.reset();
        i11 = this.f6388h;
        if (i11 == 1) {
            this.f6400t.moveTo((float) ((i7 - this.f6405y) - (this.f6377B / 2)), this.f6401u.bottom);
            this.f6400t.rLineTo((float) this.f6377B, 0.0f);
            this.f6400t.rLineTo((float) ((-this.f6377B) / 2), (float) this.f6376A);
            this.f6400t.rLineTo((float) ((-this.f6377B) / 2), (float) (-this.f6376A));
            this.f6400t.close();
        } else if (i11 == 2) {
            this.f6400t.moveTo((float) ((i7 - this.f6405y) + (this.f6377B / 2)), this.f6401u.top);
            this.f6400t.rLineTo((float) (-this.f6377B), 0.0f);
            this.f6400t.rLineTo((float) (this.f6377B / 2), (float) (-this.f6376A));
            this.f6400t.rLineTo((float) (this.f6377B / 2), (float) this.f6376A);
            this.f6400t.close();
        }
    }

    protected final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f6403w;
        int i4 = this.f6406z;
        size = (size - (i3 + i3)) - i4;
        i3 = this.f6402v;
        size2 = ((size2 - (i3 + i3)) - i4) - this.f6376A;
        i3 = Math.min((int) (((float) m3133b().x) * this.f6380E), size);
        View view = this.f6387g;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec(i3, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(size2, 0));
            if (this.f6387g.getMeasuredHeight() > size2) {
                this.f6387g.measure(MeasureSpec.makeMeasureSpec(size, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(size2, kvl.UNSET_ENUM_VALUE));
            }
        }
        View view2 = this.f6387g;
        if (view2 != null) {
            size = view2.getMeasuredWidth();
            size2 = this.f6403w;
            i3 = this.f6387g.getMeasuredHeight();
            i4 = this.f6402v;
            this.f6401u.set(0.0f, 0.0f, (float) (size + (size2 + size2)), (float) ((i4 + i4) + i3));
        }
        setMeasuredDimension(((int) this.f6401u.width()) + this.f6406z, ((((int) this.f6401u.height()) + this.f6406z) + this.f6376A) + this.f6404x);
    }
}
