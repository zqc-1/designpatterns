package com.zqc.pattern.decorator.general;

public class ConcreteDecoratorB extends Decorator{
    /**
     * 构造方法，传入组件对象
     *
     * @param component 组件对象
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void operationFirst(){ } //在调用父类前的operation方法前的操作
    private void operationLast(){ } //在调用父类前的operation方法后的操作

    @Override
    public void operation() {
        //调用父类方法，可以在调用前后执行一些附加操作
        operationFirst();   //添加功能
        super.operation();  //这里可以选择性的调用父类的方法，如果不调用相当于完全改写了方法，实现具体的功能
        operationLast();    //添加功能
    }
}
