package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, Integer> f61a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class, List<Constructor<? extends b>>> f62b = new HashMap();

    private static b a(Constructor<? extends b> constructor, Object obj) {
        try {
            return (b) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Constructor<? extends b> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    static GenericLifecycleObserver d(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f62b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        b[] bVarArr = new b[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(bVarArr);
    }

    private static int e(Class<?> cls) {
        if (f61a.containsKey(cls)) {
            return f61a.get(cls).intValue();
        }
        int g = g(cls);
        f61a.put(cls, Integer.valueOf(g));
        return g;
    }

    private static boolean f(Class<?> cls) {
        return cls != null && d.class.isAssignableFrom(cls);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends b> b2 = b(cls);
        if (b2 != null) {
            f62b.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (a.c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (f(superclass)) {
                if (e(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f62b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (f(cls2)) {
                    if (e(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f62b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f62b.put(cls, arrayList);
            return 2;
        }
    }
}
