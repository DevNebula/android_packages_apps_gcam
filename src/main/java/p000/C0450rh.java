package p000;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: PG */
/* renamed from: rh */
final class C0450rh implements ListAdapter, SpinnerAdapter {
    /* renamed from: a */
    private SpinnerAdapter f9619a;
    /* renamed from: b */
    private ListAdapter f9620b;

    public C0450rh(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.f9619a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f9620b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof C0537vg) {
            C0537vg c0537vg = (C0537vg) spinnerAdapter;
            if (c0537vg.mo11382a() == null) {
                c0537vg.mo11383b();
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f9620b;
        return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        return spinnerAdapter != null ? spinnerAdapter.getCount() : 0;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        return spinnerAdapter != null ? spinnerAdapter.getDropDownView(i, view, viewGroup) : null;
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        return spinnerAdapter != null ? spinnerAdapter.getItem(i) : null;
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        return spinnerAdapter != null ? spinnerAdapter.getItemId(i) : -1;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f9620b;
        return listAdapter != null ? listAdapter.isEnabled(i) : true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f9619a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
