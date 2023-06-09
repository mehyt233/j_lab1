package com.jva;

/**
 * Интерфейс, реализующий базовые операции с контейнером
 */
public interface Container {
    /**
     * Добавляет элемент в конец
     * @param number Добавляемый элемент
     */
    void add(int number);

    /**
     * Добавляет элемент на место заданного индекса
     * @param index Индекс, в который будет вставляться новый элемент
     * @param number Добавляемый элемент
     */
    void add(int index, int number);

    /**
     * Возвращает Значение элемента по заданному индексу
     * @param index Индекс возвращаемого элемента
     * @return Значение элемента
     */
    int get(int index);

    /**
     * Удаляет элемент по заданному индексу
     * @param index Индекс удаляемого элемента
     * @return Результат удаления
     */
    boolean remove(int index);

    /**
     * Возвращает количество элементов в контейнере
     * @return количество элементов в контейнере
     */
    int getSize();
}
