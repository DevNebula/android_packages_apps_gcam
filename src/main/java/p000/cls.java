package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.p001v4.view.ViewPager;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.GoogleCamera.R;
import com.google.common.p006io.ByteStreams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: cls */
public final class cls extends DialogFragment implements cmm, csj {
    /* renamed from: a */
    public static final String f12703a = bli.m887a("BurstEditFrag");
    /* renamed from: b */
    public final cno f12704b = new cno();
    /* renamed from: c */
    public cli f12705c;
    /* renamed from: d */
    public gqy f12706d;
    /* renamed from: e */
    public cmn f12707e;
    /* renamed from: f */
    public cop f12708f;
    /* renamed from: g */
    public jbj f12709g = jbj.m13001d();
    /* renamed from: h */
    public volatile cot f12710h;
    /* renamed from: i */
    public final cmy f12711i = new cmy(this);
    /* renamed from: j */
    public cnc f12712j = new cnc(this.f12721s);
    /* renamed from: k */
    public cmp f12713k;
    /* renamed from: l */
    public boolean f12714l = false;
    /* renamed from: m */
    public cme f12715m;
    /* renamed from: n */
    public boolean f12716n;
    /* renamed from: o */
    public csh f12717o;
    /* renamed from: p */
    public acm f12718p;
    /* renamed from: q */
    public irs f12719q;
    /* renamed from: r */
    public cre f12720r;
    /* renamed from: s */
    private final cne f12721s = new cne(this);
    /* renamed from: t */
    private cmh f12722t;

    /* renamed from: b */
    public final void mo12532b() {
        cnc cnc = this.f12712j;
        if (cnc.f2390f) {
            for (int i = 0; i < cnc.f2387c.f710j.mo11186a(); i++) {
                cnf cnf = (cnf) cnc.f2387c.mo1112a(i);
                if (cnf != null) {
                    cnf.mo12543b(true);
                }
            }
        } else {
            bli.m898e(cnc.f2385a, "adjustVisibleSelectionStatesFromController does nothing (BurstEditor has not been created).");
        }
        cmh cmh = this.f12722t;
        int size = this.f12704b.f2399b.size();
        if (size == 0) {
            cmh.f2329a.setTitle(cmh.f2331c.getString(R.string.burst_text));
            cmh.f2329a.setBackground(cmh.f2334f);
            cmh.f2329a.setNavigationIcon(R.drawable.ic_arrow_back);
            cmh.f2329a.setNavigationOnClickListener(new cmi(cmh));
            cmh.mo2376b(((Boolean) cmh.f2332d.mo9715b()).booleanValue() ^ 1);
            cmh.mo2375a(false);
            cmh.mo2377c(false);
        } else if (size == 1) {
            cmh.f2329a.setTitle(Integer.toString(size));
            cmh.f2329a.setBackground(cmh.f2335g);
            cmh.f2329a.setNavigationIcon(R.drawable.ic_cancel);
            cmh.f2329a.setNavigationOnClickListener(new cmj(cmh));
            cmh.mo2376b(false);
            cmh.mo2375a(true);
            cmh.mo2377c(((Boolean) cmh.f2332d.mo9715b()).booleanValue() ^ 1);
        } else {
            cmh.f2329a.setTitle(Integer.toString(size));
        }
    }

    /* renamed from: a */
    public static Intent m8445a(String str) {
        Intent intent = new Intent(str);
        intent.setType("image/*");
        intent.addFlags(1);
        intent.addFlags(ByteStreams.ZERO_COPY_CHUNK_SIZE);
        return intent;
    }

    /* renamed from: c */
    public final cou mo12533c() {
        if (this.f12720r.mo5692e() != null && (this.f12720r.mo5692e() instanceof cou)) {
            return (cou) this.f12720r.mo5692e();
        }
        throw new RuntimeException("Trying to show non-BurstItem item in the burst editor");
    }

    /* renamed from: d */
    final void mo12534d() {
        cno cno = this.f12704b;
        ArrayList arrayList = new ArrayList(cno.f2399b);
        cno.f2399b.clear();
        mo12532b();
    }

