package com.zqc.pattern.composite.general.transparent;

import java.util.ArrayList;
import java.util.List;

//树节点
public class Composite extends Component{
    private List<Component> mComponent;

    public Composite(String name) {
        super(name);
        this.mComponent = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.mComponent) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not support!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not support!");
    }

    public boolean getChild(Component component) {
        throw new UnsupportedOperationException("getChild not support!");
    }
}
