package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
/* renamed from: rj */
final class C0451rj implements OnItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ C0838ri f9621a;

    C0451rj(C0838ri c0838ri) {
        this.f9621a = c0838ri;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f9621a.f25453d.setSelection(i);
        if (this.f9621a.f25453d.getOnItemClickListener() != null) {
            C0838ri c0838ri = this.f9621a;
            c0838ri.f25453d.performItemClick(view, i, c0838ri.f25451b.getItemId(i));
        }
        this.f9621a.mo10860c();
    }
}
