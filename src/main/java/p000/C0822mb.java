package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p001v4.widget.NestedScrollView;
import android.support.p002v7.app.AlertController;
import android.support.p002v7.app.AlertController.RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: mb */
public final class C0822mb extends C0720mv implements DialogInterface {
    /* renamed from: a */
    public final AlertController f25373a = new AlertController(getContext(), this, getWindow());

    public C0822mb(Context context, int i) {
        super(context, C0822mb.m17040a(context, i));
    }

    protected final void onCreate(Bundle bundle) {
        int indexOfChild;
        int i;
        Object obj;
        int i2;
        super.onCreate(bundle);
        AlertController alertController = this.f25373a;
        alertController.f614b.setContentView(alertController.f629q);
        View findViewById = alertController.f615c.findViewById(R.id.parentPanel);
        View findViewById2 = findViewById.findViewById(R.id.topPanel);
        View findViewById3 = findViewById.findViewById(R.id.contentPanel);
        View findViewById4 = findViewById.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.customPanel);
        alertController.f615c.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById5 = viewGroup.findViewById(R.id.topPanel);
        View findViewById6 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById7 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a = AlertController.m432a(findViewById5, findViewById2);
        ViewGroup a2 = AlertController.m432a(findViewById6, findViewById3);
        ViewGroup a3 = AlertController.m432a(findViewById7, findViewById4);
        alertController.f621i = (NestedScrollView) alertController.f615c.findViewById(R.id.scrollView);
        alertController.f621i.setFocusable(false);
        alertController.f621i.setNestedScrollingEnabled(false);
        alertController.f625m = (TextView) a2.findViewById(16908299);
        TextView textView = alertController.f625m;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f621i.removeView(alertController.f625m);
            if (alertController.f617e != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f621i.getParent();
                indexOfChild = viewGroup2.indexOfChild(alertController.f621i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(alertController.f617e, indexOfChild, new LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        alertController.f618f = (Button) a3.findViewById(16908313);
        alertController.f618f.setOnClickListener(alertController.f634v);
        if (TextUtils.isEmpty(null)) {
            alertController.f618f.setVisibility(8);
            indexOfChild = 0;
        } else {
            alertController.f618f.setText(null);
            alertController.f618f.setVisibility(0);
            indexOfChild = 1;
        }
        alertController.f619g = (Button) a3.findViewById(16908314);
        alertController.f619g.setOnClickListener(alertController.f634v);
        if (TextUtils.isEmpty(null)) {
            alertController.f619g.setVisibility(8);
        } else {
            alertController.f619g.setText(null);
            alertController.f619g.setVisibility(0);
            indexOfChild |= 2;
        }
        alertController.f620h = (Button) a3.findViewById(16908315);
        alertController.f620h.setOnClickListener(alertController.f634v);
        if (TextUtils.isEmpty(null)) {
            alertController.f620h.setVisibility(8);
        } else {
            alertController.f620h.setText(null);
            alertController.f620h.setVisibility(0);
            indexOfChild |= 4;
        }
        Context context = alertController.f613a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (indexOfChild == 1) {
                AlertController.m433a(alertController.f618f);
            } else if (indexOfChild == 2) {
                AlertController.m433a(alertController.f619g);
            } else if (indexOfChild == 4) {
                AlertController.m433a(alertController.f620h);
            }
        }
        if (indexOfChild == 0) {
            a3.setVisibility(8);
        }
        if (alertController.f626n != null) {
            a.addView(alertController.f626n, 0, new LayoutParams(-1, -2));
            alertController.f615c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f623k = (ImageView) alertController.f615c.findViewById(16908294);
            if ((TextUtils.isEmpty(alertController.f616d) ^ 1) == 0 || !alertController.f632t) {
                alertController.f615c.findViewById(R.id.title_template).setVisibility(8);
                alertController.f623k.setVisibility(8);
                a.setVisibility(8);
            } else {
                alertController.f624l = (TextView) alertController.f615c.findViewById(R.id.alertTitle);
                alertController.f624l.setText(alertController.f616d);
                Drawable drawable = alertController.f622j;
                if (drawable != null) {
                    alertController.f623k.setImageDrawable(drawable);
                } else {
                    alertController.f624l.setPadding(alertController.f623k.getPaddingLeft(), alertController.f623k.getPaddingTop(), alertController.f623k.getPaddingRight(), alertController.f623k.getPaddingBottom());
                    alertController.f623k.setVisibility(8);
                }
            }
        }
        Object obj2 = viewGroup != null ? viewGroup.getVisibility() != 8 ? 1 : null : null;
        if (a == null) {
            i = 0;
        } else if (a.getVisibility() != 8) {
            i = 1;
        } else {
            i = 0;
        }
        if (a3 == null) {
            obj = null;
        } else if (a3.getVisibility() != 8) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null && a2 != null) {
            findViewById = a2.findViewById(R.id.textSpacerNoButtons);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (i != 0) {
            NestedScrollView nestedScrollView = alertController.f621i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (alertController.f617e != null) {
                findViewById = a.findViewById(R.id.titleDividerNoCustom);
            } else {
                findViewById = null;
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        ListView listView = alertController.f617e;
        if (listView instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) listView;
            if (obj == null || i == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i == 0) {
                    i2 = recycleListView.f611a;
                } else {
                    i2 = recycleListView.getPaddingTop();
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (obj == null) {
                    indexOfChild = recycleListView.f612b;
                } else {
                    indexOfChild = recycleListView.getPaddingBottom();
                }
                recycleListView.setPadding(paddingLeft, i2, paddingRight, indexOfChild);
            }
        }
        if (obj2 == null) {
            findViewById = alertController.f617e;
            if (findViewById == null) {
                findViewById2 = alertController.f621i;
            } else {
                findViewById2 = findViewById;
            }
            if (findViewById2 != null) {
                int i3;
                if (obj == null) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                findViewById3 = alertController.f615c.findViewById(R.id.scrollIndicatorUp);
                findViewById4 = alertController.f615c.findViewById(R.id.scrollIndicatorDown);
                C0315jm.m4629d(findViewById2, i3 | i);
                if (findViewById3 != null) {
                    a2.removeView(findViewById3);
                }
                if (findViewById4 != null) {
                    a2.removeView(findViewById4);
                }
            }
        }
        listView = alertController.f617e;
        if (listView != null) {
            ListAdapter listAdapter = alertController.f627o;
            if (listAdapter != null) {
                listView.setAdapter(listAdapter);
                i2 = alertController.f628p;
                if (i2 >= 0) {
                    listView.setItemChecked(i2, true);
                    listView.setSelection(i2);
                }
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        NestedScrollView nestedScrollView = this.f25373a.f621i;
        if (nestedScrollView != null && nestedScrollView.mo12035a(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = false;
        NestedScrollView nestedScrollView = this.f25373a.f621i;
        if (nestedScrollView != null && nestedScrollView.mo12035a(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: a */
    static int m17040a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f25373a.mo1087a(charSequence);
    }
}
