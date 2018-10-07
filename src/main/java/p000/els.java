package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: els */
public final class els extends hdz {
    /* renamed from: a */
    public int f17546a;
    /* renamed from: b */
    public final elu[] f17547b;
    /* renamed from: i */
    private View f17548i;
    /* renamed from: j */
    private TextView f17549j;
    /* renamed from: k */
    private TextView f17550k;
    /* renamed from: l */
    private Button f17551l;

    public els(Context context, int i, hea hea) {
        super(context, R.layout.photosphere_tutorial, hea);
        this.f17547b = new elu[]{new elu(i)};
    }

    /* renamed from: a */
    final void mo13162a(int i) {
        this.f17548i.findViewById(R.id.slide_1).setVisibility(8);
        elu elu = this.f17547b[i];
        this.f17548i.findViewById(R.id.slide_1).setVisibility(0);
        this.f17549j.setText(elu.f4177a);
        this.f17550k.setText(R.string.keep_the_camera_centered);
        this.f17551l.setText(R.string.photosphere_tutorial_ok_got_it);
        this.f17546a = i;
    }

    /* renamed from: a */
    protected final void mo7756a(View view) {
        this.f17548i = view;
        this.f17549j = (TextView) this.f17548i.findViewById(R.id.photosphere_tutorial_title);
        this.f17550k = (TextView) view.findViewById(R.id.photosphere_tutorial_body);
        this.f17551l = (Button) this.f17548i.findViewById(R.id.next_button);
        this.f17551l.setOnClickListener(new elt(this));
        mo13162a(0);
    }
}
