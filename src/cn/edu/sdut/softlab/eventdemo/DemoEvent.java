package cn.edu.sdut.softlab.eventdemo;

import java.util.EventObject;

/**事件对象的定义
  *
  */
public class DemoEvent extends EventObject {

	private static final long serialVersionUID = -2440129584829446909L;

	public DemoEvent(Object source) {
		super(source);
	}
}
