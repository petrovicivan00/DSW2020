package app.repository;

import app.repository.node.Node;
import app.repository.node.NodeComposite;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Workspace extends NodeComposite implements Serializable {

    public Workspace(String name) {
        super(name, null);
    }

    @Override
    public NodeComposite getChildAt(int index) {
        return null;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public void addChild(Node child) {
        if (child != null && child instanceof Project) {
            Project project = (Project) child;
            if (!this.getChildren().contains(project)) {
                this.getChildren().add(project);
            }
        }
    }
}
