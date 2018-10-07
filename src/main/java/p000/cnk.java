package p000;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cnk */
public final class cnk extends C0507tx {
    /* renamed from: c */
    public final cno f12737c;
    /* renamed from: d */
    public final kbn f12738d;
    /* renamed from: e */
    public final cme f12739e;
    /* renamed from: f */
    private final acm f12740f;
    /* renamed from: g */
    private cne f12741g;

    public cnk(cno cno, kbn kbn, acm acm, cme cme, cne cne) {
        this.f12737c = cno;
        this.f12738d = kbn;
        this.f12740f = acm;
        this.f12739e = cme;
        this.f12741g = cne;
        if (this.f9803a.mo11194a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f9804b = true;
    }

    /* renamed from: a */
    public final int mo11186a() {
        return this.f12739e.mo2373b();
    }

    /* renamed from: a */
    public final long mo11187a(int i) {
        long j;
        cmf a = this.f12739e.mo2371a(i);
        cqn cqn = a.f2321a;
        if (cqn == null) {
            j = 0;
        } else {
            int parseInt;
            Uri uri = cqn.f13151c.f13139e.f4384h;
            try {
                parseInt = Integer.parseInt(uri.getLastPathSegment());
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Unexpected URI without a content id: ");
                stringBuilder.append(valueOf);
                bli.m891b("GridFramesAdptr", stringBuilder.toString());
                parseInt = uri.hashCode();
            }
            String uri2 = uri.toString();
            j = (long) (parseInt + uri2.substring(0, uri2.lastIndexOf(47)).hashCode());
        }
        return (j * 31) + ((long) a.f2322b.ordinal());
    }

    /* renamed from: b */
    public final int mo11192b(int i) {
        return this.f12739e.mo2371a(i).mo2374a();
    }

    /* renamed from: a */
    public final void mo11191a(C0530ux c0530ux, int i) {
        cmf a = this.f12739e.mo2371a(i);
        int i2;
        if (a.mo2374a()) {
            cnn cnn = (cnn) c0530ux;
            cmg cmg = a.f2322b;
            int size = this.f12739e.mo2372a().mo12885c().size();
            switch (cmg.ordinal()) {
                case 0:
                    i2 = R.string.burst_editor_section_header_best;
                    break;
                case 1:
                    i2 = R.string.burst_editor_section_header_all;
                    break;
                default:
                    String valueOf = String.valueOf(cmg);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    stringBuilder.append("Using header for an invalid type: ");
                    stringBuilder.append(valueOf);
                    throw new RuntimeException(stringBuilder.toString());
            }
            cnn.f23225p.setText(i2);
            if (cmg == cmg.ALL_ELEMENTS_HEADER) {
                cnn.f23226q.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(size)}));
                cnn.f23226q.setVisibility(0);
                return;
            }
            cnn.f23226q.setVisibility(8);
            return;
        }
        boolean z;
        cng cng = (cng) c0530ux;
        acm acm = this.f12740f;
        if (a.f2321a == this.f12738d.mo9715b()) {
            z = true;
        } else {
            z = false;
        }
        cqn cqn = a.f2321a;
        cng.f23218q = cqn.f13151c.f13139e.f4384h;
        cng.f23219r = a.f2322b;
        cng.mo12543b(false);
        cng.mo14596a(acm, cqn);
        cng.mo14597c(z);
        i2 = a.f2323c;
        BurstImageView burstImageView = cng.f23220s;
        if (burstImageView.f2502a) {
            burstImageView.setContentDescription(burstImageView.getResources().getString(R.string.burst_editor_best_frame_description));
        } else {
            burstImageView.setContentDescription(burstImageView.getResources().getString(R.string.burst_editor_frame_description, new Object[]{Integer.valueOf(i2 + 1)}));
        }
        mo11189a(new cnl(this, cng, a));
    }

    /* renamed from: b */
    public final C0530ux mo11193b(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new cng(this, (FrameLayout) from.inflate(R.layout.burst_editor_grid_imageview, viewGroup, false), this.f12741g);
        }
        if (i == 1) {
            return new cnn((FrameLayout) from.inflate(R.layout.burst_editor_grid_header, viewGroup, false));
        }
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Unknown view type: ");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo11190a(C0530ux c0530ux) {
        if (c0530ux instanceof cnf) {
            ((cnf) c0530ux).mo12543b(false);
        }
    }
}
