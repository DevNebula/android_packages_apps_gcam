package p000;

import android.support.p002v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
/* renamed from: ly */
public final class C0364ly implements OnItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ AlertController f9188a;
    /* renamed from: b */
    private final /* synthetic */ C0363lx f9189b;

    public C0364ly(C0363lx c0363lx, AlertController alertController) {
        this.f9189b = c0363lx;
        this.f9188a = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f9189b.f9186i.onClick(this.f9188a.f614b, i);
        this.f9188a.f614b.dismiss();
    }
}