    /* renamed from: e */
    public final void mo12535e() {
        mo12534d();
        this.f12704b.f2398a = null;
        if (this.f12717o.f2846c.mo7827b(mo12533c().mo6541g().f4384h) != cre.f2792c) {
            csh csh = this.f12717o;
            err c = mo12533c();
            cre b = csh.f2846c.mo7827b(c.mo6541g().f4384h);
            if (b != cre.f2792c) {
                csh.mo5729a(b);
            } else {
                String valueOf = String.valueOf(c);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found in filmstrip data adapter.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        bli.m891b(f12703a, "Trying to remove an invalid item from the filmstrip");
        dismiss();
    }

    /* renamed from: a */
    public final cot mo12530a(Uri uri) {
        for (cot cot : ((cov) mo12533c().f13139e).mo12885c()) {
            if (cot.f13151c.f13139e.f4384h.equals(uri)) {
                return cot;
            }
        }
        return null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 0;
        if (i == 1) {
            synchronized (this) {
                cmn cmn = this.f12707e;
                if (cmn == null) {
                    bli.m891b(f12703a, "No stack image edit request after edit intent returns.");
                } else {
                    cmn.f2341a.f13151c.f13139e.f4382f.setTime(System.currentTimeMillis());
                    cnc cnc = this.f12712j;
                    cqn cqn = this.f12707e.f2341a;
                    acm acm = this.f12718p;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= cnc.f2387c.f710j.mo11186a()) {
                            break;
                        }
                        if ((cnc.f2388d.f12739e.mo2371a(i4).mo2374a() ^ 1) != 0) {
                            cng cng = (cng) cnc.f2387c.mo1112a(i4);
                            if (cng != null && cng.f23218q.equals(cqn.f13151c.f13139e.f4384h)) {
                                cng.mo14596a(acm, cqn);
                            }
                        }
                        i3 = i4 + 1;
                    }
                    cqn cqn2 = this.f12707e.f2341a;
                    cmp cmp = this.f12713k;
                    eru eru = cqn2.f13151c.f13139e;
                    Uri uri = eru.f4384h;
                    if (uri.equals(uri)) {
                        ImageView imageView = (kvr) cmp.f2356l.get(cqn2.f13151c.f13139e.f4384h);
                        if (imageView != null) {
                            acc.m100b(cmp.f2353i).mo11609a(Drawable.class).mo125a(eru.f4384h).mo124a(new aqg().mo1701a(new ColorDrawable(-16777216)).mo1695a(new are(eru.f4380d, eru.f4382f.getTime(), 0))).mo128a(imageView);
                        }
                    }
                    this.f12707e = null;
                }
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cnc cnc = this.f12712j;
        C0840su c0840su = (C0840su) cnc.f2387c.f711k;
        int a = cnc.m1224a(configuration);
        c0840su.mo15287a(a);
        c0840su.f25466a = new cnd(cnc, a);
        cnc.mo2402a(a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.BurstEditor);
        setHasOptionsMenu(true);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new clu(this, getActivity(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        return layoutInflater.inflate(R.layout.burst_editor, viewGroup, true);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f12714l) {
            this.f12717o.f2846c.mo7837d(mo12533c().mo6541g().f4384h);
        }
    }

    /* renamed from: a */
    public final void mo5731a(int i, cre cre) {
        jbj jbj = this.f12709g;
        this.f12709g = jbj.m13001d();
        jbj.mo13778a((Object) cre);
    }

    /* renamed from: b */
    public final void mo5733b(int i, cre cre) {
        if (cre == this.f12720r) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo5732a(csk csk) {
        this.f12712j.mo2401a();
    }

    /* renamed from: a */
    public final void mo5730a() {
    }

    /* renamed from: f */
    public final void mo2382f() {
        cmp cmp = this.f12713k;
        if (cmp.f2347c) {
            cmp.mo2388a();
        } else {
            dismiss();
        }
    }

    /* renamed from: g */
    public final void mo2383g() {
        List list = this.f12704b.f2399b;
        if (list.size() == mo12533c().mo14825d()) {
            mo12535e();
        } else if (list.size() > 0) {
            mo12531a(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                this.f12706d.mo7363a();
            }
            mo12534d();
        }
        this.f12705c.mo2356a();
    }

    /* renamed from: h */
    public final void mo2384h() {
        mo12534d();
    }

    /* renamed from: i */
    public final void mo2385i() {
        Collection collection = this.f12704b.f2399b;
        if (collection.size() > 0) {
            Intent a;
            if (collection.size() == 1) {
                a = cls.m8445a("android.intent.action.SEND");
                a.putExtra("android.intent.extra.STREAM", (Uri) collection.get(0));
                startActivity(a);
            } else if (collection.size() > 1) {
                a = cls.m8445a("android.intent.action.SEND_MULTIPLE");
                a.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList(collection));
                startActivity(Intent.createChooser(a, getResources().getString(R.string.share_to)));
            }
            mo12534d();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.f12714l) {
            int i;
            this.f12705c = new cli(new clq(this));
            cli cli = this.f12705c;
            cli.f2300b = (FloatingActionButton) view.findViewById(R.id.burst_editor_fab);
            cli.f2303e = (LinearLayout) view.findViewById(R.id.burst_speed_dial);
            cli.f2303e.setVisibility(8);
            cli.f2301c = view.findViewById(R.id.burst_editor_fade_layer);
            cli.f2305g = AnimationUtils.loadInterpolator(cli.f2303e.getContext(), 17563653);
            cli.f2301c.setLayerType(2, null);
            cli.f2303e.setLayerType(2, null);
            cli.mo2355a(jiy.GROUP_SMILES, R.string.creation_group_smiles, R.drawable.ic_insert_emoticon);
            cli.mo2355a(jiy.COLLAGE, R.string.creation_collage, R.drawable.ic_auto_awesome_mix);
            cli.mo2355a(jiy.ANIMATION, R.string.creation_gif, R.drawable.ic_auto_awesome_motion);
            cli.mo2355a(jiy.VFR_VIDEO, R.string.creation_video, R.drawable.ic_auto_awesome_video);
            cli.mo2355a(jiy.PHOTO_BOOTH, R.string.creation_photo_booth, R.drawable.ic_auto_awesome_mix);
            cli.f2300b.setOnClickListener(new clk(cli));
            cli.f2301c.setOnClickListener(new cll(cli));
            cli.mo2359c();
            cli cli2 = this.f12705c;
            clr clt = new clt(this);
            ikd.m12501a();
            cli2.f2308j = clt;
            Resources resources = getResources();
            kbn cmb = new cmb(this);
            Object applicationContext = getActivity().getApplicationContext();
            cmh cmh = new cmh(this, resources, cmb, view);
            cmh.f2335g = new ColorDrawable(cmh.f2331c.getColor(R.color.burst_editor_selected_bg_color));
            cmh.f2329a.setPopupTheme(R.style.Theme.BurstEditor.Toolbar.Popup);
            cmh.f2329a.setTitle(cmh.f2331c.getString(R.string.burst_text));
            cmh.f2329a.setNavigationIcon(R.drawable.ic_arrow_back);
            cmh.f2329a.setNavigationContentDescription(cmh.f2331c.getString(R.string.burst_editor_navigate_up));
            cmh.f2329a.setNavigationOnClickListener(new cmk(cmh));
            cmh.f2329a.inflateMenu(R.menu.burst_editor_toolbar_menu);
            cmh.f2333e = cmh.f2329a.getMenu();
            if (!((Boolean) cmh.f2332d.mo9715b()).booleanValue()) {
                Object obj = cmh.f2333e;
                jri.m13404b(applicationContext);
                jri.m13404b(obj);
                kbg a = axh.m756a(applicationContext, obj, axh.m755a(applicationContext));
                if (a.mo9709b()) {
                    cmh.f2336h = ((MenuItem) a.mo9706a()).getItemId();
                }
            }
            cmh.f2329a.setOnMenuItemClickListener(new cml(cmh));
            cmh.f2334f = cmh.f2329a.getBackground();
            this.f12722t = cmh;
            this.f12704b.f2398a = new cnp(this);
            kbn clv = new clv(this);
            this.f12715m = new cme(this.f12720r);
            cnc cnc = this.f12712j;
            Context activity = getActivity();
            cno cno = this.f12704b;
            cme cme = this.f12715m;
            acm acm = this.f12718p;
            cnc.f2389e = activity;
            cnc.f2387c = (RecyclerView) view.findViewById(R.id.grid_view);
            int a2 = cnc.m1224a(cnc.f2389e.getResources().getConfiguration());
            activity = cnc.f2389e;
            C0517ug c0840su = new C0840su(a2);
            cnc.f2387c.mo1119a(c0840su);
            cnc.f2388d = new cnk(cno, clv, acm, cme, cnc.f2386b);
            RecyclerView recyclerView = cnc.f2387c;
            C0507tx c0507tx = cnc.f2388d;
            C0507tx c0507tx2 = recyclerView.f710j;
            if (c0507tx2 != null) {
                c0507tx2.f9803a.unregisterObserver(recyclerView.f703c);
            }
            recyclerView.mo1169o();
            recyclerView.f705e.mo11166c();
            c0507tx2 = recyclerView.f710j;
            recyclerView.f710j = c0507tx;
            if (c0507tx != null) {
                c0507tx.mo11189a(recyclerView.f703c);
            }
            C0517ug c0517ug = recyclerView.f711k;
            if (c0517ug != null) {
                c0517ug.mo11274u();
            }
            C0524up c0524up = recyclerView.f704d;
            C0507tx c0507tx3 = recyclerView.f710j;
            c0524up.mo11290a();
            C0522un b = c0524up.mo11294b();
            if (c0507tx2 != null) {
                b.f9837b--;
            }
            if (b.f9837b == 0) {
                for (i = 0; i < b.f9836a.size(); i++) {
                    ((C0523uo) b.f9836a.valueAt(i)).f9838a.clear();
                }
            }
            if (c0507tx3 != null) {
                b.f9837b++;
            }
            recyclerView.f662A.f9860f = true;
            recyclerView.mo1129b(false);
            recyclerView.requestLayout();
            c0840su.f25466a = new cnd(cnc, a2);
            cnc.mo2402a(a2);
            cnc.f2390f = true;
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.grid_view);
            cmp cmp = this.f12713k;
            ViewGroup viewGroup = (ViewGroup) view;
            Context activity2 = getActivity();
            cmp.f2349e = viewGroup;
            cmp.f2350f = recyclerView2;
            cmp.f2357m = (ViewPager) viewGroup.findViewById(R.id.pager);
            cmp.f2357m.mo1059a(new C0324jy());
            cmp.f2354j = viewGroup.findViewById(R.id.share_icons);
            cmp.f2357m.mo1058a(new cmq(cmp));
            cmp.mo2389a(8);
            ViewGroup viewGroup2 = cmp.f2357m;
            C0314jl cmz = new cmz(cmp);
            C0314jl c0314jl = viewGroup2.f590d;
            if (c0314jl != null) {
                c0314jl.setViewPagerObserver(null);
                viewGroup2.f590d.startUpdate(viewGroup2);
                for (i = 0; i < viewGroup2.f589c.size(); i++) {
                    C0321ju c0321ju = (C0321ju) viewGroup2.f589c.get(i);
                    viewGroup2.f590d.destroyItem(viewGroup2, c0321ju.f8346b, c0321ju.f8345a);
                }
                viewGroup2.f590d.finishUpdate(viewGroup2);
                viewGroup2.f589c.clear();
                i = 0;
                while (i < viewGroup2.getChildCount()) {
                    if (!((C0322jv) viewGroup2.getChildAt(i).getLayoutParams()).f8360a) {
                        viewGroup2.removeViewAt(i);
                        i--;
                    }
                    i++;
                }
                viewGroup2.f591e = 0;
                viewGroup2.scrollTo(0, 0);
            }
            viewGroup2.f590d = cmz;
            viewGroup2.f588b = 0;
            if (viewGroup2.f590d != null) {
                if (viewGroup2.f595i == null) {
                    viewGroup2.f595i = new C0325jz(viewGroup2);
                }
                viewGroup2.f590d.setViewPagerObserver(viewGroup2.f595i);
                viewGroup2.f596j = false;
                boolean z = viewGroup2.f597k;
                viewGroup2.f597k = true;
                viewGroup2.f588b = viewGroup2.f590d.getCount();
                if (viewGroup2.f592f >= 0) {
                    viewGroup2.f590d.restoreState(viewGroup2.f593g, viewGroup2.f594h);
                    viewGroup2.mo1057a(viewGroup2.f592f, false, true);
                    viewGroup2.f592f = -1;
                    viewGroup2.f593g = null;
                    viewGroup2.f594h = null;
                } else if (z) {
                    viewGroup2.requestLayout();
                } else {
                    viewGroup2.mo1063b();
                }
            }
            cmp.f2353i = activity2;
            cmp.f2357m.mo1058a(new cmr(cmp));
            return;
        }
        view.post(new clz(this));
    }

    /* renamed from: a */
    public final void mo12531a(List list) {
        List arrayList = new ArrayList();
        for (Uri a : list) {
            cot a2 = mo12530a(a);
            if (a2 != null) {
                arrayList.add(a2);
                if (((cov) mo12533c().f13139e).mo12885c().indexOf(a2) >= 0) {
                    ((cov) mo12533c().f13139e).mo12883a(a2);
                }
            }
        }
        this.f12710h = mo12533c().mo14824b();
        this.f12712j.mo2401a();
        cmp cmp = this.f12713k;
        for (int i = 0; i < cmp.f2346b.size(); i++) {
            if (list.contains(((cot) cmp.f2346b.get(i)).f13151c.f13139e.f4384h)) {
                cmp.f2346b.remove(i);
            }
        }
        cmp.f2357m.f590d.notifyDataSetChanged();
        Executor newSingleThreadExecutor = Executors.newSingleThreadExecutor(iel.m3778c("BurstDelete", 0));
        jli.m13190a(newSingleThreadExecutor, new cly(arrayList)).mo9275a(new ikd(), new clx(this, newSingleThreadExecutor)).mo9283b(new ikd(), new clw()).mo9282a(izw.f21401a);
    }
}
