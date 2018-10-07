package android.support.p001v4.app;

import android.graphics.Rect;
import android.support.p001v4.app.BackStackRecord.C0008Op;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.C0293ip;
import p000.C0315jm;
import p000.C0691ih;

/* compiled from: PG */
/* renamed from: android.support.v4.app.FragmentTransition */
class FragmentTransition {
    public static final int[] INVERSE_OPS = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    public static final FragmentTransitionImpl PLATFORM_IMPL = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl SUPPORT_IMPL = FragmentTransition.resolveSupportImpl();

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentTransition$FragmentContainerTransition */
    class FragmentContainerTransition {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public BackStackRecord firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
        }
    }

    private FragmentTransition() {
    }

    private static void addSharedElementsWithMatchingNames(ArrayList arrayList, C0691ih c0691ih, Collection collection) {
        for (int size = c0691ih.size() - 1; size >= 0; size--) {
            View view = (View) c0691ih.mo9200d(size);
            if (collection.contains(C0315jm.m4641p(view))) {
                arrayList.add(view);
            }
        }
    }

    private static void addToFirstInLastOut(BackStackRecord backStackRecord, C0008Op c0008Op, SparseArray sparseArray, boolean z, boolean z2) {
        Fragment fragment = c0008Op.fragment;
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                int i2;
                int i3;
                int i4;
                FragmentContainerTransition ensureContainer;
                if (z) {
                    i2 = INVERSE_OPS[c0008Op.cmd];
                } else {
                    i2 = c0008Op.cmd;
                }
                boolean z3;
                int i5;
                int i6;
                boolean i42;
                switch (i2) {
                    case 1:
                    case 7:
                        if (z2) {
                            z3 = fragment.mIsNewlyAdded;
                        } else if (fragment.mAdded) {
                            z3 = false;
                        } else if (fragment.mHidden) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        i3 = 0;
                        i5 = 0;
                        i6 = 1;
                        i42 = z3;
                        break;
                    case 3:
                    case 6:
                        if (!z2) {
                            i2 = fragment.mAdded ? !fragment.mHidden ? 1 : 0 : 0;
                        } else if (fragment.mAdded) {
                            i2 = 0;
                        } else {
                            View view = fragment.mView;
                            i2 = view != null ? view.getVisibility() == 0 ? fragment.mPostponedAlpha >= 0.0f ? 1 : 0 : 0 : 0;
                        }
                        i3 = i2;
                        i5 = 1;
                        i6 = 0;
                        i42 = 0;
                        break;
                    case 4:
                        i2 = z2 ? fragment.mHiddenChanged ? fragment.mAdded ? fragment.mHidden ? 1 : 0 : 0 : 0 : fragment.mAdded ? !fragment.mHidden ? 1 : 0 : 0;
                        i3 = i2;
                        i5 = 1;
                        i6 = 0;
                        i42 = 0;
                        break;
                    case 5:
                        if (!z2) {
                            z3 = fragment.mHidden;
                        } else if (!fragment.mHiddenChanged) {
                            z3 = false;
                        } else if (fragment.mHidden) {
                            z3 = false;
                        } else if (fragment.mAdded) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i3 = 0;
                        i5 = 0;
                        i6 = 1;
                        i42 = z3;
                        break;
                    default:
                        i3 = 0;
                        i5 = 0;
                        i6 = 0;
                        i42 = 0;
                        break;
                }
                FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.get(i);
                if (i42 != 0) {
                    ensureContainer = FragmentTransition.ensureContainer(fragmentContainerTransition, sparseArray, i);
                    ensureContainer.lastIn = fragment;
                    ensureContainer.lastInIsPop = z;
                    ensureContainer.lastInTransaction = backStackRecord;
                } else {
                    ensureContainer = fragmentContainerTransition;
                }
                if (!(z2 || i6 == 0)) {
                    if (ensureContainer != null && ensureContainer.firstOut == fragment) {
                        ensureContainer.firstOut = null;
                    }
                    FragmentManagerImpl fragmentManagerImpl = backStackRecord.mManager;
                    if (fragment.mState <= 0 && fragmentManagerImpl.mCurState > 0 && !backStackRecord.mReorderingAllowed) {
                        fragmentManagerImpl.makeActive(fragment);
                        fragmentManagerImpl.moveToState(fragment, 1, 0, 0, false);
                    }
                }
                if (i3 == 0) {
                    fragmentContainerTransition = ensureContainer;
                } else if (ensureContainer == null || ensureContainer.firstOut == null) {
                    fragmentContainerTransition = FragmentTransition.ensureContainer(ensureContainer, sparseArray, i);
                    fragmentContainerTransition.firstOut = fragment;
                    fragmentContainerTransition.firstOutIsPop = z;
                    fragmentContainerTransition.firstOutTransaction = backStackRecord;
                } else {
                    fragmentContainerTransition = ensureContainer;
                }
                if (!z2 && i5 != 0 && fragmentContainerTransition != null && fragmentContainerTransition.lastIn == fragment) {
                    fragmentContainerTransition.lastIn = null;
                }
            }
        }
    }

    public static void calculateFragments(BackStackRecord backStackRecord, SparseArray sparseArray, boolean z) {
        int size = backStackRecord.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransition.addToFirstInLastOut(backStackRecord, (C0008Op) backStackRecord.mOps.get(i), sparseArray, false, z);
        }
    }

    private static C0691ih calculateNameOverrides(int i, ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        C0691ih c0691ih = new C0691ih();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i4);
            if (backStackRecord.interactsWith(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList arrayList3 = backStackRecord.mSharedElementSourceNames;
                if (arrayList3 != null) {
                    ArrayList arrayList4;
                    ArrayList arrayList5;
                    int size = arrayList3.size();
                    if (booleanValue) {
                        arrayList4 = backStackRecord.mSharedElementSourceNames;
                        arrayList5 = backStackRecord.mSharedElementTargetNames;
                    } else {
                        ArrayList arrayList6 = backStackRecord.mSharedElementSourceNames;
                        arrayList4 = backStackRecord.mSharedElementTargetNames;
                        arrayList5 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList5.get(i5);
                        String str2 = (String) arrayList4.get(i5);
                        String str3 = (String) c0691ih.remove(str2);
                        if (str3 != null) {
                            c0691ih.put(str, str3);
                        } else {
                            c0691ih.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0691ih;
    }

    public static void calculatePopFragments(BackStackRecord backStackRecord, SparseArray sparseArray, boolean z) {
        if (backStackRecord.mManager.mContainer.onHasView()) {
            for (int size = backStackRecord.mOps.size() - 1; size >= 0; size--) {
                FragmentTransition.addToFirstInLastOut(backStackRecord, (C0008Op) backStackRecord.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, C0691ih c0691ih, boolean z2) {
        SharedElementCallback enterTransitionCallback;
        int i = 0;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            int size;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            if (c0691ih != null) {
                size = c0691ih.size();
            } else {
                size = 0;
            }
            while (i < size) {
                arrayList2.add(c0691ih.mo9195b(i));
                arrayList.add(c0691ih.mo9200d(i));
                i++;
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean canHandleAll(FragmentTransitionImpl fragmentTransitionImpl, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!fragmentTransitionImpl.canHandle(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static C0691ih captureInSharedElements(FragmentTransitionImpl fragmentTransitionImpl, C0691ih c0691ih, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        View view = fragment.getView();
        if (c0691ih.isEmpty() || obj == null || view == null) {
            c0691ih.clear();
            return null;
        }
        Collection collection;
        SharedElementCallback sharedElementCallback;
        Map c0691ih2 = new C0691ih();
        fragmentTransitionImpl.findNamedViews(c0691ih2, view);
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        SharedElementCallback exitTransitionCallback;
        if (fragmentContainerTransition.lastInIsPop) {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            collection = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = exitTransitionCallback;
        } else {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            Object collection2 = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = exitTransitionCallback;
        }
        if (collection2 != null) {
            C0293ip.m4031a(c0691ih2, collection2);
            C0293ip.m4031a(c0691ih2, c0691ih.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection2, c0691ih2);
            for (int size = collection2.size() - 1; size >= 0; size--) {
                String str = (String) collection2.get(size);
                view = (View) c0691ih2.get(str);
                if (view == null) {
                    str = FragmentTransition.findKeyForValue(c0691ih, str);
                    if (str != null) {
                        c0691ih.remove(str);
                    }
                } else if (!str.equals(C0315jm.m4641p(view))) {
                    str = FragmentTransition.findKeyForValue(c0691ih, str);
                    if (str != null) {
                        c0691ih.put(str, C0315jm.m4641p(view));
                    }
                }
            }
        } else {
            FragmentTransition.retainValues(c0691ih, c0691ih2);
        }
        return c0691ih2;
    }

    private static C0691ih captureOutSharedElements(FragmentTransitionImpl fragmentTransitionImpl, C0691ih c0691ih, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        if (c0691ih.isEmpty() || obj == null) {
            c0691ih.clear();
            return null;
        }
        Collection collection;
        SharedElementCallback sharedElementCallback;
        Fragment fragment = fragmentContainerTransition.firstOut;
        Map c0691ih2 = new C0691ih();
        fragmentTransitionImpl.findNamedViews(c0691ih2, fragment.getView());
        BackStackRecord backStackRecord = fragmentContainerTransition.firstOutTransaction;
        SharedElementCallback enterTransitionCallback;
        if (fragmentContainerTransition.firstOutIsPop) {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            collection = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = enterTransitionCallback;
        } else {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            Object collection2 = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = enterTransitionCallback;
        }
        C0293ip.m4031a(c0691ih2, collection2);
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection2, c0691ih2);
            for (int size = collection2.size() - 1; size >= 0; size--) {
                String str = (String) collection2.get(size);
                View view = (View) c0691ih2.get(str);
                if (view == null) {
                    c0691ih.remove(str);
                } else if (!str.equals(C0315jm.m4641p(view))) {
                    c0691ih.put(C0315jm.m4641p(view), (String) c0691ih.remove(str));
                }
            }
        } else {
            C0293ip.m4031a((Map) c0691ih, c0691ih2.keySet());
        }
        return c0691ih2;
    }

    private static FragmentTransitionImpl chooseImpl(Fragment fragment, Fragment fragment2) {
        Object exitTransition;
        List arrayList = new ArrayList();
        if (fragment != null) {
            exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getSharedElementReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
        }
        if (fragment2 != null) {
            exitTransition = fragment2.getEnterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment2.getReenterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment2.getSharedElementEnterTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (PLATFORM_IMPL != null && FragmentTransition.canHandleAll(PLATFORM_IMPL, arrayList)) {
            return PLATFORM_IMPL;
        }
        if (SUPPORT_IMPL != null && FragmentTransition.canHandleAll(SUPPORT_IMPL, arrayList)) {
            return SUPPORT_IMPL;
        }
        if (PLATFORM_IMPL == null && SUPPORT_IMPL == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static ArrayList configureEnteringExitingViews(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fragment.getView();
        if (view2 != null) {
            fragmentTransitionImpl.captureTransitioningViews(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        fragmentTransitionImpl.addTargets(obj, arrayList2);
        return arrayList2;
    }

    private static Object configureSharedElementsOrdered(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, View view, C0691ih c0691ih, FragmentContainerTransition fragmentContainerTransition, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        final Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        final boolean z = fragmentContainerTransition.lastInIsPop;
        if (c0691ih.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = FragmentTransition.getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        }
        C0691ih captureOutSharedElements = FragmentTransition.captureOutSharedElements(fragmentTransitionImpl, c0691ih, obj3, fragmentContainerTransition);
        if (c0691ih.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(captureOutSharedElements.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj4 != null) {
            rect = new Rect();
            fragmentTransitionImpl.setSharedElementTargets(obj4, view, arrayList);
            FragmentTransition.setOutEpicenter(fragmentTransitionImpl, obj4, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            if (obj != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        final FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        final C0691ih c0691ih2 = c0691ih;
        final Object obj5 = obj4;
        final FragmentContainerTransition fragmentContainerTransition2 = fragmentContainerTransition;
        final ArrayList arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList arrayList4 = arrayList;
        final Object obj6 = obj;
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                C0691ih access$300 = FragmentTransition.captureInSharedElements(fragmentTransitionImpl2, c0691ih2, obj5, fragmentContainerTransition2);
                if (access$300 != null) {
                    arrayList3.addAll(access$300.values());
                    arrayList3.add(view2);
                }
                FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, access$300, false);
                Object obj = obj5;
                if (obj != null) {
                    fragmentTransitionImpl2.swapSharedElementTargets(obj, arrayList4, arrayList3);
                    View access$400 = FragmentTransition.getInEpicenterView(access$300, fragmentContainerTransition2, obj6, z);
                    if (access$400 != null) {
                        fragmentTransitionImpl2.getBoundsOnScreen(access$400, rect);
                    }
                }
            }
        });
        return obj4;
    }

    private static Object configureSharedElementsReordered(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, View view, C0691ih c0691ih, FragmentContainerTransition fragmentContainerTransition, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        Object obj4;
        boolean z = fragmentContainerTransition.lastInIsPop;
        if (c0691ih.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = FragmentTransition.getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        }
        C0691ih captureOutSharedElements = FragmentTransition.captureOutSharedElements(fragmentTransitionImpl, c0691ih, obj3, fragmentContainerTransition);
        final C0691ih captureInSharedElements = FragmentTransition.captureInSharedElements(fragmentTransitionImpl, c0691ih, obj3, fragmentContainerTransition);
        if (c0691ih.isEmpty()) {
            if (captureOutSharedElements != null) {
                captureOutSharedElements.clear();
            }
            if (captureInSharedElements != null) {
                captureInSharedElements.clear();
                obj4 = null;
            } else {
                obj4 = null;
            }
        } else {
            FragmentTransition.addSharedElementsWithMatchingNames(arrayList, captureOutSharedElements, c0691ih.keySet());
            FragmentTransition.addSharedElementsWithMatchingNames(arrayList2, captureInSharedElements, c0691ih.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        Rect rect;
        View inEpicenterView;
        FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj4 != null) {
            arrayList2.add(view);
            fragmentTransitionImpl.setSharedElementTargets(obj4, view, arrayList);
            FragmentTransition.setOutEpicenter(fragmentTransitionImpl, obj4, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            rect = new Rect();
            inEpicenterView = FragmentTransition.getInEpicenterView(captureInSharedElements, fragmentContainerTransition, obj, z);
            if (inEpicenterView != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
            inEpicenterView = null;
        }
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                FragmentTransition.callSharedElementStartEnd(fragment3, fragment4, z2, captureInSharedElements, false);
                View view = inEpicenterView;
                if (view != null) {
                    fragmentTransitionImpl2.getBoundsOnScreen(view, rect);
                }
            }
        });
        return obj4;
    }

    private static void configureTransitionsOrdered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, C0691ih c0691ih) {
        View view2;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            FragmentTransitionImpl chooseImpl = FragmentTransition.chooseImpl(fragment2, fragment);
            if (chooseImpl != null) {
                boolean z = fragmentContainerTransition.lastInIsPop;
                boolean z2 = fragmentContainerTransition.firstOutIsPop;
                Object enterTransition = FragmentTransition.getEnterTransition(chooseImpl, fragment, z);
                Object exitTransition = FragmentTransition.getExitTransition(chooseImpl, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object configureSharedElementsOrdered = FragmentTransition.configureSharedElementsOrdered(chooseImpl, view2, view, c0691ih, fragmentContainerTransition, arrayList, arrayList2, enterTransition, exitTransition);
                if (enterTransition != null || configureSharedElementsOrdered != null || exitTransition != null) {
                    Object obj;
                    ArrayList configureEnteringExitingViews = FragmentTransition.configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList, view);
                    if (configureEnteringExitingViews == null) {
                        obj = null;
                    } else if (configureEnteringExitingViews.isEmpty()) {
                        obj = null;
                    } else {
                        obj = exitTransition;
                    }
                    chooseImpl.addTarget(enterTransition, view);
                    Object mergeTransitions = FragmentTransition.mergeTransitions(chooseImpl, enterTransition, obj, configureSharedElementsOrdered, fragment, fragmentContainerTransition.lastInIsPop);
                    if (mergeTransitions != null) {
                        ArrayList arrayList3 = new ArrayList();
                        chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, arrayList3, obj, configureEnteringExitingViews, configureSharedElementsOrdered, arrayList2);
                        FragmentTransition.scheduleTargetChange(chooseImpl, view2, fragment, view, arrayList2, enterTransition, arrayList3, obj, configureEnteringExitingViews);
                        chooseImpl.setNameOverridesOrdered(view2, arrayList2, c0691ih);
                        chooseImpl.beginDelayedTransition(view2, mergeTransitions);
                        chooseImpl.scheduleNameReset(view2, arrayList2, c0691ih);
                    }
                }
            }
        }
    }

    private static void configureTransitionsReordered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, C0691ih c0691ih) {
        View view2;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            FragmentTransitionImpl chooseImpl = FragmentTransition.chooseImpl(fragment2, fragment);
            if (chooseImpl != null) {
                boolean z = fragmentContainerTransition.lastInIsPop;
                boolean z2 = fragmentContainerTransition.firstOutIsPop;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object enterTransition = FragmentTransition.getEnterTransition(chooseImpl, fragment, z);
                Object exitTransition = FragmentTransition.getExitTransition(chooseImpl, fragment2, z2);
                Object configureSharedElementsReordered = FragmentTransition.configureSharedElementsReordered(chooseImpl, view2, view, c0691ih, fragmentContainerTransition, arrayList2, arrayList, enterTransition, exitTransition);
                if (enterTransition != null || configureSharedElementsReordered != null || exitTransition != null) {
                    ArrayList configureEnteringExitingViews = FragmentTransition.configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList2, view);
                    ArrayList configureEnteringExitingViews2 = FragmentTransition.configureEnteringExitingViews(chooseImpl, enterTransition, fragment, arrayList, view);
                    FragmentTransition.setViewVisibility(configureEnteringExitingViews2, 4);
                    Object mergeTransitions = FragmentTransition.mergeTransitions(chooseImpl, enterTransition, exitTransition, configureSharedElementsReordered, fragment, z);
                    if (mergeTransitions != null) {
                        FragmentTransition.replaceHide(chooseImpl, exitTransition, fragment2, configureEnteringExitingViews);
                        ArrayList prepareSetNameOverridesReordered = chooseImpl.prepareSetNameOverridesReordered(arrayList);
                        chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, configureEnteringExitingViews2, exitTransition, configureEnteringExitingViews, configureSharedElementsReordered, arrayList);
                        chooseImpl.beginDelayedTransition(view2, mergeTransitions);
                        chooseImpl.setNameOverridesReordered(view2, arrayList2, arrayList, prepareSetNameOverridesReordered, c0691ih);
                        FragmentTransition.setViewVisibility(configureEnteringExitingViews2, 0);
                        chooseImpl.swapSharedElementTargets(configureSharedElementsReordered, arrayList2, arrayList);
                    }
                }
            }
        }
    }

    private static FragmentContainerTransition ensureContainer(FragmentContainerTransition fragmentContainerTransition, SparseArray sparseArray, int i) {
        if (fragmentContainerTransition != null) {
            return fragmentContainerTransition;
        }
        fragmentContainerTransition = new FragmentContainerTransition();
        sparseArray.put(i, fragmentContainerTransition);
        return fragmentContainerTransition;
    }

    private static String findKeyForValue(C0691ih c0691ih, String str) {
        int size = c0691ih.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0691ih.mo9200d(i))) {
                return (String) c0691ih.mo9195b(i);
            }
        }
        return null;
    }

    private static Object getEnterTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object reenterTransition;
        if (z) {
            reenterTransition = fragment.getReenterTransition();
        } else {
            reenterTransition = fragment.getEnterTransition();
        }
        return fragmentTransitionImpl.cloneTransition(reenterTransition);
    }

    private static Object getExitTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object returnTransition;
        if (z) {
            returnTransition = fragment.getReturnTransition();
        } else {
            returnTransition = fragment.getExitTransition();
        }
        return fragmentTransitionImpl.cloneTransition(returnTransition);
    }

    private static View getInEpicenterView(C0691ih c0691ih, FragmentContainerTransition fragmentContainerTransition, Object obj, boolean z) {
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (!(obj == null || c0691ih == null)) {
            ArrayList arrayList = backStackRecord.mSharedElementSourceNames;
            if (!(arrayList == null || arrayList.isEmpty())) {
                Object obj2;
                if (z) {
                    obj2 = (String) backStackRecord.mSharedElementSourceNames.get(0);
                } else {
                    String obj22 = (String) backStackRecord.mSharedElementTargetNames.get(0);
                }
                return (View) c0691ih.get(obj22);
            }
        }
        return null;
    }

    private static Object getSharedElementTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object sharedElementReturnTransition;
        if (z) {
            sharedElementReturnTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementReturnTransition = fragment.getSharedElementEnterTransition();
        }
        return fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(sharedElementReturnTransition));
    }

    private static Object mergeTransitions(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj, obj3);
        }
        return fragmentTransitionImpl.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    private static void replaceHide(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, final ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            fragmentTransitionImpl.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            OneShotPreDrawListener.add(fragment.mContainer, new Runnable() {
                public final void run() {
                    FragmentTransition.setViewVisibility(arrayList, 4);
                }
            });
        }
    }

    private static FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (FragmentTransitionImpl) Class.forName("er").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    private static void retainValues(C0691ih c0691ih, C0691ih c0691ih2) {
        for (int size = c0691ih.size() - 1; size >= 0; size--) {
            if (!c0691ih2.containsKey((String) c0691ih.mo9200d(size))) {
                c0691ih.mo9196c(size);
            }
        }
    }

    private static void scheduleTargetChange(FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        final Object obj3 = obj;
        final FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList arrayList4 = arrayList;
        final ArrayList arrayList5 = arrayList2;
        final ArrayList arrayList6 = arrayList3;
        final Object obj4 = obj2;
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                Object obj = obj3;
                if (obj != null) {
                    fragmentTransitionImpl2.removeTarget(obj, view2);
                    arrayList5.addAll(FragmentTransition.configureEnteringExitingViews(fragmentTransitionImpl2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        fragmentTransitionImpl2.replaceTargets(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    private static void setOutEpicenter(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, C0691ih c0691ih, boolean z, BackStackRecord backStackRecord) {
        ArrayList arrayList = backStackRecord.mSharedElementSourceNames;
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) backStackRecord.mSharedElementTargetNames.get(0);
            } else {
                String obj32 = (String) backStackRecord.mSharedElementSourceNames.get(0);
            }
            View view = (View) c0691ih.get(obj32);
            fragmentTransitionImpl.setEpicenter(obj, view);
            if (obj2 != null) {
                fragmentTransitionImpl.setEpicenter(obj2, view);
            }
        }
    }

    private static void setViewVisibility(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    static void startTransitions(FragmentManagerImpl fragmentManagerImpl, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        if (fragmentManagerImpl.mCurState > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    FragmentTransition.calculatePopFragments(backStackRecord, sparseArray, z);
                } else {
                    FragmentTransition.calculateFragments(backStackRecord, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManagerImpl.mHost.getContext());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0691ih calculateNameOverrides = FragmentTransition.calculateNameOverrides(keyAt, arrayList, arrayList2, i, i2);
                    FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.valueAt(i4);
                    if (z) {
                        FragmentTransition.configureTransitionsReordered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    } else {
                        FragmentTransition.configureTransitionsOrdered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    }
                }
            }
        }
    }

    static boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
