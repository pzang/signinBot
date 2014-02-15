package org.fun.signinBot;

import java.util.*;

public interface ActionInterface {
	public void exec();
	public List<ActionInterface> getActions();
	public void setActions(List<ActionInterface> actions);
}
