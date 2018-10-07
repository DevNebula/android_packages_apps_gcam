package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.GoogleCamera.R;
import java.lang.reflect.Method;
import p000.C0389np;
import p000.C0430qk;
import p000.C0486sy;
import p000.C0534vc;
import p000.C0535vd;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.SearchView */
public final class SearchView extends C0486sy implements C0389np {
    /* renamed from: a */
    public static final C0534vc f10591a = new C0534vc();

    /* compiled from: PG */
    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public class SearchAutoComplete extends C0430qk {
        /* renamed from: a */
        public boolean f10588a;
        /* renamed from: b */
        private int f10589b;
        /* renamed from: c */
        private final Runnable f10590c;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f10590c = new C0535vd(this);
            this.f10589b = getThreshold();
        }

        public boolean enoughToFilter() {
            return this.f10589b <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f10588a) {
                removeCallbacks(this.f10590c);
                post(this.f10590c);
            }
            return onCreateInputConnection;
        }

        protected void onFinishInflate() {
            int i = 160;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 >= 600) {
                i = 192;
            } else if (i2 >= 640 && i3 >= 480) {
                i = 192;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView.m6888d();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        SearchView searchView = null;
                        searchView.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                        this.f10588a = false;
                        removeCallbacks(this.f10590c);
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z) {
                SearchView searchView = null;
                if (searchView.hasFocus() && getVisibility() == 0) {
                    this.f10588a = true;
                    if (SearchView.m6887a(getContext())) {
                        Method method = SearchView.f10591a.f9911a;
                        if (method != null) {
                            try {
                                method.invoke(this, new Object[]{Boolean.valueOf(true)});
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f10589b = i;
        }
    }

    public final void clearFocus() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    static boolean m6887a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    public final void mo10755a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final void mo10756b() {
        throw new NoSuchMethodError();
    }

    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    protected final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        throw new NoSuchMethodError();
    }

    protected final Parcelable onSaveInstanceState() {
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    static void m6888d() {
        throw new NoSuchMethodError();
    }

    public final void onWindowFocusChanged(boolean z) {
        throw new NoSuchMethodError();
    }

    public final boolean requestFocus(int i, Rect rect) {
        throw new NoSuchMethodError();
    }
}
