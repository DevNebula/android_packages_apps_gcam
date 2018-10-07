package p000;

import android.graphics.Rect;
import android.support.p001v4.app.FragmentTransitionImpl;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: er */
public class C0673er extends FragmentTransitionImpl {
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((C0219ex) obj).mo6629a(view);
        }
    }

    public void addTargets(Object obj, ArrayList arrayList) {
        int i = 0;
        C0219ex c0219ex = (C0219ex) obj;
        if (c0219ex != null) {
            int size;
            if (c0219ex instanceof C0678fh) {
                C0678fh c0678fh = (C0678fh) c0219ex;
                size = c0678fh.f18266p.size();
                while (i < size) {
                    addTargets(c0678fh.mo13241a(i), arrayList);
                    i++;
                }
            } else if (!C0673er.m10016a(c0219ex) && FragmentTransitionImpl.isNullOrEmpty(c0219ex.f4536e)) {
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    c0219ex.mo6629a((View) arrayList.get(size));
                }
            }
        }
    }

    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C0219ex c0219ex = (C0219ex) obj;
        if (!C0225fe.f4723b.contains(viewGroup) && C0315jm.m4649x(viewGroup)) {
            C0225fe.f4723b.add(viewGroup);
            if (c0219ex == null) {
                c0219ex = C0225fe.f4722a;
            }
            C0219ex b = c0219ex.clone();
            ArrayList arrayList = (ArrayList) C0225fe.m2316a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    ((C0219ex) arrayList.get(i)).mo6649c((View) viewGroup);
                    i = i2;
                }
            }
            if (b != null) {
                b.mo6634a(viewGroup, true);
            }
            if (((C0218ew) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                C0225fe.m2317a(viewGroup, b);
                return;
            }
            throw new NoSuchMethodError();
        }
    }

    public boolean canHandle(Object obj) {
        return obj instanceof C0219ex;
    }

    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((C0219ex) obj).clone();
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m10016a(C0219ex c0219ex) {
        return (FragmentTransitionImpl.isNullOrEmpty(c0219ex.f4535d) && FragmentTransitionImpl.isNullOrEmpty(null) && FragmentTransitionImpl.isNullOrEmpty(null)) ? false : true;
    }

    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        C0219ex c0219ex;
        C0219ex c0219ex2 = (C0219ex) obj;
        C0219ex c0219ex3 = (C0219ex) obj2;
        C0219ex c0219ex4 = (C0219ex) obj3;
        if (c0219ex2 == null || c0219ex3 == null) {
            c0219ex = c0219ex2 == null ? c0219ex3 != null ? c0219ex3 : null : c0219ex2;
        } else {
            c0219ex = new C0678fh().mo13242a(c0219ex2).mo13242a(c0219ex3);
            c0219ex.f18267q = false;
        }
        if (c0219ex4 == null) {
            return c0219ex;
        }
        C0678fh c0678fh = new C0678fh();
        if (c0219ex != null) {
            c0678fh.mo13242a(c0219ex);
        }
        c0678fh.mo13242a(c0219ex4);
        return c0678fh;
    }

    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C0678fh c0678fh = new C0678fh();
        if (obj != null) {
            c0678fh.mo13242a((C0219ex) obj);
        }
        if (obj2 != null) {
            c0678fh.mo13242a((C0219ex) obj2);
        }
        if (obj3 != null) {
            c0678fh.mo13242a((C0219ex) obj3);
        }
        return c0678fh;
    }

    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((C0219ex) obj).mo6652d(view);
        }
    }

    public void replaceTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        C0219ex c0219ex = (C0219ex) obj;
        if (c0219ex instanceof C0678fh) {
            C0678fh c0678fh = (C0678fh) c0219ex;
            int size = c0678fh.f18266p.size();
            while (i < size) {
                replaceTargets(c0678fh.mo13241a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C0673er.m10016a(c0219ex)) {
            List list = c0219ex.f4536e;
            if (list.size() == arrayList.size() && list.containsAll(arrayList)) {
                int size2;
                if (arrayList2 != null) {
                    size2 = arrayList2.size();
                } else {
                    size2 = 0;
                }
                while (i < size2) {
                    c0219ex.mo6629a((View) arrayList2.get(i));
                    i++;
                }
                for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    c0219ex.mo6652d((View) arrayList.get(size2));
                }
            }
        }
    }

    public void scheduleHideFragmentView(Object obj, View view, ArrayList arrayList) {
        ((C0219ex) obj).mo6630a(new C0674es(view, arrayList));
    }

    public void scheduleRemoveTargets(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((C0219ex) obj).mo6630a(new C0675et(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((C0219ex) obj).mo6637a(new C0223fb(0));
        }
    }

    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            C0219ex c0219ex = (C0219ex) obj;
            getBoundsOnScreen(view, new Rect());
            c0219ex.mo6637a(new C0223fb((byte) 0));
        }
    }

    public void setSharedElementTargets(Object obj, View view, ArrayList arrayList) {
        C0678fh c0678fh = (C0678fh) obj;
        List list = c0678fh.f4536e;
        list.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.bfsAddViewChildren(list, (View) arrayList.get(i));
        }
        list.add(view);
        arrayList.add(view);
        addTargets(c0678fh, arrayList);
    }

    public void swapSharedElementTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0678fh c0678fh = (C0678fh) obj;
        if (c0678fh != null) {
            c0678fh.f4536e.clear();
            c0678fh.f4536e.addAll(arrayList2);
            replaceTargets(c0678fh, arrayList, arrayList2);
        }
    }

    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        Object c0678fh = new C0678fh();
        c0678fh.mo13242a((C0219ex) obj);
        return c0678fh;
    }
}
