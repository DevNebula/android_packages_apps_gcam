package android.support.p001v4.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import p000.C0314jl;

/* compiled from: PG */
/* renamed from: android.support.v4.app.FragmentPagerAdapter */
public abstract class FragmentPagerAdapter extends C0314jl {
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentPagerAdapter";
    public FragmentTransaction mCurTransaction = null;
    public Fragment mCurrentPrimaryItem = null;
    public final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    public abstract Fragment getItem(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        this.mCurTransaction.detach((Fragment) obj);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.mCurTransaction;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.mCurTransaction = null;
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        long itemId = getItemId(i);
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(FragmentPagerAdapter.makeFragmentName(viewGroup.getId(), itemId));
        if (findFragmentByTag == null) {
            findFragmentByTag = getItem(i);
            this.mCurTransaction.add(viewGroup.getId(), findFragmentByTag, FragmentPagerAdapter.makeFragmentName(viewGroup.getId(), itemId));
        } else {
            this.mCurTransaction.attach(findFragmentByTag);
        }
        if (findFragmentByTag != this.mCurrentPrimaryItem) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String makeFragmentName(int i, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android:switcher:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
