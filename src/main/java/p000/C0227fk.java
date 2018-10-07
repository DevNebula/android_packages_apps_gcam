package p000;

/* compiled from: PG */
/* renamed from: fk */
final class C0227fk {
    /* renamed from: a */
    private static final boolean f4823a = true;
    /* renamed from: b */
    private static final boolean f4824b = true;
    /* renamed from: c */
    private static final boolean f4825c = true;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
    /* renamed from: a */
    static android.view.View m2383a(android.view.ViewGroup r17, android.view.View r18, android.view.View r19) {
        /*
        r5 = new android.graphics.Matrix;
        r5.<init>();
        r1 = r19.getScrollX();
        r1 = -r1;
        r1 = (float) r1;
        r2 = r19.getScrollY();
        r2 = -r2;
        r2 = (float) r2;
        r5.setTranslate(r1, r2);
        r1 = p000.C0231fo.f4868a;
        r0 = r18;
        r1.mo6910a(r0, r5);
        r1 = p000.C0231fo.f4868a;
        r0 = r17;
        r1.mo6911b(r0, r5);
        r3 = new android.graphics.RectF;
        r1 = 0;
        r2 = 0;
        r4 = r18.getWidth();
        r4 = (float) r4;
        r6 = r18.getHeight();
        r6 = (float) r6;
        r3.<init>(r1, r2, r4, r6);
        r5.mapRect(r3);
        r1 = r3.left;
        r6 = java.lang.Math.round(r1);
        r1 = r3.top;
        r7 = java.lang.Math.round(r1);
        r1 = r3.right;
        r8 = java.lang.Math.round(r1);
        r1 = r3.bottom;
        r9 = java.lang.Math.round(r1);
        r10 = new android.widget.ImageView;
        r1 = r18.getContext();
        r10.<init>(r1);
        r1 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r10.setScaleType(r1);
        r1 = f4823a;
        if (r1 == 0) goto L_0x0138;
    L_0x0060:
        r1 = r18.isAttachedToWindow();
        r2 = r1 ^ 1;
        if (r17 == 0) goto L_0x0135;
    L_0x0068:
        r1 = r17.isAttachedToWindow();
    L_0x006c:
        r4 = r2;
    L_0x006d:
        r2 = f4824b;
        if (r2 == 0) goto L_0x0131;
    L_0x0071:
        if (r4 == 0) goto L_0x012d;
    L_0x0073:
        if (r1 == 0) goto L_0x012b;
    L_0x0075:
        r1 = r18.getParent();
        r1 = (android.view.ViewGroup) r1;
        r0 = r18;
        r2 = r1.indexOfChild(r0);
        r11 = r17.getOverlay();
        r0 = r18;
        r11.add(r0);
        r16 = r2;
        r2 = r1;
        r1 = r16;
    L_0x008f:
        r11 = r3.width();
        r11 = java.lang.Math.round(r11);
        r12 = r3.height();
        r12 = java.lang.Math.round(r12);
        if (r11 <= 0) goto L_0x0129;
    L_0x00a1:
        if (r12 <= 0) goto L_0x0127;
    L_0x00a3:
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r14 = 1233125376; // 0x49800000 float:1048576.0 double:6.092448853E-315;
        r15 = r11 * r12;
        r15 = (float) r15;
        r14 = r14 / r15;
        r13 = java.lang.Math.min(r13, r14);
        r11 = (float) r11;
        r11 = r11 * r13;
        r11 = java.lang.Math.round(r11);
        r12 = (float) r12;
        r12 = r12 * r13;
        r12 = java.lang.Math.round(r12);
        r14 = r3.left;
        r14 = -r14;
        r3 = r3.top;
        r3 = -r3;
        r5.postTranslate(r14, r3);
        r5.postScale(r13, r13);
        r3 = f4825c;
        if (r3 == 0) goto L_0x0113;
    L_0x00cb:
        r3 = new android.graphics.Picture;
        r3.<init>();
        r11 = r3.beginRecording(r11, r12);
        r11.concat(r5);
        r0 = r18;
        r0.draw(r11);
        r3.endRecording();
        r3 = android.graphics.Bitmap.createBitmap(r3);
    L_0x00e3:
        r5 = f4824b;
        if (r5 == 0) goto L_0x00f7;
    L_0x00e7:
        if (r4 == 0) goto L_0x00f7;
    L_0x00e9:
        r4 = r17.getOverlay();
        r0 = r18;
        r4.remove(r0);
        r0 = r18;
        r2.addView(r0, r1);
    L_0x00f7:
        if (r3 == 0) goto L_0x00fc;
    L_0x00f9:
        r10.setImageBitmap(r3);
    L_0x00fc:
        r1 = r8 - r6;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
        r2 = r9 - r7;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        r10.measure(r1, r2);
        r10.layout(r6, r7, r8, r9);
        return r10;
    L_0x0113:
        r3 = android.graphics.Bitmap.Config.ARGB_8888;
        r3 = android.graphics.Bitmap.createBitmap(r11, r12, r3);
        r11 = new android.graphics.Canvas;
        r11.<init>(r3);
        r11.concat(r5);
        r0 = r18;
        r0.draw(r11);
        goto L_0x00e3;
    L_0x0127:
        r3 = 0;
        goto L_0x00e3;
    L_0x0129:
        r3 = 0;
        goto L_0x00e3;
    L_0x012b:
        r3 = 0;
        goto L_0x00f7;
    L_0x012d:
        r2 = 0;
        r1 = 0;
        goto L_0x008f;
    L_0x0131:
        r2 = 0;
        r1 = 0;
        goto L_0x008f;
    L_0x0135:
        r1 = 0;
        goto L_0x006c;
    L_0x0138:
        r2 = 0;
        r1 = 0;
        r4 = r2;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
