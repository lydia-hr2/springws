package com.kbstar.frame;
import com.kbstar.dto.ProductDTO;

import java.util.List;
public interface MyService<K, V> {
    public void register(V v);
    public void remove(K k);
    public void modify(V v);
    public V select(K k);
    public List<V> select();

}
