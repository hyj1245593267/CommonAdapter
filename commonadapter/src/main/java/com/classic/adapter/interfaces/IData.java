package com.classic.adapter.interfaces;

import java.util.List;

/**
 * 项目名称: CommonAdapter
 * 包 名 称: com.classic.adapter
 * 类 描 述: 数据操作接口规范
 * 创 建 人: 续写经典
 * 创建时间: 2016/1/21 17:54.
 */
@SuppressWarnings("unused") public interface IData<T> {

    List<T> getData();

    void add(T elem);

    void addAll(List<T> elem);

    void set(T oldElem, T newElem);

    void set(int index, T elem);

    void remove(T elem);

    void remove(int index);

    void replaceAll(List<T> elem);

    boolean contains(T elem);

    void clear();

}
