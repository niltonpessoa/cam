package android.arch.lifecycle;

import android.arch.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class a {
    static a c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, C0005a> f47a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, Boolean> f48b = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a  reason: collision with other inner class name */
    static class C0005a {

        /* renamed from: a  reason: collision with root package name */
        final Map<c.a, List<b>> f49a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, c.a> f50b;

        C0005a(Map<b, c.a> map) {
            this.f50b = map;
            for (Map.Entry next : map.entrySet()) {
                c.a aVar = (c.a) next.getValue();
                List list = this.f49a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f49a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<b> list, e eVar, c.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(eVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar, c.a aVar, Object obj) {
            b(this.f49a.get(aVar), eVar, aVar, obj);
            b(this.f49a.get(c.a.ON_ANY), eVar, aVar, obj);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f51a;

        /* renamed from: b  reason: collision with root package name */
        final Method f52b;

        b(int i, Method method) {
            this.f51a = i;
            this.f52b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar, c.a aVar, Object obj) {
            try {
                int i = this.f51a;
                if (i == 0) {
                    this.f52b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f52b.invoke(obj, new Object[]{eVar});
                } else if (i == 2) {
                    this.f52b.invoke(obj, new Object[]{eVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f51a == bVar.f51a && this.f52b.getName().equals(bVar.f52b.getName());
        }

        public int hashCode() {
            return (this.f51a * 31) + this.f52b.getName().hashCode();
        }
    }

    a() {
    }

    private C0005a a(Class cls, Method[] methodArr) {
        int i;
        C0005a c2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.f50b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry next : c(c3).f50b.entrySet()) {
                e(hashMap, (b) next.getKey(), (c.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(e.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                c.a value = lVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == c.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0005a aVar = new C0005a(hashMap);
        this.f47a.put(cls, aVar);
        this.f48b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    private void e(Map<b, c.a> map, b bVar, c.a aVar, Class cls) {
        c.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f52b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public C0005a c(Class cls) {
        C0005a aVar = this.f47a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class cls) {
        if (this.f48b.containsKey(cls)) {
            return this.f48b.get(cls).booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((l) annotation.getAnnotation(l.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f48b.put(cls, Boolean.FALSE);
        return false;
    }
}
