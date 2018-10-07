package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: clk */
final class clk implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ cli f2310a;

    clk(cli cli) {
        this.f2310a = cli;
    }

    public final void onClick(View view) {
        cli cli = this.f2310a;
        if (!cli.f2304f) {
            if (cli.f2302d) {
                cli.mo2356a();
                return;
            }
            cli.f2302d = true;
            cli.mo2359c();
            cli.f2303e.setVisibility(0);
            cli.f2301c.setVisibility(0);
            cli.f2301c.setAlpha(0.0f);
            cli.mo2357a(cli.f2302d);
        }
    }
}
