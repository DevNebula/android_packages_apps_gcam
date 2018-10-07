package p000;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csa */
final class csa implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2840a;

    csa(crw crw) {
        this.f2840a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2840a.f2819c;
        if (crx != null) {
            cfk cfk = crx.f2836a;
            cre a = cfk.f23056D.mo5754a();
            if (a != cre.f2792c) {
                kbg j = a.mo5692e().mo6544j();
                if (j.mo9709b()) {
                    Context context = cfk.f23170e;
                    ListView listView = (ListView) LayoutInflater.from(context).inflate(R.layout.details_list, null, false);
                    listView.setAdapter(new ebp(context, (cqd) j.mo9706a()));
                    new Builder(context, 16974546).setTitle(R.string.details).setView(listView).setPositiveButton(R.string.close, new ebo()).create().show();
                    cfk.f23069Q.mo8895a(cfk.m15209c(a), 5, cfk.m15202b(a));
                }
            }
        }
    }
}
