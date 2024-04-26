package com.xforce.v5.xdvpro.widget.r;

import java.util.ArrayList;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f1263a;

    public static class a {
        public static int a() {
            return -1313311;
        }
    }

    public k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(-16777216);
        arrayList.add(-1);
        this.f1263a = arrayList;
    }

    public k(List<Integer> list) {
        this.f1263a = list;
    }

    private y a(List<Integer> list, int i) {
        List<Integer> list2 = list;
        int i2 = i;
        if (list2 == null || list.size() < 2) {
            return null;
        }
        y yVar = new y(i2);
        int[] iArr = yVar.c;
        int[] iArr2 = yVar.f1285b;
        int[] iArr3 = yVar.f1284a;
        int i3 = 1;
        int size = i2 / (list.size() - 1);
        float f = 1.0f / ((float) size);
        int i4 = 0;
        int intValue = list2.get(0).intValue();
        int i5 = 16711680;
        int i6 = (intValue & 16711680) >> 16;
        int i7 = 65280;
        int i8 = (intValue & 65280) >> 8;
        int i9 = intValue & 255;
        while (i3 < list.size()) {
            int intValue2 = (list2.get(i3).intValue() & i5) >> 16;
            int intValue3 = (list2.get(i3).intValue() & i7) >> 8;
            int intValue4 = list2.get(i3).intValue() & 255;
            int i10 = 0;
            while (i10 < size) {
                float f2 = ((float) i10) * f;
                int i11 = size;
                int i12 = ((int) (((float) (intValue2 - i6)) * f2)) + i6;
                float f3 = f;
                int i13 = ((int) (((float) (intValue3 - i8)) * f2)) + i8;
                int i14 = i6;
                int i15 = ((int) (((float) (intValue4 - i9)) * f2)) + i9;
                if (i12 > 255) {
                    i12 = 255;
                } else if (i12 < 0) {
                    i12 = 0;
                }
                iArr[i4] = i12;
                if (i13 > 255) {
                    i13 = 255;
                } else if (i13 < 0) {
                    i13 = 0;
                }
                iArr2[i4] = i13;
                if (i15 > 255) {
                    i15 = 255;
                } else if (i15 < 0) {
                    i15 = 0;
                }
                iArr3[i4] = i15;
                i4++;
                i10++;
                List<Integer> list3 = list;
                size = i11;
                f = f3;
                i6 = i14;
            }
            int i16 = size;
            float f4 = f;
            i3++;
            list2 = list;
            i9 = intValue4;
            i6 = intValue2;
            i8 = intValue3;
            i5 = 16711680;
            i7 = 65280;
        }
        if (i4 < i2) {
            int i17 = i4 - 1;
            iArr[i4] = iArr[i17];
            iArr2[i4] = iArr2[i17];
            iArr3[i4] = iArr3[i17];
        }
        return yVar;
    }

    public y b(int i) {
        return a(this.f1263a, i);
    }
}
