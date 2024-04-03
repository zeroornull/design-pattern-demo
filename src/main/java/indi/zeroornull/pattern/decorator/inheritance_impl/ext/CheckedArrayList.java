package indi.zeroornull.pattern.decorator.inheritance_impl.ext;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class CheckedArrayList<E> extends ArrayList<E> {

    private final Class<E> type;

    // 构造器指定受检类型
    public CheckedArrayList(Class<E> type) {
        this.type = type;
    }

    @Override
    public boolean add(E e) {
        // 添加元素前做类型校验，只允许加入指定类型元素（运行时校验）
        return super.add(typeCheck(e));
    }

    // --------- private methods ---------
    @SuppressWarnings("unchecked")
    private E typeCheck(Object o) {
        log.info("typeCheck...");
        if (o != null && !type.isInstance(o))
            throw new ClassCastException(badElementMsg(o));
        return (E)o;
    }

    private String badElementMsg(Object o) {
        return "Attempt to insert " + o.getClass() + " element into collection with element type " + type;
    }

}
