package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.C0315jm;
import p000.C0382ni;
import p000.C0413ph;
import p000.C0540vk;
import p000.C0736ot;

/* compiled from: PG */
/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements SelectionBoundsAdjuster, C0413ph {
    /* renamed from: a */
    public C0736ot f10524a;
    /* renamed from: b */
    public ImageView f10525b;
    /* renamed from: c */
    public boolean f10526c;
    /* renamed from: d */
    public boolean f10527d;
    /* renamed from: e */
    public boolean f10528e;
    /* renamed from: f */
    private ImageView f10529f;
    /* renamed from: g */
    private RadioButton f10530g;
    /* renamed from: h */
    private TextView f10531h;
    /* renamed from: i */
    private CheckBox f10532i;
    /* renamed from: j */
    private TextView f10533j;
    /* renamed from: k */
    private ImageView f10534k;
    /* renamed from: l */
    private LinearLayout f10535l;
    /* renamed from: m */
    private Drawable f10536m;
    /* renamed from: n */
    private int f10537n;
    /* renamed from: o */
    private Context f10538o;
    /* renamed from: p */
    private Drawable f10539p;
    /* renamed from: q */
    private LayoutInflater f10540q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0540vk a = C0540vk.m6109a(getContext(), attributeSet, C0382ni.f9323bC, i, 0);
        this.f10536m = a.mo11390b(C0382ni.f9324bD);
        this.f10537n = a.mo11399g(C0382ni.f9325bE, -1);
        this.f10526c = a.mo11388a(C0382ni.f9326bF, false);
        this.f10538o = context;
        this.f10539p = a.mo11390b(C0382ni.f9327bG);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f10527d = obtainStyledAttributes.hasValue(0);
        a.f9927b.recycle();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m6843a(View view, int i) {
        LinearLayout linearLayout = this.f10535l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f10525b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f10525b.getLayoutParams();
            rect.top = (layoutParams.bottomMargin + (this.f10525b.getHeight() + layoutParams.topMargin)) + rect.top;
        }
    }

    /* renamed from: c */
    private final LayoutInflater m6844c() {
        if (this.f10540q == null) {
            this.f10540q = LayoutInflater.from(getContext());
        }
        return this.f10540q;
    }

    /* renamed from: a */
    public final C0736ot mo10857a() {
        return this.f10524a;
    }

    /* renamed from: a */
    public final void mo10858a(C0736ot c0736ot) {
        int i;
        int i2;
        int i3 = 8;
        this.f10524a = c0736ot;
        if (c0736ot.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        CharSequence a = c0736ot.mo14346a((C0413ph) this);
        if (a != null) {
            this.f10531h.setText(a);
            if (this.f10531h.getVisibility() != 0) {
                this.f10531h.setVisibility(0);
            }
        } else if (this.f10531h.getVisibility() != 8) {
            this.f10531h.setVisibility(8);
        }
        boolean isCheckable = c0736ot.isCheckable();
        if (!(!isCheckable && this.f10530g == null && this.f10532i == null)) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f10524a.mo14356f()) {
                if (this.f10530g == null) {
                    this.f10530g = (RadioButton) m6844c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    m6843a(this.f10530g, -1);
                }
                compoundButton = this.f10530g;
                compoundButton2 = this.f10532i;
            } else {
                if (this.f10532i == null) {
                    this.f10532i = (CheckBox) m6844c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    m6843a(this.f10532i, -1);
                }
                compoundButton = this.f10532i;
                compoundButton2 = this.f10530g;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.f10524a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f10532i;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f10530g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
        boolean h = c0736ot.mo14370h();
        c0736ot.mo14349b();
        if (!h) {
            i2 = 8;
        } else if (this.f10524a.mo14370h()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            TextView textView = this.f10533j;
            C0736ot c0736ot2 = this.f10524a;
            char b = c0736ot2.mo14349b();
            if (b == 0) {
                a = "";
            } else {
                Resources resources = c0736ot2.f22209d.f22176a.getResources();
                StringBuilder stringBuilder = new StringBuilder();
                if (ViewConfiguration.get(c0736ot2.f22209d.f22176a).hasPermanentMenuKey()) {
                    stringBuilder.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (c0736ot2.f22209d.mo14324g()) {
                    i = c0736ot2.f22208c;
                } else {
                    i = c0736ot2.f22207b;
                }
                C0736ot.m14528a(stringBuilder, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0736ot.m14528a(stringBuilder, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0736ot.m14528a(stringBuilder, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0736ot.m14528a(stringBuilder, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0736ot.m14528a(stringBuilder, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0736ot.m14528a(stringBuilder, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                switch (b) {
                    case 8:
                        stringBuilder.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        break;
                    case 10:
                        stringBuilder.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        break;
                    case ' ':
                        stringBuilder.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        break;
                    default:
                        stringBuilder.append(b);
                        break;
                }
                a = stringBuilder.toString();
            }
            textView.setText(a);
        }
        if (this.f10533j.getVisibility() != i2) {
            this.f10533j.setVisibility(i2);
        }
        Drawable icon = c0736ot.getIcon();
        isCheckable = this.f10528e;
        if (isCheckable || this.f10526c) {
            ImageView imageView = this.f10529f;
            if (!(imageView == null && icon == null && !this.f10526c)) {
                if (imageView == null) {
                    this.f10529f = (ImageView) m6844c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    m6843a(this.f10529f, 0);
                }
                if (icon != null || this.f10526c) {
                    Drawable drawable;
                    ImageView imageView2 = this.f10529f;
                    if (isCheckable) {
                        drawable = icon;
                    } else {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f10529f.getVisibility() != 0) {
                        this.f10529f.setVisibility(0);
                    }
                } else {
                    this.f10529f.setVisibility(8);
                }
            }
        }
        setEnabled(c0736ot.isEnabled());
        h = c0736ot.hasSubMenu();
        ImageView imageView3 = this.f10534k;
        if (imageView3 != null) {
            if (h) {
                i3 = 0;
            }
            imageView3.setVisibility(i3);
        }
        setContentDescription(c0736ot.getContentDescription());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C0315jm.m4614a((View) this, this.f10536m);
        this.f10531h = (TextView) findViewById(R.id.title);
        int i = this.f10537n;
        if (i != -1) {
            this.f10531h.setTextAppearance(this.f10538o, i);
        }
        this.f10533j = (TextView) findViewById(R.id.shortcut);
        this.f10534k = (ImageView) findViewById(R.id.submenuarrow);
        ImageView imageView = this.f10534k;
        if (imageView != null) {
            imageView.setImageDrawable(this.f10539p);
        }
        this.f10525b = (ImageView) findViewById(R.id.group_divider);
        this.f10535l = (LinearLayout) findViewById(R.id.content);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f10529f != null && this.f10526c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f10529f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    public final boolean mo10859b() {
        return false;
    }
}
